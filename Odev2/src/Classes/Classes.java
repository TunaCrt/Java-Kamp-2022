package Classes;

public class Classes {

    /*
        Sınıf şablondur. Sınıfı kullanbilmek için ise objeler üretilir.

        Değer ve referans tipler
        Olay tamamen ögeninin bellekte tutulma şekliyle alakalı.
        Referans tiplerde ögeler adres saklarken değer tipler ise bir değer saklar
     */

        public static void main(String[] args) {
            Customer customer1 = new Customer();
            Customer customer2 = new Customer();

            customer2 = customer1;
            customer1.add();
            customer1.delete();
            customer1.update();

            int sayi1 = 10;
            int sayi2 = 20;

            sayi2 = sayi1;
            sayi1 = 30;
            System.out.println(sayi2);

            int[] sayilar1 = new int[]{1, 2, 3};
            int[] sayilar2 = new int[]{5, 6, 7};
            sayilar2 = sayilar1;
            sayilar1[0] = 52;
            System.out.println(sayilar2[0]);
        }
    }


