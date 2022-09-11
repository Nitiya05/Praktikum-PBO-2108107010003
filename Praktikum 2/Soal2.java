import java.util.Scanner;

public class Soal2 {
    public static void main(String[]args) {
        Scanner input = new Scanner (System.in);
        int x;

        System.out.print("Masukkan Nilai :");
        x = input.nextInt();

        if(x< 41){
            System.out.println("Nilai Huruf : 0.00 (E)");
        }
        else if(x>=41 && x<51){
            System.out.println("Nilai Huruf : 1.00 (D)");
        }
        else if(x>=51 && x<60){
            System.out.println("Nilai Huruf : 2.00 (C)");
        }
        else if(x>=60 && x<69){
            System.out.println("Nilai Huruf : 2.50 (BC)");
        }
        else if(x>=69 && x<78){
            System.out.println("Nilai Huruf : 3.00 (B)");

        }else if(x>=78 && x <87){
            System.out.println("Nilai Huruf : 3.50 (AB)");
        }else if(x>= 87){
            System.out.println("Nilai Huruf : 4.00 (A)");
        }else{
            System.out.println("Invalid");
        }
    }
}
