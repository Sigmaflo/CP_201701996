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
        System.out.print("? �л������� �Է��Ϸ��� 'Y'��, �Է��� �����Ϸ��� 'N'�� ġ�ÿ�: ");
        return _scanner.next().equals("Y");
    }

    private String inputStudnetNO() {
        System.out.print("�й��� �Է��Ͻÿ�: ");
        return _scanner.next();
    }

    private int inputScore() {
        System.out.print("������ �Է��Ͻÿ�: ");
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
                System.out.println("����: 0���� �۰ų� 100 ���� Ŀ��, �������� ������ �ƴմϴ�.");
            }
            else {
                currentStudent = new Student();
                currentStudent.set_studentNO(studentNO);
                currentStudent.set_score(score);
                addStudent(currentStudent);
            }
            moreStudentsExist = inputMoreStudentsExist();
        }
        System.out.println("�Է��� �����մϴ�.\n");
    }

    private void addStudent(Student aStudent) {
        _ban.students[_ban._numberOfStudents()] = aStudent;
        _ban.addnumberOfStudents();
    }

    private void showStudentsInfo() {
        System.out.println("�л����� ���� ����Դϴ�");
        for( int i = 0 ; i < _ban._numberOfStudents(); i++ ){
            _ban.studentWithOrder(i);
        }
    }

    private void showAvergeInfo() {
        System.out.printf("\n��������� %.1f �Դϴ�.", _ban._average());
        System.out.println("\n��� �̻��� �л��� ��� "+_ban._numberOfStudentsWithAboveAverage()+" ���Դϴ�");
        for(int i = 0; i < _ban._numberOfStudents(); i++ ) {
            if (_ban._average() <= _ban.students[i]._score()){
                System.out.println("�й�: "+_ban.students[i]._studentNO()+". ����: "+_ban.students[i]._score()+", �й�: "+_ban.students[i].grade(_ban.students[i]._score()));
            }
        }
    }

    private void showGradeInfo() {
        System.out.println("\nA ������ ��� "+_ban._numberOfGradeA()+ " ���Դϴ�.");
        System.out.println("B ������ ��� "+_ban._numberOfGradeB()+ " ���Դϴ�.");
        System.out.println("C ������ ��� "+_ban._numberOfGradeC()+ " ���Դϴ�.");
        System.out.println("D ������ ��� "+_ban._numberOfGradeD()+ " ���Դϴ�.");
        System.out.println("F ������ ��� "+_ban._numberOfGradeF()+ " ���Դϴ�.");
    }

    public void run() {
        inputAndStoreStudentsInfo();
        showStudentsInfo();
        _ban.calcAverageInfo();
        showAvergeInfo();
        _ban.countStudentsByGrade();
        showGradeInfo();

        System.out.println("\n���α׷��� �����մϴ�.");
    }
}