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
