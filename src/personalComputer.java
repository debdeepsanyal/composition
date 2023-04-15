public class personalComputer extends Product{ //personal computer too, is a Product
    private MotherBoard motherBoard; // PC is made up of these 3 components, thus the PC "has"
    private ComputerCase computerCase;// these 3 components. this introduces the concept of composition
    private Monitor monitor;// the datatype of an object is its own class

    public personalComputer(String model, String manufacturer, MotherBoard motherBoard,
                            ComputerCase computerCase, Monitor monitor) {
        super(model, manufacturer);
        this.motherBoard = motherBoard; //objects were being passed in the constructor in the main code, which are being
        this.computerCase = computerCase; // assigned to rhe 3 variables created here
        this.monitor = monitor; // the variables created here are being made objects of their classes in this constructor
    }
    private void drawLogo(){
        monitor.drawPixel(200,50,"Violet");
    }
    public void startComputer(){
        drawLogo();
        computerCase.pressPowerButton();
    }
    public void loadScreen(){
        motherBoard.loadProgram("Mac OS");
    }
}

//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//}
