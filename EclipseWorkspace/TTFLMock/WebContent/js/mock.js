/**
 * contents loader.
 */
$(document).ready(function(){
	
		//define for thai in subpage
		$.ajaxSetup({
		    'beforeSend' : function(xhr) {
		        xhr.overrideMimeType('text/html; charset=TIS-620');
		    }
		});
	
		$("#header").load("header.html");
		$("#content").load("content.html");
		$("#footer").load("footer.html");
		$.slidebars();
		$('#btnOpenLeft').click(function(){
				$.slidebars.open('left');
		});
		
		//menu tree with its navigate function
		$("#tree").fancytree({
			activate: function(event, data) {
		        var node = data.node;
		        if( node.data.href ){
		        	$("#content").load(node.data.href);
		        	$.slidebars.close();
		        }
		      }
		});
	}
);