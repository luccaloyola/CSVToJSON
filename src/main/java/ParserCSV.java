
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
public class ParserCSV extends Converter{
	public ParserCSV(Controller Controller,String file){
//		Converter converter=new Converter();
//		converter.textArea.appendText("The Reader is started");
		System.out.println("The Reader is started");
		try(Reader reader=new FileReader(file)){
			CSVParser parser=CSVFormat.EXCEL.parse(reader);
			Controller.readerState(true);
			for(CSVRecord csvRecord:parser){
				if(parser.getCurrentLineNumber()==1) continue;
				Controller.addCSV(csvRecord);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
//		converter.textArea.appendText("The Reader is finished");
		System.out.println("The Reader is finished");
		Controller.readerState(false);
	}
}