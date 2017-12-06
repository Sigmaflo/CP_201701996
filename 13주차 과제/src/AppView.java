import java.util.Scanner;

public class AppView {
    private Scanner _scanner;

    public AppView() {
        this._scanner = new Scanner(System.in);
    }

    public boolean inputMoreStudentsExist() {
        System.out.print("\n? 학생정보를 입력하려면 'Y'를, 입력을 종료하려면 'N'을 치시오: ");
        return _scanner.next().equals("Y");
    }

    public int inputScore() {
        System.out.print("점수를 입력하시오: ");
        return _scanner.nextInt();
    }

    public String inputStudnetNO() {
        System.out.print("학번을 입력하시오: ");
        return _scanner.next();
    }

    public void outputStudentInfo(Student aStudent) {
        System.out.println("학번: "+aStudent._studentNO()+", 점수: "+aStudent._score()+", 학점: "+aStudent.grade(aStudent._score()));
    }

    public void outputAverage(double anAverage) {
        System.out.printf("\n평균점수는 %.1f 입니다.\n", anAverage);
    }

    public void outputGradeInfo
            (char aGrade, int numberOfStudentsForGivenGrade) {
        System.out.println(aGrade+" 학점은 모두 "+numberOfStudentsForGivenGrade+ " 명입니다.");
    }

    public void outputMessage(String aMessage) {
        System.out.println(aMessage);
    }
}
