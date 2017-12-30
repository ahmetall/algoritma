package finalcalisma;

public class Soru17 {

	public static void main(String[] args) {
		int dizi[]= {1,3,4,8,7};
		int dizikontrol[]=new int[5];
		for(int a=0;a<5;a++)
		{
			dizikontrol[a]=dizi[a];
		}
			
				
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(dizi[i]>dizi[j])
				{
					int temp=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=temp;
				}
			}
		}
		if(dizi[0]==dizikontrol[0]&&dizi[1]==dizikontrol[1]&&dizi[2]==dizikontrol[2]&&dizi[3]==dizikontrol[3]&&dizi[4]==dizikontrol[4])
		{
			System.out.println("Dizi Küçükten Büyüge Sıralanmıstır");
		}
		else
		{
			System.out.println("Dizi Küçükten Büyüge Sıralanmamıstır");
		}
		//veya
		int sayi=0;
		for(int x=0;x<5;x++)
		{
			if(dizi[x]==dizikontrol[x])
			{
				sayi++;
			}
		}
		if(sayi==5)
		{
			System.out.println("Dizi Küçükten Büyüge Sıralanmıştır");
		}
		else
		{
			System.out.println("Dizi Küçükten Büyüge Sıralanmamıstır");
		}
		
		
	
		

	}

}
