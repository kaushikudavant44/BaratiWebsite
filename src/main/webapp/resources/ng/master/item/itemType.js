var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('itemTypeController', function($scope, $http, $location) {
	
	$scope.getSubCategory = function() {
		document.getElementById("loader").style.display="block";
		 
		$http({
			method : 'POST',
			  
			url : '/Baraati/item/getSubCategoryByCatId',
			params: { 'catId' : $scope.catId}
		}).then(
				function successCallback(response) {	

					  
				 $scope.subCategoryList = response.data; 
				 document.getElementById("loader").style.display="none";
						
				}, function errorsCallback(response) {
					
					console.log(respose);
					document.getElementById("loader").style.display="none";
				
				});
		
	}
	
	

	$scope.submitAddItemType = function() {

		document.getElementById("loader").style.display="block";
		 
	 
		var postData = {
				catId : $scope.catId,
				subCatId : $scope.subCatId, 
				itemType : $scope.itemType,
		 
		}

		$http({
			method : 'POST',
			url : '/Baraati/item/addItemType',
			data : postData
		}).then(function successCallback(response) {
			refreshData();
			document.getElementById("loader").style.display="none";
		

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display="none";
			alert("error");
		});

	}

	$scope.init = function() {
	
		refreshData();
	};

	function refreshData()
	{


		 $http({
			method : 'GET',
			url : '/Baraati/item/getAllItemType',
			 
		}).then(
				function successCallback(response) {	

					 
					$scope.itemTypeList = response.data; 
					document.getElementById("loader").style.display="none";
			
				}, function errorsCallback(response) {
					
					console.log(respose);
					document.getElementById("loader").style.display="none";
				
		}); 
	};
	
	
	
		
});
