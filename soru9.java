package finalcalisma;
import java.util.Scanner;
public class soru9 {

	public static void main(String[] args) {

		System.out.println("Sayınızı Girin(Tek Mi Çift Mi)");
	
		Scanner scan=new Scanner(System.in);
		int girilen=scan.nextInt();
		if(girilen%2==0)
		{
			System.out.println(girilen+" SAYISI Çifttir");
		}
		else
		{
			System.out.println(girilen+" SAYISI Tektir");
		}
	}

}
