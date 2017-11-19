import java.util.Scanner;

public class W04_1 {

	public static void main(String[] args) {
		Scanner ascanner = new Scanner(System.in);
		char userAnswer;
		
		System.out.print("������������ Ǯ�ڽ��ϱ�?");
		System.out.print(" Ǯ������ 'Y'�� �Է��Ͻʽÿ�: ");
		
		userAnswer = ascanner.next().charAt(0);
		while(userAnswer == 'Y' || userAnswer == 'y'){
			System.out.print("�������� ����� �Է��Ͻÿ�: ");
			double a = ascanner.nextDouble();
			if((-0.0000001<a)&&(a<0.0000001)){
				System.out.println("����: �������� ����� 0 �̹Ƿ�, ������������ Ǯ �� �����ϴ�.");
				System.out.println("");
				System.out.print("�ٽ� ������������ Ǯ�ڽ��ϱ�?");
				System.out.print(" Ǯ������ 'Y'�� �Է��Ͻʽÿ�: ");
				userAnswer = ascanner.next().charAt(0);
			}
			else{
				System.out.print("�������� ����� �Է��Ͻÿ�: ");
				double b = ascanner.nextDouble();

				System.out.print("������� �Է��Ͻÿ�: ");
				double c = ascanner.nextDouble();

				System.out.println("a = "+a+", b = "+b+", c = "+c);

				double determinant = b*b-4.0*a*c;
				if(determinant<0){
					System.out.println("����: �Ǳ��� �������� �����Ƿ�, ������������ Ǯ �� �����ϴ�.");
					System.out.println("");
					System.out.print("�ٽ� ������������ Ǯ�ڽ��ϱ�?");
					System.out.print(" Ǯ������ 'Y'�� �Է��Ͻʽÿ�: ");
					userAnswer = ascanner.next().charAt(0);
				}
				else{
					double x1 = (-b-Math.sqrt(determinant))/(2.0*a);
					double x2 = (-b+Math.sqrt(determinant))/(2.0*a);
					System.out.println("The solution is "+x1+" or "+x2);
					System.out.println("");
					System.out.print("�ٽ� ������������ Ǯ�ڽ��ϱ�?");
					System.out.print(" Ǯ������ 'Y'�� �Է��Ͻʽÿ�: ");
					userAnswer = ascanner.next().charAt(0);
				}
			}
		}
		ascanner.close();
		System.out.println("���������� ���α׷��� �����մϴ�.");
	}

}
