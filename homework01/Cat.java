package homework01;

import Actions.Jump;
import Actions.Run;
public class Cat implements Run , Jump {
    private String name;
    private int max_distance;
    private float max_height;

    public Cat(String name,float max_height,int max_distance){
        this.name = name;
        this.max_height= max_height;
        this.max_distance = max_distance;
    }

    @Override
    public void run(int distance) {
        System.out.println(distance <= max_distance?this.name+" can run "+distance:this.name+" can't run, because its limit distance is "+max_distance);
    }
    @Override

    public void jump(float height) {
        System.out.println(height <= max_height?this.name+" can jump "+height:this.name+" can't jump, because its limit height is "+ max_height);
   }


}
