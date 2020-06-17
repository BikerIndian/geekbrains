package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.barrier;

import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Competitor;

public class Wall implements Barrier{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
