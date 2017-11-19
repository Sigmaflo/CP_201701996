
public class W02_1 {
	public static void main(String[] args) {
		double a, b, c;
		double determinant;
		double x1, x2;
		
		a = 2;
		b = 4;
		c = 3;
		System.out.println("a = "+a+", b = "+b+", c = "+c);
		
		determinant = b*b-4.0*a*c;
		x1 = (-b-Math.sqrt(determinant))/(2.0*a);
		x2 = (-b+Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is "+x1+" or "+x2);

	}
}
