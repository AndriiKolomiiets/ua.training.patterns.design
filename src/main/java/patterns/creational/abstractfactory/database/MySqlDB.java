package patterns.creational.abstractfactory.database;

public class MySqlDB implements Database {
    String data;

    @Override
    public String getData() {
        return data;
    }

    @Override
    public boolean putData(String s) {
        if (data == null) {
            data = s;
            System.out.println(s + " was written to MySql database.");
            return true;
        }
        return false;
    }
}
