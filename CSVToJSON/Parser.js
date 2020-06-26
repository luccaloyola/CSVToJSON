const Reader=require('./Reader');
var Papa=require('papaparse');
console.log('Program is parsing data.');
(async ()=>{
    try{
        Papa.parse(Reader.brasilCSV,{
            header:true,
            delimiter:'\n',
            complete:function(results){
                var rows=results.data;
                module.exports={rows:rows};
            }
        });
    }
    catch(err){
        console.log(err);
    }
})();
console.log('Program finished to parse data.');
