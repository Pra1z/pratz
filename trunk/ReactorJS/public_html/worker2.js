onmessage = function(oEvent) {
    console.log('Event: '+oEvent.data);
    for (var i = 0; i < 10; i++) {
        postMessage('work2: '+i);
        sleep(1);
    }
    function sleep(seconds)
    {
                var e = new Date().getTime() + (seconds * 1000);
                while (new Date().getTime() <= e) {
                }
    }
};