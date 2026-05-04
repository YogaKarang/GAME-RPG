public class Musuh {
    protected String namaMusuh;
    protected int healthPoint;

    public Musuh() {
        this.namaMusuh = "Monster Dasar";
        this.healthPoint = 100;
    }

    public void serang() {
        System.out.println(this.namaMusuh + " Melakukan serangan fisik! Pemain kehilangan 10 HP.");
    }

    public void serang(String elemenSihir) {
        System.out.println(this.namaMusuh + " Mengeluarkan sihir " + elemenSihir + "! Pemain kehilangan 30 HP.");
    }

    public void terimaDamage(int damage) {
        this.healthPoint -= damage;
        System.out.println(this.namaMusuh + " Terkena serangan biasa. Sisa HP: " + this.healthPoint);
    }
}