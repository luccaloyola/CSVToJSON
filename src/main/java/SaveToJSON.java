
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class SaveToJSON{
	public void save(String fileJSON,List<String> jsonRule){
		List<String> lista=jsonRule;
		Path path=Paths.get(fileJSON);
//		Converter converter=new Converter();
//		converter.textArea.appendText("Writing to JSON");
		System.out.println("Writing to JSON");
		try{
			Files.write(path,lista,StandardCharsets.UTF_8);
		}
		catch(IOException e){
			e.printStackTrace();
		}
//		converter.textArea.appendText("The application reached its end");
		System.out.println("The application reached its end");
	}
}