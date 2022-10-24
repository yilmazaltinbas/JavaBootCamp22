package odev2.interfaces;

public class MySqlCustomerDal implements ICustomerDal  {
    @Override
    public void Add() {
        System.out.println("Mysql eklendi");
    }
}
