package 外观模式;

public class Client {

    public static void main(String[] args) {
        Facade facade=new Facade();
        System.out.println("上课");
        facade.onButton();
       System.out.println("下课");
       facade.offButton();

    }
}