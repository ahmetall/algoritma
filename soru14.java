package finalcalisma;

public class soru14 {

	public static void main(String[] args) {
		int bol,bolum;
		int i=1;
    	for(;i<=100;i++)
    	{
    		System.out.print(i+"==>");
    		for(bol = 1; bol<=i;bol++){
    		bolum=i % bol;
    		
    		if(bolum==0){
       			System.out.print(bol+" ");
    			
    		}
    		
    	}
    	System.out.println();
    }
	}
}

