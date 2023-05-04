package 外观模式;

public class Computer {
    String name = "cm";
    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void on() {

        System.err.println(name+"已打开");

    }

    public void off() {

        System.out.println(name+"关闭");

    }
}
