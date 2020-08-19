var app = angular.module('app', [ 'angular-loading-bar' ]);



app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('vendorMasterController', function($scope, $http, $location) {
	$scope.submitVendor = function() {

		document.getElementById("loader").style.display = "block";

		var postData = {

			vendorId : $scope.vendorId,
			vendorName : $scope.vendorName,
			vendorGst : $scope.vendorGst,
			vendorAddress : $scope.vendorAddress,
			vendorContact1 : $scope.vendorContact1,
			vendorContact2 : $scope.vendorContact2,
			vendorEmail : $scope.vendorEmail,
			isUsed : 0,
		};

		$http({
			method : 'POST',
			url : '/Barati/vendor/insertVendor',
			data : postData
		}).then(function successCallback(response) {

			refreshData();

		}, function errorsCallback(response) {
			console.log(respose);
			document.getElementById("loader").style.display = "none";

		});

	}

	$scope.init = function() {
		
		refreshData();
	};

	function refreshData() {
		$http({

			method : 'GET',
			url : '/Barati/vendor/getAllVendors',

		}).then(function successCallback(response) {

						
			$scope.vendors = response.data;
			
			alert($scope.vendors);
			
			document.getElementById("loader").style.display = "none";

		}, function errorsCallback(response) {

			console.log(respose);
			document.getElementById("loader").style.display = "none";

		});
	}
	;

	$scope.editVendorDetails = function(vendor) {

		$scope.vendorId = vendor.vendorId;
		$scope.vendorName = vendor.vendorName;

		$scope.vendorGst = vendor.vendorGst;
		$scope.vendorAddress = vendor.vendorAddress;
		$scope.vendorContact1 = vendor.vendorContact1;
		$scope.vendorContact2 = vendor.vendorContact2;
		$scope.vendorEmail = vendor.vendorEmail;

	};

	$scope.deleteVendor = function(vendor) {

		$scope.vendorId = vendor.vendorId;

		if (confirm("Are you sure to delete category?")) {
			$http({
				method : 'PUT',
				url : '/Barati/vendor/deleteVendor',
				params : {
					'vendorId' : $scope.vendorId
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
