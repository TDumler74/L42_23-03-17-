package pizza_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        String salami = "PIZZA_SALAMI";
        PizzaType pizzaType = PizzaType.valueOf(salami);
        Pizza pizzaSalami = factory.createPizza(pizzaType);
        pizzaSalami.orderPizza();

        String hawaii = "PIZZA_HAWAII";
        PizzaType pizzaType1 = PizzaType.valueOf(hawaii);
        Pizza pizzaHawaii = factory.createPizza(pizzaType);
        pizzaHawaii.orderPizza();

        String mozzarella = "PIZZA_MOZZARELLA";
        PizzaType pizzaType2 = PizzaType.valueOf(mozzarella);
        Pizza pizzaMozzarella = factory.createPizza(pizzaType);
        pizzaMozzarella.orderPizza();

        System.out.println("__________________________________________");
        Scanner scanner = new Scanner(System.in);

        do {
            PizzaType pizzaTypeFromScanner=null;
            boolean flag;

            do {
                flag=false;
                System.out.println("We have tree pizza types. Enter the following: ");
                System.out.println("PIZZA_SALAMI for salami");
                System.out.println("PIZZA_HAWAII for hawaii");
                System.out.println("PIZZA_MOZZARELA for mozzarella");

                String pizzaChoice = scanner.nextLine();
                try {
                    pizzaTypeFromScanner = PizzaType.valueOf(pizzaChoice.toUpperCase());
                } catch (IllegalArgumentException e) {  //e ist ein Object//
                    System.out.println("Please make a valid choice");
                    flag=true;

                }
            }while (flag);
            Pizza newPizza= factory.createPizza(pizzaTypeFromScanner);
            newPizza.orderPizza();
            System.out.println("Do you want to order another pizza? press no if not or any other key is yes");

        } while (!scanner.nextLine().equalsIgnoreCase("no"));
        System.out.println("Thank you for your order! Enjoj your pizza");
        /*
        We have tree pizza types. Enter the following:
PIZZA_SALAMI for salami
PIZZA_HAWAII for hawaii
PIZZA_MOZZARELA for mozzarella
pizza_hawaii
Prepairing pizza with pinapple and cheese
BakingPizza Hawaii
Packing Pizza Hawaii
Do you want to order another pizza? press no if not or any other key is yes

         */
    }
}