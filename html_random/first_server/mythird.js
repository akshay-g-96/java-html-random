/*var doc = { hello: 'world'
               , n: 5
               , today: new Date()
               , nedbIsAwesome: true
               , notthere: null
               , notToBeSaved: undefined  // Will not be saved 
               , fruits: [ 'apple', 'orange', 'pear' ]
               , infos: { name: 'nedb' }
               };
 
db.insert(doc, function (err, newDoc) {   // Callback is optional 
  // newDoc is the newly inserted document, including its _id 
  // newDoc has no key called notToBeSaved since its value was undefined 
});*/
var Datastore=require('nedb');
var db=new Datastore({filename:'store.db',
autoload:true});
var doc=[{clg:'amrita',workshop:'node.js'},
          {clg:'amritha',workshop:'android'},
          {clg:'abc',workshop:'python'},
          {clg:'abc',workshop:'web'},
          {clg:'xyz',workshop:'hackathon'}];
/*db.insert(doc,function(err,insertedDoc){
  if(err) throw err;
  console.log(insertedDoc);
});*/
// db.find({clg:'amrita'},function(err,result){
//   if(err) throw err;
//  console.log(result);
// })
db.find({workshop:'node.js'},function(err,result){
  if(err) throw err;
  console.log(result);
})
