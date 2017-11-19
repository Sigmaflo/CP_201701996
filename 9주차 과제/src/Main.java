import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static final int MAX_SIZE = 100;

    public static void main(String[] args) {
        int[] scores = new int[MAX_SIZE];
        System.out.print("점수를 입력하시오: ");
        int score = inputscore();
        int numberOfStudents = 0;
        while (score >= 0) {
            if (score > 100) {
                System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
                System.out.print("점수를 입력하시오: ");
                score = inputscore();
            } else {
                scores[numberOfStudents] = score;
                numberOfStudents++;
                System.out.print("점수를 입력하시오: ");
                score = inputscore();
            }
        }

        System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
        System.out.println("");

        System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
        double average = calcAverage(scores, numberOfStudents);
        System.out.println("평균은" + average + "입니다.");
        System.out.println("");

        System.out.println("입력된 성적은 다음과 같습니다.");
        int i = 0;
        int aboveOfStudent = 0;
        while (i < numberOfStudents) {
            if (scores[i] >= average) {
                System.out.print("[" + i + "] " + scores[i]);
                i++;
                System.out.println(" (평균 이상입니다)");
                aboveOfStudent = aboveOfStudent + 1;
            } else {
                System.out.print("[" + i + "] " + scores[i]);
                System.out.println(" (평균 미만입니다)");
                i++;
            }
        }
        System.out.println("평균 이상인 학생의 수는 " + aboveOfStudent + " 명 입니다.");
        System.out.println("");

        int maxScore = calcMax(scores, numberOfStudents);
        int minScore = calcMin(scores, numberOfStudents);
        System.out.println("최고점은 " + maxScore + " 입니다.");
        System.out.println("최저점은 " + minScore + " 입니다.");
        System.out.println("");

        System.out.println("성적순은 다음과 같습니다.");
        selectionSort(scores, numberOfStudents);

        System.out.println("프로그램을 종료합니다.");
    }

    private static int inputscore() {
        int ascore = scanner.nextInt();
        return ascore;
    }

    private static double calcAverage(int elements[], int aSize) {
        int i = 0, sum = 0;
        double average;
        while (i < aSize) {
            sum = sum + elements[i];
            i++;
        }
        average = (double) sum / aSize;
        return average;
    }

    private static int calcMax(int elements[], int aSize) {
        int i = 0, maxScore = 0;
        while (i < aSize) {
            if (elements[i] > maxScore) {
                maxScore = elements[i];
                i++;
            }
            else{
                i++;
            }
        }
        return maxScore;
    }

    private static int calcMin(int elements[], int aSize) {
        int i = 0, minScore = 101;
        while (i < aSize) {
            if (elements[i] < minScore) {
                minScore = elements[i];
                i++;
            }
            else{
                i++;
            }
        }
        return minScore;
    }

    private static void selectionSort(int[] elements, int aSize ){
        int lastLoc = aSize -1;
        int maxLoc;
        int maxValue;
        int curLoc;

        int selectionLoc = 0;
        while (selectionLoc < lastLoc){
            maxLoc = selectionLoc;
            maxValue = elements[maxLoc];
            curLoc = selectionLoc + 1;
            while(curLoc <= lastLoc){
                if(elements[curLoc]>=maxValue){
                    maxLoc = curLoc;
                    maxValue = elements[curLoc];
                }
                curLoc++;
            }
            elements[maxLoc] = elements[selectionLoc];
            elements[selectionLoc] = maxValue;

            selectionLoc ++;
        }
        int i = 0;
        while(i<=aSize-1){
            System.out.println("["+i+"]"+elements[i]);
            i++;
        }
    }
}