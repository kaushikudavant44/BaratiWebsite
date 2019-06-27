var app = angular.module('app', ['ngCookies','ngRoute','angular-loading-bar']);


app.config(['cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
    cfpLoadingBarProvider.includeBar = true; // Show the bar.
}]);

app.controller('loginController', function($scope, $http, $location) {
	$scope.submitLoginForm = function(){

		var dataJson = {
	            userName: $scope.userName,
	            password: $scope.password
	        };
		
		 $http({
             method : 'POST',
             url : '/api/demo/getlogin',
             params: dataJson
         }).then(function successCallback(response) {
        	 
        	
        	 
        	 
         }, function errorCallback(response) {
             console.log(response.statusText);
         });
		
	}
});

app.controller('getallcustomersController', function($scope, $http, $location) {
	
	$scope.showAllCustomers = false;

	$scope.getAllCustomers = function() {
	//	var url = $location.absUrl() + "findall";

	/*	var url =  $location.$$absUrl+"findall";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {

			if (response.data.status == "Done") {
			
				$scope.allcustomers = response.data;
				$scope.showAllCustomers = true;
				$scope.getResultMessage = "List of customers.";
				
			
				
			} else {
				$scope.getResultMessage = "get All Customers Data Error !";
			}

		}, function(response) {
			$scope.getResultMessage = "Fail!";
			
		});*/
		
		
		 $http({
             method : 'GET',
             url : 'findall'
         }).then(function successCallback(response) {
             $scope.allcustomers = response.data.data;
             
				$scope.showAllCustomers = true;

         }, function errorCallback(response) {
             console.log(response.statusText);
         });

	}
});

app.controller('getcustomerController', function($scope, $http, $location) {
	
	$scope.showCustomer = false;
	
	$scope.getCustomer = function() {
		
	/*	
		var url = $location.$$absUrl+ + "customer/" + $scope.customerId;

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {

			if (response.data.status == "Done") {
				$scope.customer = response.data;
				$scope.showCustomer = true;

			} else {
				$scope.getResultMessage = "Customer Data Error !";
			}

		}, function(response) {
			$scope.getResultMessage = "Fail !";
		});

		*/
		
		//
		 $http({
             method : 'GET',
             url : 'customerbyId',
             params: { 'id' : $scope.customerId }
         }).then(function successCallback(response) {
        		$scope.customer = response.data;
				$scope.showCustomer = true;

         }, function errorCallback(response) {
        	 $scope.getResultMessage = "Customer Data Error !";
             console.log(response.statusText);
         });
		
		
		//
	}
});

app.controller('getcustomersbylastnameController', function($scope, $http, $location) {
	
	$scope.showCustomersByLastName = false;
	
	$scope.getCustomersByLastName = function() {

	
		
		 $http({
             method : 'GET',
             url : 'findbylastname',
             params: { 'lastName' : $scope.customerLastName }
         }).then(function successCallback(response) {
             $scope.allcustomersbylastname = response.data.data;
             
				$scope.showCustomersByLastName = true;

         }, function errorCallback(response) {
             console.log(response.statusText);
         });

	}
});