/*var Datastore = require('nedb')
var db = new Datastore({filename:'store.db',autoload:true});
var doc = [
            { hello: 'world', workshop:'nodasad'},
               
          {hello: 'amrita', workshop: 'node.js'},
          {hello: 'amrita', workshop: 'noasasda'},     
        ];
db.insert(doc, function (err, insertedDoc) {   // Callback is optional 
  //db.find({hello: 'amrita'},function(err,result){
    if(err) throw err;
    //console.log(result);
  //})

  // newDoc is the newly inserted document, including its _id 
  // newDoc has no key called notToBeSaved since its value was undefined 
//if(err) throw err;
//console.log(insertedDoc)
});*/
var Datastore =require('nedb')
var db=new Datastore({filename:'store.db',autoload:true});
var doc= [
          {country:'india', city:'bangalore'},
          {country:'india', city:'chennai'},
          {country:'spain', city:'madrid'}];
db.insert(doc,function(err,insertedDoc){
  db.find({country:'india'},function(err,result){if(err) throw err;
  console.log(result);})
  

  
})