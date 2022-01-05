package soru6;
import java.util.Scanner;
public class Soru6 {
    public static void main(String[] args) {
        System.out.print("Şifrenizi girin: ");
        Scanner input = new Scanner(System.in);
        int passwordStrength=0;
        String password = input.nextLine();
        String lowerAlphabet ="abcdefghijklmnoprstuvyzxqw";
        for (String i: lowerAlphabet.split("")){
            if (password.contains(i)){
                passwordStrength++;
                break;
            }
        }
        String upperAlphabet ="ABCDEFGHIJKLMNOPRSTUVYZXQW";
        for (String i: upperAlphabet.split("")){
            if (password.contains(i)){
                passwordStrength++;
                break;
            }
        }
        String numbers = "0123456789";
        for (String i: numbers.split("")){
            if (password.contains(i)){
                passwordStrength++;
                break;
            }
        }
        String characters = "-_*?}][{)(=/&%+^'!é,.;:";
        for (String i: characters.split("")){
            if (password.contains(i)){
                passwordStrength++;
                break;
            }
        }
        if (password.length()>5) passwordStrength++;
        System.out.println("Şifre gücünüz: "+passwordStrength);
        
    }
    
}
