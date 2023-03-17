package pizza_factory;

public abstract class Pizza {
    public String type;
    public Pizza(String type){
        this.type=type;
    }
    public void orderPizza(){
        prepare();
        bake();
        box();
    }
    protected abstract void prepare();
    /*man sieht im selbem Packet und der tochterklasse*/
    private void bake(){
        System.out.println("Baking"+type);
    }
    private void box(){
        System.out.println("Packing "+type);
    }
}
