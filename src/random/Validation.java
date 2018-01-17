//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		int lastNum = 89;
		
		// 1. OPTIONAL: Watch the first 2 minutes of this movie:
		// http://vimeo.com/2485018
		for (int i = 0; i < 10; i++) {
			int randomNumber = new Random().nextInt(4)+ 1;

			// 2. On paper, write all the numbers that get printed when you run this class
			// 10 times

			System.out.println(randomNumber);

			// 3. Use each value of randomNumber to give the user a random compliment.
			String one = "you just completely 360 no scoped that pleb";
			String two = "you just wasted your money on a lit supreme sticker";
			String three = "do ju no deh wei";
			String four = "oof";
			if (randomNumber == 1 && lastNum != 1){
				lastNum = 1;
				JOptionPane.showMessageDialog(null, one);
			}
			if (randomNumber == 2 && lastNum != 2) {
				lastNum = 2;
				JOptionPane.showMessageDialog(null, two);
			}
			if (randomNumber == 3 && lastNum != 3) {
				lastNum = 3;
				JOptionPane.showMessageDialog(null, three);
			}
			if (randomNumber == 4 && lastNum != 4) {
				lastNum = 4;
				JOptionPane.showMessageDialog(null, four);
			}
		}
		// 4. Repeat all the code above 10 times

		// 5. Find someone to test out your program. They will like it :)
	}
}
