var app = angular.module('app', [ 'angular-loading-bar' ]);

var URL='/Barati/';

app.config([ 'cfpLoadingBarProvider', function(cfpLoadingBarProvider) {
	cfpLoadingBarProvider.includeSpinner = true; // Show the spinner.
	cfpLoadingBarProvider.includeBar = true; // Show the bar.
} ]);

app.controller(
				'billController',
				function($scope, $http, $location) {
					$scope.getItemByDesignCode = function() {

						if ($scope.designCode != "") {
							document.getElementById("loader").style.display = "block";

							$http(
									{
										method : 'POST',
										url : URL+'billRestController/getItemBydesignCode',

										params : {
											'designCode' : $scope.designCode
										}

									})
									.then(
											function successCallback(response) {

												document
														.getElementById("loader").style.display = "none";

												if (response.data.itemId == 0) {

													document
															.getElementById("errorMsg").style.display = "block";
													document
															.getElementById("itemName").value = "";
													document
															.getElementById("itemId").value = "";
													document
															.getElementById("errorMsg").textContent = "Item Not Found";
													document
															.getElementById("addItem").disabled = true;

												} else {
													document
															.getElementById("errorMsg").style.display = "none";
													document
															.getElementById("itemId").value = response.data.itemId;
													document
															.getElementById("addItem").disabled = false;
													document
															.getElementById("itemName").value = response.data.itemName;
												}

											},
											function errorsCallback(response) {
												console.log(respose);
												document
														.getElementById("loader").style.display = "none";
												alert("error");
											});
						}
					}

					$scope.addItemInBillList = function() {

						document.getElementById("loader").style.display = "block";
						var itemId = document.getElementById("itemId").value;
						alert(itemId)
						$http(
								{
									method : 'POST',
									url : URL+'billRestController/addItemInBillList',

									params : {
										'itemId' : itemId,
										'itemQty' : $scope.itemQty
									}

								})
								.then(
										function successCallback(response) {

											document.getElementById("loader").style.display = "none";
											document.getElementById("addItem").disabled = true;
											$scope.itemList = response.data;

										},
										function errorsCallback(response) {
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
							url : URL+'item/getAllItemWithItemType',

						})
								.then(
										function successCallback(response) {

											console.log(response);
											$scope.itemList = response.data;

											document.getElementById("loader").style.display = "none";

										},
										function errorsCallback(response) {
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
								url : URL+'item/deleteItem',
								params : {
									'itemId' : $scope.itemId
								}

							})
									.then(
											function successCallback(response) {

												$scope.info = response.data;

												refreshData();
												alert($scope.info.message);
												document
														.getElementById("loader").style.display = "none";

											},
											function errorsCallback(response) {
												console.log(respose);
												document
														.getElementById("loader").style.display = "none";
												alert("error");
											});

						}
						;
					}

					/* */

				});
