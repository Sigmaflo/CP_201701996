import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("<<프로그램을 시작합니다>>");
        System.out.println("");
        System.out.print("세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력하시오: ");
        int score_Korean = inputScore();
        int score_English = inputScore();
        int score_Computer = inputScore();
        while ((score_Korean >= 0) || (score_English >= 0) || (score_Computer >= 0)) {
            if ((score_Korean > 100) || (score_English > 100) || (score_Computer > 100)) {
                System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
                System.out.println("");
            } else {
                char grade_Korean = score2Grade(score_Korean);
                char grade_English = score2Grade(score_English);
                char grade_Computer = score2Grade(score_Computer);
                double point_korean = score2Point(grade_Korean);
                double point_English = score2Point(grade_English);
                double point_Computer = score2Point(grade_Computer);
                System.out.println("[국 어] 성적: " + score_Korean + ", 학점: " + grade_Korean + ", 평점: " + point_korean);
                System.out.println("[영 어] 성적: " + score_English + ", 학점: " + grade_English + ", 평점: " + point_English);
                System.out.println("[컴퓨터] 성적: " + score_Computer + ", 학점: " + grade_Computer + ", 평점: " + point_Computer);
                double average_point = (point_korean + point_English + point_Computer) / 3;
                System.out.printf("이 학생의 평균평점은 %.2f 입니다.", average_point);
//                System.out.println("이 학생의 평균평점은 " + average_point + " 입니다.");
            }
            System.out.println("");
            System.out.print("세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력시오: ");
            score_Korean = inputScore();
            score_English = inputScore();
            score_Computer = inputScore();
        }
        scanner.close();
        System.out.println("음의 정수가 입력되어 프로그램을 종료합니다.");
    }

    private static int inputScore() {
        int score = 0;
        score = scanner.nextInt();
        return score;
    }

    private static char score2Grade(int aScore) {

        char grade = 0;

        if (aScore >= 90) {
            grade = 'A';
        } else if (aScore >= 80) {
            grade = 'B';
        } else if (aScore >= 70) {
            grade = 'C';
        } else if (aScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    private static double score2Point(char aGrade) {
        double aPoint;
        if (aGrade == 'A') {
            aPoint = 4.0;
        } else if (aGrade == 'B') {
            aPoint = 3.0;
        } else if (aGrade == 'C') {
            aPoint = 2.0;
        } else if (aGrade == 'D') {
            aPoint = 1.0;
        } else {
            aPoint = 0;
        }
        return aPoint;

    }

}
	