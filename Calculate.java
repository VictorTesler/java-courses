import static java.lang.Math.*;

public class Calculate {
	
		public static void main(String[] arg) {
			
			System.out.println("Calculate...");
			
			Double a = Double.valueOf(arg[0]);
			Double b = Double.valueOf(arg[1]);
			
			System.out.println ("Sum " +  ( a + b));
			System.out.println ("Residual " +  ( a - b));
			System.out.println ("op " +  ( a * b));
			System.out.println ("division " +  ( a / b));
			System.out.println("power " + (pow(a,b)));
		}
		
}