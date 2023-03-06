package BurcBulanProgram;

import java.util.Scanner;

public class BurcBulmaProjesi {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz ay : ");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = input.nextInt();


        if ((month >= 1) && (month <= 3)) {
        month = 1;                               
            if ((day >=1) && (day <= 31)) {  //Ocak
            if (day < 22) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
        }
    }
    else {
        isError = true;
    }


        month = 2;                                  
            if ((day >=1) && (day <= 28)) {  //Şubat
            if (day < 20) {
            burc = "Kova";
        } else {
            burc = "Balık";
    }
    }
    else {
    isError = true;
    }

        month = 3;
            if ((day >=1) && (day <= 31)) {  //Mart
            if (day < 21) {
            burc = "Balık";
        } else {
            burc = "Koç";
    }
    }
    else {
    isError = true;
    }
        month = 4;
            if ((day >=1) && (day <= 30)) {  //Nisan
            if (day < 21) {
            burc = "Koç";
        } else {
            burc = "Boğa";
    }
    }
    else {
    isError = true;
    }


    if (isError) {
        System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
    } else{
        System.out.println("Burcunuz : " + burc);
    }
}
    else {
        System.out.println("Doğduğunuz ay girişi hatalı. Tekrar deneyiniz.");
    }
}
}
