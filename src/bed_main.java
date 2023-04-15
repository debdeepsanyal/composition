public class bed_main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp("Classic", true,120);
        Bed bed = new Bed("Queen",4,20,3,2);
        Ceiling ceiling = new Ceiling(140,1);
        Wall wall1 = new Wall("east");
        Wall wall2 = new Wall("west");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("north");
        BedRoom room = new BedRoom(lamp,bed,ceiling,wall1,wall2,wall3,wall4,"Neel");
        room.makeBed(true);
        room.lightCheck(75);
        room.LightToggle(false);

    }
}
