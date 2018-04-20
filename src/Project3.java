import java.awt.Color;
import java.awt.image.Kernel;
public class Project3 {

	public static void main(String[] args) {
		

		//Create New Image Utility.		
		Project3Utilities Utility = new Project3Utilities();
		
		//Load in an Image
		Color[][] orig = Utility.loadImage("C:\\Users\\codya\\eclipse-workspace\\Project3\\src\\LennaCV.png");
		
		//Add Original Image to tab
		Utility.addImage(orig,  "Original Image");
		
		//Process the Image

		
		Color[][] moreBlue= increaseBlue(orig);
			Utility.addImage(moreBlue, "Increase Blue");
		Color[][] redChecker= checkerBoard(orig,1);
			Utility.addImage(redChecker,"Red Checkered");	
		Color[][] greenChecker= checkerBoard(orig,2);
			Utility.addImage(greenChecker,"Green Checkered");
		Color[][] blueChecker= checkerBoard(orig,3);
			Utility.addImage(blueChecker,"Blue Checkered");
		Color[][] rainbow= rainbow(orig);
			Utility.addImage(rainbow,"Rainbow");

		
		Utility.display();
		
		}
		
		
		public static Color[][] increaseBlue(Color[][] img){
			Color[][] tmp= Project3Utilities.cloneArray(img);
			for( int i=0; i < tmp.length; i++) {
				for( int j=0; j < tmp[i].length; j++) {
						tmp[i][j] = new Color(0,0,0);
						Color pixel = img[i][j];
						int r = pixel.getRed();
						int g = pixel.getGreen();
						int b = pixel.getBlue();
						tmp[i][j]=new Color(r,g,255);
				}
			}
			return tmp;
		}
		

		public static Color[][] checkerBoard(Color[][] img,int selector){
			int rowPosition;
			int columnPosition;
			Color[][] tmp =Project3Utilities.cloneArray(img);
			
			for(int row=0; row<tmp.length;row++) {
			for(int column=0;column<tmp.length;column++) {
			
						if (row<tmp.length/5) {
							rowPosition=1;
						}
						else if  (row<tmp.length/5*2) {
							rowPosition=2;
							}
						else if (row<tmp.length/5*3) {
							rowPosition=3;
						}
						else if (row<tmp.length/5*4) {
							rowPosition=4;
						}
						else {
							rowPosition=5;
						}
						
						if (column<tmp.length/5) {
							columnPosition=1;
						}
						else if  (column<tmp.length/5*2) {
							columnPosition=2;
							}
						else if (column<tmp.length/5*3) {
							columnPosition=3;
						}
						else if (column<tmp.length/5*4) {
							columnPosition=4;
						}
						else {
							columnPosition=5;
						}
						
						if ((rowPosition %2 ==0 && columnPosition %2 ==0)  || (rowPosition %2 !=0 && columnPosition %2 !=0)) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r = pixel.getRed();
							int g = pixel.getGreen();
							int b = pixel.getBlue();
						
							if (selector==1) {
							tmp[row][column]=new Color(255,g,b);	
						}
							else if (selector==2) {
								tmp[row][column]=new Color(r,255,b);
							}
							else if (selector==3) {
								tmp[row][column]=new Color(r,g,255);
							}
							else
								tmp[row][column]=new Color(r,g,b);
						}
					}
					}
			return tmp;
		}
		
		
		public static Color[][] rainbow(Color[][] img){
			int rowPosition;
			int columnPosition;
			Color[][] tmp =Project3Utilities.cloneArray(img);
				for(int row=0; row<tmp.length;row++) {
					for(int column=0;column<tmp.length;column++) {	
						if (row<tmp.length/7) {
							rowPosition=1;
						}
						else if  (row<tmp.length/7*2) {
							rowPosition=2;
							}
						else if (row<tmp.length/7*3) {
							rowPosition=3;
						}
						else if (row<tmp.length/7*4) {
							rowPosition=4;
						}
						else if (row<tmp.length/7*5) {
							rowPosition=5;
						}
						else if (row<tmp.length/7*6) {
							rowPosition=6;
						}
					
						else {
							rowPosition=7;
						}
							
						if (rowPosition==1) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(255,g,b);
						}
						else if (rowPosition==2) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(255,140,b);
						}
						else if (rowPosition==3) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(255,255,b);
						}
						else if (rowPosition==4) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(r,255,b);
						}
						else if (rowPosition==5) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(0,g,200);
						}
						else if (rowPosition==6) {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(135,g,255);
							}

						else {
							tmp[row][column] = new Color(0,0,0);
							Color pixel = img[row][column];
							int r=pixel.getRed();
							int g=pixel.getGreen();
							int b=pixel.getBlue();
							tmp[row][column]=new Color(200,g,225);
						}
						
						
						
							
						}
					}
				return tmp;
				}
		}
