import java.util.Scanner;
public class ForKelipatan03{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah, counter;
        float rata;
        rata = 0;
        jumlah = 0;
        counter = 0;

        System.out.println(("Masukkan bilangan kelipatan (1-9): "));
        kelipatan = scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                rata = jumlah / counter;

                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
                System.out.printf("Rata-rata seluruh bilangan kelipatan %d adalah %.3f\n", kelipatan, rata);


            }
        }


    }
}