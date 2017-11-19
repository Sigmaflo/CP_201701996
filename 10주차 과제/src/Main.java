import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        GPACounter gpaCounter = new GPACounter();
        int ScoreKorean;
        int ScoreEnglish;
        int ScoreComputer;

        System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오: ");
        ScoreKorean = inputScore();
        student.setScoreKorean(ScoreKorean);
        ScoreEnglish = inputScore();
        student.set_scoreEnglish(ScoreEnglish);
        ScoreComputer = inputScore();
        student.set_scoreComputer(ScoreComputer);

        while (ScoreKorean >= 0 || ScoreEnglish >= 0 || ScoreComputer >= 0) {
            if (ScoreKorean > 100 || ScoreEnglish > 100 || ScoreComputer > 100) {
                System.out.println("오류: 100이 넘어서 정상적인 점수가 아닙니다.\n");
                System.out.print(">세과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오: ");
                ScoreKorean =inputScore();
                student.setScoreKorean(ScoreKorean);
                ScoreEnglish =inputScore();
                student.set_scoreEnglish(ScoreEnglish);
                ScoreComputer = inputScore();
                student.set_scoreComputer(ScoreComputer);
            }
            else {
                System.out.println("[국   어] 점수: "+student._scoreKorean()+", 학점: "+student.gradeKorean()+", 평점: "+student.gradePointKorean());
                System.out.println("[영   어] 점수: "+student._scoreEnglish()+", 학점: "+student.gradeEnglish()+", 평점: "+student.gradePointEnglish());
                System.out.println("[컴퓨터] 점수: "+student._scoreComputer()+" ,학점: "+student.gradeCompter()+", 평점: "+student.gradePointComputer());
                System.out.printf("이 학생의 평균평점은 %.1f 입니다.\n\n", student.gpa());
                gpaCounter.Count(student.gpa());
                System.out.print("> 세 과목 (국어, 영어, 컴퓨터)의 점수를 차례로 입력하시오: ");
                ScoreKorean =inputScore();
                student.setScoreKorean(ScoreKorean);
                ScoreEnglish =inputScore();
                student.set_scoreEnglish(ScoreEnglish);
                ScoreComputer = inputScore();
                student.set_scoreComputer(ScoreComputer);
            }
        }
        System.out.println("음수가 입력되어 입력을 종료합니다.\n");
        System.out.println("평균평점이 3.0 이상인 학생은 "+gpaCounter._numberOfGPA3()+" 명입니다.");
        System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 "+gpaCounter._numberOfGPA2()+" 명입니다.");
        System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 "+gpaCounter._numberOfGPA1()+" 명입니다.");
        System.out.println("평균평점이 1.0 미만인 학생은 "+gpaCounter._numberOfGPA0()+" 명입니다.");
        System.out.println("프로그램을 종료합니다.");
    }

    public static int inputScore() {
        return scan.nextInt();
    }
}

class Student {
    private int _scoreKorean;
    private int _scoreEnglish;  //instance variable
    private int _scoreComputer;

    public void setScoreKorean(int aScore) {
        _scoreKorean = aScore;
    }

    public void set_scoreEnglish(int aScore) {
        _scoreEnglish = aScore;
    }

    public void set_scoreComputer(int aScore) {
        _scoreComputer = aScore;
    }

    public int _scoreKorean() {
        return _scoreKorean;
    }

    public int _scoreEnglish() {
        return _scoreEnglish;
    }

    public int _scoreComputer() {
        return _scoreComputer;
    }

    public char gradeKorean() {
        if (_scoreKorean >= 90) {
            return 'A';
        } else if (_scoreKorean >= 80) {
            return 'B';
        } else if (_scoreKorean >= 70) {
            return 'C';
        } else if (_scoreKorean > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public char gradeEnglish() {
        if (_scoreEnglish >= 90) {
            return 'A';
        } else if (_scoreEnglish >= 80) {
            return 'B';
        } else if (_scoreEnglish >= 70) {
            return 'C';
        } else if (_scoreEnglish > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public char gradeCompter() {
        if (_scoreComputer >= 90) {
            return 'A';
        } else if (_scoreComputer >= 80) {
            return 'B';
        } else if (_scoreComputer >= 70) {
            return 'C';
        } else if (_scoreComputer > 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public double gradePointKorean() {
        char curGrade = gradeKorean();
        switch (curGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double gradePointEnglish() {
        char curGrade = gradeEnglish();
        switch (curGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double gradePointComputer() {
        char curGrade = gradeCompter();
        switch (curGrade) {
            case 'A':
                return 4.0;
            case 'B':
                return 3.0;
            case 'C':
                return 2.0;
            case 'D':
                return 1.0;
            default:
                return 0.0;
        }
    }

    public double gpa() {
        double gradePointKorean, gradePointEnglish, gradePointComputer;
        gradePointKorean = gradePointKorean();
        gradePointEnglish = gradePointComputer();
        gradePointComputer = gradePointComputer();
        return (gradePointKorean+gradePointEnglish+gradePointComputer)/3;
    }
}
class GPACounter{
    private int _numberOfGPA3;
    private int _numberOfGPA2;
    private int _numberOfGPA1;
    private int _numberOfGPA0;

    public GPACounter(){
        this._numberOfGPA3 = 0;
        this._numberOfGPA2 = 0;
        this._numberOfGPA1 = 0;
        this._numberOfGPA0 = 0;
    }
    
    public int _numberOfGPA3() {
        return _numberOfGPA3;
    }

    public int _numberOfGPA2() {
        return _numberOfGPA2;
    }

    public int _numberOfGPA1() {
        return _numberOfGPA1;
    }

    public int _numberOfGPA0() {
        return _numberOfGPA0;
    }


    public void Count(double aGPA){
        if (aGPA>=3.0){
            this._numberOfGPA3++;
        }
        else if (aGPA>=2.0){
            this._numberOfGPA2++;
        }
        else if (aGPA>=1.0){
            this._numberOfGPA1++;
        }
        else{
            this._numberOfGPA0++;
        }
    }

}