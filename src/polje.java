import java.util.Scanner;

public class polje {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Unesite veličinu polja");
        int k = input.nextInt();
        int[] polje = new int[k];
        int najm=0;
        int najv=0;
        int f1=0;
        for(int i=0;i<k;i++){
            if(i==0){
                System.out.println("Unesite "+k+" brojeva");
            }
            polje[i] = input.nextInt();
            if(najm==0 && f1==0){
                f1=1;
                najm=polje[i];
            }
            if(polje[i]<najm){
                najm=polje[i];
            }
            if(polje[i]>najv){
                najv=polje[i];
            }
        }
        System.out.println(najm);
        System.out.println(najv);



        input.close();
    }
}
