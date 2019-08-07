var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('subCategoryMasterController', function($scope, $http, $location) {
	
	
	$scope.submitSubCategory = function() {

		
		
		document.getElementById("loader").style.display = "block";

		var postData = {
			
			subCatId : $scope.subCatId,
			categoryId : $scope.categoryId,
			subCatName : $scope.subCatName,
			

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
					 $scope.subCategories = response.data; 
						document.getElementById("loader").style.display="none";
				}, function errorsCallback(response) {
					console.log(respose);
					document.getElementById("loader").style.display="none";
				});
	}

	$scope.editSubCategory = function(subCategory) {
		
		

		$scope.subCatName = subCategory.subCatName;
	//	$scope.categoryName = subCategory.categoryName;
		
		$("[data-id=categoryId]").html(subCategory.categoryName);
		$('#categoryId option[value="'+subCategory.categoryId+'"]').attr("selected", "selected");
		$scope.categoryId = subCategory.categoryId;
		$scope.subCatId = subCategory.subCatId;
	//	$scope.isUsed = subCategory.isUsed;
			
	};
	
	$scope.deleteSubCategory = function(subCategory) {

		$scope.subCatId = subCategory.subCatId;

		if (confirm("Are you sure to delete category?")) {
			$http({
				method : 'PUT',
				url : '/Baraati/category/deleteSubCategory',
				params : {
					'subCatId' : $scope.subCatId
				}

			}).then(function successCallback(response) {

				$scope.info = response.data;

				refreshData();
				alert($scope.info.message);
				document.getElementById("loader").style.display = "none";

			}, function errorsCallback(response) {
				console.log(respose);
				document.getElementById("loader").style.display = "none";
				alert("error");
			});

		}
		;
	}
	

});
