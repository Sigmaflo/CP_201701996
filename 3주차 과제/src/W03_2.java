import java.util.Scanner;

public class W03_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 N 까지 합계를 구하려고 합니다. N값을 입력하십시오: ");
		int givenN = scanner.nextInt();
		int sum = 0;
		int count = 1;
		while(count<=givenN){
			sum = sum + count;
			count = count + 1;
		}
		System.out.println("1부터 "+givenN+" 까지 합계는: "+sum+" 입니다.");
		scanner.close();
	}

}