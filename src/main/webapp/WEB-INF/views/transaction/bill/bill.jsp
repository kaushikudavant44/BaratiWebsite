<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Add Bill</title>
<!-- Favicon-->
<link rel="icon" href="../../favicon.ico" type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<!-- Waves Effect Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/node-waves/waves.css"
	rel="stylesheet" />

<!-- Animation Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/animate-css/animate.css"
	rel="stylesheet" />

<!-- JQuery DataTable Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/skin/bootstrap/css/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- Custom Css -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">

<!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
<link
	href="${pageContext.request.contextPath}/resources/css/themes/all-themes.css"
	rel="stylesheet" />


<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>

<link
	href="https://cdnjs.cloudflare.com/ajax/libs/angular-loading-bar/0.7.1/loading-bar.min.css"
	rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/angular-loading-bar/0.7.1/loading-bar.min.js"></script>


<!-- Favicon-->
<link rel="icon"
	href="${pageContext.request.contextPath}/resources/favicon.ico"
	type="image/x-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">

<!-- Bootstrap Core Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<!-- Waves Effect Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/node-waves/waves.css"
	rel="stylesheet" />

<!-- Animation Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/animate-css/animate.css"
	rel="stylesheet" />

<!-- Colorpicker Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.css"
	rel="stylesheet" />

<!-- Dropzone Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/dropzone/dropzone.css"
	rel="stylesheet">

<!-- Multi Select Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/multi-select/css/multi-select.css"
	rel="stylesheet">

<!-- Bootstrap Spinner Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/jquery-spinner/css/bootstrap-spinner.css"
	rel="stylesheet">

<!-- Bootstrap Tagsinput Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap-tagsinput/bootstrap-tagsinput.css"
	rel="stylesheet">

<!-- Bootstrap Select Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap-select/css/bootstrap-select.css"
	rel="stylesheet" />

<!-- noUISlider Css -->
<link
	href="${pageContext.request.contextPath}/resources/plugins/nouislider/nouislider.min.css"
	rel="stylesheet" />

<!-- Custom Css -->
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">

<!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
<link
	href="${pageContext.request.contextPath}/resources/css/themes/all-themes.css"
	rel="stylesheet" />

<style type="text/css">
@charset "utf-8";

@import
	url(https://fonts.googleapis.com/css?family=Open+Sans:400,700,600);

html, html a {
	-webkit-font-smoothing: antialiased;
	text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.004);
}
/* 
body {
  background-color: #fff;
  color: black;
font-family: 'Roboto', Arial, Tahoma, sans-serif;
  font-size: 62.5%;
  margin: 0 auto;
}
 */
a {
	border: 0 none;
	outline: 0;
	text-decoration: none;
}

strong {
	font-weight: bold;
}

p {
	margin: 0.75rem 0 0;
}

h1 {
	font-size: 0.98rem;
	font-weight: normal;
	margin: 0;
	font-size: 12px;
	padding: 0;
}

input, button {
	border: 0 none;
	outline: 0 none;
}

button {
	background-color: #eb6f6f;
	color: #fff;
}

