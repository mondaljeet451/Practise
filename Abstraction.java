public abstract class Abstraction {
    abstract void car();
}

class SUV extends Abstraction{

    @Override
    public void car(){
        System.out.println("This car is SUV type");
    }
}

class Carname extends SUV {
    @Override
    public void car(){
        System.out.println("This is a Mercedes AMG");
    }
}
