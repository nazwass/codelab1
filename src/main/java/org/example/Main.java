import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char jeniskelamin;
        String nama , tanggallahir;

        System.out.print("Nama : ");
        nama = input.nextLine();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jenis Kelamin (P/L) : ");
        jeniskelamin = scanner.next().charAt(0);
        System.out.print("Tanggal Lahir :");
        tanggallahir = input.nextLine();

        LocalDate tahunLahir = LocalDate.parse(tanggallahir);
        LocalDate tahunSekarang = LocalDate.now();
        Period period = Period.between(tahunLahir, tahunSekarang);

        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : ");
        switch (jeniskelamin){
            case 'p':
            case 'P':
                System.out.println("Perempuan");
                break;
            case 'l':
            case 'L':
                System.out.println("Laki Laki");
                break;
            default:
                System.out.println("Input Tidak Valid");
        }
        System.out.println("Umur Anda: " + period.getYears() + " Tahun " + period.getMonths() + " Bulan");
    }
}