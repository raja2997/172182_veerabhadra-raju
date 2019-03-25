const fs=require('fs');
fs.writeFile('raja.txt','hi iam in the file',(renu)=>{
 if(renu){
     console.log(renu);
 }
 else{
     console.log("successfully created");
     fs.readFile('raja.txt','utf8',(err,file)=>{
         if(err){
             console.log(err);
         }
         else{
             console.log(file);
         }
     });
 }
});
/*fs.mkdir('raja',(err)=>{
    if(err)
    {
        console.log(err);
    }
    else{
        fs.writeFile('./raja/ex.txt','hello',(err)=>{
            if(err)
            {
                console.log(err);
            }
            else{
                console.log("sucessfully created");
            }
        });
    }
});
fs.readdir('raja',(err,file)=>{
    if(err)
    {
        console.log(err);
    }
    else{
        console.log(file);
    }
})*/