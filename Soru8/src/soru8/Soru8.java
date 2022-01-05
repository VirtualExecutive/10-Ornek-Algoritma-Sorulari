package soru8;
import java.util.Scanner;
public class Soru8 {
    public static void main(String[] args) {
        System.out.print("SAYI-SAYI cinsinden yazınız,\nÖrn: 2-150 , 2 ila 150 arasındaki asal sayıları gösterecektir.\nİstediğiniz aralığını yazınız: ");
        Scanner input = new Scanner(System.in);
        // SAYI1-SAYI2 cinsinden veri alıyoruz.
        String degerler = input.nextLine();
        String degerler2[] = degerler.split("-");
        //SAYI1 kısmını alıyoruz.
        int sayi1 = Integer.parseInt(degerler2[0]);
        //SAYI2 kısmını alıyoruz.
        int sayi2 = Integer.parseInt(degerler2[1]);
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
        //asal sayıları String tipinde asalSayilarArrays'a ata.
        String[] asalSayilarArrays = asalSayilar.split(" ");
        //dizinin son elemanı büyük olduğu için genişliğini "genislik" değişkenine atadık.
        int genislik = (asalSayilarArrays[asalSayilarArrays.length-1]).length();
        int number;
        int sutun=1;
        //asalSayilarArrays dizisindeki her bir eleman için "str" ye atayıp döngüyü tekrarla.
        for (String str: asalSayilarArrays){
            //elemanı int tipine çevirip "number" değişkenine ata.
            number = Integer.parseInt(str);
            //kullanıcıdan aldığımız değerlerin arasındaysa yap.
            if(sayi1<number&&number<sayi2){
                //sutun sırası 10 veya 10'dan daha az ise asal sayıyı ekrana yazdır.
                if(sutun<=10){
                    System.out.printf("%"+genislik+"d ", number);
                    sutun++;
                }
                //sutun sırası 10'dan üstü ise alt satıra geçip asal sayıyı ekrana yazdır.
                else{
                    System.out.printf("\n%"+genislik+"d ", number);
                    sutun=1;
                    sutun++;
                }
            }
        }
        
    }
    
}
