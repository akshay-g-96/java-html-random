var express = require('express')
var xyz = require('body-parser');
var Datastore = require('nedb')
var db = new Datastore({filename:'store.db',autoload:true});
var doc = [
            { username: 'madhu',password:'kiran'}
                           
        ];

var app = express()
 app.use(express.static('public'));//creates a middle wear pieces of code that run before the route
app.use(xyz.urlencoded({extented:false}));

app.get('/', function (req, res) {
  res.sendFile('public/login.html',{root:__dirname});
})
app.post('/name',function(req,res)
{
	res.send('madhu');
}) 

app.post('/login',function(req,res)
{  var login = req.body.username;
	var pass = req.body.password;
	var result=db.find({username:login.tostring(),password:pass.tostring()})
	//db.insert(doc, function (err, insertedDoc) {   // Callback is optional 
  if(result)
 res.sendFile('public/success.html',{root:__dirname})
else
 res.sendFile('public/error.html',{root:__dirname 
//db.find({hello: 'amrita'},function(err,result){
    //if(err) throw err;
    //console.log(result);
  //})

//if(err) throw err;
//console.log(insertedDoc)
});
	console.log(req.body);
	// if(username=="madhu"&&password=="kiran")
	// {res.sendFile('public/success.html',{root:__dirname})}
	// 	else
	// 	res.sendFile('public/error.html',{root:__dirname})
})

app.listen(3000)
//
