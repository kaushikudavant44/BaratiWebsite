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

@import url(https://fonts.googleapis.com/css?family=Open+Sans:400,700,600);

html,
html a {
  -webkit-font-smoothing: antialiased;
  text-shadow: 1px 1px 1px rgba(0, 0, 0, 0.004);
}

body {
  background-color: #fff;
  color: black;
font-family: 'Roboto', Arial, Tahoma, sans-serif;
  font-size: 62.5%;
  margin: 0 auto;
}

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
  padding: 0;
}

input,
button {
  border: 0 none;
  outline: 0 none;
}

button {
  background-color: #eb6f6f;
  color: #fff;
}

button:hover,
button:focus {
background: linear-gradient(-45deg,#f403d1,#64b5f6);
color:#fff;
}

img,
.basket-module,
.basket-labels,
.basket-product {
  width: 100%;
}

input,
button,
.basket,
.basket-module,
.basket-labels,
.item,
.price,
.quantity,
.subtotal,
.basket-product,
.product-image,
.product-details {
  float: left;
}

.price:before,
.subtotal:before,
.subtotal-value:before,
.total-value:before,
.promo-value:before {
  content:'Rs. ';
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

.basket,
aside {
  padding: 0 1rem;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

.basket {
  width: 70%;
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

.promo-code-field:hover,
.promo-code-field:focus {
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
  margin-top: 1.625rem;background-color: #e9e9e9;
    font-size: 12px;
    text-transform: uppercase;
    letter-spacing: 0.03em;padding-right:8px;
}

ul {
  list-style: none;
  margin: 0;
  padding: 0;
}

li {
  color: #111;
  display: inline-block;
  padding: 0.625rem 0;
}

li.price:before,
li.subtotal:before {
  content: '';
}

.item {
  width: 55%;
}

.price,
.quantity,
.subtotal {
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
  color:#fff;
  float: right;width:100px;height:30px;
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
  position: relative;box-shadow: 0px 0px 9px 0px rgba(0, 0, 0, 0.1);margin-bottom:5px;
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

    font-size: 1.0rem;    padding-left: 14px;padding-top: 7px;padding-bottom: 7px;


    width: 4.75rem;

}

aside {
  float: right;
  position: relative;
  width: 30%;
}

.summary {
background: linear-gradient(-45deg,#24ff72,#9a4eff);-webkit-box-shadow: 0 10px 15px rgba(0,0,0,.1);
    box-shadow: 0 10px 15px rgba(0,0,0,.1);
    -webkit-transition: .5s;border-radius: 15px;
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

.summary-subtotal,
.summary-total {
  border-top: 1px solid #ccc;
  border-bottom: 1px solid #ccc;
  clear: both;
  margin: 1rem 0;
  overflow: hidden;
  padding: 0.5rem 0;
}

.subtotal-title,
.subtotal-value,
.total-title,
.total-value,
.promo-title,
.promo-value {
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

.subtotal-value,
.total-value {
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
  width: 100%;
   position: relative;
    z-index: 2;
    background: #fff;
    color: black;
    border-radius: 40px;
    display: block;
    margin: 20px auto 0;
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
  aside,
  .basket,
  .summary,
  .item,
  .remove {
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
  .price,
  .subtotal {
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
				<div class="row clearfix" >
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"style="height: 60px;padding-bottom: 5px;">
						<div class="card">
							<div class="header">


								<h6 class="card-inside-title">GENERATE BILL</h6>

							</div>
							
						</div>
					</div>
				</div>




				<!-- Basic Examples -->
				<div class="row clearfix">




					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"
						data-ng-init="init()">
						<div class="card" style="min-height: 500px;">
 <main>
    <div class="basket">
      <div class="basket-module">
        <label for="promo-code">Enter a code</label>
        <input id="promo-code" type="text" name="promo-code" maxlength="5" class="promo-code-field">
        <button class="promo-code-cta" style="background-color: #44ab9f;">Add Item</button>
      </div>
      <div class="basket-labels">
        <ul>
          <li class="item item-heading">Product</li>
          <li class="price">Price</li>
          <li class="quantity">Quantity</li>
          <li class="subtotal">Subtotal</li>
        </ul>
      </div>
      <div class="basket-product">
        <div class="item">
            <div class="product-image">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzwQPfxtvLZNj-V_ZAbhYNeHWYmJehIfh6UWv9fH8r8liq3vn-" alt="Placholder Image 2" class="product-frame">
          </div>
          <div class="product-details">
            <h1><strong><span class="item-quantity">4</span> x Eliza J</strong> Lace Sleeve Cuff Dress</h1>
            <p><strong>Navy, Size 18</strong></p>
            <p>Product Code - 232321939</p>
          </div>
        </div>
        <div class="price">26.00</div>
        <div class="quantity">
          <input type="number" value="4" min="1" class="quantity-field">
        </div>
        <div class="subtotal">104.00</div>
        <div class="remove" >
          <button class="checkout-cta" >Remove</button>
        </div>
      </div>
      <div class="basket-product">
        <div class="item">
            <div class="product-image">
            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToeiAGenHvcGNQSO_kw9tAXvGdVLb5GmS4tuR6RpkIzbH_O7oX" alt="Placholder Image 2" class="product-frame">
          </div>
          <div class="product-details">
            <h1><strong><span class="item-quantity">1</span> x Whistles</strong> Amella Lace Midi Dress</h1>
            <p><strong>Navy, Size 10</strong></p>
            <p>Product Code - 232321939</p>
          </div>
        </div>
        <div class="price">26.00</div>
        <div class="quantity">
          <input type="number" value="1" min="1" class="quantity-field">
        </div>
        <div class="subtotal">26.00</div>
        <div class="remove">
          <button class="checkout-cta">Remove</button>
        </div>
      </div>

    </div>
    <aside>
      <div class="summary">
        <div class="summary-total-items"><div class="demo-google-material-icon" style="width: 95%" > <i class="material-icons" style="color:white;">shopping_cart</i></div>     <span class="total-items"></span> Items in your Cart</div>
  
        <div class="summary-subtotal">
          <div class="subtotal-title">Subtotal</div>
          <div class="subtotal-value final-value" id="basket-subtotal">130.00</div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
        
 <div class="summary-subtotal">
          <div class="subtotal-title">Discount %</div>
          <div class="subtotal-value final-value" id="basket-subtotal"><input type="text" name="disc_per" id="disc_per" value="0" style="color:black;padding-left:5px;border-radius:25px;width:75px;text-align:center;"   /></div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
 <div class="summary-subtotal">
          <div class="subtotal-title">Disc In Rs</div>
          <div class="subtotal-value final-value" id="basket-subtotal"><input type="text" name="disc_amt" id="disc_amt" value="0" style="color:black;padding-left:5px;border-radius:25px;width:75px;text-align:center;"   /></div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
     
        <div class="summary-subtotal">
          <div class="subtotal-title">Tax Amt</div>
          <div class="subtotal-value final-value" id="basket-subtotal">0.00</div>
          <div class="summary-promo hide">
            <div class="promo-title">Promotion</div>
            <div class="promo-value final-value" id="basket-promo"></div>
          </div>
        </div>
        <div class="summary-total">
          <div class="total-title">Total</div>
          <div class="total-value final-value" id="basket-total">130.00</div>
        </div>
        <div class="summary-checkout">
          <button class="checkout-cta">Go to Secure Checkout</button>
        </div>
      </div>
    </aside>
  </main>
							
						</div>
					</div>
				</div>
			</div>
			<!-- #END# Basic Examples -->





		</section>




	</div>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script>
/* Set values + misc */
var promoCode;
var promoPrice;
var fadeTime = 300;

/* Assign actions */
$('.quantity input').change(function() {
  updateQuantity(this);
});

$('.remove button').click(function() {
  removeItem(this);
});

$(document).ready(function() {
  updateSumItems();
});

$('.promo-code-cta').click(function() {

  promoCode = $('#promo-code').val();

  if (promoCode == '10off' || promoCode == '10OFF') {
    //If promoPrice has no value, set it as 10 for the 10OFF promocode
    if (!promoPrice) {
      promoPrice = 10;
    } else if (promoCode) {
      promoPrice = promoPrice * 1;
    }
  } else if (promoCode != '') {
    alert("Invalid Promo Code");
    promoPrice = 0;
  }
  //If there is a promoPrice that has been set (it means there is a valid promoCode input) show promo
  if (promoPrice) {
    $('.summary-promo').removeClass('hide');
    $('.promo-value').text(promoPrice.toFixed(2));
    recalculateCart(true);
  }
});

/* Recalculate cart */
function recalculateCart(onlyTotal) {
  var subtotal = 0;

  /* Sum up row totals */
  $('.basket-product').each(function() {
    subtotal += parseFloat($(this).children('.subtotal').text());
  });

  /* Calculate totals */
  var total = subtotal;

  //If there is a valid promoCode, and subtotal < 10 subtract from total
  var promoPrice = parseFloat($('.promo-value').text());
  if (promoPrice) {
    if (subtotal >= 10) {
      total -= promoPrice;
    } else {
      alert('Order must be more than £10 for Promo code to apply.');
      $('.summary-promo').addClass('hide');
    }
  }

  /*If switch for update only total, update only total display*/
  if (onlyTotal) {
    /* Update total display */
    $('.total-value').fadeOut(fadeTime, function() {
      $('#basket-total').html(total.toFixed(2));
      $('.total-value').fadeIn(fadeTime);
    });
  } else {
    /* Update summary display. */
    $('.final-value').fadeOut(fadeTime, function() {
      $('#basket-subtotal').html(subtotal.toFixed(2));
      $('#basket-total').html(total.toFixed(2));
      if (total == 0) {
        $('.checkout-cta').fadeOut(fadeTime);
      } else {
        $('.checkout-cta').fadeIn(fadeTime);
      }
      $('.final-value').fadeIn(fadeTime);
    });
  }
}

/* Update quantity */
function updateQuantity(quantityInput) {
  /* Calculate line price */
  var productRow = $(quantityInput).parent().parent();
  var price = parseFloat(productRow.children('.price').text());
  var quantity = $(quantityInput).val();
  var linePrice = price * quantity;

  /* Update line price display and recalc cart totals */
  productRow.children('.subtotal').each(function() {
    $(this).fadeOut(fadeTime, function() {
      $(this).text(linePrice.toFixed(2));
      recalculateCart();
      $(this).fadeIn(fadeTime);
    });
  });

  productRow.find('.item-quantity').text(quantity);
  updateSumItems();
}

function updateSumItems() {
  var sumItems = 0;
  $('.quantity input').each(function() {
    sumItems += parseInt($(this).val());
  });
  $('.total-items').text(sumItems);
}

/* Remove item from cart */
function removeItem(removeButton) {
  /* Remove row from DOM and recalc cart total */
  var productRow = $(removeButton).parent().parent();
  productRow.slideUp(fadeTime, function() {
    productRow.remove();
    recalculateCart();
    updateSumItems();
  });
}
</script>
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
		src="${pageContext.request.contextPath}/resources/ng/transaction/bill/bill.js"></script>
</body>
</html>