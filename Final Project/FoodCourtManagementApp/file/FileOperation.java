package file;
import java.io.*;

public class FileOperation{

	private File file;
	private FileWriter fileWriter;
	private FileReader fileReader;
	private BufferedReader bfr;
	
	public void write(String text){
		try{
			file = new File("addSellHistory.txt");
			file.createNewFile();
			fileWriter = new FileWriter(file, true);
			fileWriter.write(text);
			fileWriter.flush();
			fileWriter.close();
		}catch(IOException ioe){
			//ioe.printStackTrace();
		}
	}
	
	public void read(){
		try{
			file = new File("addSellHistory.txt");
			file.createNewFile();
			fileReader = new FileReader(file);
			bfr = new BufferedReader(fileReader);
			String text = "";
			String temp;
			while((temp=bfr.readLine())!=null){
				text=text+temp+"\n"+"\r";
			}
			System.out.print(text);
			fileReader.close();
			if(text.equals("")){
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("\t"+"Add Sell History is Empty!");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println();
			}
		}catch(IOException ioe){
			//ioe.printStackTrace();
		}
	}
}