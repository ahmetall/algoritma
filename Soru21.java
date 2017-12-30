package finalcalisma;
import java.util.Scanner;
public class Soru21 {

	public static void main(String[] args) {
		System.out.println("Faktöriyelini Hesaplayacagınız Sayıyı Giriniz");
		Scanner scan=new Scanner(System.in);
		int fakt=scan.nextInt();
		int toplam=1;
		for(int i=1;i<=fakt;i++)
		{
			toplam=toplam*i;
		}
		System.out.print(fakt+"!===>>"+toplam);
	}

}
