
public class W05_2 {

	public static void main(String[] args) {
		System.out.println("<< Sine �� ��� ���α׷��� �����մϴ� >>");
		System.out.println();
		int n = 0;
		while(n<180){
			n = n+1;
			double x = (double)n*(3.141592/180.0);
			double y = Math.sin(x);
			
			System.out.println("Sin("+n+"��) ��  "+y+" �Դϴ�.");
		}
		System.out.println();
		System.out.println("<< Sine �� ��� ���α׷��� �����մϴ� >>");
	}

}
