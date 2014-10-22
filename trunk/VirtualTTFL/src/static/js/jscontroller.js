$(document).ready(function() {
    
    $.ajaxSetup({
        'beforeSend': function(xhr) {
            xhr.overrideMimeType('text/html; charset=UTF-8');
        }, async: false
    });
    $("#header").load("header.html");
    $("#content").load("SAL010101.html");
    $("#footer").load("footer.html");
    $.slidebars();
    $('.header-menu').click(function() {
        $.slidebars.open('left');
    });
    $("#tree").fancytree({
        activate: function(event, data) {
            var node = data.node;
            if (node.data.href) {
                $("#content").load(node.data.href);
                $.slidebars.close();
            }
        }
    });
});