package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Assignment7 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Radius : ");
        double r = Double.parseDouble(bufferedReader.readLine());
        System.out.print("Height : ");
        double h = Double.parseDouble(bufferedReader.readLine());
        System.out.printf("Cylinder Surface Area : %.2f",calculateCylinderSurfaceArea(r,h));
	}
	public static double calculateCylinderSurfaceArea(double radius,double height) {
		return 2*Math.PI*radius*(radius+height);
	}

}
