package finalcalisma;

import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) {
		System.out.println("Metin Giriniz");
		Scanner scan=new Scanner(System.in);
		String girilencumle=scan.nextLine();
		for (int i =girilencumle.length()-1; i >=0; i--) 
		{
		System.out.print(girilencumle.charAt(i));
		}

	}

}
