package is.ru.stringcalculator;

public class calculator {

	public static int Add(String text){
		if(text.equals("")){
			return 0;
		}

		else if (text.contains(",") || text.contains("\n")) {
			String[] numbers = text.split(",|\n");
			//numbers = text.split("\n");
			int ret = 0;
			for(Integer i = 0; i < numbers.length; i++){
			 	ret += Integer.parseInt(numbers[i]);
			}
			return ret;
		}

		else{
			int ret = Integer.parseInt(text);
			return ret;
		}
	}
}