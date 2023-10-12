import java.util.Scanner;
public class DoWhileCuti03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan.nextInt();
        
        do {
            System.out.print("Apakah anda ingin mengambil jatah cutih (y/t)?");
            konfirmasi = scan.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;                                                                        
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    
                }
            } else {System.out.println("Terimakasih maniezkuuu"); 
            break; }

        } while (jatahCuti > 0);
    }
}