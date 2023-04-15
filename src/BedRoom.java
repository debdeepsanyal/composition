public class BedRoom {
    private Lamp lamp;
    private Bed bed;
    private Ceiling ceiling;
    private Wall wall1, wall2, wall3, wall4;
    String name;

    public BedRoom(Lamp lamp, Bed bed, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4, String name) {
        this.lamp = lamp;
        this.bed = bed;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.name = name;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(boolean yes){
        if(yes){
            bed.make();
        }
    }
    public void LightToggle(boolean yes){
        if(yes){
            lamp.isOn();
        }
        else{
            lamp.isOff();
        }
    }
    public void lightCheck(int num){
        if(num > lamp.getGlobalRating()){
            System.out.println("Rating unsuitable");
        }
        else{
            System.out.println("safe to use");
        }
    }

}
