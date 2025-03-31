package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Assignment3 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter the length of the side a :");
        double a = Double.parseDouble(bufferedReader.readLine());
        System.out.print("Enter the length of the side b :");
        double b = Double.parseDouble(bufferedReader.readLine());
        System.out.print("Enter the length of the side c :");
        double c = Double.parseDouble(bufferedReader.readLine());
        System.out.print("The angles of the triangle are : ");
        calculateAngle(a,b,c);
	}
	public static void calculateAngle(double num1, double num2, double num3) {
		double A = Math.toDegrees(Math.acos((Math.pow(num2, 2)+Math.pow(num3, 2)-Math.pow(num1, 2))/(2*num2*num3)));
		double B = Math.toDegrees(Math.acos((Math.pow(num1, 2)+Math.pow(num3, 2)-Math.pow(num2, 2))/(2*num1*num3)));
		double C = Math.toDegrees(Math.acos((Math.pow(num1, 2)+Math.pow(num2, 2)-Math.pow(num3, 2))/(2*num1*num2)));
		System.out.printf("%.2f , %.2f , %.2f", A, B, C);
	}

}
