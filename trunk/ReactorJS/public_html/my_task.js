console.log('my_task.js - start');


postMessage(":: Server Ready ::");

onmessage = function (oEvent) {
    postMessage("Server got: " + oEvent.data);
     //close();
};

onerror = function(oEvent){
    console.log('onerror in my_task');
};

console.log('my_task.js - end');

