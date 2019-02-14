var express = require('express')
var xyz = require('body-parser');
var Datastore = require('nedb')
var db = new Datastore({filename:'store.db',autoload:true});
var doc = [
            { username: 'madhu',password:'kiran'}
                           
        ];
db.insert(doc, function (err, insertedDoc) {
	 if(err) throw err;
  })
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

		db.find({username:login,password:pass},function(err,result)
		{
			console.log(result);
	//db.insert(doc, function (err, insertedDoc) {   // Callback is optional 
	  if(result.length!=0)
	   res.sendFile('public/success.html',{root:__dirname})
	   else
	   res.sendFile('public/error.html',{root:__dirname })
	//db.find({hello: 'amrita'},function(err,result){
    //if(err) throw err;
    //console.log(result);
  		})

//if(err) throw err;
//console.log(insertedDoc)
})
app.post('/register',function(req,res)
{  var login = req.body.newuser;
	var pass = req.body.newpass;
		var email=req.body.newemailaddress;
		db.insert({username:login,password:pass,email:email},function(err,result)
		{
			if(err) throw err;
	//db.insert(doc, function (err, insertedDoc) {   // Callback is optional 
	  
	  res.sendFile('public/success.html',{root:__dirname})
	  
	//db.find({hello: 'amrita'},function(err,result){
    //if(err) throw err;
    //console.log(result);
  		})

//if(err) throw err;
//console.log(insertedDoc)
})

//app.post('/login',function(req,res)
//{//

//}
	//console.log(req.body);
	//if(username=="madhu"&&password=="kiran")
	//{res.sendFile('public/success.html',{root:__dirname})}
	//	else
	//	res.sendFile('public/error.html',{root:__dirname})


app.listen(3000)
//
