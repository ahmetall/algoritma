package finalcalisma;
import java.util.Scanner;
public class soru34 {

	public static void main(String[] args) {
		System.out.println("Üslü Sayılar İçin a =");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Üslü Sayılar İçin b =");
		Scanner scan2=new Scanner(System.in);
		int b=scan2.nextInt();
		int sonuc=1;
		for(int i=b;i>0;i--)
		{
			sonuc=sonuc*a;
		}
		System.out.println(sonuc);
	}

}
