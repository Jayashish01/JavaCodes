class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name
    Person(String name) {
        this.name = name;
        this.age = 18;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Jayashish", 21);
        Person p3 = new Person("Mahesh");

        p1.display();
        p2.display();
        p3.display();
    }
}
