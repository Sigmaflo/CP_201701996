import java.util.Scanner;

public class W05_1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int score;
	int numberOfStudents=0;
	int sumOfScore = 0;
	double average;
	char grade = 0;
	int	numberOfAscore = 0;
	int numberOfBscore = 0;
	int numberOfCscore = 0;
	int numberOfDscore = 0;
	int numberOfFscore = 0;
		
	System.out.println("<< ���� ó�� ���α׷��� �����մϴ� >>");
	System.out.println("");
	System.out.print("������ �Է��Ͻÿ�: ");
	score = scanner.nextInt();
	while (score>=0){
		if(score>100){
			System.out.println("����: �ִ� ���� 100�� �Ѿ����ϴ�.");
			System.out.println("");
		}
		else{
			numberOfStudents = numberOfStudents + 1;
			sumOfScore = sumOfScore + score;
			if (score>=90 ){
				grade = 'A';
				numberOfAscore = numberOfAscore + 1;
			}
			else if (score>=80) {
				grade = 'B';
				numberOfBscore = numberOfBscore + 1;
			}
			else if (score>=70) {
				grade = 'C';
				numberOfCscore = numberOfCscore + 1;
			}
			else if (score>=60) {
				grade = 'D';
				numberOfDscore = numberOfDscore + 1;
			}
			else {
				grade = 'F';
				numberOfFscore = numberOfFscore + 1;
			}
			System.out.println("  (����: "+score+", ����: "+grade+")");
		}	
		System.out.print("������ �Է��Ͻÿ�: ");
		score = scanner.nextInt();
	}
	average = (double)sumOfScore/(double)numberOfStudents;
	System.out.println("");
	System.out.println("�л����� "+numberOfStudents+"���Դϴ�.");
	
	System.out.println("A�� "+numberOfAscore+" �� �Դϴ�.");
	System.out.println("B�� "+numberOfBscore+" �� �Դϴ�.");
	System.out.println("C�� "+numberOfCscore+" �� �Դϴ�.");
	System.out.println("D�� "+numberOfDscore+" �� �Դϴ�.");
	System.out.println("F�� "+numberOfFscore+" �� �Դϴ�.");
	
	System.out.println("����� "+average+" �Դϴ�.");
	System.out.println("");
	
	scanner.close();
	System.out.println("<< ���� ó�� ���α׷��� �����մϴ� >>");
	}
	
}