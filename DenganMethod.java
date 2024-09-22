public class DenganMethod {
    public static void main(String[] args) {
        int gajipokok = 50000000;
        int tunjanganTransport = 5000000;
        int tunjanganMakan = 500000;
        int bonus = 50000000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajipokok, tunjanganTransport, bonus);
        int pajak = DenganMethod.hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        tampilkanDetailGaji(gajipokok, tunjanganTransport, tunjanganMakan, bonus, gajiBersih);
    }
           public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus){
            return gajipokok + tunjanganTransport + tunjanganTransport + bonus;

    }
    public static hitungPajak(int totalPenghasilan){
        return totalPenghasilan * 10 / 100;

    }
    public static int hitungGajiBersih(int totalPenghasilan, int pajak){
        return totalPenghasilan - pajak;
    }

    public static void tampilkanDetailGaji(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Tunjangan Transport: " + tunjanganTransport);
        System.out.println("Gaji Tunjangan Makan: " + tunjanganMakan);
        System.out.println("Gaji bonus: " + bonus);
        System.out.println("Gaji Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
