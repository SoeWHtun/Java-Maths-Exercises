package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Assignment6 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Radius : ");
        double radius = Integer.parseInt(bufferedReader.readLine());
        System.out.printf("Area : %.2f",calculateArea(radius));
        System.out.printf("\nPerimeter : %.2f",calculatePerimeter(radius));
        
	}
	public static double calculateArea(double x) {
		return Math.PI*Math.pow(x, 2);
	}
	public static double calculatePerimeter(double y) {
		return 2*Math.PI*y;
	}

}
