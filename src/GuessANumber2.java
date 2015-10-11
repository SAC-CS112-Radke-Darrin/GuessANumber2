import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuessANumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
						
		int cmpNum = 1 + (int)(Math.random()*10);
		int usrNum;
		
		do
			{
			String usrInp = JOptionPane.showInputDialog("Guess a number between 1 & 10.");
			usrNum = Integer.parseInt(usrInp);
				
			if (usrNum > cmpNum)
			{
				JOptionPane.showMessageDialog(null, "Too big.");
				}
			else if (usrNum < cmpNum)
			{
				JOptionPane.showMessageDialog(null, "Too small.");
				}
			else if (usrNum == cmpNum)
			{
				JOptionPane.showMessageDialog(null, "Match.");
				}
			}
		while (usrNum != cmpNum);
						
	JOptionPane.showMessageDialog(null, "End.");
		
	inp.close();
	}

}
//Good job solving the GitHub issue
