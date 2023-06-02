package Methods;

public class Methods2 {
    public static void main(String[] args) {
        String mesaj="bugün hava çok güzel";
        String yenimesaj=sehirVer();
        System.out.println(yenimesaj);
        int sayi=topla(1,5);
        System.out.println(sayi);

        System.out.println(topla2(1,2,3,4,5,6,7));

    }
    public static void ekle( ){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void güncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... Sayılar){//Variable arguments
        int toplam=0;
        for (int sayi:Sayılar){
            toplam=toplam+sayi;
        }
        return toplam;
    }
    public static String sehirVer(){
        return "Amasya";
    }

}
