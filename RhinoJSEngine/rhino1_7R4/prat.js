print("start pratz.js try to override print()");



function print(){
	java.lang.System.out.println('my print');	
	for( var i = 0; i < arguments.length; i++ ) {
       var value = arguments[i];
       java.lang.System.out.print( value );
    }
    java.lang.System.out.println();
}



try{

print("exit");

} catch (e) {
	print("Exception e: "+e);
}