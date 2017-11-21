import java.util.Scanner;

public class Main {
    private static final int MAXSTUDENTS = 50;

    private static Scanner scanner = new Scanner(System.in);

    private static Student[] c1 = new Student[MAXSTUDENTS];
    private static int numberOfStudents = 0;
    private static double average = 0;
    private static int numberOfGtadeA = 0;
    private static int numberOfGtadeB = 0;
    private static int numberOfGtadeC = 0;
    private static int numberOfGtadeD = 0;
    private static int numberOfGtadeF = 0;


    public static void main(String[] args) {

        inputAndStoreStudentInfo();
        System.out.println("�Է��� �����մϴ�.\n");
        System.out.println("�л����� ���� ����Դϴ�");
        for( int i = 0 ; i < numberOfStudents ; i++ ){
            System.out.println("�й�: "+c1[i]._studentNO()+", ����: "+c1[i]._score()+", ����: "+c1[i].grade(c1[i]._score()));
        }

        System.out.printf("\n��������� %.1f �Դϴ�.\n", calcAverage());
        System.out.println("��� �̻��� �л��� ��� "+showAvergaeInfo()+" ���Դϴ�\n");
        countStudentsByGrade();
        showGradeInfo();

        System.out.println("\n���α׷��� �����մϴ�.");
    }

    private static boolean inputMoreStudentsExist() {
        System.out.print("? �л������� �Է��Ϸ��� 'Y'��, �Է��� �����Ϸ��� 'N'�� ġ�ÿ�: ");
        return scanner.next().equals("Y");
    }

    private static String inputStudnetNO() {
        System.out.print("�й��� �Է��Ͻÿ�: ");
        return scanner.next();
    }

    private static int inputScore() {
        System.out.print("������ �Է��Ͻÿ�: ");
        return scanner.nextInt();
    }

    private static void inputAndStoreStudentInfo() {
        boolean moreStudentsExist;
        String studentNO ;
        int score;

        moreStudentsExist = inputMoreStudentsExist() ;
        while (moreStudentsExist && numberOfStudents < MAXSTUDENTS ) {
            studentNO = inputStudnetNO();
            score = inputScore();
            if ( score < 0 || score > 100) {
                System.out.println("����: 0���� �۰ų� 100 ���� Ŀ��, �������� ������ �ƴմϴ�.");
            }
            else {
                Student currentStudent = new Student();
                currentStudent.set_studentNO(studentNO);
                currentStudent.set_score(score);
                addStudent(currentStudent);
            }
            moreStudentsExist = inputMoreStudentsExist();
        }
    }

    private static double calcAverage() {
        double sum = 0;

        for( int i = 0 ; i < numberOfStudents ; i++ ){
            sum = sum + c1[i]._score();
        }
        return sum/numberOfStudents ;
    }

    private static int showAvergaeInfo() {
        int aboveStudent =0;
        double average = calcAverage();

        for( int i = 0 ; i < numberOfStudents ; i++ ) {
            if (average <= c1[i]._score()){
                aboveStudent++;
            }
            else {
                aboveStudent++;
            }
        }
        return aboveStudent;
    }

    private static void countStudentsByGrade() {
        char currentGrade;
        for( int i = 0 ; i <numberOfStudents ; i++ ) {
            currentGrade = c1[i].grade(c1[i]._score());
            switch (currentGrade) {
                case 'A':
                    numberOfGtadeA++;
                    break;
                case 'B':
                    numberOfGtadeB++;
                    break;
                case 'C':
                    numberOfGtadeC++;
                    break;
                case 'D':
                    numberOfGtadeD++;
                    break;
                default:
                    numberOfGtadeF++;
                    break;
            }
        }
    }

    private static void showGradeInfo() {
        System.out.println("A ������ ��� "+numberOfGtadeA+ " ���Դϴ�.");
        System.out.println("B ������ ��� "+numberOfGtadeB+ " ���Դϴ�.");
        System.out.println("C ������ ��� "+numberOfGtadeC+ " ���Դϴ�.");
        System.out.println("D ������ ��� "+numberOfGtadeD+ " ���Դϴ�.");
        System.out.println("F ������ ��� "+numberOfGtadeF+ " ���Դϴ�.");
    }

    private static void addStudent(Student aStudent) {
        c1[numberOfStudents] = aStudent;
        numberOfStudents++;
    }

}