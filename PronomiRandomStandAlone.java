package com.zaviprogetti;

import java.util.Random;

public class PronomiRandomStandAlone 
{
	public static void main (String[] args) 
	{
		Random randomNumbers = new Random(); // random number generator
		int choice;
		String pronome = null;
		choice = randomNumbers.nextInt( 13 ); // number from 0 to 12

			switch( choice )
			{
			case 0:
				pronome = "io (maschile)";
				break;
			case 1:
				pronome = "io (femminile)";
				break;
			case 2:
				pronome = "tu (maschile)";
				break;
			case 3:
				pronome = "tu (femminile)";
				break;
			case 4:
				pronome = "lui";
				break;
			case 5:
				pronome = "lei";
				break;
			case 6:
				pronome = "Lei (formale)";
				break;
			case 7:
				pronome = "noi (maschile)";
				break;
			case 8:
				pronome = "noi (femminile)";
				break;
			case 9:
				pronome = "voi (maschile)";
				break;
			case 10:
				pronome = "voi (femminile)";
				break;
			case 11:
				pronome = "loro (maschile)";
				break;
			case 12:
				pronome = "loro (femminile)";
				break;// optional at end of switch
			} // end switch
		System.out.println(pronome);// print random pronome on console
	}

}
