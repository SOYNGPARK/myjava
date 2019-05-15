package myjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileCompareUtil {
	public static void main(String[] args) throws Exception {
		List<String> difList = new ArrayList<String>();
		difList = compareFile("fst.txt", "scd.txt");
		for(int i=0; i<difList.size(); i++) {
			System.out.println(difList.get(i));
		}		
	}
	
	static List<String> compareFile(String fstFileName, String scdFileName) throws Exception {
		if(fstFileName==null | scdFileName==null) throw new Exception("File name is null!");
		File file1 = new File(fstFileName);
		File file2 = new File(scdFileName);
		if(!file1.exists() || !file2.exists()) throw new Exception("File is not found!");
		
		List<String> list = new ArrayList<String>();
		
		Reader reader1 = new FileReader(fstFileName);
		Reader reader2 = new FileReader(scdFileName);
		
		BufferedReader br1 = new BufferedReader(reader1);
		BufferedReader br2 = new BufferedReader(reader2);
		
		int count = 1;
		while(true) {
			String line1 = br1.readLine();
			String line2 = br2.readLine();
			if(line1 == null) {
				break;
			}
			if (!line1.equals(line2)) {
				list.add("LINE " + count +":" + line2);
			}
			count++;
		}
		return list;
	}
}
