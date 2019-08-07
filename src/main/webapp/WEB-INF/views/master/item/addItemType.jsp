<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>Add / View Item Type</title>
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
<%-- <link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap-colorpicker/css/bootstrap-colorpicker.css"
	rel="stylesheet" />
 --%>
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
<%-- <link
	href="${pageContext.request.contextPath}/resources/plugins/bootstrap-select/css/bootstrap-select.css"
	rel="stylesheet" /> --%>

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


			<div class="body" ng-controller="itemTypeController">
				<div class="row clearfix">
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<div class="card">
							<div class="header">


								<h2 class="card-inside-title">ADD ITEM TYPE DETAILS</h2>

							</div>
							<div class="body">

								<form name="payScaleForm" ng-submit="submitAddItemType()">
									<div class="row clearfix">

										<input type="hidden" ng-model="typeId" id="typeId"
											ng-value="0">
											
											<div class="col-md-4">

											<b>Category</b> <select class="form-control" ng-change="getSubCategory()"
												ng-model="catId" id="catId" required="required">
												 
												 
													<option value="" selected="selected" disabled="disabled">Select Category</option>
												 
												 
												 <c:forEach var="category" items="${categoryList}">
												 	<option value="${category.categoryId}" >${category.categoryName}</option>
												 											 
												 </c:forEach>
											</select>

										</div>
										<div class="col-md-4">

											<b>Sub Category</b> <select class="form-control browser-default custom-select" 
											
											
											
												ng-model="subCatId" id="subCatId" required="required">
												 
												 
													<option value="" disabled="disabled" selected="selected">Select Sub Category</option>
													 
												 <option ng-repeat="subCategory in subCategoryList" value="{{subCategory.subCatId}}">
												 
												 {{ subCategory.subCatName }}
												 
												 
												 </option>
												 
												 
											</select>

										</div>
										
										<div class="col-md-4">
											<b>Item Type Title</b>

											  <div class="input-group">
												<div class="form-line">
													<input type="text" class="form-control text-center"
														ng-model="itemType" id="itemType"  placeholder="Item name"  >
												</div>
												 
											</div>
										</div>
										 

										<div class="col-md-4">
											<div class="col-md-4">
												<br>

												<button type="submit"
													class="btn btn-block btn-lg btn-primary waves-effect">Submit</button>
											</div>

										</div>
									</div>



								</form>
							</div>
						</div>
					</div>
				</div>




				<!-- Basic Examples -->
				<div class="row clearfix">




					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" data-ng-init="init()">
						<div class="card">

							<div class="header">
								<h2>JOB PAY SCALE DETAILS</h2>
							</div>

							<div class="body">
								<div class="table-responsive">
									<table id="jobListTable"
										class="table table-bordered table-striped table-hover  dataTable">
										<thead>
											<tr>
												<th>Type Title</th>
												<th>Category</th>
												<th>Sub Category</th>
											 	<th>Edit</th>
												<th>Delete</th>
											  
												<!-- <th>Action</th> -->
 
											</tr>
										</thead>
										<tfoot>
											<tr>
												<th>Type Title</th>
												<th>Category</th>
												<th>Sub Category</th>
												<th>Edit</th>
												<th>Delete</th>
												 
											 
												<!-- <th>Action</th> -->
											</tr>
										</tfoot>
										<tbody>
											<tr ng-repeat="itemType in itemTypeList">

												<td>{{ itemType.itemType }}</td>
												<td>{{ itemType.categoryName }}</td>
												<td>{{ itemType.subCatName }}</td>
												
												

												<td><a ng-click="editItemType(itemType)" class="edit-button"
													style="cursor: pointer;">Edit</a></td>
												<td><a ng-click="deleteItemType(itemType)" class="edit-button"
													style="cursor: pointer;">Delete</a></td>


											</tr>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- #END# Basic Examples -->





		</section>




	</div>

	<!-- Jquery Core Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core Js -->
	<script
		src="${pageContext.request.contextPath}/resources/plugins/bootstrap/js/bootstrap.js"></script>

	<!-- Select Plugin Js -->
	<%-- <script
		src="${pageContext.request.contextPath}/resources/plugins/bootstrap-select/js/bootstrap-select.js"></script> --%>

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
	<%-- <script
		src="${pageContext.request.contextPath}/resources/multi-select/js/jquery.multi-select.js"></script> --%>

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
		src="${pageContext.request.contextPath}/resources/ng/master/item/itemType.js"></script>
</body>
</html>