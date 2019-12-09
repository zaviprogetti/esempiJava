package com.zaviprogetti;
import java.util.Random;

public class PronomiRandom {
   public static void main(String[] args) {
	  Random randomNumbers = new Random(); // random number generator
	  int face;
	  String pronome = null;
	  face = randomNumbers.nextInt(13); // number from 0 to 12

	  switch (face) {
 	  } // end switch
	  System.out.printf("il pronome è: %s\n", pronome);
   }

}
