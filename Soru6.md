# Algoritma Sorusu 2
> Soru - 2
> 
> 1'den 100'e kadar rastgele sayı oluşturup 10 defa ekrana yazdıran algoritma akış şemasını çizin ve java kodunu yazınız.
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/147885803-9ce55f97-5808-46c3-a657-86dd565d6b85.png)

 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru2/src/soru2/Soru2.java)

```java

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

```

Yorumsuz satırlarla kod
```java

package soru2;
public class Soru2 {
    public static void main(String[] args) {
        int sayi1 = 1;      
        int sayi2 = 100;    
        int random;         
        int i=0;            
        while(i<10){        
            random = (int) (Math.random()*(sayi2-1));
            random+=sayi1;
            System.out.println(random);
            i++;
        }
    }
}

```
