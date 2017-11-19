import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static final int MAX_SIZE = 100;

    public static void main(String[] args) {
        int[] scores = new int[MAX_SIZE];
        System.out.print("������ �Է��Ͻÿ�: ");
        int score = inputscore();
        int numberOfStudents = 0;
        while (score >= 0) {
            if (score > 100) {
                System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
                System.out.print("������ �Է��Ͻÿ�: ");
                score = inputscore();
            } else {
                scores[numberOfStudents] = score;
                numberOfStudents++;
                System.out.print("������ �Է��Ͻÿ�: ");
                score = inputscore();
            }
        }

        System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
        System.out.println("");

        System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
        double average = calcAverage(scores, numberOfStudents);
        System.out.println("�����" + average + "�Դϴ�.");
        System.out.println("");

        System.out.println("�Էµ� ������ ������ �����ϴ�.");
        int i = 0;
        int aboveOfStudent = 0;
        while (i < numberOfStudents) {
            if (scores[i] >= average) {
                System.out.print("[" + i + "] " + scores[i]);
                i++;
                System.out.println(" (��� �̻��Դϴ�)");
                aboveOfStudent = aboveOfStudent + 1;
            } else {
                System.out.print("[" + i + "] " + scores[i]);
                System.out.println(" (��� �̸��Դϴ�)");
                i++;
            }
        }
        System.out.println("��� �̻��� �л��� ���� " + aboveOfStudent + " �� �Դϴ�.");
        System.out.println("");

        int maxScore = calcMax(scores, numberOfStudents);
        int minScore = calcMin(scores, numberOfStudents);
        System.out.println("�ְ����� " + maxScore + " �Դϴ�.");
        System.out.println("�������� " + minScore + " �Դϴ�.");
        System.out.println("");

        System.out.println("�������� ������ �����ϴ�.");
        selectionSort(scores, numberOfStudents);

        System.out.println("���α׷��� �����մϴ�.");
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