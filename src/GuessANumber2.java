import java.util.Scanner;

public class GuessANumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		int cmpNum;
		int usrNum;
		String ppt = "";
		
			do {
				cmpNum = 1 + (int)(Math.random()*10);
				System.out.println("Guess a number between 1 & 10.");
				usrNum = inp.nextInt();
				if (usrNum > cmpNum){
					System.out.println("Too big.");}
				else if (usrNum < cmpNum){
					System.out.println("Too small.");}
				else if (usrNum == cmpNum){
					System.out.println("Match.");}}
							
			while (usrNum != cmpNum);{
				System.out.println("Continue? (y/n)");
				ppt = inp.next();}
				if (ppt == "y");
				else if ((ppt == "n") || (usrNum == cmpNum))
				System.out.println("End.");
		
		inp.close();
	}

}
//Good job solving the GitHub issue
