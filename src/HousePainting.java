import java.util.Scanner;


public class HousePainting {
	public static void main(String[] args) {
		double length, width, height, houseArea;
		double windowHeight, windowWidth, totalWindow, windowArea;
		double doorHeight, doorWidth, totalDoor, doorArea;
		double totalPaint;
		double areaPerGallon, totalGallons;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length, width and height the of house");
		length = in.nextDouble();
		width = in.nextDouble();		
		height = in.nextDouble();
			
			
		houseArea = (2*(length*height)) + (2*(width*height));
		
		System.out.println("Please enter the width, length & number of windows");
		windowWidth = in.nextDouble();	
		windowHeight = in.nextDouble();
		totalWindow = in.nextDouble();
		
		windowArea = (windowWidth*windowHeight)*totalWindow;
		
		
		
		System.out.println("Please enter the width, length & number of doors");
		doorWidth = in.nextDouble();
		doorHeight = in.nextDouble();
		totalDoor = in.nextDouble();
		
		doorArea = (doorWidth*doorHeight)*totalDoor;
		
		totalPaint = houseArea - (windowArea + doorArea);
		
		System.out.println("The total surface are needed for painting is:" +totalPaint);
		
		System.out.println("What is the coverage area of one gallon of paint?");
		areaPerGallon = in.nextDouble();
		
		totalGallons = (totalPaint/areaPerGallon);
		
		System.out.println("Total amount of gallons needed is:" + totalGallons);
	}
}
