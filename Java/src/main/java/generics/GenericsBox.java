package src.main.java.generics;

public class GenericsBox<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericsBox<Integer> integerGenericsBox = new GenericsBox<>();
        integerGenericsBox.setItem(1);
        System.out.println(integerGenericsBox.getItem());

        GenericsBox<String> stringGenericsBox = new GenericsBox<>();
        stringGenericsBox.setItem("Generic String");
        System.out.println(stringGenericsBox.getItem());
    }
}
