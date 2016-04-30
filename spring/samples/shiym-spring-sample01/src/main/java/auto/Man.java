package auto;

public class Man {
    String _name;
    int    _age;

    public void setName(String name) { _name = name; }

    public void setAge(int age) { _age = age; }

    public String toString() {
        return "{" + _name + ", " + _age + "}";
    }
}
