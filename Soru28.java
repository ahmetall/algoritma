package finalcalisma;

import java.util.Scanner;

public class Soru28 {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
	      System.out.print("Kelime Giriniz : ");
	      String girilen=scan.nextLine();

	      String kontrol="";
	      int uzunluk=girilen.length();
	      for(int i=uzunluk-1;i>=0;i--)
	      {
	    	  kontrol=kontrol+girilen.charAt(i);
	      }
	      System.out.println("Ters Yazılışı : "+kontrol); 

	      if(girilen.equals(kontrol))
	      {
	    	  System.out.println("Palindrom Kelimedir");

	      }  else
	      {
	    	  System.out.println("Palindrom Kelime Değildir");
	      }	
	    }
	
}

