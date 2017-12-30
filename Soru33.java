package finalcalisma;
import java.util.Scanner;
public class soru33 {

	public static void main(String[] args) {
		System.out.println("Bir Sayı Giriniz");
		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		if(sayi<50)
		{
			double sonuc=(double)sayi*0.25;
			System.out.print(sonuc);
				
		}
		else
		{
			double sonuc=(double)sayi*0.10;
			System.out.print(sonuc);
		}
		

	}

}
