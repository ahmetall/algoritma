package finalcalisma;
import java.util.Scanner;
public class soru18 {

	public static void main(String[] args) {
		System.out.println("Celcius Giriniz");
		Scanner scan=new Scanner(System.in);
		double c=scan.nextDouble();
		double f=32+c*9/5;
		System.out.print(c+" Celcius ="+f+" Fahrenheit");

	}

}
