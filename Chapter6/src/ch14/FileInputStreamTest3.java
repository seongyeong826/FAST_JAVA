package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			
			while((i = fis.read(bs)) != -1) {
				for(int ch : bs) {
					System.out.print((char)ch);
				}
				System.out.println(" : " + i + "����Ʈ ����");
			}
		} catch(IOException e) {
			System.out.println(e);
		}

	}

}
