# Algoritma Sorusu 5
> Soru - 5
> 
> Kullanıcı tarafından girilen cümlenin, kullanıcı tarafından girilen harf, hece veya kelimenin yerlerine yine kullanıcı tarafından girilen harf, hece veya kelime ile 
> değiştirilip değiştirilen cümleyi ve kaç defa değiştirildiğini ekrana yazdıran algoritma akış şemasını ve java kodunu yazınız.
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/148199081-3753baa7-9db9-4dbe-ac85-37b461e4f542.png)
![image](https://user-images.githubusercontent.com/63202456/148199160-93d6ec78-3658-4b2e-ab63-20a403f421af.png)

 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru5/src/soru5/Soru5.java)

```java

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
            //değiştirilecek ilk kısmını değiştir.
            text=text.replaceFirst(changeOld,changeNew);
            sayac++;
        }
        System.out.println("Yeni yazınız:\n"+text+"\n\nBilgi: Yazının üzerinde "+sayac+" defa değişiklik yapıldı.");
    }
    
}

```

Yorumsuz satırlarla kod
```java

package soru5;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        System.out.println("Bir cümle giriniz:");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        System.out.println("Değiştirilmesini istediğiniz harf, hece veya kelimeyi girin: ");
        String changeOld = input.nextLine();
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

```
