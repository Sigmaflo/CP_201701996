
import java.util.Scanner;

public class W03_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		System.out.print("�������� ����� �Է��Ͻÿ�: ");
		a = scanner.nextDouble();
		if((-0.0000001<a)&&(a<0.0000001)){
			System.out.println("����: �������� ����� 0 �̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
		}
		else{
			double b;
			double c;
			double determinant;
			System.out.print("�������� ����� �Է��Ͻÿ�: ");
			b = scanner.nextDouble();
		
			System.out.print("������� �Է��Ͻÿ�: ");
			c = scanner.nextDouble();
		
			System.out.println("a = "+a+",b = "+b+",c = "+c);
		
			determinant = b*b-4.0*a*c;
			if(determinant<0){
				System.out.println("����: �Ǳ��� �������� �����Ƿ�, ������������ Ǯ �� �����ϴ�.");
			}
			else{
				double x1;
				double x2;
				x1 = (-b-Math.sqrt(determinant))/(2.0*a);
				x2 = (-b+Math.sqrt(determinant))/(2.0*a);
				System.out.println("The solution is "+x1+" or "+x2);
			}
		}
		scanner.close();
		
	}

}