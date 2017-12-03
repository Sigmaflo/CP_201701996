public class Student {
    private String _studentNO;
    private int _score;

    public Student() {
        this._studentNO = null;
        this._score = 0;
    }

    public void set_studentNO(String _studentNO) {
        this._studentNO = _studentNO;
    }

    public String _studentNO() {
        return _studentNO;
    }

    public void set_score(int _score) {
        this._score = _score;
    }

    public int _score() {
        return _score;
    }

    public char grade(int aScore){
        if (aScore >= 90){
            return 'A';
        }
        else if (aScore >= 80) {
            return 'B';
        }
        else if (aScore >= 70) {
            return 'C';
        }
        else if (aScore >= 60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
