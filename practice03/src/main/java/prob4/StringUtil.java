package prob4;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		String result = "";
		
		for (String value : str) {
			result += value;
		}
		return result;
	}

}
