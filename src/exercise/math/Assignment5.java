package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Assignment5 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter angle : ");
        double a = Integer.parseInt(bufferedReader.readLine());
        System.out.println("w : "+calculateW(a));
        
        
	}
	public static double calculateW(double x) {
		return (180-x)/2;
	}
	
}

