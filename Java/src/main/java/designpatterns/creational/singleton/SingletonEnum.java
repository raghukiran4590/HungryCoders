package src.main.java.designpatterns.creational.singleton;

public enum SingletonEnum {
    SINGLETON_ENUM;

    int value;

    public void getValue() {
        System.out.println(value);
    }

    public void setValue(int value) {
        this.value = value;
    }
}
