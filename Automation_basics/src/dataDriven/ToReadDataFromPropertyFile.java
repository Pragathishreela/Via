package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import genericLibrary.ReadData;

public class ToReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//creating input stream type object
		File fpath = new File("./testData/configuration.properties");
		//FileInputStream fis = new FileInputStream(fpath);
		FileReader fir = new FileReader(fpath);
		
		//creating object of file type
		Properties properties = new Properties();
		properties.load(fir);//connection b/w script and file
		
		//read methods
		Object browserKeyO = properties.get("browserKey");//object
		System.out.println(browserKeyO);
		String browserKey = browserKeyO.toString();//tostring
		System.out.println(browserKey);
		String path = properties.get("path").toString();
		String url = properties.get("url").toString();
		System.out.println(ReadData.fromPropertyFile("browserKey"));
		/*System.setProperty(browserKey, path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);*/
	}
}
