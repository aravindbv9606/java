class Student{
public void register(String name) {
        System.out.println("Registered: " + name);
    }

    public void register(String name, int age) {
        System.out.println("Registered: " + name + ", Age: " + age);
    }

    public void register(String name, int age, String course) {
        System.out.println("Registered: " + name + ", Age: " + age + ", Course: " + course);
    }
}
