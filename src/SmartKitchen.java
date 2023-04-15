public class SmartKitchen {
    private Refrigerator fridge;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;
    public SmartKitchen(){
        fridge = new Refrigerator(); // here, we are making the variables objects of their respective classes
        dishWasher = new DishWasher();//this can otherwise be done by creating objects in the main class and passing (bedroom and kitchen example)
        coffeeMaker = new CoffeeMaker();// those objects to this constructor(if this one was having the class variables
    }                                   //as their arguments in this constructor.

//    public Refrigerator getFridge() {
//        return fridge;
//    }
//
//    public DishWasher getDishWasher() {
//        return dishWasher;
//    }
//
//    public CoffeeMaker getCoffeeMaker() {
//        return coffeeMaker;
//    }
    public void ActivateSmartMode(boolean c, boolean f, boolean dw){
//        fridge.setHasWorkToDo(f);
//        dishWasher.setHasWorkToDo(dw);
//        coffeeMaker.setHasWorkToDo(c);
        if(fridge.setHasWorkToDo(f)){
            fridge.OrderFood();
        }
        if(coffeeMaker.setHasWorkToDo(c)){
            coffeeMaker.brewCoffee();
        }
        if(dishWasher.setHasWorkToDo(dw)){
            dishWasher.doDishes();
        }

    }
}
