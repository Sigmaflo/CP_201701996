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
		
	System.out.println("<< 성적 처리 프로그램을 시작합니다 >>");
	System.out.println("");
	System.out.print("성적을 입력하시오: ");
	score = scanner.nextInt();
	while (score>=0){
		if(score>100){
			System.out.println("오류: 최대 점수 100을 넘었습니다.");
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
			System.out.println("  (성적: "+score+", 학점: "+grade+")");
		}	
		System.out.print("성적을 입력하시오: ");
		score = scanner.nextInt();
	}
	average = (double)sumOfScore/(double)numberOfStudents;
	System.out.println("");
	System.out.println("학생수는 "+numberOfStudents+"명입니다.");
	
	System.out.println("A는 "+numberOfAscore+" 명 입니다.");
	System.out.println("B는 "+numberOfBscore+" 명 입니다.");
	System.out.println("C는 "+numberOfCscore+" 명 입니다.");
	System.out.println("D는 "+numberOfDscore+" 명 입니다.");
	System.out.println("F는 "+numberOfFscore+" 명 입니다.");
	
	System.out.println("평균은 "+average+" 입니다.");
	System.out.println("");
	
	scanner.close();
	System.out.println("<< 성적 처리 프로그램을 종료합니다 >>");
	}
	
}