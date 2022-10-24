package odev2.abstractDemo;

public class CustomerManager {
    BaseDataManager dataBaseManager;
    public void getCustomers(){
        dataBaseManager.getData();
    }
}
