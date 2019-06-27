var app = angular.module('app', [ 'angular-loading-bar' ]);

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller('payScaleMasterController', function($scope, $http, $location) {
	$scope.submitAddJobPayScale = function() {

		document.getElementById("loader").style.display="block";
		
	 
		var postData = {
				payscaleId : $scope.payscaleId,
			jobId : $scope.jobId,
			 
			gradeBasic : $scope.gradeBasic,
			gradeTa : $scope.gradeTa,
			gradeHra : $scope.gradeHra,
			gradeBonus : $scope.gradeBonus,
			gradeOther : $scope.gradeOther,
			gradePf : $scope.gradePf,
			gradePt : $scope.gradePt,
			graduity : $scope.graduity,
			mediclaim : $scope.mediclaim,
			gradeGrossSalary : $scope.gradeGrossSalary,
			gradeNetSalary : $scope.gradeNetSalary,
			isUsed : 1,
		};

		$http({
			method : 'POST',
			url : '/api/hr/addPayScaleDetails',
			data : postData
		}).then(function successCallback(response) {
			refreshData();
		
		

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
	
	
	$scope.editJPayScale = function(pay) {

		 
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
		
		$('#jobId option[value="'+pay.jobId+'"]').attr("selected", "selected");
	$('#gradeBasic').focus();
	};

});
