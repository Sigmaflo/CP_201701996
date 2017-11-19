import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);

    private static final int MAX_SIZE = 100;

    public static void main(String[] args){
        int[] scoresKorean = new int[MAX_SIZE];
        int[] scoresComputer = new int[MAX_SIZE];
        double [] studentAverages = new double[MAX_SIZE];
        System.out.print("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
        int scoreKorean = inputscore();
        int scoreComputer = inputscore();
        int numberOfStudent = 0;
        while (scoreKorean>=0 || scoreComputer>=0){
            if (scoreKorean>100 || scoreComputer>100){
               System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
               System.out.print("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
               scoreKorean = inputscore();
               scoreComputer = inputscore();            }
            else{
                scoresKorean[numberOfStudent] = scoreKorean;
                scoresComputer[numberOfStudent] = scoreComputer;
                numberOfStudent++;
                System.out.print("�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�: ");
                scoreKorean = inputscore();
                if(scoreKorean>=0){
                    scoreComputer = inputscore();
                }
                else {
                    scoreComputer = -1;
                }
            }
        }

        System.out.println("������ �ԷµǾ� �Է��� �����մϴ�.");
        System.out.println("");
        System.out.println("��� "+numberOfStudent+" ���� ������ �ԷµǾ����ϴ�.");
        System.out.println("");
        System.out.println("�Էµ� ������ ��������� ������ �����ϴ�.");
        int i = 0;
        double total = 0;
        int aboveOfStuent = 0;
        while (i < numberOfStudent){
            System.out.print("["+i+"] "+scoresKorean[i]+" "+scoresComputer[i]);
            studentAverages[i] = ((double)scoresKorean[i]+(double)scoresComputer[i])/2;
            System.out.println("(��� "+studentAverages[i]+")");
            total = total +studentAverages[i];
            i++;
        }
        double classAverages = total / (double)numberOfStudent;
        System.out.printf("�б������ %.2f �Դϴ�.\n", classAverages);
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

        System.out.println("��� �̻��� �л��� ���� "+aboveOfStuent+" �� �Դϴ�");
        System.out.println("");
        System.out.println("���α׷��� �����մϴ�.");

    }
    private static int inputscore(){
        int ascore = scanner.nextInt();
        return ascore;
    }
}
