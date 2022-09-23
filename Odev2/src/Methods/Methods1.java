package Methods;

public class Methods1 {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar={1,2,5,7,9,6,0};
        int aranacak=6;
        boolean varMi=false;
        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            mesajVer("Sayi mevcuttur: "+aranacak);
        }else mesajVer("sayı mevcut değildir: "+aranacak);
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
