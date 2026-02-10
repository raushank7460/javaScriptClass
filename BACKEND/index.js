const express=require("express");


const app = express();

const port = 8080;

app.use(express.urlencoded({ extended: true }));

app.listen(port ,()=>{
    console.log(`server is slisting at ${port}`);
})

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/index.html");
});
 

app.post("/studentdata",(req ,res)=>{
    console.log(req.body);
    res.send("data send kar diya ");
})
