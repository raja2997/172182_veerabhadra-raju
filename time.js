var strftime = require('strftime') // not required in browsers
var strftimeIT = strftime.localizeByIdentifier('it_IT')
console.log(strftimeIT('%B %d, %Y %H:%M:%S')) // => aprile 28, 2011 18:21:08
