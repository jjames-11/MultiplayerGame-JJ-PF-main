package Client;
import java.util.ArrayList;

public class ship {
    int size;
    ArrayList<square> Squares = new ArrayList<square>();    
    boolean sink = false;
    boolean up = true;
    boolean down = false;
    boolean right = false;
    boolean left = false;
    int square_size = 50;

    public ship(int size){
        this.size = size;
    }

    public void move(int x1, int y1, int x2, int y2){

    }
}
