import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuessANumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		int cmpNum, usrNum;
		String ppt;
		cmpNum = 1 + (int)(Math.random()*10);
		System.out.printf("%d\n", cmpNum);
		
			do {
				
				usrNum = Integer.parseInt(JOptionPane.showInputDialog("Guess a number between 1 & 10."));
				if (usrNum > cmpNum){
					JOptionPane.showMessageDialog(null, "Too big.");}
				else if (usrNum < cmpNum){
					JOptionPane.showMessageDialog(null, "Too small.");}
				else if (usrNum == cmpNum){
					JOptionPane.showMessageDialog(null, "Match.");}
				else if (usrNum != cmpNum)
					ppt = JOptionPane.showInputDialog("Continue? (y/n)");}
			
			while ((ppt == "y") && (usrNum != cmpNum));
				ppt = inp.next();
			
			if ((ppt == "n"))
				System.out.println("End.");
		
		inp.close();
	}

}