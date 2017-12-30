package finalcalisma;
import java.util.Scanner;
public class soru4 {

	public static void main(String[] args) {
			System.out.println("Üç Basamaklı Bir Sayı Giriniz");
			Scanner scan=new Scanner(System.in);
			int i=scan.nextInt();
			int sonrakam=i%10;
			int ikirakamacevir=i/10;
			int ortancarakam=ikirakamacevir%10;
			int tekrakamacevir=ikirakamacevir/10;
			int ilkrakam=tekrakamacevir%10;
			int toplam=sonrakam+ortancarakam+ilkrakam;
			int carpım=sonrakam*ortancarakam*ilkrakam;
			int sonuc=carpım/toplam;
			
			System.out.println("ÇARPIM==>"+ilkrakam+" * "+ortancarakam+" * "+sonrakam+" = "+carpım);
			System.out.println("TOPLAM==>"+ilkrakam+" + "+ortancarakam+" + "+sonrakam+" = "+toplam);
			System.out.println("SONUÇ===>"+carpım+" / "+toplam+" = "+sonuc);
		}
	}


