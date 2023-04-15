public class Computer_main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("G7710","Samsung",20,"2560 x 1440");
        ComputerCase computerCase = new ComputerCase("F77-1","Apple","240V");
        MotherBoard motherBoard = new MotherBoard("HH54","AMD",8,6,"v.02.4");
        personalComputer computer = new personalComputer("F77-1","Apple", motherBoard,computerCase,monitor);// passing the 3 objects just created
        //now how do we access the methods of the different parts in the personalComputer we have just created
        //there are two ways
        //computer.getMotherBoard.loadProgram("MacOS"); -> so here, we are basically calling the getter method
        //in the personalComputer to have access to the class MotherBoard using the object motherBoard created in the
        //personalComputer class. so personalComputer.getMotherBoard returns MotherBoard and then we are performing
        //MotherBoard.loadProgram which returns the desired value. but this isnt the optimal way.
        computer.startComputer();//here we have created a function in the personalComputer class which calls the other
                                 //classes.
        computer.loadScreen();



    }
}