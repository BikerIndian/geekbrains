package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01;

public enum DayOfWeek {
    Monday,Tuesday,WednesdayThursday,Friday,Saturday;
    private String[]  dayOfWeekRus = {"понедельник","вторник","среда","четверг","пятница","суббота"};
    private int workingHours = 40;

    /**
     * @return Возвращает кол-во оставшихся рабочих часов до конца недели
     */
    public int getRemainderWorkingHours(){
        if (6 == this.ordinal() || 7 == this.ordinal() ){
            return 0;
        }
        return 40-(this.ordinal()*8);
    }

    public String getRus(){
        return dayOfWeekRus[this.ordinal()];
    }

    public void printRemainderWorkingHours(){

        if (6 == this.ordinal() || 7 == this.ordinal() ){
            System.out.println("Сегодня "+ this.getRus()+ " выходной.");
        } else {
            System.out.println("Сегодня "+ this.getRus()+".");
            System.out.println("Оставшихся рабочих часов до конца недели " + this.getRemainderWorkingHours()+".");
        }
    }
    //Saturday,Sunday - выходные
}
