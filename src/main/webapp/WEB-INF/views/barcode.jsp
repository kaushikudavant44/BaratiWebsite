<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>




 <style>
 .price-bg {
    width: 180px;
   /*  float: left; */
    height: auto;
    overflow: hidden;
    padding: 5px 5px 0 5px;
    margin: 0 0 4px 0;
    font-size: 11px;
    border-radius:14px;
    font-weight:bold;
    -webkit-box-shadow: 0px 0px 2px 2px rgba(220,227,230,1);
    -moz-box-shadow: 0px 0px 2px 2px rgba(220,227,230,1);
    box-shadow: 0px 0px 2px 2px rgba(220,227,230,1);
    }
    
     /*  * {
          color:#7F7F7F;
          font-family:Arial,sans-serif;
          font-size:12px;
          font-weight:normal;
      }    
      #config{
          overflow: auto;
          margin-bottom: 10px;
      }
      .config{
          float: left;
          width: 200px;
          height: 250px;
          border: 1px solid #000;
          margin-left: 10px;
      }
      .config .title{
          font-weight: bold;
          text-align: center;
      }
      .config .barcode2D,
      #miscCanvas{
        display: none;
      }
      #submit{
          clear: both;
      }
      #barcodeTarget,
      #canvasTarget{
        margin-top: 20px;
      }       */  
    </style>
     <script type="text/javascript" src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-barcode.js"></script>
 
     <script type="text/javascript">
    
      function generateBarcode(can){
        var value = $("#barcodeValue").val();
        var btype = 'ean8';
        var renderer = 'canvas';

        var settings = {
          output:renderer,
          bgColor: $("#bgColor").val(),
          color: $("#color").val(),
          barWidth: $("#barWidth").val(),
          barHeight: $("#barHeight").val(),
          moduleSize: $("#moduleSize").val(),
          posX: $("#posX").val(),
          posY: $("#posY").val(),
          addQuietZone: $("#quietZoneSize").val()
        };
        if ($("#rectangular").is(':checked') || $("#rectangular").attr('checked')){
          value = {code:value, rect: true};
        }
        if (renderer == 'canvas'){
          clearCanvas();
          $("#barcodeTarget").hide();
          $("#"+can).show().barcode(value, btype, settings);
        } else {
          $("#"+can).hide();
          $("#barcodeTarget").html("").show().barcode(value, btype, settings);
        }
      }
          
      function showConfig1D(){
        $('.config .barcode1D').show();
        $('.config .barcode2D').hide();
      }
      
      function showConfig2D(){
        $('.config .barcode1D').hide();
        $('.config .barcode2D').show();
      }
      
      function clearCanvas(){
        var canvas = $('#canvasTarget').get(0);
        var ctx = canvas.getContext('2d');
        ctx.lineWidth = 1;
        ctx.lineCap = 'butt';
        ctx.fillStyle = '#FFFFFF';
        ctx.strokeStyle  = '#000000';
        ctx.clearRect (0, 0, canvas.width, canvas.height);
        ctx.strokeRect (0, 0, canvas.width, canvas.height);
      } 
      
      $(function(){
        $('input[name=btype]').click(function(){
          if ($(this).attr('id') == 'datamatrix') showConfig2D(); else showConfig1D();
        });
        $('input[name=renderer]').click(function(){
          if ($(this).attr('id') == 'canvas') $('#miscCanvas').show(); else $('#miscCanvas').hide();
        });
        generateBarcode();
      });
  
    </script> 
