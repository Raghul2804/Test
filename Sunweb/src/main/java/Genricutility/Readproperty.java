package Genricutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class Readproperty {
	
	FileInputStream path;
	
	public String fetchproperty(String key){
		
		try {
			path =new FileInputStream("./Data/Shopperstack.properties");
		} catch (FileNotFoundException e) {
			Reporter.log("Path is wrong");
			}
		
		Properties  pObj =new Properties();
		
		try {
			pObj.load(path);
		} catch (IOException e) {
			Reporter.log("Path is wrong");
		}
		
		String data=pObj.getProperty(key);
		return data;
		
		
		
	}

}
