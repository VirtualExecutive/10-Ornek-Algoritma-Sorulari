# Algoritma Sorusu 1
> Soru - 1
> 
> Kullanıcı tarafından girilen sayının çift yada tek olduğunu ekrana yazdıran algoritma akış şemasını çizin ve java kodunu yazınız.
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/147883400-bd61397a-45e8-4f9d-b3f8-314c8bb46fbf.png)


---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru1/src/soru1/Soru1.java)

```java
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
```

Yorumsuz satırlarla kod
```java
package soru1;
import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        String sonuc=(sayi%2==0)? "çift":"tek";
        System.out.println("Girdiğiniz sayı " + sayi + " " + sonuc + " sayıdır.");
    }
}
```
