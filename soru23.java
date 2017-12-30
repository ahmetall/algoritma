package finalcalisma;
import java.util.Scanner;

public class Soru23{
 
    public static void main(String args[]){
    	System.out.print("Bir sayi giriniz:");
    	Scanner scan = new Scanner(System.in); 
        int gir = scan.nextInt(); 
        int sayi=0;
		for(int i=2;i<=gir;i++)
		{	
			
			for(int k=2;k<=i/2;k++)
			{
			if(i%k==0)
			{
				sayi++;
			}
			
				
			}
			
				
			
		}
		System.out.print(sayi);
    }
         
}
