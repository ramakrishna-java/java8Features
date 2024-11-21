package ram.krish;

class Example {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40; // Package-private

    public void display() {
        System.out.println(publicVar);   // Accessible
        System.out.println(privateVar);  // Accessible
        System.out.println(protectedVar); // Accessible
        System.out.println(defaultVar);  // Accessible
    }
}

class TestAccessSpecifier {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj.publicVar);  // Accessible (public)
        // System.out.println(obj.privateVar); // Not Accessible (private)
        System.out.println(obj.protectedVar); // Accessible (protected in subclass or same package)
        System.out.println(obj.defaultVar);  // Accessible (same package)
    }
}
