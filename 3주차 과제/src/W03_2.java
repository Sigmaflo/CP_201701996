import java.util.Scanner;

public class W03_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1���� N ���� �հ踦 ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�: ");
		int givenN = scanner.nextInt();
		int sum = 0;
		int count = 1;
		while(count<=givenN){
			sum = sum + count;
			count = count + 1;
		}
		System.out.println("1���� "+givenN+" ���� �հ��: "+sum+" �Դϴ�.");
		scanner.close();
	}

}