import java.util.Scanner;

public class AppCountroller {
    private final int MAXSTUDENTS = 50;
    private Scanner _scanner;
    private Ban _ban;

    public AppCountroller() {
        _scanner = new Scanner(System.in);
        _ban = new Ban(MAXSTUDENTS);
    }

    private boolean inputMoreStudentsExist() {
        System.out.print("? 학생정보를 입력하려면 'Y'를, 입력을 종료하려면 'N'을 치시오: ");
        return _scanner.next().equals("Y");
    }

    private String inputStudnetNO() {
        System.out.print("학번을 입력하시오: ");
        return _scanner.next();
    }

    private int inputScore() {
        System.out.print("점수를 입력하시오: ");
        return _scanner.nextInt();
    }

    private void inputAndStoreStudentsInfo() {
        boolean moreStudentsExist;
        Student currentStudent;
        String studentNO;
        int score;

        moreStudentsExist = inputMoreStudentsExist() ;
        while (moreStudentsExist && (! _ban.isFull())) {
            studentNO = inputStudnetNO();
            score = inputScore();
            if ( score < 0 || score > 100) {
                System.out.println("오류: 0보다 작거나 100 보다 커서, 정상적인 점수가 아닙니다.");
            }
            else {
                currentStudent = new Student();
                currentStudent.set_studentNO(studentNO);
                currentStudent.set_score(score);
                addStudent(currentStudent);
            }
            moreStudentsExist = inputMoreStudentsExist();
        }
        System.out.println("입력을 종료합니다.\n");
    }

    private void addStudent(Student aStudent) {
        _ban.students[_ban._numberOfStudents()] = aStudent;
        _ban.addnumberOfStudents();
    }

    private void showStudentsInfo() {
        System.out.println("학생들의 성적 목록입니다");
        for( int i = 0 ; i < _ban._numberOfStudents(); i++ ){
            _ban.studentWithOrder(i);
        }
    }

    private void showAvergeInfo() {
        System.out.printf("\n평균점수는 %.1f 입니다.", _ban._average());
        System.out.println("\n평균 이상인 학생은 모두 "+_ban._numberOfStudentsWithAboveAverage()+" 명입니다");
        for(int i = 0; i < _ban._numberOfStudents(); i++ ) {
            if (_ban._average() <= _ban.students[i]._score()){
                System.out.println("학번: "+_ban.students[i]._studentNO()+". 점수: "+_ban.students[i]._score()+", 학번: "+_ban.students[i].grade(_ban.students[i]._score()));
            }
        }
    }

    private void showGradeInfo() {
        System.out.println("\nA 학점은 모두 "+_ban._numberOfGradeA()+ " 명입니다.");
        System.out.println("B 학점은 모두 "+_ban._numberOfGradeB()+ " 명입니다.");
        System.out.println("C 학점은 모두 "+_ban._numberOfGradeC()+ " 명입니다.");
        System.out.println("D 학점은 모두 "+_ban._numberOfGradeD()+ " 명입니다.");
        System.out.println("F 학점은 모두 "+_ban._numberOfGradeF()+ " 명입니다.");
    }

    public void run() {
        inputAndStoreStudentsInfo();
        showStudentsInfo();
        _ban.calcAverageInfo();
        showAvergeInfo();
        _ban.countStudentsByGrade();
        showGradeInfo();

        System.out.println("\n프로그램을 종료합니다.");
    }
}