package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01;

  /*
	    ФИО:  		    Свищ Владимир Сергеевич
	    Факультет:      Geek University Android-разработки
	    Курс: 		    Java Core. Продвинутый уровень
	    Урок: 		    Урок 1. Объектно-ориентированное программирование Java
	    Дата правки:    14.06.2020
  */

import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.barrier.Barrier;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.barrier.Cross;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.barrier.Wall;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Cat;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Competitor;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Human;
import geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson01.competitors.Robot;

public class MainLesson01 {
    public static void main(String[] args) {

    /*
        1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
           Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии
           в консоль).
        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
           участники должны выполнять соответствующие действия (бежать или прыгать),
           результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
        3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников
           пройти этот набор препятствий.
        4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников
           ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
           то дальше по списку он препятствий не идет.
    */
        // Участники
        Competitor[] competitors = {
                new Human("Петя",1000,2),
                new Cat("Мурзик",100,2),
                new Robot("Валли",3000,10),
        };

        // препятствия
        Barrier[] barriers ={
                new Cross(500),
                new Wall(3),

        };

        for (Competitor competitor:competitors ) {
            for (Barrier barrier : barriers) {
                barrier.doIt(competitor);
                if (!competitor.isOnDistance()) {
                    break;
                }
            }
        }

        /*
            5. * Задание с перечислениями. (текст прикреплен в материалах)

            Требуется реализовать enum DayOfWeek, который будет представлять
            дни недели.

            С его помощью необходимо решить задачу определения кол-ва рабочих
            часов до конца недели по заданному текущему дню.

            Возвращает кол-во оставшихся рабочих часов до конца
            недели по заданному текущему дню.

            Считается, что текущий день ещё не начался, и рабочие часы за него
            должны учитываться.

            Если заданный день выходной то вывести "Сегодня выходной"
         */

    }
}
