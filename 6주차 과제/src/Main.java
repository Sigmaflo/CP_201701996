
public class Main {
		
	public static void main(String[] args) {
		System.out.println("<<���� ������ ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
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
		System.out.println("<<���� ������ ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		
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
			System.out.print("sine(00"+degree+"��): ");
		}
		else if (degree < 100){
			System.out.print("sine(0"+degree+"��): ");
		}
		else{
			System.out.print("sine("+degree+"��): ");
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
