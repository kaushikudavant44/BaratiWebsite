var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('loginController', function($scope, $http, $location) {

	$scope.submitLoginForm = function() {

		$http({
			method : 'POST',
			url : '/api/lab/labStaffLogin',
			params : {
				'staffMobile' : $scope.userName,
				'password' : $scope.password
			}
		}).then(
				function successCallback(response) {

					var data = response.data;

					var errorMessage = data.info.error;

					if (errorMessage) {

						alert("Invalid Login Details")
					} else {

						sessionStorage.setItem("empId", data.labStaff.staffId);
						sessionStorage.setItem("branchId", data.labStaff.branchId);
						sessionStorage.setItem("staffRoleType",data.labStaff.staffRoleType);
					    window.location.assign( "/home");

					}

				}, function errorsCallback(response) {
					console.log(respose);
					alert("error");
				});

	}

});
