package first_gui;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HousesRunner {
	ArrayList<Houses> houses = new ArrayList<Houses>();
	public static void main(String[] args) {
		
	}
	
	public static void makeArrayList() throws Exception{
		Scanner inFile = new Scanner(new File ("Houses.txt"));
		int sqFeetOne = inFile.nextInt();
		int bedsOne = inFile.nextInt();
		double bathsOne = inFile.nextDouble();
		int costOne = inFile.nextInt();
		String addressOne = inFile.nextLine();
	}
	
	public static void buildGUI() {
		
	}
}
