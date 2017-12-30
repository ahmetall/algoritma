package finalcalisma;

import java.util.Random;

public class Soru27 {

	public static void main(String[] args) {
		int rastgele=0;
		int cift = 0,tek=0;
		while(rastgele!=175)
		{
		Random r=new Random();
		rastgele=r.nextInt(150)+150;
		if(rastgele%2==0)
		{
		System.out.print(rastgele+"-");
		cift++;
		
		}
		
		if(rastgele%2==1)
		{
			System.out.print(rastgele+"-");
			tek++;
		}
		
		}
		
		System.out.println("\n"+"Çift Sayı Adedi==>"+cift);
		System.out.println("Tek Sayı Adedi==>"+tek);
	}

}
