package is.ru.stringcalculator;

import java.util.ArrayList;

public class calculator {

	public static int Add(String text){


		if(text.equals("")){
			return 0;
		}

		else if (text.contains(",") || text.contains("\n")) {
			String[] numbers = text.split(",|\n");
			return stringNumbers(numbers);
		}

		else{
			int ret = Integer.parseInt(text);
			return ret;
		}
	}

	public static int stringNumbers(String[] numbers){
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
			throw new RuntimeException("Negatives not allowed: " + negativeNumb);
		}
		return ret;
	}
}