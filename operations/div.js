const sum=(num1,num2)=>num1+num2;
const div=(num1,num2)=>num1/num2;
var strftime = require('strftime') // not required in browsers
var strftimeIT = strftime.localizeByIdentifier('it_IT')
const date=(strftimeIT("Today is:"+'%d %Y %H:%M:%S'))

module.exports={div:div,date:date};