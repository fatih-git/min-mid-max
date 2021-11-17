import java.util.Scanner;

/**
 * @author fatih-git
 */

public class maxmin {

    public static void main(String[] args) {

        int a,b,c,temp;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı girin: ");
        a=input.nextInt();

        System.out.print("Lütfen 2. sayıyı girin: ");
        b=input.nextInt();

        System.out.print("Lütfen 3. sayıyı giirn: ");
        c=input.nextInt();

        if(b>a){
            temp=a;
            a=b;
            b=temp;
        }

        if(c>a){
            temp=a;
            a=c;
            c=temp;

        }

        if(c>b){
            temp=b;
            b=c;
            c=temp;
        }

        System.out.println("Sıralama: "+c+" "+b+" "+a);

    }

}
