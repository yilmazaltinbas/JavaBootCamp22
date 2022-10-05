package week2Odev;
public class Methods2 {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok kötü";

        mesaj.substring(0, 2);
        String yenimesaj = mesaj.toUpperCase();
        System.out.println(yenimesaj);
        int toplam = topla2(2,3,4,5,6,7,8,9,0);

        System.out.println("TOPLAMMMM = " + toplam);

        ekle();
        sil();
        guncelle();

    }

    public static void ekle() {

        System.out.println("Eklendi");

    }

    public static void sil() {

        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1+sayi2;
    }

    public static int topla2(int... sayilar){ // ... 3 nokta sınırsız sayıda ekleme parametre yapabilmemizi sağlıyor bir nevi array'e çevriliyor.
        int toplam = 0;

        for(int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;

    }




}
