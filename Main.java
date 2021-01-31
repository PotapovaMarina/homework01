import Actions.Jump;
import Actions.Run;
import homework01.*;

import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {

        Cat c = new Cat("Cat", 1.2f, 10);
        Man m1 = new Man("Петров", 2, 25);
        Man m2 = new Man("Иванов", 3.5f, 30);
        Robot r = new homework01.Robot("homework01.Robot", 3.1f, 20);

        ArrayList<Run> running = new ArrayList<>();
        running.add(r);
        running.add(m1);
        running.add(m2);
        running.add(c);

        ArrayList<Jump> jumping = new ArrayList<>();
        jumping.add(r);
        jumping.add(m1);
        jumping.add(m2);
        jumping.add(c);

        RunningTrack[] runTracks = {new RunningTrack(26), new RunningTrack(30)};
        //  System.out.println(runTracks[1].distance);
        Wall[] walls = {new Wall(2.1f), new Wall(3.2f)};
        for (int i = 0; i < runTracks.length; i++) {
            for (Run j : running) {
                j.run(runTracks[i].distance);
            }
        }
        for (int i = 0; i < walls.length; i++) {
            for (Jump j : jumping) {
                j.jump(walls[i].height);
            }
        }
    }
}
