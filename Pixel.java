public class Pixel {
    private String color;

    public Pixel(String color){
        this.color=color;
    }
    public Pixel(){
        this("FFFFFF");
    }
    public void setPixel(String color){
        this.color=color;
    }
}
