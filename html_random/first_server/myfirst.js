// var express = require('express')
// var app = express()
 
// app.get('/', function (req, res) {
//   res.send('Hello World')
// })
 
// app.listen(3000)


// express//local host
// get to user, post from user(sensitive info)
//body-parser...post route
//nedb //database
//http-server

var express = require('express')
var app = express()
 app.use(express.static("public"));
app.get('/', function (req, res) {
  res.sendFile('login.html',{root:__dirname});
})
app.get('/password',function(req,res){
	res.send('you password is changed');
})
 
app.listen(3000)
