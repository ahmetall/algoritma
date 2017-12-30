package finalcalisma;

public class Soru20 {

	public static void main(String[] args) {
		int dizi[]= {1,2,3,4,11,13,20,22};
		System.out.print("Çift SAYILAR ===>");
		for(int i=0;i<8;i++)
		{
			if(dizi[i]%2==0)
			{
				System.out.print(dizi[i]+" ");
			}
		}
		
		System.out.print("\n"+"TEK SAYILAR ===>");
		for(int i=0;i<8;i++)
		{
			if(dizi[i]%2!=0)
			{
				System.out.print(dizi[i]+" ");
			}
		}
		

	}

}
