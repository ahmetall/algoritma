package saliuygulama;

import java.util.Scanner;
public class karakter
{
  public static void main(String[] atgs)
  {	  
	  
	  System.out.println("Metni Giriniz");
      Scanner giris=new Scanner(System.in);
      String metin=giris.nextLine();
      int adet=0;
      String dizi[]=new String[metin.length()];
      int i=0;
      
      for(;i<metin.length();i++)
      {
    	  String harf=metin.substring(i,i+1);
    	  dizi[i]=harf;
      }
      for(int j=0;j<dizi.length;j++)
      {
    	  System.out.print(""+dizi[j]+"=");
    	  adet=0;
    	  for(int k=0;k<dizi.length;k++)
    	  {
    		
    		 if(dizi[j].equals(dizi[k]))
    		 {
    			adet++;
    			 
    		 } 
    	  }
    	  System.out.println(adet);
      }
      
   }
 }
