
public class Main {
    public static void main(String[] args) {
        double avarage = 0.0;
        double sum = 0.0;

        double[] list = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < list.length; i++) {
            sum += (1.0/list[i]);
        }
        avarage = list.length/sum;

        System.out.println(avarage);

    }
}