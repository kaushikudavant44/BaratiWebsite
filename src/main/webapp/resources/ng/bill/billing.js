var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('billController', function($scope, $http, $location) {
	$scope.getItemByDesignCode = function() {

		document.getElementById("loader").style.display = "block";

		 
		$http({
			method : 'POST',
			url : '/Baraati/billRestController/getItemBydesignCode',

			params : {
				'designCode' : $scope.designCode
			}

		}).then(function successCallback(response) {

			document.getElementById("loader").style.display = "none";
			 
			if(response.data.itemId==0){
				document.getElementById("errorMsg").textContent = "Item Not Found";
			}else{
				document.getElementById("errorMsg").style.display = "none";
			}
			

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
			url : '/Baraati/item/getAllItemWithItemType',

		}).then(function successCallback(response) {

			console.log(response);
			$scope.itemList = response.data;

			document.getElementById("loader").style.display = "none";

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display = "none";
		});
	}

	$scope.editItemDetails = function(item) {

		$scope.itemId = item.itemId;
		$scope.itemName = item.itemName;
		$scope.typeId = item.itemType;
		$scope.designNo = item.designNo;
		$scope.barcode = item.barcode;
		$scope.itemSize = item.itemSize;
		$scope.itemQuantity = Number(item.itemQuantity);
		$scope.itemPrice = item.itemPrice;
		$('select').prop('selectedIndex', item.itemType);

	};

	$scope.deleteItem = function(item) {

		$scope.itemId = item.itemId;

		if (confirm("Are you sure to delete category?")) {
			$http({
				method : 'PUT',
				url : '/Baraati/item/deleteItem',
				params : {
					'itemId' : $scope.itemId
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

	/* */

});
