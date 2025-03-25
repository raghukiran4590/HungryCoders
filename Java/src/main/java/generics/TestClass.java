package src.main.java.generics;

public class TestClass {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.setItem("Test");
        int i = (int) obj.getItem();
        System.out.println(i);
    }
}
