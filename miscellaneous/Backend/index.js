const express=require("express");
const app=express();

const port = 4000;

app.get("/register",(req,res)=>{
  res.send("starnderd GET responce");
})


app.post("/register",(req,res)=>{
    res.send("standerd POST respone");
})
app.listen("port",()=>{

    console.log("server is listing");

})

