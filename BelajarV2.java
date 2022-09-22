abstract class Main {
    public abstract void coba();
}

public class BelajarV2 extends Main {
    public int x;
    public byte nilaiUlangan;
    final String coba = "roxyzc";

    public BelajarV2(int i, byte nilai) {
        x = i;
        nilaiUlangan = nilai;
    }

    public void coba() {
        System.out.printf("\n%s", coba);
    }

    public static void main(String[] args) {
        BelajarV2 belajar = new BelajarV2(3, (byte) 100);
        // coba.Awal namaNya = new coba.Awal();
        cekUmur((byte) belajar.x);
        nilaiUlangan(belajar.nilaiUlangan);
        int i = sum((int) belajar.x);
        System.out.printf("%d nama: %s", i, belajar.coba);
        belajar.coba();
        // System.out.printf("\n%s", namaNya);
    }

    static void cekUmur(byte umur) {
        if (umur <= 0) {
            System.out.printf("nggak bisa karena umur %d tidak ada \n", umur);
            return;
        }
        if (umur >= 18) {
            System.out.print("anda sudah dewasa \n");
            return;
        }
        System.out.print("anda belum dewasa \n");
    }

    static void nilaiUlangan(byte nilai) {
        if (nilai < 0 || nilai > 100) {
            System.out.printf("Error: Fatal karena nilai %d tidak ada \n", nilai);
            return;
        } else if (nilai < 50) {
            System.out.printf("C karena nilai: %d \n", nilai);
            return;
        } else if (nilai < 80) {
            System.out.printf("B karena nilai: %d \n", nilai);
            return;
        } else if (nilai <= 100) {
            System.out.printf("A karena nilai: %d \n", nilai);
            return;
        } else {
            System.out.print("Error");
        }
    }

    // rekursif
    public static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        }
        return 0;
    }
}
