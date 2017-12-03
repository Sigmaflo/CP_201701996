public class Ban {
    private static final int MAXSTUDENTS = 50;

    public Student[] students;
    private static int _numberOfStudentsWithAboveAverage;
    private static int _numberOfStudents;
    private static int _numberOfGradeA;
    private static int _numberOfGradeB;
    private static int _numberOfGradeC;
    private static int _numberOfGradeD;
    private static int _numberOfGradeF;
    private static double _average;

    public Ban(int MAXSTUDENTS) {
        students = new Student[MAXSTUDENTS];
    }

    public int _numberOfStudentsWithAboveAverage() {
        return _numberOfStudentsWithAboveAverage;
    }

    public int _numberOfStudents() {
        return _numberOfStudents;
    }

    public int _numberOfGradeA() {
        return _numberOfGradeA;
    }

    public int _numberOfGradeB() {
        return _numberOfGradeB;
    }

    public int _numberOfGradeC() {
        return _numberOfGradeC;
    }

    public int _numberOfGradeD() {
        return _numberOfGradeD;
    }

    public int _numberOfGradeF() {
        return _numberOfGradeF;
    }

    public void addnumberOfStudents() {
        _numberOfStudents++;
    }

    public double _average() {
        return _average;
    }

    public boolean isFull() {
        return _numberOfStudents >= MAXSTUDENTS;
    }

    public void calcAverageInfo() {
        double sum = 0;

        for(int i = 0; i < _numberOfStudents; i++ ){
            sum = sum + students[i]._score();
        }
        _average = sum/ _numberOfStudents;

        for(int i = 0; i < _numberOfStudents; i++ ) {
            if (_average <= students[i]._score()){
                _numberOfStudentsWithAboveAverage++;
            }
        }
    }

    public void countStudentsByGrade() {
        char currentGrade;
        for(int i = 0; i < _numberOfStudents; i++ ) {
            currentGrade = students[i].grade(students[i]._score());
            switch (currentGrade) {
                case 'A':
                    _numberOfGradeA++;
                    break;
                case 'B':
                    _numberOfGradeB++;
                    break;
                case 'C':
                    _numberOfGradeC++;
                    break;
                case 'D':
                    _numberOfGradeD++;
                    break;
                default:
                    _numberOfGradeF++;
                    break;
            }
        }
    }

    public void studentWithOrder(int i_th) {
        System.out.println("학번: "+students[i_th]._studentNO()+", 점수: "+ students[i_th]._score()+", 학점: "+ students[i_th].grade(students[i_th]._score()));
    }
}
