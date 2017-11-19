import java.util.Scanner;

public class W04_1 {

	public static void main(String[] args) {
		Scanner ascanner = new Scanner(System.in);
		char userAnswer;
		
		System.out.print("이차방정식을 풀겠습니까?");
		System.out.print(" 풀겠으면 'Y'를 입력하십시오: ");
		
		userAnswer = ascanner.next().charAt(0);
		while(userAnswer == 'Y' || userAnswer == 'y'){
			System.out.print("이차항의 계수를 입력하시오: ");
			double a = ascanner.nextDouble();
			if((-0.0000001<a)&&(a<0.0000001)){
				System.out.println("오류: 이차항의 계수가 0 이므로, 이차방정식을 풀 수 없습니다.");
				System.out.println("");
				System.out.print("다시 이차방정식을 풀겠습니까?");
				System.out.print(" 풀겠으면 'Y'를 입력하십시오: ");
				userAnswer = ascanner.next().charAt(0);
			}
			else{
				System.out.print("일차항의 계수를 입력하시오: ");
				double b = ascanner.nextDouble();

				System.out.print("상수항을 입력하시오: ");
				double c = ascanner.nextDouble();

				System.out.println("a = "+a+", b = "+b+", c = "+c);

				double determinant = b*b-4.0*a*c;
				if(determinant<0){
					System.out.println("오류: 실근이 존재하지 않으므로, 이차방적식을 풀 수 없습니다.");
					System.out.println("");
					System.out.print("다시 이차방정식을 풀겠습니까?");
					System.out.print(" 풀겠으면 'Y'를 입력하십시오: ");
					userAnswer = ascanner.next().charAt(0);
				}
				else{
					double x1 = (-b-Math.sqrt(determinant))/(2.0*a);
					double x2 = (-b+Math.sqrt(determinant))/(2.0*a);
					System.out.println("The solution is "+x1+" or "+x2);
					System.out.println("");
					System.out.print("다시 이차방정식을 풀겠습니까?");
					System.out.print(" 풀겠으면 'Y'를 입력하십시오: ");
					userAnswer = ascanner.next().charAt(0);
				}
			}
		}
		ascanner.close();
		System.out.println("이차방정식 프로그램을 종료합니다.");
	}

}
