package geekUniversityAndroid.quarter1.javaCoreAdvancedLevel.lesson03;

    /*
	    ФИО:  		    Свищ Владимир Сергеевич
	    Факультет:      Geek University Android-разработки
	    Курс: 		    Java Core. Продвинутый уровень
	    Урок: 		    Урок 3. Коллекции
	    Дата правки:    22.06.2020
    */

import java.util.*;

public class MainLesson03 {
    public static void main(String[] args) {
    /*
        1. Создать массив с набором слов (10-20 слов, среди которых должны
           встречаться повторяющиеся). Найти и вывести список уникальных слов,
           из которых состоит массив (дубликаты не считаем). Посчитать, сколько
           раз встречается каждое слово.
    */

        List<String> listWords = new ArrayList<>(Arrays.asList(
                "абонент", "абориген", "абстрактный",
                "барабан", "бараний", "барельеф",
                "вакуум", "вакханалия", "валенки",
                "генерал", "гениальный", "декабрь",
                "декада", "декларация",
                "жакет", "жасмин",
                "гениальный", "абстрактный", "валенки", "жасмин"
        ));
        printListWords(listWords);


    /*
        2. Написать простой класс ТелефонныйСправочник, который хранит в себе
           список фамилий и телефонных номеров. В этот телефонный справочник с
           помощью метода add() можно добавлять записи. С помощью метода get()
           искать номер телефона по фамилии. Следует учесть, что под одной фамилией
           может быть несколько телефонов (в случае однофамильцев), тогда при запросе
           такой фамилии должны выводиться все телефоны.

           Желательно как можно меньше добавлять своего, чего нет в задании
           (т.е. не надо в телефонную запись добавлять еще дополнительные поля
           (имя, отчество, адрес), делать взаимодействие с пользователем через
           консоль и т.д.). Консоль желательно не использовать (в том числе Scanner),
           тестировать просто из метода main(), прописывая add() и get().
    */
        phoneBookRun();
    }



    private static void printListWords(List<String> listWords) {
        Set<String> listWordsUnique = new HashSet<>(listWords);

        //вывести список уникальных слов
        System.out.println("   *** Список уникальных слов ***");
        System.out.println(listWordsUnique.toString());

        //Посчитать, сколько раз встречается каждое слово.
        System.out.println();
        System.out.println("   *** Сколько раз встречается каждое слово. ***");
        Iterator<String> it = listWordsUnique.iterator();
        while(it.hasNext()){
            String word = it.next();
            int amount = amountWords(word,listWords);
            System.out.println(word+" - "+amount);
        }

    }

    /**
     * Посчитать, сколько раз встречается каждое слово.
     * @param word Слово для поиска.
     * @param listWords Список слов в котором производится поиск.
     * @return Количество встречающихся слов
     */
    private static int amountWords(String word, List<String> listWords) {
        int amount = 0;
        for (int i = 0; i < listWords.size(); i++) {
            if (listWords.get(i).equals(word)) {
                amount++;
            }
        }
        return amount;
    }

    private static void phoneBookRun() {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Смирнов","+79267778899");
        phonebook.add("Иванов","+79267771100");
        phonebook.add("Кузнецов","+79267772299");
        phonebook.add("Смирнов","+79267773388");

        System.out.println();
        System.out.println("   *** Телефонный справочник ***");
        System.out.println("Смирнов - "+phonebook.get("Смирнов").toString());
        System.out.println("Иванов - "+phonebook.get("Иванов").toString());
    }
}
