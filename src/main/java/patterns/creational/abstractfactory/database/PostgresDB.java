package patterns.creational.abstractfactory.database;

public class PostgresDB implements Database {
    String data;

    @Override
    public String getData() {
        return data;
    }

    @Override
    public boolean putData(String s) {
        if (data == null) {
            data = s;
            System.out.println(s + " was written to Postgres database.");
            return true;
        }
        return false;
    }
}
