package odev2.logging;

public class ConsoleLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Console logger :" + message);

    }
}
