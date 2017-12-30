package finalcalisma;
import java.util.Scanner;
public class Soru25 {

	public static void main(String[] args) {
		System.out.print("İlk Sayıyı Giriniz");
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		System.out.print("İkinci Sayıyı Giriniz");
		Scanner scan2=new Scanner(System.in);
		int sayi2=scan2.nextInt();
		
		int buyuk;
		int ekok ;
		if(sayi1>sayi2){
			buyuk=sayi1;
			}
		else{
			buyuk=sayi2;
		}
		
		for(int i=buyuk;i<=sayi1*sayi2;i++){

		if(i%sayi1==0 && i%sayi2==0)
		{
			ekok=i;
			System.out.println("En Büyük Ortak Kat===>"+ekok);
			break;
		}
		
		}

	}

}
