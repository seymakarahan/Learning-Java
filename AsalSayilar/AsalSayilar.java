package AsalSayilar;

public class AsalSayilar {
    public static void main(String[] args) {
        int sayac = 0, i, j;

        for (i = 3; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if(i % j == 0)  sayac++;

            }
            if (sayac == 0) System.out.println(i);
            sayac = 0;
            }
        }
}

