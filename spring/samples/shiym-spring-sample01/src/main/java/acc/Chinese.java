package acc;

public class Chinese implements Person {
    private Axe m_axe;

    // 通过setter方法注入属性值
    public void setAxe(Axe axe) { m_axe = axe; }

    public void useAxe() { m_axe.chop(); }

    public String sayHello(String name) {
        return name + ", 您好";
    }

    public String sayGoodBye(String name) {
        return name + ", 再见";
    }
}
