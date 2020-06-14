package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.barrier;

import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Competitor;

public class Cross implements Barrier{

    private int dist;

    public Cross(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(dist);
    }
}
