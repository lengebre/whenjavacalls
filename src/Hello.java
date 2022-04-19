public class Hello implements SampleInterface {
    

    void hello() {
        System.out.println("Hello, World!");
    }

    @Override
    public void sample() {
        System.out.println("Sample interface implemented");
    }
    
}