</head>
<body>
<div class="price-bg">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
			  <tbody><tr  height="15">
					<td class="label" width="20">M.R.P </td>
				    <td>:&nbsp;Rs.<span id="mrp">399/-</span><span  style="font-size: 7px;">(Incl of all Taxes)</span></td>
			      </tr>
			  <tr style="padding-bottom: 2px;" height="15">
				<td class="label"   width="20">PRODUCT </td>
				<td>:&nbsp;<span id="product_name">MENS T-SHIRTS</span></td>
			  </tr>
			  <tr style="padding-bottom: 2px;"height="15">
			    <td class="label" width="20">SIZE </td>
				<td>:&nbsp;<span id="product_size">SMALL / 102CM.</span></td>
			  </tr>
			 <tr style="padding-bottom: 2px;"height="15">
				 <td class="label" width="20">COLOR </td>
				<td>:&nbsp;<span id="product_color">DARK PINK</span></td>
			 </tr>
			  <tr style="padding-bottom: 2px;" height="15">
				 <td class="label" width="20">NET QTY </td>
				<td>:&nbsp;<span id="product_qty">1 Pc. Pkd.Dt:05/11/19</span></td>
			 </tr>
			  <tr style="padding-bottom: 2px;"height="15">
				 <td class="label" >CODE </td>
				<td>:&nbsp;<span id="product_code">FWR03261</span></td>
			 </tr>  
			  <tr style="padding-bottom: 2px;"  height="15">
				 <td class="label" width="20">DESCRIPTION </td>
				<td >:&nbsp;<span id="product_desc">FEB D-13</span></td>
			 </tr>
			 </table>
			 <table width="100%" border="0" cellspacing="0" cellpadding="0">
			 <tr>
				 <td colspan="2" class="label" style="text-align:center;border-bottom: 1px solid #cdd0d4;"> <canvas id="canvasTarget" width="190" height="100"></canvas> </td>
			 </tr>
			  <tr style="padding-bottom: 2px;">
				 <td height="10"  style="padding-left:5px;border-bottom: 1px;  font-size: 8px;">Mfd by: Total Wardrobe Solutions</td>
			 </tr>	 
			 <tr> 
			 <td height="10" style="padding-left:5px;font-size: 7px;">503/504,Shah Sultan Complex,5th Floor,Cunningham road,Banglore-560052</td>
			</tr>
			<tr>
			 <td height="10"  style="padding-left:5px;font-size: 7px;">For Complaints Contact. &nbsp; 080-40820830</td>
			</tr>
			<tr>  
			<td height="10"  style="padding-left:5px;font-size: 7px;">E-mail: &nbsp;world@sktn.co.in</td>
			 </tr>
			 </tbody></table>
			  </div><br><br><br><br><br><br><br>
 <div id="generator">
   <input style="display: none" type="text" id="barcodeValue" value="${item.vendorId}${item.designNo}${item.itemId}">
      <div id="config">
         
             
        <div class="config" style="display: none;">
          <div class="title">Misc</div>
            Background : <input type="text" id="bgColor" value="#FFFFFF" size="7"><br /> 
            "1" Bars : <input type="text" id="color" value="#000000" size="7"><br />
          <div class="barcode1D">
            bar width: <input type="text" id="barWidth" value="2" size="3"><br />
            bar height: <input type="text" id="barHeight" value="50" size="3"><br />
          </div>
          <div class="barcode2D">
            Module Size: <input type="text" id="moduleSize" value="5" size="3"><br />
            Quiet Zone Modules: <input type="text" id="quietZoneSize" value="1" size="3"><br />
            Form: <input type="checkbox" name="rectangular" id="rectangular"><label for="rectangular">Rectangular</label><br />
          </div>
          <div id="miscCanvas">
            x : <input type="text" id="posX" value="10" size="3"><br />
            y : <input type="text" id="posY" value="20" size="3"><br />
          </div>
        </div>
             
         
      </div>
        
      <div id="submit">
        <input style="display: none" type="button" onclick="generateBarcode('canvasTarget');" value="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Generate the barcode&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">
      
      </div>
         
    </div>
    
    <div id="barcodeTarget" class="barcodeTarget"></div>
   <!--  <canvas id="canvasTarget" width="200" height="100"></canvas>  -->
  

<script>
  
 
$( window ).on( "load", function() {
	 
	 generateBarcode('canvasTarget');
}); 

</script> 
</body>
</html>