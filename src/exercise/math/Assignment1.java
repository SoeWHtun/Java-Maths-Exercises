package exercise.math;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Assignment1 {

	public static void main(String[] args)throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("First angle : ");
        int a1 = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Second angle : ");
        int a2 = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Third angle : "+calculateThirdAngle(a1,a2));
	}
	public static int calculateThirdAngle(int angle1,int angle2) {
		return 180-(angle1+angle2);
	}

}
