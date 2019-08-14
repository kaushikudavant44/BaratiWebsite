var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('itemMasterController', function($scope, $http, $location) {
	$scope.submitAddItem = function() {

		document.getElementById("loader").style.display="block";
		$scope.invoiceDate=document.getElementById("invoiceDate").value;
		 
	 
		var postData = {
				
				itemId : $scope.itemId,
				itemName : $scope.itemName,		 
				typeId : $scope.typeId,
				designNo : $scope.designNo,
			 
				itemSize : $scope.itemSize,
				itemQuantity : $scope.itemQuantity,
				itemPrice : $scope.itemPrice,
				gstPer : $scope.gstPer,
		 		bottomPrice : $scope.bottomPrice,
				hsnNo : $scope.hsnNo,
				invoiceDate : $scope.invoiceDate,
				vendorId : $scope.vendorId,
				itemPurchasePrice : $scope.itemPurchasePrice,
				invoiceNo : $scope.invoiceNo
		};

		$http({
			method : 'POST',
			url : '/Baraati/item/addItem',
			data : postData
		}).then(function successCallback(response) {
			
			 
			document.getElementById("loader").style.display="none";
		if(confirm("Do you want print Barcode now!"))
			{
			window.open("showBarcode/"+response.data.itemId,"_blank");
			}

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display="none";
			alert("error");
		});

	}

	$scope.init = function() {
	 
	 
	};

 
	
	/* */

});
