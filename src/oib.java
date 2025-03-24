import java.util.Scanner;

public class oib {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] oib = new int[11];
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        for(int i=0;i<oib.length;i++)
        {
           if(i==0) System.out.print("Unesite oib");
            oib[i] = input.nextInt();
        }
        for(int i=0;i<oib.length-1;i++)
        {
            if(i==0){
                c=oib[i]+10;
                d=c%10;
                if(d==0){
                    d=10;
                }
                e=d*2;
                f=e%11;
            } else {
                c=oib[i]+f;
                d=c%10;
                if(d==0){
                    d=10;
                }
                e=d*2;
                f=e%11;
            }
// 69435151530
        }
        int k = 11-f;
        if(k==10){
            k=0;
        }
        if(k == oib[10]){
            System.out.println("oib je ispravan");

        }else {
            System.out.println("oib je neispravan");
        }


        input.close();
    }
}
