import java.util.Scanner;

public class W04_2 {

	public static void main(String[] args) {
		Scanner ascanner = new Scanner(System.in);
		char userAnswer;
		System.out.print("Factorial�� ����ϰڽ��ϱ�?");
		System.out.print(" ����ϰ����� 'Y'�� �Է��Ͻʽÿ�: ");
		userAnswer = ascanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y'){
			System.out.print("N!�� ���� ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�: ");
			int givenN = ascanner.nextInt();
			if(givenN<0){
				System.out.println("�Է��� ����������, Factorial ���� ����� �� �����ϴ�."); 
				System.out.println("");
				System.out.print("�ٽ� Factorial�� ����ϰڽ��ϱ�?");
				System.out.print(" ����ϰ����� 'Y'�� �Է��Ͻʽÿ�: ");	
				userAnswer = ascanner.next().charAt(0);
			}
			else{
				int fact = 1;
				int count = 1;
				if(givenN==0){
					System.out.println("0!�� ����: " +fact+ " �Դϴ�.");
					System.out.println("");
					System.out.print("�ٽ� Factorial�� ����ϰڽ��ϱ�?");
					System.out.print(" ����ϰ����� 'Y'�� �Է��Ͻʽÿ�: ");	
					userAnswer = ascanner.next().charAt(0);
				}
				else{
					while(count<=givenN){
						fact = fact*count;
						count = count + 1;
					}
					System.out.println(givenN+"!��  ����: "+fact+" �Դϴ�.");
					System.out.println("");
					System.out.print("�ٽ� Factorial�� ����ϰڽ��ϱ�?");
					System.out.print(" ����ϰ����� 'Y'�� �Է��Ͻʽÿ�: ");	
					userAnswer = ascanner.next().charAt(0);
				}
			}
		}
		ascanner.close();
		System.out.println("Factorial��� ���α׷��� �����մϴ�.");
	}
}
