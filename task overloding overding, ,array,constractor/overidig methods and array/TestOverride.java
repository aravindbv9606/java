public class TestOverride {
    public static void main(String[] args) {
        Child child = new Child();
        child.show(10);
        child.show("Hello");
        child.show(99.9);
    }
}