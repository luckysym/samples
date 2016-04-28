package acc;

public class American implements Person {
    private Axe m_axe;

    public American() {}

    // 通过构造函数法注入属性值
    public American(Axe axe) {
        m_axe = axe;
    }

    public void useAxe() { m_axe.chop(); }

    public String sayHello(String name) {
        return "Hello, " + name;
    }

    public String sayGoodBye(String name) {
        return "Good Bye, " + name;
    }
}
