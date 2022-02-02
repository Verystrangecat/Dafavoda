import java.util.Scanner;

public class Roman {
    static Scanner input=new Scanner(System.in);
    static int num=1;
    public static void main(String[] args) {
        while (num>0){
        System.out.println("PLease enter a number:");
        num=input.nextInt();
        num=check(num);
        fl(num);
        mdl(num);
        lastn(num);

        }



    }
    static public int check(int n){
        while (n>100){
            System.out.println("Please try again");
            n= input.nextInt();}
        return n;
    }
    static public void lastn (int n){
        int n3=n%10;
        if (n3==1)
            System.out.println("I");;
        if (n3==2)
            System.out.println("II");
        if (n3==3)
            System.out.println("III");
        if (n3==4)
            System.out.println("IV");
            if (n3==5)
            System.out.println("V");
            if (n3==6)
            System.out.println("VI");
            if (n3==7)
                System.out.println("VII");
            if (n3==8)
                System.out.println("VIII");
            if (n3==9)
                System.out.println("IX");
            if (n3==0)
                System.out.println("");
        }
            static public void mdl(int n)  {
        int n3=(n/10)%10;
                if (n3==1)
                    System.out.print("X");;
                if (n3==2)
                    System.out.print("XX");
                if (n3==3)
                    System.out.print("XXX");
                if (n3==4)
                    System.out.print("XL");
                if (n3==5)
                System.out.print("L");
                if (n3==6)
                System.out.print("LX");
                if (n3==7)
                    System.out.print("LXX");
                if (n3==8)
                    System.out.print("LXXX");
                if (n3==9)
                    System.out.print("XC");
                if (n3==0)
                    System.out.print("");


        }
        static public void fl(int n){
        int n3=n/100;
        if (n3==1)
            System.out.print("C");
        else
            System.out.print("");

    }
}
