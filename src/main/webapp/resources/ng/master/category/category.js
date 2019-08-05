var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('categoryMasterController', function($scope, $http, $location) {
	$scope.submitAddCategory = function() {

		document.getElementById("loader").style.display = "block";

		var postData = {

			categoryId : $scope.categoryId,
			categoryName : $scope.categoryName,

		};

		$http({
			method : 'POST',
			url : '/Baraati/category/insertCategory',
			data : postData
		}).then(function successCallback(response) {
			refreshData();
			document.getElementById("loader").style.display = "none";

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display = "none";
			alert("error");
		});

	}

	$scope.init = function() {

		refreshData();
	};

	function refreshData() {

		$http({
			method : 'GET',
			url : '/Baraati/category/getAllCategories',

		}).then(function successCallback(response) {

			console.log("Success " + response);
			$scope.categories = response.data;
			document.getElementById("loader").style.display = "none";
		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display = "none";
		});
	}

	$scope.editCategory = function(category) {

		$scope.categoryId = category.categoryId;
		$scope.categoryName = category.categoryName;
		$scope.isUsed = category.isUsed;

	};

	$scope.deleteCategory = function(category) {

			$scope.categoryId = category.categoryId;

	if(confirm("Are you sure to delete category?")){
		$http({
			method : 'PUT',
			url : '/Baraati/category/deleteCategory',
			params: { 'categoryId' : $scope.categoryId}
			

		}).then(function successCallback(response) {

			$scope.info=response.data;
			
			
			refreshData();
			alert($scope.info.message);
			document.getElementById("loader").style.display = "none";

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display = "none";
			alert("error");
		});

	};
	}
});
