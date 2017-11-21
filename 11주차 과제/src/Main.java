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
        System.out.println("입력을 종료합니다.\n");
        System.out.println("학생들의 성적 목록입니다");
        for( int i = 0 ; i < numberOfStudents ; i++ ){
            System.out.println("학번: "+c1[i]._studentNO()+", 점수: "+c1[i]._score()+", 학점: "+c1[i].grade(c1[i]._score()));
        }

        System.out.printf("\n평균점수는 %.1f 입니다.\n", calcAverage());
        System.out.println("평균 이상인 학생은 모두 "+showAvergaeInfo()+" 명입니다\n");
        countStudentsByGrade();
        showGradeInfo();

        System.out.println("\n프로그램을 종료합니다.");
    }

    private static boolean inputMoreStudentsExist() {
        System.out.print("? 학생정보를 입력하려면 'Y'를, 입력을 종료하려면 'N'을 치시오: ");
        return scanner.next().equals("Y");
    }

    private static String inputStudnetNO() {
        System.out.print("학번을 입력하시오: ");
        return scanner.next();
    }

    private static int inputScore() {
        System.out.print("점수를 입력하시오: ");
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
                System.out.println("오류: 0보다 작거나 100 보다 커서, 정상적인 점수가 아닙니다.");
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
        System.out.println("A 학점은 모두 "+numberOfGtadeA+ " 명입니다.");
        System.out.println("B 학점은 모두 "+numberOfGtadeB+ " 명입니다.");
        System.out.println("C 학점은 모두 "+numberOfGtadeC+ " 명입니다.");
        System.out.println("D 학점은 모두 "+numberOfGtadeD+ " 명입니다.");
        System.out.println("F 학점은 모두 "+numberOfGtadeF+ " 명입니다.");
    }

    private static void addStudent(Student aStudent) {
        c1[numberOfStudents] = aStudent;
        numberOfStudents++;
    }

}