# Algoritma Sorusu 7
> Soru - 7
> 
> Kullanıcı tarafından girilen öğrenci sayısı ve öğrencilerin notlarını tek tek girip öğrencilerin not ortalaması ve 50 veya üstü not alıp sınıfı geçen öğrenci sayısını ekrana yazdıran algoritma akış şemasını çizin ve java kodunu yazınız.
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/148203930-fa40d396-619b-420a-997b-f0377115b743.png)
![image](https://user-images.githubusercontent.com/63202456/148203979-e18d70cc-e245-462a-ad62-566b99dbe4be.png)

 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru7/src/soru7/Soru7.java)

```java

package soru7;
import java.util.Scanner;
public class Soru7 {
    public static void main(String[] args) {
        System.out.print("Kaç öğrenci var? : ");
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();
        int not;
        int toplam=0;
        int upNot50 = 0;
        for(int i=1;i<=students;i++){
            System.out.print(i+". öğrencinin notu: ");
            not = input.nextInt();
            toplam+=not;
            if (not>=50) upNot50++;
        }
        System.out.println("Not ortlaması: "+(toplam/students)+"\nSınıfı geçen sayısı: "+upNot50);
        
    }
    
}

```

