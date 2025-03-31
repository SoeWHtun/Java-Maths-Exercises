package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Assignment4 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Base : ");
        double b = Double.parseDouble(bufferedReader.readLine());
        System.out.print("Height : ");
        double h = Double.parseDouble(bufferedReader.readLine());
        System.out.println("The hypotenuse : "+calculateHypotenuse(b,h));
	}
	public static double calculateHypotenuse(double base,double height) {
		return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
	}

}
