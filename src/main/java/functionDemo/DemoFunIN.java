package functionDemo;

@FunctionalInterface
interface AB{
    void display();
}

public class DemoFunIN{
    public static void main(String[] args) {
        AB obj = () -> {
            System.out.println("Display B");
        };
        obj.display();
    }
}

