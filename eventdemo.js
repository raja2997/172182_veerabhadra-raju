const EventEmitter =require('events');
const ee=new EventEmitter();
ee.on('raja',(input)=>{console.log(input);});
ee.emit('raja','venky');