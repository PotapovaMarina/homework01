package homework01;

import Actions.Jump;
import Actions.Run;


public class Man implements Run, Jump {
  private String name;
  private float limitHeight;
  private int limitDistance;

  public Man(String name,float limitHeight,int limitDistance) {
    this.name = name;
    this.limitHeight = limitHeight;
    this.limitDistance = limitDistance;
  }

  @Override
  public void run(int distance) {
    System.out.println(distance <= limitDistance?this.name+" can run "+ distance:this.name+" can't run, because his limit distance is "+limitDistance);
  }
  @Override

  public void jump(float height) {
    System.out.println(height <= limitHeight?this.name+" can jump "+height:this.name+" can't jump, because his limih height is "+limitHeight);
  }

}

