package Main.Projeler;

import java.util.Scanner;

public class KullaniciGirisiProjesi {
    public static void main(String[] args) {
        String userName, password, answer, Y;

        Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

        
        

        if (userName.equals("Patika") && password.equals("java123"))
        {
            System.out.println("Giriş yaptınız.");

        } 
        
        else {
                System.out.println("Bilgileriniz yanlış !\nŞifrenizi sıfırlamak istiyorsanız 'Y' tuşuna basınız.");
                Y = input.nextLine();
                System.out.print("Yeni Şifreniz : ");
                answer = input.nextLine();
                if (!answer.equals("java123")) {
                    System.out.print("Yeni Şifreniz Başarılı Şekilde Oluşturuldu.");

                } else {
                    System.out.print("Yeni şifreniz eski şifreniz ile aynı. Lütfen başka bir şifre giriniz.");
                }

            }
            
        }
        

    }
