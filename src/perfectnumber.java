import java.util.Scanner;

public class perfectnumber {
    static Scanner input=new Scanner(System.in);
        static double num;
        public static void main(String[] args) {
            System.out.println("Please enter a number");
            num= input.nextDouble();
            Check(num);

        }
        public static void Check(double n){
            int counter=1;
            double devisior;
            double sum=0;
            for (int i=1; i<n; i++){
                devisior=n/counter;
                if (devisior%1==0){
                    devisior=counter;
                    sum=sum+devisior;}
                counter++;
            }
            if (sum==num)
                System.out.println("It is a perfect number");
            else
                System.out.println("It is not a perfect number");

        }
    }

