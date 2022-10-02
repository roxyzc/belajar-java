import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

interface IBiodata {
    public void cetak();
}

class Biodata implements IBiodata {
    private String nama = "roxyzc";
    private int nim = 10000000;
    private DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss");
    private LocalDateTime waktu = LocalDateTime.now();
    protected String kelas;
    protected byte umur;
    public String hobi;
    // private LocalTime waktuBiasa = LocalTime.now();
    // private LocalDate tanggal = LocalDate.now();

    public Biodata(String kelas, byte umur, String hobi) {
        this.kelas = kelas;
        this.umur = umur;
        this.hobi = hobi;
    }

    public void cetak() {
        System.out.printf("Nama:\t%s\nNim:\t%d\nKelas:\t%s\nDibuat:\t%s", this.nama, this.nim, this.kelas,
                this.waktu.format(this.format2));
    }
}

public class BuatBesok extends Biodata {
    /**
     * @param kelas
     * @param umur
     * @param hobi
     */
    public BuatBesok(String kelas, byte umur, String hobi) {
        super(kelas, umur, hobi);
    }

    /**
     * @param args
     */

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kelas anda: ");
            String kelas = input.nextLine();
            BuatBesok data = new BuatBesok(kelas, (byte) 19, "Main game");
            data.cetak();
            input.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
    }
}
