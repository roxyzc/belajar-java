import java.time.*;
import java.time.format.DateTimeFormatter;

class Coba1 {
    protected String sertifikatRumah = "punya orang tua";
    public String nama = "";
    private int hasil = 0;

    public int sum(int x, int y) {
        this.hasil += x + y;
        return this.hasil;
    }
}

enum Level {
    Medium,
    Hard
}

class Belajar extends Coba1 {
    public static void main(String[] args) {
        // Level player = Level.Medium;
        // System.out.print(player);
        LocalDate tanggal = LocalDate.now();
        System.out.println(tanggal);
        LocalTime waktu = LocalTime.now();
        System.out.println(waktu);
        LocalDateTime tanggalDanWaktu = LocalDateTime.now();
        System.out.println(tanggalDanWaktu);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String coba = tanggalDanWaktu.format(format);
        System.out.println(coba);

        // try (Scanner input = new Scanner(System.in)) {
        // System.out.print("Nama anda:");
        // String nama = input.nextLine();
        // System.out.print(nama);
        // } catch (Error error) {
        // System.out.print(error);
        // }
    }
}