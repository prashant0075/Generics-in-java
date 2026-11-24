public class Main {
    public static void main(String[] args) {
        Box b = new Box("Anjali");

        Demo<String> d = new Demo<>("Prashant");
        d.print();
        String s = d.get();

        System.out.println(s);
    }
}
