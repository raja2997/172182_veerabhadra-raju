const express=require('express');
const app=express();
app.get('/index/:name/:gender',(req,res)=>{
    console.log(req.p);
    res.send("listening from 3000 port");
    res.send("Name:"+req.params.name+" "+"and gender is:"+req.params.gender);
}).listen(1000);