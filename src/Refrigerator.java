public class Refrigerator{
    private boolean hasWorkToDo;
    public boolean setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo=hasWorkToDo;
        return hasWorkToDo;
    }
    public void OrderFood(){
        if(hasWorkToDo){
            System.out.println("Water is being added");
        }
    }
}
class DishWasher{
    private boolean hasWorkToDo;
    public boolean setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
        return hasWorkToDo;
    }
    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Dishes are being done ");
        }
    }
}
class CoffeeMaker{
    private boolean hasWorkToDo;
    public boolean setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
        return hasWorkToDo;
    }
    public void brewCoffee(){
        if(hasWorkToDo){
            System.out.println("Coffee is being brewed ");
        }
    }
}