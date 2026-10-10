public class Utama {
    public static void main(String[] args) {
        // BujurSangkar
        BujurSangkar bujursangkar = new BujurSangkar(5, "Hijau");
        System.out.println("\n--- Bujur Sangkar ---");
        System.out.println("Warna: " + bujursangkar.getWarna());
        System.out.println("Sisi: " + bujursangkar.getSisi());
        System.out.println("Luas: " + bujursangkar.hitungLuas());
        bujursangkar.printInfo();
        // Lingkaran
        Lingkaran lingkaran = new Lingkaran(9, "Emerald");
        System.out.println("\n--- Lingkaran ---");
        System.out.println("Warna: " + lingkaran.getWarna());
        System.out.println("Radius: " + lingkaran.getRadius());
        System.out.println("Luas: " + lingkaran.hitungLuas());
        lingkaran.printInfo();
        // Silinder
        Silinder silinder = new Silinder(8, 10, "Tosca");
        System.out.println("\n--- Silinder ---");
        System.out.println("Warna: " + silinder.getWarna());
        System.out.println("Radius: " + silinder.getRadius());
        System.out.println("Tinggi: " + silinder.getTinggi());
        System.out.println("Volume: " + silinder.hitungVolume());
        silinder.printInfo();
    }
}