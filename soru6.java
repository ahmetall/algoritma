package finalcalisma;

public class soru6 {

	public static void main(String[] args) {
		int toplam=0;
			System.out.print("5'e Bölünen Ve 7'ye Bölünmeyen Sayılar==>");
		for(int i=1;i<1000;i++)
		{
			if(i%5==0&&i%7!=0)
			{
				System.out.print(i+" ");
				toplam=toplam+i;
			} 
		}
		System.out.print("\n"+"Sayıların Toplamı "+toplam);

	}

}
