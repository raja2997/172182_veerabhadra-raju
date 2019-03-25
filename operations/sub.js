const sub=(num1,num2)=>num1-num2;
const mul=(num1,num2)=>num1*num2;
var strftime = require('strftime') // not required in browsers
var strftimeIT = strftime.localizeByIdentifier('it_IT')
const date=(strftimeIT("Today is:"+'%d %Y %H:%M:%S'))

module.exports={sub:sub,date:date};