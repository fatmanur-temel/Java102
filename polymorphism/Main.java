//Farklı işlemler yapan fakat aynı isimdeki özellik veya metotların kullanımına çok biçimlilik (polymorphism) denmektedir.

class BaseLogger {
    public void log(String mesaj){
        System.out.println("Default mesajı: "+mesaj);
    }
}

class DatabaseLogger extends BaseLogger {
    //overriding
    public void log(String mesaj){
        System.out.println("Logged to databese: "+mesaj);
    }
}

class FileLogger extends BaseLogger {
    //overriding
    public void log(String mesaj){
        System.out.println("Logged to file: "+mesaj);
    }
}

class EmailLogger extends BaseLogger {
    //overriding
    public void log(String mesaj){
        System.out.println("Logged to email: "+mesaj);
    }
}

public class Main {

    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{
                new FileLogger(),
                new DatabaseLogger(),
                new EmailLogger()
        };

        for(BaseLogger logger : loggers){
            logger.log("Log mesajı");
        }
    }
}
