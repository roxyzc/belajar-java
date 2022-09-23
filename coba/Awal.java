package coba;

// public class Awal{
//     String namaDepan, namaBelakang;

// construktor;
// public Awal() {
//  = 
//  = 
// }
//     public static void main(String[] argas){
//         Awal coba = new Awal("roxyzc", "coba");
//     }
// }

public class Awal {
    int nomer;

    public Awal(int i) {
        this.nomer = i;
    }

    public static void main(String[] args) {
        Awal myObject = new Awal(1);
        int hasil = sum((int) myObject.nomer);
        System.out.printf("hasilnya %d", hasil);

    }

    static int sum(int i) {
        if (i > 0) {
            return i + sum(i - 1);
        }
        return 0;
    }
}
