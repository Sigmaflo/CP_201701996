public class AppCountroller {
    private final int MAXSTUDENTS = 50;
    private Ban _ban;
    private AppView _appView;

    public AppCountroller() {
        _ban = new Ban(MAXSTUDENTS);
        _appView = new AppView();
    }

    private void inputAndStoreStudentsInfo() {
        boolean moreStudentsExist;
        Student currentStudent;
        String studentNO;
        int score;

        moreStudentsExist = _appView.inputMoreStudentsExist() ;
        while (moreStudentsExist && (! _ban.isFull())) {
            studentNO = _appView.inputStudnetNO();
            score = _appView.inputScore();
            if ( score < 0 || score > 100) {
                System.out.println("오류: 0보다 작거나 100 보다 커서, 정상적인 점수가 아닙니다.");
            }
            else {
                currentStudent = new Student();
                currentStudent.set_studentNO(studentNO);
                currentStudent.set_score(score);
                addStudent(currentStudent);
            }
            moreStudentsExist = _appView.inputMoreStudentsExist();
        }
        System.out.println("입력을 종료합니다.\n");
    }

    private void addStudent(Student aStudent) {
        _ban.students[_ban._numberOfStudents()] = aStudent;
        _ban.addnumberOfStudents();
    }

    private void showStudentListInfo() {
        Student aStudent = null;
        this._appView.outputMessage("학생들의 성적 목록입니다");
        for( int i = 0 ; i < _ban._numberOfStudents(); i++ ){
            aStudent = this._ban.studentWithOrder(i);
            this._appView.outputStudentInfo(aStudent);
        }
    }

    private void showAvergeInfo() {
        Student aStudent = null;
        this._appView.outputAverage(_ban._average());
        this._appView.outputMessage("평균 이상인 학생의 성적은 다음과 같습니다.");
        for(int i = 0; i < _ban._numberOfStudents(); i++ ) {
            if (_ban._average() <= _ban.students[i]._score()){
                aStudent = this._ban.studentWithOrder(i);
                this._appView.outputStudentInfo(aStudent);
            }
        }
    }

    private void showGradeInfo() {
        this._appView.outputMessage("");
        this._appView.outputGradeInfo('A' , this._ban._numberOfGradeA());
        this._appView.outputGradeInfo('B' , this._ban._numberOfGradeB());
        this._appView.outputGradeInfo('C' , this._ban._numberOfGradeC());
        this._appView.outputGradeInfo('D' , this._ban._numberOfGradeD());
        this._appView.outputGradeInfo('F' , this._ban._numberOfGradeF());
        this._appView.outputMessage("");
    }

    public void run() {
        this._appView.outputMessage("<<< 성적 처리를 시작합니다 >>>");
        this.inputAndStoreStudentsInfo();
        this.showStudentListInfo();
        this._ban.calcAverageInfo();
        this.showAvergeInfo();
        this._ban.countStudentsByGrade();
        this.showGradeInfo();
        this._appView.outputMessage("" +"<<< 프로그램을 종료합니다. >>>");
    }
}