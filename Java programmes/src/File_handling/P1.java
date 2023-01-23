package File_handling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class P1 {
	public static void main(String[] args) throws IOException {
		File a = new File("C:\\Users\\praga\\Documents\\Java programs\\Arrays\\pragathinew//A.pdf");
		if(!a.exists()) {
			a.createNewFile();
			System.out.println("File created");
		}
		else {
			System.out.println("Not created");
		}											//instead of creating object for file we can create directly pass the file name in fileoutputstream
		FileOutputStream a1 = new FileOutputStream(a);//FileOutputStream a1 = new FileOutputStream("C:\\Users\\praga\\Documents\\Java programs\\Arrays\\pragathinew//A.pdf");
		String s = "Hello World";
		a1.write(s.getBytes());
		a1.close();
		FileInputStream a2 = new FileInputStream(a);
		/*for(int i=0;i<s.length();i++) {
			System.out.print((char)a2.read());
		}*/
		int i = a2.read();
		String a3 = "";
		while(i!=-1) {
			//System.out.print((char)i);
			a3 = a3 + (char)i;
			i = a2.read();
		}
		System.out.println(a3);
		a2.close();
		a.delete();
		System.out.println();
	}
}