
import java.util.Scanner;

public class W03_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a;
		System.out.print("이차항의 계수를 입력하시오: ");
		a = scanner.nextDouble();
		if((-0.0000001<a)&&(a<0.0000001)){
			System.out.println("오류: 이차항의 계수가 0 이므로, 이차방정식을 풀 수 없습니다.");
		}
		else{
			double b;
			double c;
			double determinant;
			System.out.print("일차항의 계수를 입력하시오: ");
			b = scanner.nextDouble();
		
			System.out.print("상수항을 입력하시오: ");
			c = scanner.nextDouble();
		
			System.out.println("a = "+a+",b = "+b+",c = "+c);
		
			determinant = b*b-4.0*a*c;
			if(determinant<0){
				System.out.println("오류: 실근이 존재하지 않으므로, 이차방적식을 풀 수 없습니다.");
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