public class Main {
    public static void main(String[] args) {

        String ogrenci3 = "Nazlı";
        String ogrenci4 = "Aysu";
        String ogrenci2 = "Gökcen";
        String ogrenci1 = "Engin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Nazlı";
        ogrenciler[1] = "Aysu";
        ogrenciler[2] = "Gökcen";
        ogrenciler[3] = "Derin";

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-----------------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}