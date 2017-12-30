package finalcalisma;

import java.util.Scanner;

public class soru36 {

	public static void main(String[] args) {
		int dizi[]=new int[10];
		for(int i=0;i<=9;i++)
		{	
			System.out.print((i+1)+". Sayıyı Giriniz");
			Scanner scan=new Scanner(System.in);
			dizi[i]=scan.nextInt();
		}
		for(int i=0; i<10; i++)
		{
			for(int j=i+1; j<10; j++)
			{
				if(dizi[i]>dizi[j])
				{
					int temp=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=temp;
				}
			}
		}
		
		int max=dizi[0];
        for(int t=1;t<dizi.length;t++){
            if(dizi[t]>max){
                max=dizi[t];
            }
        }
        System.out.println("En Büyük Değer ==>"+max);
        
        int min=dizi[0];
        for(int t=1;t<dizi.length;t++){
            if(dizi[t]<min){
                min=dizi[t];
            }
        }
        System.out.println("En Küçük Değer ==>"+min);
        System.out.println("En Büyük + En Küçük==>"+(max+min));
		
		


	}

}
