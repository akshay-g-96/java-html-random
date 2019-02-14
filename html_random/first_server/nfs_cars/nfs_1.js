var express =require('express')
var app=express()

app.get('/',function(req,res){
	res.sendFile('home_index.html',{root:__dirname});
})

app.listen(8080)