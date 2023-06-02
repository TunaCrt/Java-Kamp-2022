public class ProductValidator {
    // new lenmediği "ProductValidator()" için çalışmaz.
    //  Çalışması için altta ki gibi static lazım ama yaygın bir kullanım değilidr.
    static {
        System.out.println("Yapıcı blok çalıştı");
    }
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else return false;
    }

    //inner class
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
