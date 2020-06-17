package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors;

public class Human implements Competitor {

    private final String name;
    private final int maxRunDistance;
    private final int maxJumpHeight;
    private boolean onDistance;
    private String type;

    /**
     * @param name Имя
     * @param maxRunDistance Максимальная дистанция, которую может пробежать.
     * @param maxJumpHeight Максимальная высота, которую может прыгнуть.
     */
    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.type = "Человек";
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type+" "+ name + " побежал "+ dist +" m.");
        }
        else {
            System.out.println(type+" "+ name + " не смог пробежать "+ dist +" m. [Выбыл]");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height){

        if (height <= maxJumpHeight) {
            System.out.println(type+" "+ name + " прыгнул "+ height +" m.");
        } else {
            System.out.println(type+" "+ name + " смог прыгнуть "+ height +" m. [Выбыл]");
            onDistance = false;
        }
    }
    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}
