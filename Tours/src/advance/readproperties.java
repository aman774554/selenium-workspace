package advance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readproperties {

	public static void main(String[] args) throws IOException  {
		
		Properties p1 = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\aman7\\OneDrive\\Desktop\\stud.properties");
		
		p1.load(fis);
		
		System.out.println(p1.getProperty("course"));
		System.out.println(p1.getProperty("name"));
		System.out.println(p1.getProperty("time"));
		System.out.println(p1.getProperty("sub-courrse"));

	}

}
