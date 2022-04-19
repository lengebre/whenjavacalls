public class Hello extends SampleAbstract  implements SampleInterface{

    

    void hello() {
        System.out.println("Hello, World!");
    }

    @Override
    public void sample() {
        System.out.println("Sample interface implemented");
    }

    @Override
    public void sampleAbstract() {
        System.out.println("Sample abstract implemented");
        
    }

    public void whileLoopExample() {
    }
    
}
