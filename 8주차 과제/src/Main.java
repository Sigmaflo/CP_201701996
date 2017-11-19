import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);

    private static final int MAX_SIZE = 100;

    public static void main(String[] args){
        int[] scoresKorean = new int[MAX_SIZE];
        int[] scoresComputer = new int[MAX_SIZE];
        double [] studentAverages = new double[MAX_SIZE];
        System.out.print("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
        int scoreKorean = inputscore();
        int scoreComputer = inputscore();
        int numberOfStudent = 0;
        while (scoreKorean>=0 || scoreComputer>=0){
            if (scoreKorean>100 || scoreComputer>100){
               System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
               System.out.print("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
               scoreKorean = inputscore();
               scoreComputer = inputscore();            }
            else{
                scoresKorean[numberOfStudent] = scoreKorean;
                scoresComputer[numberOfStudent] = scoreComputer;
                numberOfStudent++;
                System.out.print("두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오: ");
                scoreKorean = inputscore();
                if(scoreKorean>=0){
                    scoreComputer = inputscore();
                }
                else {
                    scoreComputer = -1;
                }
            }
        }

        System.out.println("음수가 입력되어 입력을 종료합니다.");
        System.out.println("");
        System.out.println("모두 "+numberOfStudent+" 명의 성적이 입력되었습니다.");
        System.out.println("");
        System.out.println("입력된 성적과 개인평균은 다음과 같습니다.");
        int i = 0;
        double total = 0;
        int aboveOfStuent = 0;
        while (i < numberOfStudent){
            System.out.print("["+i+"] "+scoresKorean[i]+" "+scoresComputer[i]);
            studentAverages[i] = ((double)scoresKorean[i]+(double)scoresComputer[i])/2;
            System.out.println("(평균 "+studentAverages[i]+")");
            total = total +studentAverages[i];
            i++;
        }
        double classAverages = total / (double)numberOfStudent;
        System.out.printf("학급평균은 %.2f 입니다.\n", classAverages);
        int k = 0;
        while (k < numberOfStudent){
            if (studentAverages[k]>classAverages) {
                aboveOfStuent = aboveOfStuent + 1;
                k++;
            }
            else{
                k++;
            }
        }

        System.out.println("평균 이상인 학생의 수는 "+aboveOfStuent+" 명 입니다");
        System.out.println("");
        System.out.println("프로그램을 종료합니다.");

    }
    private static int inputscore(){
        int ascore = scanner.nextInt();
        return ascore;
    }
}
