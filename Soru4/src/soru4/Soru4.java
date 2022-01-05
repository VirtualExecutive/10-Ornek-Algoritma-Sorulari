package soru4;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        //Kullanıcıdan kilo ve boy iste
        System.out.print("Kilo ve cm cinsinden boyunuzu girin: ");
        Scanner input = new Scanner(System.in);
        int kilo = input.nextInt();
        double boy = input.nextDouble();
        boy/=100; //cm cinsinden girilen boyunu metreye çevir.
        double BKI = kilo/(Math.pow(boy,2));  //vucüt kitle endeksini hesapla
        String humanState;
        if(BKI<=20){
            humanState="Zayıf";
        }
        else if(BKI<=25){
            humanState="Normal";
        }
        else if(BKI<=30){
            humanState="Kilolu";
        }
        else if(BKI<=40){
            humanState="Şişman";
        }
        else{
            humanState="Aşırı Şişman";
        }
        System.out.println(humanState+" \nBKI: "+BKI);
        
    }
    
}
