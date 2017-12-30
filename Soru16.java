package finalcalisma;

import java.util.Scanner;
import java.util.StringTokenizer;

public class soru16 {

	public static void main(String[] args) {
		System.out.println("Cümleyi Giriniz");
		Scanner cumle=new Scanner(System.in);
		String girilencumle=cumle.nextLine();
		String ayirma=" ";
		StringTokenizer f=new StringTokenizer(girilencumle,ayirma);
		while(f.hasMoreTokens()){
			System.out.println(f.nextToken());
		}

	}

}
