/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {

// Here are the parts I used to make the armor
	public static void printHelmet() {
		System.out.println("                               _______");
		System.out.println("                           ___/       \\");
		System.out.println("                      ____/         __/\\__");
		System.out.println("                      \\       _____/      \\");
		System.out.println("                       \\_____/    / __/\\__ \\");
		System.out.println("                                  \\ //  \\\\ /");
	}

	public static void printShoulder() {
		System.out.println("                         _________(__    __)___");
		System.out.println("__   __                 /___ / _____ ^ ____ \\  \\__");
	}



	
	
// Here are the parts I used to make the big letter K
	public static void printDoubleleg() {
		System.out.print("||");
	}

	public static void printSlantRight() {
		System.out.print("//");
	}

	public static void printSlantLeft() {
		System.out.print("\\\\");
	}

	public static void printDoubleRight() {
		System.out.print("/ /");
	}

	public static void printDoubleLeft() {
		System.out.print("\\ \\");
	}


	
	
	
	
	public static void main(String[] args) {
		System.out.println("THIS IS MY ASCII ART!!!!");

//top section
		printHelmet();
		printShoulder();

//middle section - line1-3 is the top part of the K
	// line 1
		printDoubleleg();
		System.out.print("  ");
		printDoubleRight();
		System.out.print("                ( __ )   __( ( ) )____ (   )\n");
	// line 2
		printDoubleleg();
		System.out.print(" ");
		printDoubleRight();
		System.out.print("                  \\ __)__/   __|__       ___/\n");
	// line 3
		printDoubleleg();
		printDoubleRight();
		System.out.print("    ___  __ __   __  |__  __  /   \\  _|__\n");

//bottom section
	// line 4
		printDoubleleg();
		printDoubleLeft();
		System.out.print("    | \\\\ || ||  // \\| ||__||  | | | (___\n");
	// line 5
		printDoubleleg();
		System.out.print(" ");
		printDoubleLeft();
		System.out.print("   || \\\\|| || ||   _ ||__||  | | |    \\\\\n");
	// line 6
		printDoubleleg();
		System.out.print("  ");
		System.out.print("\\ \\  ||  \\\\| ||  \\\\__| ||  ||  \\ | / |___))\n");
	// line 7
		System.out.print("                                    \\ /");

		
	}

}