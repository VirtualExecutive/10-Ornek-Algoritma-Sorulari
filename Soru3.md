# Algoritma Sorusu 3
> Soru - 3
> 
> 1'den 100'e kadar asal sayıları yazdıran algoritma akış şeması ve java kodunu yazınız.
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/148197045-cdfcb3d4-fd2d-43db-bdb8-7377cace6b18.png)
![image](https://user-images.githubusercontent.com/63202456/148197141-8d36962d-60dd-4c0c-bda3-163684092075.png)


 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru3/src/soru3/Soru3.java)

```java

package soru3;
public class Soru3 {
    public static void main(String[] args) {
        int sayi2=100;
        int i=2;
        int j;
        int sayi3;
        // asal sayıları ekleyebilmek için String olarak "asalSayilar" değişkeni oluştur.
        String asalSayilar = "2";
        while (i<sayi2){
            i++;
            //"String asalSayilar"i boşluklara göre ayırıp "asalSayilarArrays"a dizi olarak ata.
            String[] asalSayilarArrays = asalSayilar.split(" ");
            //0'dan başlayıp "asalSayilarArrays"ın uzunluğu kadar tekrar et.
            for(j=0;j<asalSayilarArrays.length;j++){
                //j'ci elemanını int değerine çevirip "sayi3"e ata.
                sayi3 = Integer.parseInt(asalSayilarArrays[j]);
                //"i" sayısı "sayi3"e tam bölünüyorsa asal sayı değildir.
                if (i%sayi3==0){
                    break;      //for döngüsünü kır.
                }
                else if(j==asalSayilarArrays.length-1){  
                    //for döngüsü bitmeden önce "asalSayilar"a "i" sayısını ekle.
                    asalSayilar = asalSayilar +" "+ i;
                }
            }
        }
        System.out.println(asalSayilar); //asal sayıları ekrana yazdır
    }
}

```

Yorumsuz satırlarla kod
```java

package soru3;
public class Soru3 {
    public static void main(String[] args) {
        int sayi2=100;
        int i=2;
        int j;
        int sayi3;
        String asalSayilar = "2";
        while (i<sayi2){
            i++;
            String[] asalSayilarArrays = asalSayilar.split(" ");
            for(j=0;j<asalSayilarArrays.length;j++){
                sayi3 = Integer.parseInt(asalSayilarArrays[j]);
                if (i%sayi3==0){
                    break;
                }
                else if(j==asalSayilarArrays.length-1){  
                    asalSayilar = asalSayilar +" "+ i;
                }
            }
        }
        System.out.println(asalSayilar);
    }
}

```
