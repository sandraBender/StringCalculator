package is.ru.stringcalculator;

import java.util.ArrayList;

public class calculator {

	public static int Add(String text){


		if(text.equals("")){
			return 0;
		}

		else if (text.contains(",") || text.contains("\n") || text.contains("//")) {

			return stringNumbers(getSplitter(text));
		}

		else{
			int ret = Integer.parseInt(text);
			return ret;
		}
	}

	private static int stringNumbers(String[] numbers){
		int ret = 0;
		ArrayList<Integer> negativeNumb = new ArrayList<Integer>();

		for(Integer i = 0; i < numbers.length; i++){
			int number = Integer.parseInt(numbers[i]);

			if (number < 0) {
				negativeNumb.add(number);
			}
			if (number > 1000) {
				continue;
			}

			else{
			 	ret += Integer.parseInt(numbers[i]);
			}
		}
		if (negativeNumb.size() > 0) {
			throw new IllegalArgumentException("Negatives not allowed: " + negativeNumb);
		}
		return ret;
	}

	private static String[] getSplitter(String numbers){
		String del = ",|\n";

		if (numbers.startsWith("//")){
			int delimiter = numbers.indexOf("//") + 2; 
			del = del + "|" + numbers.substring(delimiter, delimiter + 1); 
			numbers = numbers.substring(delimiter + 2);
			return numbers.split(del);
		}

		else {
			return numbers.split(del);	
		}
	}
}