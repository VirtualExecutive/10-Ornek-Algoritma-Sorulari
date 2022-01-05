# Algoritma Sorusu 6
> Soru - 6
> 
> Kullanıcı tarafından girilen şifrenin çok zayıf, zayıf, iyi, güçlü , çok güçlü gibi hesaplayan algoritma akış şeması ve java kodunu yazınız.
> 
> İPUCU: şifrenin 5 ten kısa olmaması, en az 1 rakam kullanılması, en az 1 küçük harf ve en az 1 büyük harf, en az 1 karakter
>  

---
## Akış Şeması
![image](https://user-images.githubusercontent.com/63202456/148202563-269f24ff-cfc0-4b34-8fe5-0f4cbc2634fd.png)
![image](https://user-images.githubusercontent.com/63202456/148202628-08ea6455-0c37-4afd-9000-b773d0003343.png)
![image](https://user-images.githubusercontent.com/63202456/148202686-8a78db07-9425-45d1-9b14-00d8056a82dc.png)


 
---

## [Java Kodu](https://github.com/yusufYAZICI155/10-Ornek-Algoritma-Sorulari/blob/main/Soru6/src/soru6/Soru6.java)

```java

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

```

