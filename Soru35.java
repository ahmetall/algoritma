package finalcalisma;
import java.util.Scanner;
public class soru35 {
	public static void main(String[] args) {
		   int sayi,x=1,y=1;
		   Scanner gir = new Scanner(System.in);
		   System.out.println("Sayıyı Giriniz: ");
		   sayi = gir.nextInt();
		   while (sayi/x>9)
		   {  
			   x=x*10;  
			   y++;        
			   }  
		   System.out.println(y+" Basamaklıdır");        
		   } 
}

