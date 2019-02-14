/*var express = require('express')
var app = express()
 
 

app.get('/', function (req, res) {
  res.send('Hello World')
})
 
 app.get('/name',function(req,res){res.send('akshay');})
app.listen(3000);
*/
var express = require('express')
var bodyParser= require('body-parser');
var app = express()
 
 app.set('view engine','ejs');

 app.use(express.static('public'));
 app.use(bodyParser.urlencoded({executed:false}));

app.get('/', function (req, res) {
  res.sendfile('public/login.html',{root:__dirname});
})
 
 app.post('/name',function(req,res){res.send('akshay');})
 app.post('/login',function(req,res)
 	{console.log(req.body);
 	var login=req.body.username;
 	var password=req.body.password;
 	if(login=='akshay'&&password=='akshay')res.render('success',{name:login});
 	else res.sendfile('public/error.html',{root:__dirname});
 
 		
 	
 	})
app.listen(3000);

/*
var express = require('express')
var bodyParser= require('body-parser');
var app = express()
 
 app.use(express.static('public'));
 app.use(bodyParser.urlencoded({executed:false}));

app.get('/', function (req, res) {
  res.sendfile('public/login.html',{root:__dirname});
})
 
 app.post('/name',function(req,res){res.send('akshay');})

 var doc=[{clg:'amrita',workshop:'node.js'},
          {clg:'amrita',workshop:'android'},
          {clg:'abc',workshop:'python'},
          {clg:'abc',workshop:'web'},
          {clg:'xyz',workshop:'hackathon'}];
 app.post('/login',function(req,res)
 	{console.log(req.body);
 	var login=req.body.username;
 	var password=req.body.password;
 	if(login=='akshay'&&password=='akshay')res.sendfile('public/success.html',{root:__dirname});
 	else res.sendfile('public/error.html',{root:__dirname});
 
 		
 	
 	})
app.listen(3000);*/
