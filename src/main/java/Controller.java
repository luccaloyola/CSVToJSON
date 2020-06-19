
import java.util.List;
import java.util.Vector;
import org.apache.commons.csv.CSVRecord;
public class Controller{
	private List<CSVRecord> csvRule=null;
	private List<String> jsonRule=null;
	private boolean isReading=true;
	public Controller(String pathCSV, String pathJSON){
		csvRule=new Vector<CSVRecord>();
		jsonRule=new Vector<String>();
		new ParserCSV(this,pathCSV);
		this.parserJSON();
		new SaveToJSON().save(pathJSON,jsonRule);
	}
	public void readerState(boolean state){
		isReading=state;
	}
	public synchronized boolean whileRunning(){
		return csvRule.size()>0||isReading;
	}
	public synchronized CSVRecord getCSV(){
		if(csvRule.size()>0) return csvRule.remove(0);
		return null;
	}
	public synchronized void addJson(String json){
		jsonRule.add(json);
	}
	public void addCSV(CSVRecord csvRecord){
		this.csvRule.add(csvRecord);
	}
	private void parserJSON(){
		Thread thread1=new Thread(new JSONConverter(this));
		Thread thread2=new Thread(new JSONConverter(this));
		Thread thread3=new Thread(new JSONConverter(this));
		Thread thread4=new Thread(new JSONConverter(this));
		Thread thread5=new Thread(new JSONConverter(this));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		try{
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}