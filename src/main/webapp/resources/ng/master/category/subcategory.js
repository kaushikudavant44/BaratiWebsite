var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('subCategoryMasterController', function($scope, $http, $location) {
	$scope.submitSubCategory = function() {

		document.getElementById("loader").style.display = "block";

		var postData = {

			categoryName : $scope.subCategoryName

		};

		$http({
			method : 'POST',
			url : '/Baraati/category/insertSubCategory',
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
			url : '/Baraati/category/getAllSubCategories',
			 
		}).then(
				function successCallback(response) {	

					 console.log("Success "+response);
					 $scope.categories = response.data; 
						document.getElementById("loader").style.display="none";
				}, function errorsCallback(response) {
					console.log(respose);
					document.getElementById("loader").style.display="none";
				});
	}

	$scope.editSubCategory = function(subCategory) {

		$scope.catId = subCategory.catId;
		$scope.subCategoryId = subCategory.subCategoryId;
		$scope.isUsed = subCategory.isUsed;
			
	};

});
