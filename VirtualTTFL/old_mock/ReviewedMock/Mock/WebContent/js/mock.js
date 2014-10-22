/**
 * contents loader.
 */
$(document).ready(function() {
    jQuery.ajaxSetup({async: false});

    //define for thai in subpage
    $.ajaxSetup({
        'beforeSend': function(xhr) {
            xhr.overrideMimeType('text/html; charset=UTF-8');
        }, async: false
    });

    $("#header").load("header.html");
    
    
   
        $("#content").load("SAL010101.html");
   
    
    
    
    $("#footer").load("footer.html");
    $.slidebars();
    /*
     $('#btnOpenLeft').click(function(){
     $.slidebars.open('left');
     });
     */
    //menu tree with its navigate function
    $("#tree").fancytree({
        activate: function(event, data) {
            var node = data.node;
            if (node.data.href) {
                $("#content").load(node.data.href);
                $.slidebars.close();
            }
        }
    });
    }
);

    function SearchCustomer() {
        var customerSearch = window.open("searchCustomer.html", "customerSearch", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=300,width=675,left=200,top=200,screenX=1,screenY=1");
        customerSearch.focus();
    }
/*   
function addSaleActivity() {
        var saleAct = window.open("SAL010103.html", "CustomerCard", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=300,width=720,left=200,top=200,screenX=1,screenY=1");
        saleAct.focus();
    }
    function addAsset() {
        var asset = window.open("SAL010104.html", "Asset", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=200,width=600,left=1,top=1,screenX=1,screenY=1");
        asset.focus();
    }*/
    function SelectModel() {
   		var selectModel = window.open("selectModel.html", "selectModel", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=500,width=675,left=1,top=1,screenX=10px,screenY=10px");
   		selectModel.focus();
	}
	function SelectComponentJP() {
   		var selectComponentJP = window.open("selectComponentJP.html", "selectComponentJP", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=445,width=675,left=1,top=1,screenX=10px,screenY=10px");
   		selectComponentJP.focus();
	}
	function SelectComponentLocal() {
   		var selectComponentLocal = window.open("selectComponentLocal.html", "selectComponentLocal", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=445,width=675,left=1,top=1,screenX=10px,screenY=10px");
   		selectComponentLocal.focus();
	}
	function SelectCompany() {
   		var selectCompany = window.open("OTH010103.html", "selectCompany", "status=0,toolbar=0,location=0,menubar=0,directories=0,resizable=0,scrollbars=0,height=330,width=650,left=1,top=1,screenX=10px,screenY=10px");
   		selectCompany.focus();
	}
        function goToCostsheet(){
             $("#content").load("SAL010201.html");
        }
        
        function goToQuotation(){
             $("#content").load("SAL010302.html");
        }
        
        function goToDashborad(){
             $("#content").load("SAL010101.html");
        }
        function goToLogin(){
            window.location="login.html";
        }
         function goToApprovalWorkflowEntry(){
            $("#content").load("OTH010202.html");
        }
        function goToSaleOrderEntry(){
             $("#content").load("SAL010402.html");
        }
        function goToSaleOrderInquiry(){
             $("#content").load("SAL010401.html");
        }
        function goToQuotationEntry(){
             $("#content").load("SAL010302.html");
        }
         function goToPDIRequestInquiry(){
             $("#content").load("SAL020101.html");
        }
         function goToPDIRequestEntry(){
             $("#content").load("SAL020102.html");
        }
        function addSaleActivity() {
            $("#content").load("SAL010103.html");
        }
         function addAsset() {
             
             $("#content").load("SAL010104.html");
         }
        
        