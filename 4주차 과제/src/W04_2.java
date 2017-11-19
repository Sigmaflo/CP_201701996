import java.util.Scanner;

public class W04_2 {

	public static void main(String[] args) {
		Scanner ascanner = new Scanner(System.in);
		char userAnswer;
		System.out.print("Factorial을 계산하겠습니까?");
		System.out.print(" 계산하겠으면 'Y'를 입력하십시오: ");
		userAnswer = ascanner.next().charAt(0);
		
		while(userAnswer == 'Y' || userAnswer == 'y'){
			System.out.print("N!의 값을 구하려고 합니다. N값을 입력하십시오: ");
			int givenN = ascanner.nextInt();
			if(givenN<0){
				System.out.println("입력이 음수임으로, Factorial 값을 계산할 수 없습니다."); 
				System.out.println("");
				System.out.print("다시 Factorial을 계산하겠습니까?");
				System.out.print(" 계산하겠으면 'Y'를 입력하십시오: ");	
				userAnswer = ascanner.next().charAt(0);
			}
			else{
				int fact = 1;
				int count = 1;
				if(givenN==0){
					System.out.println("0!의 값은: " +fact+ " 입니다.");
					System.out.println("");
					System.out.print("다시 Factorial을 계산하겠습니까?");
					System.out.print(" 계산하겠으면 'Y'를 입력하십시오: ");	
					userAnswer = ascanner.next().charAt(0);
				}
				else{
					while(count<=givenN){
						fact = fact*count;
						count = count + 1;
					}
					System.out.println(givenN+"!의  값은: "+fact+" 입니다.");
					System.out.println("");
					System.out.print("다시 Factorial을 계산하겠습니까?");
					System.out.print(" 계산하겠으면 'Y'를 입력하십시오: ");	
					userAnswer = ascanner.next().charAt(0);
				}
			}
		}
		ascanner.close();
		System.out.println("Factorial계산 프로그램을 종료합니다.");
	}
}
