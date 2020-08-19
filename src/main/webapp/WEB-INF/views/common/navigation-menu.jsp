<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<jsp:useBean id="date" class="java.util.Date" />


<aside id="leftsidebar" class="sidebar">
	<!-- User Info -->


	<%--  <div class="user-info">
      <div class="image">
            <img src="${pageContext.request.contextPath}/resources/images/user.png" width="48" height="48" alt="User" />
        </div> 
        <div class="info-container">
            <div class="name" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">John Doe</div>
            <div class="email">john.doe@example.com</div>
            <div class="btn-group user-helper-dropdown">
                <i class="material-icons" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">keyboard_arrow_down</i>
                <ul class="dropdown-menu pull-right">
                    <li><a href="javascript:void(0);"><i class="material-icons">person</i>Profile</a></li>
                    <li role="separator" class="divider"></li>
                    <li><a href="javascript:void(0);"><i class="material-icons">input</i>Sign Out</a></li>
                </ul>
            </div>
        </div>
    </div> --%>


	<!-- #User Info -->
	<!-- Menu -->
	<div class="menu">
		<ul class="list" id="ul">
			<li class="accordion-toggle "><a
				href="${pageContext.request.contextPath}/home"> <i
					class="material-icons">Home</i> <span>Home</span>
			</a></li>


			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">widgets</i> <span>Master</span>
			</a>
				<ul class="ml-menu">

				 <li><a href="${pageContext.request.contextPath}/showAddVendor">Vendor</a></li>
					<li><a href="${pageContext.request.contextPath}/showCategoryForm">Category</a></li>
					<li><a href="${pageContext.request.contextPath}/showAddSubCategory">Sub Category</a></li>
						<li><a href="${pageContext.request.contextPath}/showAddItemType">Item Type</a></li>
						<li><a href="${pageContext.request.contextPath}/showAllItems">Show Items</a></li>
					
					


				</ul></li> 

 

		 <li><a href="javascript:void(0);" class="menu-toggle"> <i
					class="material-icons">swap_calls</i> <span>Add Item</span>
			</a>
				<ul class="ml-menu">
				
				 
				
					<li><a href="${pageContext.request.contextPath}/showAddItem">Item</a></li>
					 
				</ul></li>  
				
				 <li><a href="javascript:void(0);" class="menu-toggle"> <i
					class="material-icons">swap_calls</i> <span>Billing</span>
			</a>
				<ul class="ml-menu">
				
				 
				
					<li><a href="${pageContext.request.contextPath}/redimedBilling">Readymade</a></li>
					<li><a href="${pageContext.request.contextPath}/stichinBilling">Non Readymade billing</a></li>
					 
				</ul></li>  
				
				
			<%-- <li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">assignment</i> <span>Forms</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/forms/basic-form-elements.html">Basic
							Form Elements</a></li>
					<li><a href="pages/forms/advanced-form-elements.html">Advanced
							Form Elements</a></li>
					<li><a href="pages/forms/form-examples.html">Form Examples</a>
					</li>
					<li><a href="pages/forms/form-validation.html">Form
							Validation</a></li>
					<li><a href="pages/forms/form-wizard.html">Form Wizard</a></li>
					<li><a href="pages/forms/editors.html">Editors</a></li>
				</ul></li>

			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">perm_media</i> <span>Medias</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/medias/image-gallery.html">Image
							Gallery</a></li>
					<li><a href="pages/medias/carousel.html">Carousel</a></li>
				</ul></li>
			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">pie_chart</i> <span>Charts</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/charts/morris.html">Morris</a></li>
					<li><a href="pages/charts/flot.html">Flot</a></li>
					<li><a href="pages/charts/chartjs.html">ChartJS</a></li>
					<li><a href="pages/charts/sparkline.html">Sparkline</a></li>
					<li><a href="pages/charts/jquery-knob.html">Jquery Knob</a></li>
				</ul></li>
			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">content_copy</i>
					<span>Example Pages</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/examples/profile.html">Profile</a></li>
					<li><a href="pages/examples/sign-in.html">Sign In</a></li>
					<li><a href="pages/examples/sign-up.html">Sign Up</a></li>
					<li><a href="pages/examples/forgot-password.html">Forgot
							Password</a></li>
					<li><a href="pages/examples/blank.html">Blank Page</a></li>
					<li><a href="pages/examples/404.html">404 - Not Found</a></li>
					<li><a href="pages/examples/500.html">500 - Server Error</a></li>
				</ul></li>
			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">map</i> <span>Maps</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/maps/google.html">Google Map</a></li>
					<li><a href="pages/maps/yandex.html">YandexMap</a></li>
					<li><a href="pages/maps/jvectormap.html">jVectorMap</a></li>
				</ul></li>
			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">trending_down</i>
					<span>Multi Level Menu</span>
			</a>
				<ul class="ml-menu">
					<li><a href="javascript:void(0);"> <span>Menu Item</span>
					</a></li>
					<li><a href="javascript:void(0);"> <span>Menu Item
								- 2</span>
					</a></li>
					<li><a href="javascript:void(0);" class="menu-toggle"> <span>Level
								- 2</span>
					</a>
						<ul class="ml-menu">
							<li><a href="javascript:void(0);"> <span>Menu
										Item</span>
							</a></li>
							<li><a href="javascript:void(0);" class="menu-toggle"> <span>Level
										- 3</span>
							</a>
								<ul class="ml-menu">
									<li><a href="javascript:void(0);"> <span>Level
												- 4</span>
									</a></li>
								</ul></li>
						</ul></li>
				</ul></li>



			<li class="accordion-toggle"><a href="javascript:void(0);"
				class="menu-toggle"> <i class="material-icons">view_list</i> <span>Tables</span>
			</a>
				<ul class="ml-menu">
					<li><a href="pages/tables/normal-tables.html">Normal
							Tables</a></li>
					<li><a href="${pageContext.request.contextPath}/jq">Jquery
							Datatables</a></li>
					<li><a href="pages/tables/editable-table.html">Editable
							Tables</a></li>
				</ul></li>
			<li><a href="pages/changelogs.html"> <i
					class="material-icons">update</i> <span>Changelogs</span>
			</a></li>
			<li class="header">LABELS</li>
			<li><a href="javascript:void(0);"> <i
					class="material-icons col-red">donut_large</i> <span>Important</span>
			</a></li>
			<li><a href="javascript:void(0);"> <i
					class="material-icons col-amber">donut_large</i> <span>Warning</span>
			</a></li>
			<li><a href="javascript:void(0);"> <i
					class="material-icons col-light-blue">donut_large</i> <span>Information</span>
			</a></li> --%>
		</ul> 
	</div>
	<!-- #Menu -->

	<!-- Footer -->
	<div class="legal">
		<div class="copyright">
			&copy;
			<fmt:formatDate value="${date}" pattern="yyyy" />
			<a href="javascript:void(0);">Mavric Soft.</a>
		</div>
	</div>
	<!-- #Footer -->

</aside>
