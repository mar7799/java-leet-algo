package functionDemo;

public class B {
    public void main() {
        System.out.println("Inside class B");
        String[] args = new String[2];
        A.main(args);
    }
}
