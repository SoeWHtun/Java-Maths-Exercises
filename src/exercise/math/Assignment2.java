package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Assignment2 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter coefficients a,b,c :");
        String nums = bufferedReader.readLine();
        String [] values = nums.split(",");
        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[1]);
        double c = Double.parseDouble(values[2]);
        System.out.print("The solution : ");
        quadraticEquation(a,b,c);
        
	}
	public static void quadraticEquation(double num1,double num2,double num3) {
		double x1 = ((-1*num2)+Math.sqrt(Math.pow(num2, 2)-(4*num1*num3)))/(2*num1);
		double x2 = ((-1*num2)-Math.sqrt(Math.pow(num2, 2)-(4*num1*num3)))/(2*num1);
		System.out.print("x1 = "+x1+" | "+"x2 = "+x2);
	}

}
