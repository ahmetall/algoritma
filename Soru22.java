package finalcalisma;
import java.util.Scanner;
import java.util.Random;
public class Soru22 {

	public static void main(String[] args) {
		Random rastgeleuret = new Random(); 
		int sayi = rastgeleuret.nextInt(50)+5;
	int hak=9;
	for(;hak>=0;hak--)
	{
		System.out.println("Lütfen Sayı Giriniz");
		Scanner scan=new Scanner(System.in);
		int girilen=scan.nextInt();
		if(girilen==sayi)
		{
			System.out.println("Sayıyı Bildiniz Tebrikler ="+sayi);
			break;
		}
		else if(girilen>sayi)
		{
			System.out.println("Büyük Sayı Girdiniz Kalan Hakkınız="+hak);
		}
		else if(girilen<sayi)
		{
			System.out.println("KüçüK Sayı Girdiniz Kalan Hakkınız="+hak);
		}

	}
	if(hak==-1)
	{
		System.out.println("Hakkınız Doldu Sayı="+sayi);

	

	}
	}
}


