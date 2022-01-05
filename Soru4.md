# Algoritma Sorusu 4
> Soru - 4
> 
> Kullanıcıdan kilo ve boy verilerini alarak zayıf, sağlıklı, kilolu, şişman, aşırı şişman şeklinde 
>beden kitle indeksini hesaplayıp sonucunu ekrana yazdıran algoritma akış şemasını çizin ve java kodunu yazınız.
>
>NOT:BKİ = kilo/boy'un metre cinsinden karesi
>
>0-20		Zayıf
>
>20-25		Sağlıklı
>
>25-30		Kilolu
>
>30-40		Şişman
>
>40-60		Aşırı Şişman
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/148198108-2740b148-c285-46de-b408-fd69283bf597.png)
![image](https://user-images.githubusercontent.com/63202456/148198158-de1bced4-b575-4062-b2f7-8fc6f1df7b1f.png)


 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru4/src/soru4/Soru4.java)

```java

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
```

Yorumsuz satırlarla kod
```java

package soru4;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        System.out.print("Kilo ve cm cinsinden boyunuzu girin: ");
        Scanner input = new Scanner(System.in);
        int kilo = input.nextInt();
        double boy = input.nextDouble();
        boy/=100;
        double BKI = kilo/(Math.pow(boy,2)); 
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

```
