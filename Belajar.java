public class Belajar {
    // int x = 1;
    // String namaDepan = "Fauzhan", namaBelakang = "Qhof";
    // String[] coba = { "coba", "lagi" };

    public static void main(String[] args) {
        // Belajar myObj = new Belajar();

        // int i = (int) (Math.random() * 2);
        // System.out.println(myObj.x);
        // System.out.println(myObj.coba[i]);
        // for (String i : myObj.coba) {
        // System.out.println(i);
        // }
        // perulangan(2, "fauzhan");

        // int i = angka(1);
        int a = coba(2);

        // nggak bisa karena pake void;
        String coba1 = coba();

        // System.out.print(i);
        System.out.printf("%d \n", a);
        System.out.print(coba1);
    }

    // void tidak mengembalikan data
    // static void perulangan(int i, String nama) {
    // do {
    // System.out.printf("perulangan do while %d \n", i);
    // System.out.printf("perulangan do while %s", nama);
    // i++;
    // } while (i < 1);

    // while (i < 1) {
    // System.out.printf("perulangan while biasa %d", i);
    // i++;
    // }
    // }

    // error jika pake void
    static int coba(int i) {
        return i + 1;
    }

    static String coba() {
        return "coba";
    }

    // static int angka(int i) {
    // while (i < 10) {
    // // System.out.print(i);
    // i++;
    // }
    // return i;
    // }
}
