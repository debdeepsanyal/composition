public class Lamp {
    private String style;
    private boolean battery;
    private int globalRating;
    public Lamp(String style, boolean battery, int globalRating){
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }
    public void isOn(){
        System.out.println("Lamp is being turned on ");
    }
    public void isOff(){
        System.out.println("Lamp is being turned off ");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
class Bed {
    private String style;
    private int pillows, height, sheet, quill;

    public Bed(String style, int pillows, int height, int sheet, int quill) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheet = sheet;
        this.quill = quill;
    }
    public void make(){
        System.out.println("Bed is being made ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheet() {
        return sheet;
    }

    public int getQuill() {
        return quill;
    }
}
class Ceiling {
    private int height, paintedColour;

    public Ceiling(int height, int paintedColour) {
        this.height = height;
        this.paintedColour = paintedColour;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColour() {
        return paintedColour;
    }
}
class Wall{
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}