package finalcalisma;
import java.util.Scanner;
public class soru11 {

	public static void main(String[] args) {
		System.out.println("Metin Giriniz");
		Scanner scan=new Scanner(System.in);
		String cumle=scan.nextLine();
		System.out.println("Sizin Cümleniz===>"+cumle);
		String buyukcumle=cumle.toUpperCase();
		System.out.println("Bizim Cümlemiz===>"+buyukcumle);

	}

}
