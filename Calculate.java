import static java.lang.Math.*;

public class Calculate {
	
		public static void main(String[] arg) {
			
			System.out.println("Calculate...");
			
			Double a = Double.valueOf(arg[0]);
			Double b = Double.valueOf(arg[1]);
			
			System.out.println ("����� " +  ( a + b));
			System.out.println ("������� " +  ( a - b));
			System.out.println ("������������ " +  ( a * b));
			System.out.println ("������� " +  ( a / b));
			System.out.println("������� " + (pow(a,b)));
		}
		
}