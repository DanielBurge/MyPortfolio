package filereader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) {
		//FileReader = read the content of a file
		System.out.println(new File("\"C:\\Users\\dburg\\OneDrive\\Desktop\\art.txt\"").getAbsolutePath());
		try {
			FileReader reader = new FileReader("Desktop\\art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
