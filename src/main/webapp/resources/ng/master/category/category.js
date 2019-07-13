var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('categoryMasterController', function($scope, $http, $location) {
	$scope.submitAddCategory = function() {

		document.getElementById("loader").style.display = "block";

		var postData = {

			categoryName : $scope.categoryName

		};

		$http({
			method : 'POST',
			url : '/Baraati/category/insertCategory',
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
			url : '/Baraati/category/getAllCategories',
			 
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

	/*$scope.editJPayScale = function(pay) {

		$scope.payscaleId = pay.payscaleId;
		$scope.gradeBasic = pay.gradeBasic;
		$scope.gradeTa = pay.gradeTa;
		$scope.gradeHra = pay.gradeHra;
		$scope.gradeBonus = pay.gradeBonus;
		$scope.gradeOther = pay.gradeOther;
		$scope.gradePf = pay.gradePf;
		$scope.gradePt = pay.gradePt;
		$scope.graduity = pay.graduity;
		$scope.mediclaim = pay.mediclaim;
		$scope.gradeGrossSalary = pay.gradeGrossSalary;
		$scope.gradeNetSalary = pay.gradeNetSalary;
		$scope.jobId = pay.jobId;
		//$('#jobId option[value='+pay.jobId+']');

		$("[data-id=jobId]").html(pay.jobName);

		$('#jobId option[value="' + pay.jobId + '"]').attr("selected",
				"selected");	
		$('#gradeBasic').focus();
	};*/

});
