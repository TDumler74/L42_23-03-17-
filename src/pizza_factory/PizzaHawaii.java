package pizza_factory;

public class PizzaHawaii extends Pizza{
    private static String TYPE="Pizza Hawaii";
    public PizzaHawaii(){
        super(TYPE);
    }
    protected void prepare(){
        System.out.println("Prepairing pizza with pinapple and cheese");
    }
}
