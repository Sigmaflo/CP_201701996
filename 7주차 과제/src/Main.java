import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("<<���α׷��� �����մϴ�>>");
        System.out.println("");
        System.out.print("�� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��Ͻÿ�: ");
        int score_Korean = inputScore();
        int score_English = inputScore();
        int score_Computer = inputScore();
        while ((score_Korean >= 0) || (score_English >= 0) || (score_Computer >= 0)) {
            if ((score_Korean > 100) || (score_English > 100) || (score_Computer > 100)) {
                System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
                System.out.println("");
            } else {
                char grade_Korean = score2Grade(score_Korean);
                char grade_English = score2Grade(score_English);
                char grade_Computer = score2Grade(score_Computer);
                double point_korean = score2Point(grade_Korean);
                double point_English = score2Point(grade_English);
                double point_Computer = score2Point(grade_Computer);
                System.out.println("[�� ��] ����: " + score_Korean + ", ����: " + grade_Korean + ", ����: " + point_korean);
                System.out.println("[�� ��] ����: " + score_English + ", ����: " + grade_English + ", ����: " + point_English);
                System.out.println("[��ǻ��] ����: " + score_Computer + ", ����: " + grade_Computer + ", ����: " + point_Computer);
                double average_point = (point_korean + point_English + point_Computer) / 3;
                System.out.printf("�� �л��� ��������� %.2f �Դϴ�.", average_point);
//                System.out.println("�� �л��� ��������� " + average_point + " �Դϴ�.");
            }
            System.out.println("");
            System.out.print("�� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է½ÿ�: ");
            score_Korean = inputScore();
            score_English = inputScore();
            score_Computer = inputScore();
        }
        scanner.close();
        System.out.println("���� ������ �ԷµǾ� ���α׷��� �����մϴ�.");
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
	