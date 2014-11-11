// if you don't want to bother invoking rhino with -opt -1 you 
// can also set the optimization level before loading scripts
Packages.org.mozilla.javascript.Context.
    getCurrentContext().setOptimizationLevel(-1);

// now load env.rhino.js and utility scripts
load('env.rhino.1.2.js'); 