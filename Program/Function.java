/**
*author: William Scribner
*
*purpose: to do math without the Math classes, because life is pain, and programming needs to be as well.
*
*/




import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
	
		double wow = sqrt(4) + absolute(-90) + exp(9); //equation pointing at other methods to complete
		
		Scanner keyboard = new Scanner(System.in);
		
		//System.out.println("Enter any number to raise to the power of 10");
				
		System.out.println("Exponent:  " + exp(3));
		
		System.out.println("Addition: 5 + 3 = " + Addition());
		
		System.out.println("The complicated one: " + wow);
		System.out.println(wow);
		
		keyboard.close();
		
	}
	//exponent method..but it only does square ..should do tenth power..
	public static double exp(double x) {
//	return(x>=0)?x:(-1*x);
	while (x <=10) {
		x*= x;
		x++;
		
	}
	return x;
}
	//square root method
	public static double sqrt(double x) {
		
		return x;
	}
	//absolute value method
	public static double absolute(double x) {
		
		return(x>=0)?x:(-1*x);
	}
	//method that does simple ole addition
	public static int Addition() {
		
		int x = 5;
		int y = 3;
		int z = x + y;
		
		return z;
		
	}
	
	
}
