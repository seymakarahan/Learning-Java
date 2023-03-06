package AtmProjesi;

import java.util.Scanner;

public class Pratik2 {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;


        do {
        System.out.println("Kullanıcı adınız : ");
        username = input.nextLine();
        System.out.println("Parolanız : ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("dev123")) {
            System.out.println("Merhaba, X bankasına hoşgeldiniz!");

            do {
                System.out.println("1- Para yatırma\n" + "2- Para çekme\n" + "3- Bakiye sorgulama\n" + "4- Çıkış");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
            
                switch (select) {
                    case 1:
                    System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    balance += price;
                    System.out.println("Yeni bakiyeniz : " + balance);
                        break;
                    case 2:
                    System.out.print("Para miktarı : ");
                    price = input.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz");
                    } else {
                        balance -= price;
                        System.out.println("Yeni bakiyeniz : " + balance);
                    }
                        break;
                    case 3:
                    System.out.println("Bakiyeniz : " + balance);
                        
                        break;
                
                    default:
                        break;
                }
            
            
            } while(select != 4);
            System.out.println("Çıkış yapıldı.");
            break;

        } else {
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if (right == 0) {
            System.out.println("Hesabınız bloke edildi. Banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan hakkınız :" + right);
            }
        }
    } while(right > 0);
}  
}