button:hover, button:focus {
	background: linear-gradient(-45deg, #f403d1, #64b5f6);
	color: #fff;
}

img, .basket-module, .basket-labels, .basket-product {
	width: 100%;
}

input, button, .basket, .basket-module, .basket-labels, .item, .price,
	.quantity, .subtotal, .basket-product, .product-image, .product-details
	{
	float: left;
}

.price:before, .subtotal:before, .subtotal-value:before, .total-value:before,
	.promo-value:before {
	content: '';
}

.hide {
	display: none;
}

main {
	clear: both;
	font-size: 14px;
	margin: 0 auto;
	overflow: hidden;
	padding: 1rem 0;
	width: 960px;
}

.basket, aside {
	padding: 0 1rem;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.basket {
	width: 72%;
	margin-bottom: 19px;
}

.basket-module {
	color: #111;
}

label {
	display: block;
	margin-bottom: 0.3125rem;
}

.promo-code-field {
	border: 1px solid #ccc;
	padding: 0.5rem;
	text-transform: uppercase;
	transition: all 0.2s linear;
	width: 48%;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	-o-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
}

.promo-code-field:hover, .promo-code-field:focus {
	border: 1px solid #999;
}

.promo-code-cta {
	border-radius: 21px;
	font-size: 1.425rem;
	margin-left: 0.825rem;
	padding: 0.6875rem 1.25rem 0.625rem;
}

.basket-labels {
	border-top: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
	margin-top: 1.625rem;
	background-color: #e9e9e9;
	font-size: 12px;
	text-transform: uppercase;
	letter-spacing: 0.03em;
	padding-right: 8px;
}

ul {
	list-style: none;
	margin: 0;
	padding: 0;
}

/* li {
  color: #111;
  display: inline-block;
  padding: 0.625rem 0;
} */
li.price:before, li.subtotal:before {
	content: '';
}

.item {
	width: 19%;
}

.price, .quantity, .subtotal {
	width: 15%;
}

.subtotal {
	text-align: right;
}

.remove {
	bottom: 1.125rem;
	float: right;
	position: absolute;
	right: 0;
	text-align: right;
	width: 45%;
}

.remove button {
	background-color: #eb6f6f;
	color: #fff;
	float: right;
	width: 100px;
	height: 30px;
	text-decoration: underline;
	text-transform: uppercase;
}

.item-heading {
	padding-left: 4.375rem;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.basket-product {
	border-bottom: 1px solid #ccc;
	padding: 1rem 5px;
	position: relative;
	box-shadow: 0px 0px 9px 0px rgba(0, 0, 0, 0.1);
	margin-bottom: 5px;
}

.product-image {
	width: 14%;
}

.product-details {
	width: 65%;
}

.product-frame {
	border: 1px solid #aaa;
}

.product-details {
	padding: 0 1.5rem;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.quantity-field {
	background-color: #dcc8c8;
	border: 1px solid #aaa;
	font-size: 1.0rem;
	padding-left: 14px;
	padding-top: 7px;
	padding-bottom: 7px;
	width: 4.75rem;
}

aside {
	float: right;
	position: relative;
	width: 28%;
}

.summary {
	background: linear-gradient(-45deg, #24ff72, #9a4eff);
	-webkit-box-shadow: 0 10px 15px rgba(0, 0, 0, .1);
	box-shadow: 0 10px 15px rgba(0, 0, 0, .1);
	-webkit-transition: .5s;
	border-radius: 15px;
	transition: .5s;
	border: 1px solid #657dce;
	padding: 1rem;
	position: fixed;
	width: 250px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.summary-total-items {
	color: #ffffff;
	font-size: 1.875rem;
	text-align: center;
}

.summary-subtotal, .summary-total {
	border-top: 1px solid #ccc;
	border-bottom: 1px solid #ccc;
	clear: both;
	margin: 1rem 0;
	overflow: hidden;
	padding: 0.5rem 0;
}

.subtotal-title, .subtotal-value, .total-title, .total-value,
	.promo-title, .promo-value {
	color: #ffffff;
	float: left;
	width: 50%;
}

.summary-promo {
	-webkit-transition: all .3s ease;
	-moz-transition: all .3s ease;
	-o-transition: all .3s ease;
	transition: all .3s ease;
}

.promo-title {
	float: left;
	width: 70%;
}

.promo-value {
	color: #8B0000;
	float: left;
	text-align: right;
	width: 30%;
}

.summary-delivery {
	padding-bottom: 3rem;
}

.subtotal-value, .total-value {
	text-align: right;
}

.total-title {
	font-weight: bold;
	text-transform: uppercase;
}

.summary-checkout {
	display: block;
}

.checkout-cta {
	display: block;
	float: none;
	font-size: 1.3rem;
	text-align: center;
	text-transform: uppercase;
	padding: 0.625rem 0;
	width: 82%;
	position: relative;
	z-index: 2;
	background: lightgrey;
	color: black;
	border-radius: 40px;
	display: block;
	margin-left: 25px;
	cursor: pointer;
	-webkit-box-shadow: 0 5px 10px rgba(0, 0, 0, .1);
	box-shadow: 0 5px 10px rgba(0, 0, 0, .1);
}

.summary-delivery-selection {
	background-color: #ccc;
	border: 1px solid #aaa;
	border-radius: 4px;
	display: block;
	font-size: 0.625rem;
	height: 34px;
	width: 100%;
}

@media screen and (max-width: 640px) {
	aside, .basket, .summary, .item, .remove {
		width: 100%;
	}
	.basket-labels {
		display: none;
	}
	.basket-module {
		margin-bottom: 1rem;
	}
	.item {
		margin-bottom: 1rem;
	}
	.product-image {
		width: 40%;
	}
	.product-details {
		width: 60%;
	}
	.price, .subtotal {
		width: 33%;
	}
	.quantity {
		text-align: center;
		width: 34%;
	}
	.quantity-field {
		float: none;
	}
	.remove {
		bottom: 0;
		text-align: left;
		margin-top: 0.75rem;
		position: relative;
	}
	.remove button {
		padding: 0;
	}
	.summary {
		margin-top: 1.25rem;
		position: relative;
	}
}

@media screen and (min-width: 641px) and (max-width: 960px) {
	aside {
		padding: 0 1rem 0 0;
	}
	.summary {
		width: 28%;
	}
}

@media screen and (max-width: 960px) {
	main {
		width: 100%;
	}
	.product-details {
		padding: 0 1rem;
	}
}
</style>
<c:url var="getItemBydesignCode" value="/getItemBydesignCode" />
<c:url var="addItemInBillList" value="/addItemInBillList" />
<c:url var="deleteItemFromBillDetail" value="/deleteItemFromBillDetail" />
</head>
<body class="theme-red">
	<!-- Page Loader -->
	<div class="page-loader-wrapper" id="loader">
		<div class="loader">
			<div class="preloader">
				<div class="spinner-layer pl-red">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
			</div>
			<p>Please wait...</p>
		</div>
	</div>
	<!-- #END# Page Loader -->
	<!-- Overlay For Sidebars -->
	<div class="overlay"></div>
	<!-- #END# Overlay For Sidebars -->
	<!-- Search Bar -->
	<!-- #END# Search Bar -->
	<!-- Top Bar -->
	<nav class="navbar">
		<jsp:include page="/WEB-INF/views/common/top-menu.jsp"></jsp:include>
	</nav>
	<!-- #Top Bar -->
	<section>
		<!-- Left Sidebar -->
		<jsp:include page="/WEB-INF/views/common/navigation-menu.jsp"></jsp:include>
		<!-- #Left Sidebar -->
	</section>

	<div ng-app="app">
		<section class="content">
			<div class="container-fluid"></div>
			<div class="body" ng-controller="billController">
				<div class="row clearfix">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"
						style="height: 60px; padding-bottom: 5px;">
						<div class="card">
							<div class="header">
								<h6 class="card-inside-title">GENERATE BILL</h6>
							</div>
						</div>
					</div>
				</div>
				<form id="submitForm"
					action="${pageContext.request.contextPath}/submitBill"
					onsubmit="return confirm('Do you really want to submit the Bill ?');"
					method="post">
					<!-- 	<div class="row clearfix">

						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="card">

								<div class="body">
									<div class="row clearfix">


										<div class="col-md-4">

											<label for="custName">Customer Name</label> <input
												id="custName" type="text" name="custName"
												class="form-control " required>
										</div>
										<div class="col-md-4">
											<label for="custMo"> Mobile</label> <input id="custMo"
												type="text" name="custMo" class="form-control " required>
										</div>
										<div class="col-md-4">
											<label for="email">Email</label> <input id="email"
												type="email" name="email" class="form-control " required>

										</div>

									</div>
									<hr>
									<div class="row clearfix">


										<div class="col-md-2">

											<label for="designCode">Enter a code</label> <input
												id="designCode" type="text" onchange="getItemByDesignCode()"
												name="designCode" maxlength="5" class="form-control ">

										</div>
										<div class="col-md-4">
											<label for="designCode">Item Name</label> <input
												id="itemName" type="text" name="itemName"
												class="form-control " disabled> <input id="itemId"
												type="hidden" name="itemId">
										</div>
										<div class="col-md-1">
											<label for="designCode">QTY</label> <input id="itemQty"
												type="number" name="itemQty" class="form-control " value="1">

										</div>



										<div class="col-md-2">
											<label for="designCode">Add Item</label>
											<button class="promo-code-cta"
												style="background-color: #44ab9f;" disabled id="addItem"
												onclick="addItemInBillList()" type="button">Add
												Item</button>


										</div>
									</div>
									
								</div>
							</div>
						</div>
					</div> -->

					<!-- Basic Examples -->
					<div class="row clearfix">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="card" style="min-height: 500px;">
								<main>
								<div class="basket">
									<div class="col-md-5">
										<label for="designCode">Enter Design code</label> <input
											id="designCode" type="text" onchange="getItemByDesignCode()"
											name="designCode" placeholder="Design Code"
											class="form-control ">

									</div>
									<div class="col-md-5">
										<label for="designCode">Item Name</label> <input id="itemName"
											type="text" name="itemName" placeholder="Item Name"
											class="form-control " disabled> <input id="itemId"
											type="hidden" name="itemId">
									</div>


								</div>

								<div class="basket">
									<div class="col-md-4">
										<label for="itemQty">QTY</label> <input id="itemQty"
											type="number" name="itemQty" style="text-align: right;"
											class="form-control " value="1">

									</div>

									<div class="col-md-4">
										<label for="amt">AMT</label> <input id="amt" type="text"
											name="amt" style="text-align: right;" class="form-control "
											value="1">

									</div>

									<div class="col-md-3">
										<label for="designCode"> &nbsp;</label>
										<button class="promo-code-cta"
											style="background-color: #d080cb;" disabled id="addItem"
											onclick="addItemInBillList()" type="button">Add Item</button>
									</div>
								</div>



								<aside>



									<div class="summary">
										<div class="summary-total-items">
											<div class="demo-google-material-icon" style="width: 95%">
												<i class="material-icons" style="color: white;">shopping_cart</i>
											</div>
											<span class="total-items" id="totalItem"></span> Items in
											your Cart
										</div>

										<div class="summary-subtotal">
											<div class="subtotal-title">Subtotal</div>
											<div class="subtotal-value final-value" id="subTotal">0.00</div>
											<input type="hidden" name="subTotalHidden"
												id="subTotalHidden" value="0" />
										</div>
										<div class="summary-subtotal">
											<div class="subtotal-title">Tax Amt</div>
											<div class="subtotal-value final-value" id="taxAmt">0.00</div>
											<input type="hidden" name="taxAmtHidden" id="taxAmtHidden"
												value="0" />
										</div>
										<div class="summary-subtotal">
											<div class="subtotal-title">Discount %</div>
											<div class="subtotal-value final-value">
												<input type="text" name="discPer" id="discPer" value="0"
													onchange="getDiscountOnBill()"
													style="color: black; padding-left: 5px; border-radius: 25px; width: 75px; text-align: center;" />
											</div>

										</div>
										<div class="summary-subtotal">
											<div class="subtotal-title">Disc In Rs</div>
											<div class="subtotal-value final-value">
												<input type="text" name="discAmt" id="discAmt" value="0"
													onchange="getDiscountOnBill()"
													style="color: black; padding-left: 5px; border-radius: 25px; width: 75px; text-align: center;" />
											</div>

										</div>


										<div class="summary-total">
											<div class="total-title">Total</div>
											<div class="total-value final-value" id="total">0.00</div>
											<input type="hidden" name="totalHidden" id="totalHidden"
												value="0" /> <input type="hidden" name="totalNonChangable"
												id="totalNonChangable" value="0" />
										</div>
										<div class="summary-checkout">
											<button class="checkout-cta" type="submit"
												style="background-color: #d080cb; color: white; font-weight: bold;">Submit
												Bill</button>
										</div>
									</div>
								</aside>
								<div class="basket">
									<div class="col-md-4">

										<label for="custName">Customer Name</label> <input
											id="custName" type="text" placeholder="Customer Name"
											name="custName" class="form-control " required>
									</div>
									<div class="col-md-4">
										<label for="custMo"> Mobile</label> <input id="custMo"
											type="text" name="custMo" placeholder="Mobile"
											class="form-control " required>
									</div>
									<div class="col-md-4">
										<label for="email">Email</label> <input id="email"
											type="email" name="email" placeholder="Email"
											class="form-control " required>

									</div>
								</div>
								<div class="basket" style="margin-top: 20px;">
									<div class="table-responsive">
										<table id="table_grid1"
											class="table table-bordered table-striped table-hover  dataTable">
											<thead>
												<tr>
													<th>Sr.No.</th>
													<th>Product</th>
													<th>Quantity</th>
													<th>Taxable</th>
													<th>Tax%</th>
													<th>Tax_amt</th>
													<th>AMT</th>
													<th>Action</th>

												</tr>
											</thead>

											<tbody>

											</tbody>
										</table>
									</div>
								</div>

								</main>

							</div>
						</div>
					</div>
				</form>
			</div>
			<!-- #END# Basic Examples -->

		</section>

	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>

	<!-- Jquery Core Js -->
	<%-- <script
		src="${pageContext.request.contextPath}/resources/plugins/jquery/jquery.min.js"></script>
 --%>
	<!-- Bootstrap Core Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/bootstrap/js/bootstrap.js"></script>

	<!-- Select Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/bootstrap-select/js/bootstrap-select.js"></script>

	<!-- Slimscroll Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

	<!-- Waves Effect Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/node-waves/waves.js"></script>

	<!-- Jquery DataTable Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/jquery.dataTables.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/skin/bootstrap/js/dataTables.bootstrap.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/dataTables.buttons.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/buttons.flash.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/jszip.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/pdfmake.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/vfs_fonts.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/buttons.html5.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-datatable/extensions/export/buttons.print.min.js"></script>

	<!-- Custom Js -->
	<script src="${pageContext.request.contextPath}/resources/js/admin.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/pages/tables/jquery-datatable.js"></script>

	<!-- Demo Js -->
	<script src="${pageContext.request.contextPath}/resources/js/demo.js"></script>



	<!-- Dropzone Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/dropzone/dropzone.js"></script>

	<!-- Input Mask Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-inputmask/jquery.inputmask.bundle.js"></script>

	<!-- Multi Select Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/multi-select/js/jquery.multi-select.js"></script>

	<!-- Jquery Spinner Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery-spinner/js/jquery.spinner.js"></script>

	<!-- Bootstrap Tags Input Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/bootstrap-tagsinput/bootstrap-tagsinput.js"></script>


	<script
		src="${pageContext.request.contextPath}/resources/js/pages/forms/advanced-form-elements.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/controllerjs/navigation.js"></script>



	<script
		src="${pageContext.request.contextPath}/resources/ng/bill/billing.js"></script>
</body>

<script type="text/javascript">
	function getItemByDesignCode() {

		var designCode = $("#designCode").val();

		$.getJSON('${getItemBydesignCode}', {

			designCode : designCode,
			ajax : 'true',

		}, function(data) {

			//alert(data.itemId)
			if (data.itemId == 0) {

				alert("Item Not Found")
				//document.getElementById("errorMsg").style.display = "block";
				document.getElementById("itemName").value = "";
				document.getElementById("itemId").value = "";
				//document.getElementById("errorMsg").textContent = "Item Not Found";
				document.getElementById("addItem").disabled = true;

			} else {
				//document.getElementById("errorMsg").style.display = "none";
				document.getElementById("itemId").value = data.itemId;
				document.getElementById("addItem").disabled = false;
				document.getElementById("itemName").value = data.itemName;
				document.getElementById("amt").value = data.bottomPrice;
			}
		});

	}

	function addItemInBillList() {

		var itemId = $("#itemId").val();
		var itemQty = $("#itemQty").val();
		var amt = $("#amt").val();
		var flag = 1;

		if (itemId == "" || itemId == 0) {
			alert("Item");
			flag = 0;
		} else if (isNaN(itemQty) || itemQty < 0 || itemQty == "") {
			alert("Enter valid Qty");
			flag = 0;
		} else if (isNaN(amt) || amt < 0 || amt == "") {
			alert("Enter valid Ammount");
			flag = 0;
		}
		//alert(itemId + ' ' + itemQty)
		if (flag == 1) {

			$('#loader').show();
			$
					.getJSON(
							'${addItemInBillList}',

							{

								itemId : itemId,
								itemQty : itemQty,
								amt : amt,
								ajax : 'true'

							},
							function(data) {

								$('#table_grid1 td').remove();
								$('#loader').hide();

								if (data == "") {
									alert("No records found !!");

								}
								var subTotal = 0.00;
								var taxAmt = 0.00;
								var total = 0.00;
								document.getElementById("totalItem").textContent = data.length;
								$
										.each(
												data,
												function(key, itemList) {

													var tr = $('<tr></tr>');
													tr.append($('<td></td>')
															.html(key + 1));
													tr
															.append($(
																	'<td></td>')
																	.html(
																			itemList.itemName));
													tr
															.append($(
																	'<td align="right"></td>')
																	.html(
																			itemList.itemQty));
													tr
															.append($(
																	'<td align="right"></td>')
																	.html(
																			itemList.actualTaxableAmt
																					.toFixed(2)));
													tr
															.append($(
																	'<td align="right"></td>')
																	.html(
																			itemList.taxPer
																					.toFixed(2)));
													tr
															.append($(
																	'<td align="right"></td>')
																	.html(
																			itemList.actualTaxAmt
																					.toFixed(2)));
													tr
															.append($(
																	'<td align="right"></td>')
																	.html(
																			(itemList.actualTaxableAmt + itemList.actualTaxAmt)
																					.toFixed(2)));
													tr
															.append($(
																	'<td></td>')
																	.html(
																			'<a href="#" title="Delete Item" onclick="deleteItem('
																					+ key
																					+ ')">Delete</a>'));
													$('#table_grid1 tbody')
															.append(tr);
													subTotal = subTotal
															+ itemList.actualTaxableAmt;
													taxAmt = taxAmt
															+ itemList.actualTaxAmt;

												})

								document.getElementById("subTotal").textContent = subTotal
										.toFixed(2);
								document.getElementById("subTotalHidden").value = subTotal
										.toFixed(2);
								document.getElementById("taxAmt").textContent = taxAmt
										.toFixed(2);
								document.getElementById("taxAmtHidden").value = taxAmt
										.toFixed(2);
								document.getElementById("total").textContent = (subTotal + taxAmt)
										.toFixed(2);
								document.getElementById("totalHidden").value = (subTotal + taxAmt)
										.toFixed(2);
								document.getElementById("totalNonChangable").value = (subTotal + taxAmt)
										.toFixed(2);
								getDiscountOnBill();
							});

		}
	}

	function getDiscountOnBill() {

		var total = document.getElementById("totalNonChangable").value;
		var discPer = document.getElementById("discPer").value;
		var discAmt = document.getElementById("discAmt").value;

		if (discPer == "") {
			document.getElementById("discPer").value = 0;
			discPer = 0;
		}
		if (discAmt == "") {
			document.getElementById("discAmt").value = 0;
			discAmt = 0;
		}

		if (discPer == 0) {

			total = total - discAmt;
			document.getElementById("total").textContent = total.toFixed(2);
			document.getElementById("totalHidden").value = total.toFixed(2);

		} else {

			discAmt = (discPer / 100) * total;
			total = total - discAmt;
			document.getElementById("discAmt").value = discAmt.toFixed(2);
			document.getElementById("total").textContent = total.toFixed(2);
			document.getElementById("totalHidden").value = total.toFixed(2);
		}

	}
	function deleteItem(key) {

		$('#loader').show();
		$
				.getJSON(
						'${deleteItemFromBillDetail}',

						{

							key : key,
							ajax : 'true'

						},
						function(data) {

							$('#table_grid1 td').remove();
							$('#loader').hide();

							if (data == "") {
								alert("No records found !!");

							}
							var subTotal = 0.00;
							var taxAmt = 0.00;
							var total = 0.00;
							document.getElementById("totalItem").textContent = data.length;
							$
									.each(
											data,
											function(key, itemList) {

												var tr = $('<tr></tr>');
												tr.append($('<td></td>').html(
														key + 1));
												tr.append($('<td></td>').html(
														itemList.itemName));
												tr
														.append($(
																'<td align="right"></td>')
																.html(
																		itemList.itemQty));
												tr
														.append($(
																'<td align="right"></td>')
																.html(
																		itemList.actualTaxableAmt
																				.toFixed(2)));
												tr
														.append($(
																'<td align="right"></td>')
																.html(
																		itemList.taxPer
																				.toFixed(2)));
												tr
														.append($(
																'<td align="right"></td>')
																.html(
																		itemList.actualTaxAmt
																				.toFixed(2)));
												tr
														.append($(
																'<td align="right"></td>')
																.html(
																		(itemList.actualTaxableAmt + itemList.actualTaxAmt)
																				.toFixed(2)));
												tr
														.append($('<td></td>')
																.html(
																		'<a href="#" title="Delete Item" onclick="deleteItem('
																				+ key
																				+ ')">Delete</a>'));
												$('#table_grid1 tbody').append(
														tr);
												subTotal = subTotal
														+ itemList.actualTaxableAmt;
												taxAmt = taxAmt
														+ itemList.actualTaxAmt;

											})

							document.getElementById("subTotal").textContent = subTotal
									.toFixed(2);
							document.getElementById("subTotalHidden").value = subTotal
									.toFixed(2);
							document.getElementById("taxAmt").textContent = taxAmt
									.toFixed(2);
							document.getElementById("taxAmtHidden").value = taxAmt
									.toFixed(2);
							document.getElementById("total").textContent = (subTotal + taxAmt)
									.toFixed(2);
							document.getElementById("totalHidden").value = (subTotal + taxAmt)
									.toFixed(2);
							document.getElementById("totalNonChangable").value = (subTotal + taxAmt)
									.toFixed(2);
							getDiscountOnBill();
						});

	}
</script>
</html>