package day5.Q2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
public class Q2 {
	public static void main(String[] args) {
	
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("story.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				
				String tokens[] = line.split(" ");
				
				for (String token : tokens) {
					 token= token.toLowerCase();
					 
						Integer freq=map.get(token);
						if(freq==null) {
							map.put(token, 1);
						}else {
							map.put(token, ++freq);
						}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey() +" appear "+ entry.getValue() + " times");
		}
		
	}
}
