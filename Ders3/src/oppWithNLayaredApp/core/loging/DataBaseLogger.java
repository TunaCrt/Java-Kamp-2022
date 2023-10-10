package oppWithNLayaredApp.core.loging;

public class DataBaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("veritabanına loglandı: " + data);
    }
}
