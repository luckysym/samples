package auto;

/**
 * 测试spring自动装配
 */

public class Building {
    String _name;
    int    _floors;
    Man    _man;

    public void setMan(Man man) {
        _man = man;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setFloors(int floors) {
        _floors = floors;
    }

    public String toString() {
        return "{" + _name + ", " + _floors + ", " + _man.toString() + "}";
    }
}
