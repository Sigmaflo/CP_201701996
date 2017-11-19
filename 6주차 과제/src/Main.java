
public class Main {
		
	public static void main(String[] args) {
		System.out.println("<<양의 정수의 값을 별의 개수로 출력하는 프로그램을 시작합니다>>");
		System.out.println("");
		
		int degreeNumber = 1;
		int numberOfStar = 0;
		
			while ( degreeNumber < 110){
				numberOfStar = putNumber(degreeNumber);
				printAsterisk(numberOfStar);
				System.out.println("");
				degreeNumber = degreeNumber + 5;
			}
			
		System.out.println("");
		System.out.println("<<양의 정수의 값을 별의 개수로 출력하는 프로그램을 종료합니다>>");
		
	}
	
	private static void printAsterisk (int n){
		int count = 0;
		while(count < n){
			System.out.print("*");
			count++;
		}
	}
	private static int putNumber(int degree){
		if (degree < 10){
			System.out.print("sine(00"+degree+"도): ");
		}
		else if (degree < 100){
			System.out.print("sine(0"+degree+"도): ");
		}
		else{
			System.out.print("sine("+degree+"도): ");
		}
		double radian = ((double)degree/180.0)*3.141592;
		double sineValue = MySine(radian);
		int numberOfAsterisk = (int)((sineValue*40.0) + 0.5);
		return numberOfAsterisk;
	}
	private static double MySine(double k){
		double a = Math.sin(k);
		return a;
	}

}
