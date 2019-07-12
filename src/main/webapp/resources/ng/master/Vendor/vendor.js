var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('vendorMasterController', function($scope, $http, $location) {
	$scope.submitVendor = function() {

		document.getElementById("loader").style.display="block";
		
	 
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
			url : '/baraati/vendor/insertVendor',
			data : postData
		}).then(function successCallback(response) {
		//	refreshData();
		alert("Data Save");
		

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
			url : '/api/hr/getAllPayScale',
			 
		}).then(
				function successCallback(response) {	
					 
					 $scope.payScale = response.data; 
						document.getElementById("loader").style.display="none";
				}, function errorsCallback(response) {
					console.log(respose);
					document.getElementById("loader").style.display="none";
				});
	
	
	}
	