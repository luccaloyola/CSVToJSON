import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class Converter implements Initializable{
	private String pathCSV=null;
	private String pathJSON=null;
	@FXML
	public AnchorPane anchorPane;
	@FXML
	public TextArea textArea;
	@FXML
	private void handleCSVButtonAction(ActionEvent event){
		FileChooser fileChooserCSV=new FileChooser();
		fileChooserCSV.setTitle("Select CSV File");
		File fileCSV=fileChooserCSV.showOpenDialog(new Stage());
		pathCSV=fileCSV.getAbsolutePath();
		textArea.appendText("CSV File Selected\n");
	}
	@FXML
	private void handleJSONButtonAction(ActionEvent event){
		FileChooser fileChooserJSON=new FileChooser();
		fileChooserJSON.setTitle("Select JSON File");
		File fileJSON=fileChooserJSON.showOpenDialog(new Stage());
		pathJSON=fileJSON.getAbsolutePath();
		textArea.appendText("JSON File Selected\n");
	}
	@FXML
	private void handleStarterButtonAction(ActionEvent event){
		new Controller(pathCSV,pathJSON);
	}
	public synchronized final String getFileCSV(){
		return pathCSV;
	}
	public synchronized final String getFileJSON(){
		return pathJSON;
	}
//	public void setConverterStatus(String converterStatus){
//		textArea.appendText(converterStatus);
//	}
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle){
//		setConverterStatus("teste");
	}
}