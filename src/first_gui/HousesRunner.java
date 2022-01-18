package first_gui;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HousesRunner {
	static ArrayList<Houses> houses = new ArrayList<Houses>();
	public static void main(String[] args) {
		
	}
	
	public static void makeArrayList() throws Exception{
		Scanner inFile = new Scanner(new File ("Houses.txt"));
		int sqFeetOne = inFile.nextInt();
		int bedsOne = inFile.nextInt();
		double bathsOne = inFile.nextDouble();
		int costOne = inFile.nextInt();
		String addressOne = inFile.nextLine();
		String housePicOne = inFile.nextLine();
		Houses houseOne = new Houses(sqFeetOne, bedsOne, bathsOne, costOne, addressOne, housePicOne);
		houses.add(houseOne);
		inFile.nextLine();
		int sqFeetTwo = inFile.nextInt();
		int bedsTwo = inFile.nextInt();
		double bathsTwo = inFile.nextDouble();
		int costTwo = inFile.nextInt();
		String addressTwo = inFile.nextLine();
		String housePicTwo = inFile.nextLine();
		Houses houseTwo = new Houses(sqFeetTwo, bedsTwo, bathsTwo, costTwo, addressTwo, housePicTwo);
		houses.add(houseTwo);
		inFile.nextLine();
		
		
	}
	
	public static void buildGUI() {
		
	}
}
