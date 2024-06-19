public class Main{
    public static void main(String[] args);
    Pizza basePizza = new Pizza(veg false);
    //basePizza.getPizzaPrice();
    //basePizza.addExtraToppings();
    //basePizza.addExtraCheese();
    //basePizza.takeAway();
    //basePizza.getBill();

    DeluxePizza dp = new DeluxePizza( veg true);
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.getBill();
 }