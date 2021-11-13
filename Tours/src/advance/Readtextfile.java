package advance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readtextfile {

	public static void main(String[] args) throws IOException {
		
		String Fpath = "C:\\Users\\aman7\\OneDrive\\Desktop\\reading.txt\\";
		
		BufferedReader bf = new BufferedReader(new FileReader(Fpath));
		String startLine;
		
		while((startLine = bf.readLine())!=null)
		{
			System.out.println(startLine);
		}
		
		
	}

}
