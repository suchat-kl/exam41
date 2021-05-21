
public class Exam41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHandSome=false;
		int score = 45;
		isHandSome=!isHandSome;
		if (score >= 80 || isHandSome)
			System.out.println("Good");
		else if (score >= 50)
			System.out.println("Normal");
		else
			System.out.println("Fail");
	}

}
