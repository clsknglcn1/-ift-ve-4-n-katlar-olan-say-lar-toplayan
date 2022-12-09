import java.util.Scanner;

public class ciftsayi4 {
    public static void main(String[] args) {
        int n;
        int total = 0;// varsayılan degeri sıfır kabul etmeliyiz yoksa program hata verir.
        Scanner num = new Scanner(System.in);

        do {
            System.out.println("sayıyı giriniz:");
            n = num.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total+=n;

            }


        } while (n > 0);

        System.out.println("TOPLAM:"+total);

    }
}
