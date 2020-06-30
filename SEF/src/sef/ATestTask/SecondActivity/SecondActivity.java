package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		SecondActivity calculator = new SecondActivity();
	
	        // Add
	        double result1 = calculator.add(10.2, 5);
	        System.out.println("1) Add result is " + result1);

	        // Subtract
	        double result2 = calculator.sub(100, 33);
	        System.out.println("2) Sub result is " + result2);

	        // Multiply
	        double result3 = calculator.mul(33, 7);
	        System.out.println("3) Multiply result is " + result3);

	        // Divide
	        double result4 = calculator.div(5, 0);
	        System.out.println("4) Devide result is " + result4);

	    }

	    private double div(double x, double y) {
	        if(y != 0.0) {
	            return x/y;
	        } else {
	            System.out.println("You can not devide by 0!");
	            return Double.NaN;
	        }
	    }

	    private double mul(double x, double y) {
	        return x*y;
	    }

	    private double sub(double x, int y) {
	        return x-y;
	    }

	    private double add(double x, double y) {
	        return x+y;
	    }
	    

}
