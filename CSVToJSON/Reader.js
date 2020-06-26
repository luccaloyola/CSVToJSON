var fs=require('fs');
console.log('Program is starded.');
const brasilCSV=fs.readFileSync('brasil.csv','utf-8');
module.exports={brasilCSV:brasilCSV};
console.log('Program just finished read the file.');