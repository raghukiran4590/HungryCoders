package src.main.java;

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

//    @Override (Deep Cloning)
//    public Person clone() throws CloneNotSupportedException {
//        Person clonedPerson = (Person) super.clone();
//        clonedPerson.address = new Address(this.address.city); // Deep copy of Address
//        return clonedPerson;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}



public class Cloning {

    public static void main(String[] args) {
        try {
            Address address = new Address("New York");
            Person person1 = new Person("John", address);

            Person person2 = person1.clone();
            person2.name = "Jane";
            person2.address.city = "Los Angeles";

            System.out.println(person1); // Output: Person{name='John', address=Address{city='Los Angeles'}}
            System.out.println(person2); // Output: Person{name='Jane', address=Address{city='Los Angeles'}}
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
