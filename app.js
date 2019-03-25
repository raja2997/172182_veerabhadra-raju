const demo=require('./operations/sum.js')
const demo1=require('./operations/sub.js')
const demo2=require('./operations/mul.js')
const demo3=require('./operations/div.js')
console.log(demo.date+"  "+demo.sum(11,11));
console.log(demo1.date+"  "+demo1.sub(11,11));
console.log(demo2.date+"  "+demo2.mul(11,11));
console.log(demo3.date+"  "+demo3.div(11,11));