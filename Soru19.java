package finalcalisma;

public class Soru19 {

	public static void main(String[] args) {
		int dizi[]= {1,3,4,8,7};
		
		int max=dizi[0];
        for(int t=1;t<dizi.length;t++){
            if(dizi[t]>max){
                max=dizi[t];
            }
        }
        System.out.println(max);

	}

}
