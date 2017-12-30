package finalcalisma;
import java.util.Scanner;
public class Soru7 {

	public static void main(String[] args) {
		int sayi,x=1,y=1,j=2;
	    Scanner gir = new Scanner (System.in);
	    System.out.println("Sayi Giriniz :");
	    sayi = gir.nextInt();
	    while (sayi/x>9)
	    { 
	    	x=x*10;         
	    	y++;         
	    } 
	    if(y<=4)
	    {
	    	 int bolen;
	         int boleninboleni; 
	         boolean asal=true;
	         for(bolen=2;bolen<sayi;bolen++){
	             if((sayi%bolen)==0){
	             for(boleninboleni=2;boleninboleni<bolen;boleninboleni++){
	                 if((bolen%boleninboleni)==0){
	                     boleninboleni=boleninboleni+bolen;
	                     asal=false;
	                 }
	             }
	             if(asal==true)
	                 System.out.print(bolen+" ");
	             }
	         }

	    }
	    else
	    {
	    	System.out.println("En Fazla 4 Basmaaklı Sayı Giriniz");
	    }
	     
	

	}

}
