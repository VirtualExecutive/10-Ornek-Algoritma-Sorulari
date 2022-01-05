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
