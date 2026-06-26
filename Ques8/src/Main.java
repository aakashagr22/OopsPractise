//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods
//    to change the color and check for red or green.
    TrafficLight tl = new TrafficLight();
    tl.setColor("Greeen");
    System.out.println(tl.isRed());

}
class TrafficLight{
    private String color;
    private int duration;

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isRed(){
       return getColor().equals("Red");
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}