package 外观模式;

public class Facade {
    private Computer c=new Computer();

    private Screen s=new Screen();

    private TouYing t=new TouYing();

    private Mic m=new Mic();



    public void onButton() {

        c.on();

        t.on();

        m.on();

        s.on();

    }

    public void offButton() {

        c.off();

        t.off();

        m.off();

        s.off();

    }
}
