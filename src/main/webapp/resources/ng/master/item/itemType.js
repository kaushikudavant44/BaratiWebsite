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
	
	
	$scope.editItemType = function(itemType) {

		//alert(itemType.catId);
		
		 $scope.itemType = itemType.itemType;
		/* $scope.categoryName = itemType.categoryName;
		 $scope.subCatName = itemType.subCatName;
		 $scope.subCatId = itemType.subCatId;*/
		 
		
			$("[data-id=catId]").html(itemType.categoryName);
			$('#catId option[value="'+itemType.catId+'"]').attr("selected", "selected");
			
			$scope.catId = itemType.catId;
			angular.element(document.getElementById("catId")).scope().getSubCategory();
			$("[data-id=subCatId]").html(itemType.subCatName);
			$('#subCatId option[value="'+itemType.subCatId+'"]').attr("selected", "selected");
			
			
	//	 $('select').prop('selectedIndex', itemType.categoryName); 
		
	
	};
	
/*	$scope.deleteItemType = function(item) {

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
	}*/
		
});
