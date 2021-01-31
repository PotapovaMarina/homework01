package homework01;

import Actions.Jump;
import Actions.Run;
public class Robot implements Run , Jump {
    private String name;

    private int max_distance;
    private float max_height;

    public Robot(String name,float max_height,int max_distance){
        this.name = name;
        this.max_height= max_height;
        this.max_distance = max_distance;}

    @Override
    public void run(int distance) {
        System.out.println(distance <= max_distance?this.name+" can run "+distance:this.name+" can't run because its max distance is "+max_distance);
    }
    @Override

    public void jump(float height) {
        System.out.println(height <= max_height?this.name+" can jump "+ height:this.name+" can't jump because its max height is "+ max_height);
    }
}
