package finalcalisma;

import java.util.Scanner;

public class soru29 {

	public static void main(String[] args) {
		int dizi[]=new int[3];
		for(int i=0;i<=2;i++)
		{	
			System.out.print((i+1)+". Sayıyı Giriniz");
			Scanner scan=new Scanner(System.in);
			dizi[i]=scan.nextInt();
		}
		for(int i=0; i<3; i++)
		{
			for(int j=i+1; j<3; j++)
			{
				if(dizi[i]>dizi[j])
				{
					int temp=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=temp;
				}
			}
		}
		
		if(dizi[0]!=dizi[1]&&dizi[1]!=dizi[2])
		{
			System.out.println(dizi[0]+"<"+dizi[1]+"<"+dizi[2]);
		}
		else if(dizi[0]==dizi[1]&&dizi[1]==dizi[2])
		{
			System.out.println(dizi[0]+"="+dizi[1]+"="+dizi[2]);
		}
		else if(dizi[0]!=dizi[1]&&dizi[1]==dizi[2])
		{
			System.out.println(dizi[0]+"<"+dizi[1]+"="+dizi[2]);
		}
		else 
		{
			System.out.println(dizi[0]+"="+dizi[1]+"<"+dizi[2]);
		}


	}

}
