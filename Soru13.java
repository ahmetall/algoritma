package finalcalisma;

public class soru13 {

	public static void main(String[] args) {
		int sayi=0;
		for(int i=2;i<=1000;i++)
		{	
			sayi=0;
			for(int k=2;k<=i/2;k++)
			{
			if(i%k==0)
			{
				sayi++;
			}
			
				
			}
			if(sayi==0)
			{
				System.out.print(i+" - ");
			}
		}

	}

}
