package soru1;
import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
        // Ekrana "Bir sayı giriniz: " yazdır.
        System.out.print("Bir sayı giriniz: ");
        
        // input değişkeni adında Scanner tipini çağır.
        Scanner input = new Scanner(System.in);
        // "Scanner input" ile int tipindeki klavye girdisini "sayi"ya ata.
        int sayi = input.nextInt();
        
        // "sayi" değişkeninin değeri 2'ye bölümünden kalanı 0 ise "çift" değil ise "tek" olarak "sonuc" ata.
        String sonuc=(sayi%2==0)? "çift":"tek";
        
        // Ekrana sonucu yazdır.
        System.out.println("Girdiğiniz sayı " + sayi + " " + sonuc + " sayıdır.");
    }
    
}
