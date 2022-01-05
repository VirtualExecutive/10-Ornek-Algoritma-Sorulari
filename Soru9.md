# Algoritma Sorusu 9
> Soru - 9
> 
> Sadece önden giriş çıkış kapısı olan bir otobüs muavini, ekrandaki numaralılandırılmış koltuk diziliminin numarasını, otobüsün kaç sıra koltuktan oluştuğunu, en arkadaki koltuk sırasının kaç koltuğu olduğunu, erkeklerin oturduğu koltuk numaralarını ve kızların oturduğu koltuk numaralarını girdikten sonra matrix şeklinde boş koltuklar "B" erkeklerin oturduğu koltuklar "E" kadınların oturduğu
koltuklar "K" koltuk diziliminde tireli kısımlar boşluk olacak şekilde ekrana yazdıran akış şeması ve java kodunu yazınız.
> 
> Not: 1)0-2 , 2)1-2 , 3)2-1 , 4)2-2 , 5)2-0 
> 
> koltuk diziliminin numarasına göre seçtiriniz.
>  


---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru9/src/soru9/Soru9.java)

```java
package soru9;
import java.util.Scanner;
public class Soru9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n1)0-2\n2)1-2\n3)2-1\n4)2-2\n5)2-0\nYukarıdaki numaralandırılmış koltuk diziliminizi seçin: ");
        int dizilim = input.nextInt();
        System.out.print("\nOtobüs kaç sıradan oluşuyor?(Arka sıra dahil): ");
        int sira = input.nextInt() - 1;
        System.out.print("\nArkadaki koltuk sayısı kaç?: ");
        int arkaSira = input.nextInt();
        System.out.print("\nErkeklerin oturduğu koltuk numaralarını arasında boşluk olacak şeklinde yazın: ");
        Scanner input2= new Scanner(System.in);
        String erkekNo = input2.nextLine();
        System.out.print("\nKızların oturduğu koltuk numaralarını arasında boşluk olacak şeklinde yazın: ");
        String kizNo = input2.nextLine();
        int koltukSayisi = sira*((dizilim==1||dizilim==5)?2:((dizilim==2||dizilim==3)?3:4))+arkaSira;
        String koltukSira[] = new String[koltukSayisi];
        for(String i: erkekNo.split(" ")){
            koltukSira[Integer.parseInt(i)-1] = "E";
        }
        for(String i: kizNo.split(" ")){
            koltukSira[Integer.parseInt(i)-1] = "K";
        }
        for(int i=0;i<koltukSira.length;i++){
            if(koltukSira[i]==null){
                koltukSira[i]="B";
            }
        }
        int genislik=arkaSira;
        int koltukno=0;
        if (dizilim==1){
            for(int i=0;i<sira;i++){
                System.out.printf("%"+genislik+"s\n",(koltukSira[koltukno++]+koltukSira[koltukno++]));
            }
        }
        else if(dizilim==2){
            for(int i=0;i<sira;i++){
                System.out.printf(koltukSira[koltukno++]+"%"+(genislik-1)+"s\n",(koltukSira[koltukno++]+koltukSira[koltukno++]));
            }
        }
        else if(dizilim==3){
            for(int i=0;i<sira;i++){
                System.out.printf(koltukSira[koltukno++]+koltukSira[koltukno++]+"%"+(genislik-2)+"s\n",koltukSira[koltukno++]);
            }
        }
        else if(dizilim==4){
            for(int i=0;i<sira;i++){
                System.out.printf(koltukSira[koltukno++]+koltukSira[koltukno++]+"%"+(genislik-2)+"s\n",(koltukSira[koltukno++]+koltukSira[koltukno++]));
            }
        }
        else if(dizilim==5){
            for(int i=0;i<sira;i++){
                System.out.printf(koltukSira[koltukno++]+koltukSira[koltukno++]+"\n");
            }
        }
        String arkaSira2="";
        for(int i=koltukno;i<koltukSayisi;i++){
            arkaSira2=arkaSira2+koltukSira[koltukno++];
        }
        System.out.printf("%"+genislik+"s\n",arkaSira2);
    }
    
}
```

