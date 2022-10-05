package week2Odev;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();

        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};

        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);


        DortIslem dortIslem = new DortIslem();

        int sonuc =  dortIslem.Topla(3,4);
        int sonuc2 = dortIslem.Cikar(10,20);
        System.out.println(sonuc);
        System.out.println(sonuc2);





    }
}
