package soru5;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        // Ekrana "Bir cümle giriniz" yazdır.
        System.out.println("Bir cümle giriniz:");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        // Değiştirmesini istediği kısımlarını girmesini istiyoruz.
        System.out.println("Değiştirilmesini istediğiniz harf, hece veya kelimeyi girin: ");
        String changeOld = input.nextLine();
        // Değiştirlecek olan yazının yerine geçecek yazının girmesini istiyoruz.
        System.out.println("Değiştirilecek yerlerine harf, hece veya kelimeyi girin: ");
        String changeNew = input.nextLine();
        int sayac=0;
        while(text.contains(changeOld)==true){
            text=text.replaceFirst(changeOld,changeNew);
            sayac++;
        }
        System.out.println("Yeni yazınız:\n"+text+"\n\nBilgi: Yazının üzerinde "+sayac+" defa değişiklik yapıldı.");
    }
    
}
