package soru2;
public class Soru2 {
    public static void main(String[] args) {
        int sayi1 = 1;      //başlangıç sayısını "sayi1"e ata.
        int sayi2 = 100;    //bitiş sayısını "sayi2"e ata.
        int random;         //"random" değişkenin tiğini int olarak belirle.
        int i=0;            //"i" değişkenini.
        while(i<10){        //"i"nin değeri 10'dan küçük olduğu sürece tekrarla.
            //Math.random() double olarak 0 ila 1 arasında sayı ürettiği için
            //çarpılan sayı kadar sayı çıkar.
            random = (int) (Math.random()*(sayi2-1));
            // başlangıç sayısını ayarla.
            random+=sayi1;
            // Ekrana "random" yazdır.
            System.out.println(random);
            i++;
        }
    }
}
