require('papaparse');
const Reader=require('./Reader');
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