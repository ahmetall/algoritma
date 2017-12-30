package finalcalisma;

public class soru3 {

	public static void main(String[] args) {
		int toplam=0;
		System.out.print("SAYILAR ===>");
		for(int i=45;i<=225;i++)
		{
			if(i%7==0&&i%2==0)
			{
				System.out.print(i+" ");
				toplam=toplam+i;
			}
		}
		System.out.println("\n"+"TOPLAM="+toplam);
	}

}
