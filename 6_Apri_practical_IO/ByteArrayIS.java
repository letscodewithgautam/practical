package april_6_23_IO;

import java.io.ByteArrayInputStream;
public class ByteArrayIS {
	public static void main(String[] args) {
		byte[] arr = {68,37,35,70,39};
		ByteArrayInputStream bin = new ByteArrayInputStream(arr);
		
		int i = 0;
		while((i=bin.read())!=-1) {
			char ch = (char)i;
			System.out.println("ASCII character "+i+" "+"value is "+ch);
		}
	}
}
