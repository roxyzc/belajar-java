// import java.util.*;

interface FirstInterface {
    public void myMethod(); // interface method
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

abstract class Main {
    private String npc = "roxyzc";
    protected String MC = npc;

    public abstract void coba();
}

abstract class AnimalSound {
    public abstract void animalSound();
}

class Animal extends AnimalSound {
    int x = 10;

    public void animalSound() {
        System.out.print("Moooo\n");
    }

    class InnerClass {
        int y = 5;
    }

    static class innerClass1 {
        int z = 15;
    }
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

public class BelajarV2 extends Main {
    public int x;
    public byte nilaiUlangan;
    final String coba = "roxyzc";
    String nama;

    // contructor
    public BelajarV2(int i, byte nilai) {
        this.x = i;
        this.nilaiUlangan = nilai;
    }

    // abstract function
    public void coba() {
        System.out.print("coba");
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter
    public String getNama() {
        return this.nama;
    }

    public static void main(String[] args) {
        BelajarV2 belajar = new BelajarV2(6, (byte) 100);
        Animal animal = new Animal();
        Animal.InnerClass animal1 = animal.new InnerClass();
        Animal.innerClass1 animal2 = new Animal.innerClass1();
        DemoClass demo = new DemoClass();
        System.out.printf("%d %d %d\n", animal.x, animal1.y, animal2.z);
        demo.myMethod();
        demo.myOtherMethod();
        animal.animalSound();
        // try (Scanner inputNama = new Scanner(System.in)) {
        // coba.Awal namaNya = new coba.Awal();
        // System.out.printf("\n%s", namaNya);
        // System.out.println("Masukkan nama anda:");
        // String nama = inputNama.nextLine();
        // belajar.setNama(nama);
        // } catch (Error Error) {
        // System.out.print(Error);
        // }
        cekUmur((byte) belajar.x);
        nilaiUlangan(belajar.nilaiUlangan);
        int i = sum((int) belajar.x);
        System.out.printf("%d nama: %s MCnya %s\n", i, belajar.coba, belajar.MC);
        // System.out.print(belajar.getNama());
    }

    // function
    static void cekUmur(byte umur) {
        if (umur <= 0) {
            System.out.printf("nggak bisa karena umur %d tidak ada \n", umur);
            return;
        }
        if (umur >= 18) {
            System.out.print("anda sudah dewasa \n");
            return;
        }
        System.out.printf("anda belum dewasa karena umur anda %d \n", umur);
    }

    // function
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
    static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        }
        return 0;
    }
}