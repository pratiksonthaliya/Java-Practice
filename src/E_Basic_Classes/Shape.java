package E_Basic_Classes;

public interface Shape {
    public void computeArea();
}

// Concrete Class
class Rectangle implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Compute Area Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void computeArea() {
        System.out.println("Compute Area Square");
    }
}
