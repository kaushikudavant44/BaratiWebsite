$(window).scroll(function() {
	var scrollDistance = $(window).scrollTop();
       
        var url = window.location.href;


        $(".accordion-toggle a").each(function() {
         
            if (url == (this.href)) {
            
            	window.HTMLElement.prototype.scrollIntoView = function() {};
                $(this).closest("li").addClass("active");
                $(this).addClass("toggled waves-effect waves-block")
               $(this).closest("li").parent().parent().addClass("active");
               $(this).closest(".ml-menu").css('display', 'block');
            }
        });
    }).scroll();


