package pizza_factory;

public class PizzaFactory {
    public Pizza createPizza(PizzaType type){
        switch (type){
            case PIZZA_SALAMI :return new PizzaSalami();
            case PIZZA_MOZZARELLA:return new PizzaMozzarella();
            case PIZZA_HAWAII:return new PizzaHawaii();
            default:return null;
        }
    }
}
