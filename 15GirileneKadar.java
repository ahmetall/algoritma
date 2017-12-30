package finalcalisma;
import java.util.Scanner;
public class soru1 {

	public static void main(String[] args) {
		int toplam=0;
		int girilensayi=0;
		while(girilensayi!=15)
		{
			Scanner scan=new Scanner(System.in);
			 girilensayi=scan.nextInt();
			toplam=toplam+girilensayi;
		}
		System.out.println("Sonuç="+toplam);
	}
		
}

