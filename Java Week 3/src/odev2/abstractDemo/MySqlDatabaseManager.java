package odev2.abstractDemo;

public class MySqlDatabaseManager extends BaseDataManager {
    @Override
    public void getData() {
        System.out.println("Veri Getirildi: MySql Server");
    }
}
