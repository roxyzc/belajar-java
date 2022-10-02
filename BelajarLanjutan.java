import java.time.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;

interface IDate {
    public void format();

    public void tanggal();

    public void waktu();
}

class Date implements IDate {
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private LocalDate tanggal = LocalDate.now();
    private LocalDateTime tanggalDanWaktu = LocalDateTime.now();
    private LocalTime waktu = LocalTime.now();

    public void format() {
        System.out.println(this.tanggalDanWaktu.format(this.format));
    }

    public void tanggal() {
        System.out.println(this.tanggal);
    }

    public void waktu() {
        System.out.println(this.waktu);
    }
}

class List {
    public void ambilData(ArrayList<?> coba) {
        for (Object i : coba) {
            System.out.println(i);
        }
    }

    public void ambilDatav2(ArrayList<?> coba) {
        for (int i = 0; i < coba.size(); i++) {
            System.out.println(coba.get(i));
        }
    }
}

public class BelajarLanjutan {
    public static void main(String[] args) {
        // ArrayList<String> coba = new ArrayList<String>();
        List belajar = new List();
        // belajar.ambilData(coba);
        // belajar.ambilDatav2(coba);
        // coba.clear();

        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(10);
        myNumber.add(40);
        myNumber.add(120);
        myNumber.add(20);
        myNumber.add(9);
        Collections.sort(myNumber);
        belajar.ambilData(myNumber);

        LinkedList<String> link = new LinkedList<String>();
        LinkedList<Integer> link1 = new LinkedList<Integer>();
        link.add("coba");
        link.add("COBA");
        link.addLast("Last");
        link.addFirst("First");
        link1.addAll(myNumber);
        for (String i : link) {
            System.out.println(i);
        }
        for (int i : link1) {
            System.out.println(i);
        }

        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        hash.put('A', 100);
        hash.put('B', 80);
        hash.put('C', 60);
        hash.put('D', 40);
        hash.replace('A', 100, 99);
        @SuppressWarnings("unchecked")
        HashMap<Character, Integer> hash1 = (HashMap<Character, Integer>) hash.clone();
        // or
        Object hash2 = hash.clone();
        System.out.println(hash1);
        System.out.println(hash2);
        for (char i : hash.keySet()) {
            System.out.printf("Key: %s\nValue: %d\n\n", i, hash.get(i));
        }

        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("BMW");
        hashSet.add("HONDA");
        hashSet.add("YAMAHA");
        for (String i : hashSet) {
            if (i.toLowerCase().contains("honda")) {
                break;
            } else {
                System.out.println(i);
            }
        }

        // iterator ArrayList
        Iterator<Integer> it = myNumber.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (i < 20) {
                it.remove();
            }
        }
        System.out.println(myNumber);

        // Iterator hastSet
        Iterator<String> it1 = hashSet.iterator();
        while (it1.hasNext()) {
            String i = it1.next();
            if (i.toLowerCase().contains("bmw")) {
                it1.remove();
            }
        }
        System.out.println(hashSet);

        Integer x = 10;
        Float y = 21.5f;
        Boolean valid = true;
        String nama = "roxyzc123 ";
        System.out.println(x.intValue());
        System.out.println(y.intValue());
        System.out.println(valid.toString());
        System.out.println(nama.trim() + "coba");

        try {
            checkAge(0);
        } catch (Exception e) {
            System.out.println(e);
        }

        checkKata("anjing");

    }

    static void checkAge(int umur) {
        if (umur < 18) {
            throw new ArithmeticException("Lu belum cukup umur");
        }
        System.out.println("dongo");
    }

    static void checkKata(String text) {
        Pattern kata = Pattern.compile("anjing", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher cariKata = kata.matcher(text);
        boolean valid = cariKata.find();
        System.out.println(valid ? "Toxic bae" : "Mantap anda sungguh sopan");
    }
}
