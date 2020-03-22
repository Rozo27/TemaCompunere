import java.util.ArrayList;

public class Screen {
    private ArrayList<Pixel> pixels;
    private final Dimensions dimensions;

    public Screen(int noPixels,int width, int length,int depth) {
        pixels=new ArrayList<>(noPixels);
        dimensions=new Dimensions(width,length,depth);
    }
    public void setPixel(int i, String color){
        pixels.get(i).setPixel(color);
    }
    public void colorScreen(String color){
        for(int i=0;i<pixels.size();i++)
            setPixel(i,color);
    }
}
