const express = require("express");
const app = express();

app.set("view engine", "ejs");

app.get("/ig/:username", (req, res) => {
    let { username } = req.params;
    const instadata = require("./data.json");

    const data = instadata[username];

    if (!data) {
        return res.send(" User not found in data.json");
    }

    res.render("instagram.ejs", { data });
});

app.listen(8080, () => {
    console.log("Server running on port 8080");
});


// 


