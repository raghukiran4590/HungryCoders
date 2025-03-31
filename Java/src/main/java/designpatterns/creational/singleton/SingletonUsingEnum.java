package src.main.java.designpatterns.creational.singleton;

public class SingletonUsingEnum {

    public static void main(String[] args) {

        SingletonEnum singletonEnum = SingletonEnum.SINGLETON_ENUM;

        singletonEnum.getValue();
        singletonEnum.setValue(10);
        singletonEnum.getValue();

    }

}
