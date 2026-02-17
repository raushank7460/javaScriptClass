const express = require("express");
const mongoose = require("mongoose");
const path = require("path");

const app = express();

const User = require("./model/User");

app.use(express.urlencoded({ extended: true }));

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));

mongoose.connect("mongodb://127.0.0.1:27017/formDB")
.then(() => console.log("MongoDB Connected ✅"))
.catch(err => console.log(err));

app.get("/form", (req, res) => {
    res.render("form");
});

app.post("/submit", async (req, res) => {

    const newUser = new User(req.body);

    await newUser.save();

    res.send("Data Saved Successfully ✅");

});

app.listen(8080, () => {
    console.log("Server running on http://localhost:8080 🚀");
});
