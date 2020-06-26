const fs=require('fs');
const Parser=require('./Parser');
console.log('Program is starting to save parser data to json.');
fs.writeFile('brasil.json', JSON.stringify(Parser.rows,null,''),(err)=>{
    if(err) throw err;
});
console.log('Program reached its end.');