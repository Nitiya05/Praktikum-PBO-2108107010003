import java.util.Scanner;

public class Latihan1{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        int x, harga, total, diskon, jumlah;

        System.out.print("masukkan harga :");
        harga = input.nextInt();

        System.out.print("masukkan banyak barang :");
        x = input.nextInt();

        jumlah = harga*x;
        diskon = jumlah*15/100;
        total = jumlah-diskon;
        System.out.println("Diskon 15% = " +diskon+ "\nJumlah harga :" +total);
