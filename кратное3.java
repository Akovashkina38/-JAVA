
public class Main {
	public static void main(String[] args) {
		int [] numbers = new int[1000];
	
		for(int i = 0; i < numbers.length; i++)
		    numbers[i] = i;
		    
		for(int i = 0; i < numbers.length; i++)
		    if( numbers[i] %3 == 0) {
		        System.out.println(numbers[i]);
		}
	}
}