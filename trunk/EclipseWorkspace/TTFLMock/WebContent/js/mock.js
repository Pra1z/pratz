/**
 * contents loader.
 */
$(document).ready(function(){
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
		        }
		      }
		});
	}
);