public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    public Product(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

}
class Monitor extends Product{ //so we know that Inheritance has an "is a" relationship
    private int size; //since monitor is a subclass of product,monitor "is a" product
    private String resolution;
    public Monitor(String model, String manufacturer, int size, String resolution){
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixel(int x, int y, String colour){
        System.out.printf("Draw pixel at %d , %d in colour %s \n", x,y,colour);
    }
}
class MotherBoard extends Product{ //Motherboard is also a product
    private int ramSlots;
    private int cardSlots;
    private String bios;
    public MotherBoard(String model , String manufacturer, int ramSlots, int cardSlots, String bios){
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    public void loadProgram(String programName){ // a behaviour of the motherboard which is the concept behind
        System.out.println("Program " + programName + " is loading ...\n"); // adding methods to a class
    }
}
class ComputerCase extends Product{ //Computercase is also a product
    private String powerSupply;
    public ComputerCase(String model, String manufacturer, String powerSupply){
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button pressed\n");
    }
}
