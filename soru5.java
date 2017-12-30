package finalcalisma;
import java.util.Scanner;
public class soru5 {

	public static void main(String[] args) {
		System.out.println("İfade Giriniz");
		Scanner scan=new Scanner(System.in);
		String ifade=scan.nextLine();
		System.out.println("Kaç Kez Yazılacagını Giriniz");
		Scanner kackez=new Scanner(System.in);
		int adet=kackez.nextInt();
		for(int i=0;i<adet;i++)
		{
			System.out.println(ifade);
		}
	}

}
