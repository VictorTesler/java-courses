import static java.lang.Math.*;

public class Calculate {
	
		public static void main(String[] arg) {
			
			System.out.println("Calculate...");
			
			Double a = Double.valueOf(arg[0]);
			Double b = Double.valueOf(arg[1]);
			
			System.out.println ("Сумма " +  ( a + b));
			System.out.println ("Разница " +  ( a - b));
			System.out.println ("Произведение " +  ( a * b));
			System.out.println ("Деление " +  ( a / b));
			System.out.println("Степень " + (pow(a,b)));
		}
		
}