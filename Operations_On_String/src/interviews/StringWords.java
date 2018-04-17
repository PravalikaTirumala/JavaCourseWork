package interviews;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringWords {
	
	public static void main(String[] args){
		String str="India, officially the Republic of India , is "
				+ "a country in South Asia (sothern continent). It is the seventh-largest "
				+ "country by area, the second-most populous country "
				+ "(with over 1.2 billion people), and the most populous "
				+ "democracy in the world. It is bounded by the Indian Ocean"
				+ " on the south, the Arabian Sea on the southwest, and the "
				+ "Bay of Bengal on the southeast. It shares land borders "
				+ "with Pakistan to the west  China, Nepal, and Bhutan to"
				+ " the northeast; and Myanmar (Burma) and Bangladesh to"
				+ " the east. In the Indian Ocean, India is in the vicinity"
				+ " of Sri Lanka and the Maldives. India's Andaman and Nicobar "
				+ "Islands share a maritime border with Thailand and Indonesia.";
		
		
		BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
		try{
			String line = "";
	        String result = "";
	        while((line = bufferedReader.readLine()) != null)
	            result += line;

	        bufferedReader.close();
	        System.out.println(result);
			
		} catch (IOException ioe) {
		    System.out.println("IO error");
		    System.exit(1);
		} 
		
		}
		
	}
	
