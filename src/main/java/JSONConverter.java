
import org.apache.commons.csv.CSVRecord;
import com.google.gson.Gson;
public class JSONConverter implements Runnable{
	private Controller controller;
	public JSONConverter(Controller controller){
		this.controller=controller;
	}
	@Override
	public void run(){
//		Converter converter=new Converter();
//		converter.setConverterStatus
		System.out.println("Converting CSV, please wait");
		do{
			CSVRecord csvRecord=controller.getCSV();
			String json=jsonConverter(csvRecord);
			controller.addJson(json);
		}while(controller.whileRunning());
	}
	private String jsonConverter(CSVRecord csvRecord){
		BrasilCSV brasilCSV=new BrasilCSV();
		brasilCSV.setNumber(csvRecord.get(0));
		brasilCSV.setGender(csvRecord.get(1));
		brasilCSV.setNameSet(csvRecord.get(2));
		brasilCSV.setTitle(csvRecord.get(3));
		brasilCSV.setGivenName(csvRecord.get(4));
		brasilCSV.setSurName(csvRecord.get(5));
		brasilCSV.setStreetAddres(csvRecord.get(6));
		brasilCSV.setCity(csvRecord.get(7));
		brasilCSV.setState(csvRecord.get(8));
		brasilCSV.setZipCode(csvRecord.get(9));
		brasilCSV.setCountryFull(csvRecord.get(10));
		brasilCSV.setEmailAddress(csvRecord.get(11));
		brasilCSV.setUsername(csvRecord.get(12));
		brasilCSV.setPassword(csvRecord.get(13));
		brasilCSV.setTelephoneNumber(csvRecord.get(14));
		brasilCSV.setBirthday(csvRecord.get(15));
		brasilCSV.setCCType(csvRecord.get(16));
		brasilCSV.setCCNumber(csvRecord.get(17));
		brasilCSV.setCVV2(csvRecord.get(18));
		brasilCSV.setCCExpires(csvRecord.get(19));
		brasilCSV.setNationalID(csvRecord.get(20));
		brasilCSV.setColor(csvRecord.get(21));
		brasilCSV.setKilograms(csvRecord.get(22));
		brasilCSV.setCintimeters(csvRecord.get(23));
		brasilCSV.setGUID(csvRecord.get(24));
		Gson gson=new Gson();
		return gson.toJson(brasilCSV,BrasilCSV.class);
	}
}