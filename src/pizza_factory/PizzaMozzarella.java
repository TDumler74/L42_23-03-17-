package pizza_factory;

public class PizzaMozzarella extends Pizza{
    private static String TYPE="Pizza Mozzarella";
    public PizzaMozzarella(){
        super(TYPE);
    }
    protected void prepare(){
        System.out.println("Prepare pizza mozzarella ");
    }
}
