import java.util.Scanner;

public class ToCompare {
    public static void main(String[] args) {
        int A, B, C;

        Scanner input = new Scanner(System.in);

        System.out.print("Number A =");
        A = input.nextInt();

        System.out.print("Number B=");
        B = input.nextInt();

        System.out.print("Number C=");
        C = input.nextInt();

        if(A==B && B==C){
            System.out.println("A=B=C");
        }

        if (A > B && A > C) {
            if (B > C) {
                System.out.println("A>B>C");
            } else if (C>B){
                System.out.println("A>C>B");
            } else {
                System.out.println("A>C=B");
            }
        }
             if (B > A && B > C) {
                 if(A>C) {
                     System.out.println("B>A>C");
                 }else if(C>A){
                     System.out.println("B>C>A");
                 }else {
                     System.out.println("B>C=A");
                 }
             }
             if(C>A && C>B) {
                 if(A>B){
                     System.out.println("C>A>B");
                 }else if(B>A){
                     System.out.println("C>B>A");
                 }else {
                     System.out.println("C>B=A");
                 }
             }


}
}
