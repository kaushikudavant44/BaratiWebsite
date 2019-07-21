var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('itemMasterController', function($scope, $http, $location) {
	$scope.submitAddItem = function() {

		document.getElementById("loader").style.display="block";
		 
	 
		var postData = {
				itemId : $scope.itemId,
				itemName : $scope.itemName,
			 
				typeId : $scope.typeId,
				designNo : $scope.designNo,
				barcode : $scope.barcode,
				itemSize : $scope.itemSize,
				itemQuantity : $scope.itemQuantity,
				itemPrice : $scope.itemPrice,
			 
			 
			 
		};

		$http({
			method : 'POST',
			url : '/Baraati/item/addItem',
			data : postData
		}).then(function successCallback(response) {
			//refreshData();
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
			url : '/Baraati/item/getAllItem',
			 
		}).then(
				function successCallback(response) {	

					 
					 $scope.itemList = response.data; 
						document.getElementById("loader").style.display="none";
				}, function errorsCallback(response) {
					console.log(respose);
					document.getElementById("loader").style.display="none";
				}); 
	}
	
	
	/* */

});
