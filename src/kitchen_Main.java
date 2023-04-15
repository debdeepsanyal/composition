public class kitchen_Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().brewCoffee();
//        kitchen.getFridge().OrderFood();
//        kitchen.getDishWasher().doDishes();
        kitchen.ActivateSmartMode(true, false, true);
    }
}
