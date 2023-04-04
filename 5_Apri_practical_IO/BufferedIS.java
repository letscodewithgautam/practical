package april_5_23_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedIS {
	public static void main(String[] args) {
		try {
			FileInputStream f = new FileInputStream("D:\\1234.txt");
			BufferedInputStream b = new BufferedInputStream(f);
			int i;
			while((i=b.read())!=-1){
				System.out.println((char)i);
			}
			f.close();
			b.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
