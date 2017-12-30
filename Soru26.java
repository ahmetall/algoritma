package finalcalisma;
import java.util.Scanner;
public class Soru26 {

	public static void main(String[] args) {
		int dizi[] = new int[5];
		for(int i = 0; i < 5 ; i++)
		{
		   System.out.print((i+1)+"'inci sayıyı giriniz");
		   Scanner scn = new Scanner(System.in);
		   dizi[i] = scn.nextInt(); 

		}
		int toplam=0;
        for(int t=0;t<dizi.length;t++){
            	toplam=toplam+dizi[t];
           }
        System.out.println("Toplam "+toplam);
        System.out.println("Ortalama "+toplam/5);
		
		
		
		int max=dizi[0];
        for(int t=1;t<dizi.length;t++){
            if(dizi[t]>max){
                max=dizi[t];
            }
        }
        System.out.println("En Büyük Değer "+max);
        
        int min=dizi[0];
        for(int t=1;t<dizi.length;t++){
            if(dizi[t]<min){
                min=dizi[t];
            }
        }
        System.out.println("En Küçük Değer "+min);
		
	}

}
