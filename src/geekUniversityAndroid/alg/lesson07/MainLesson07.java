package geekUniversityAndroid.alg.lesson07;

public class MainLesson07 {

    /*
      ФИО:  		    Свищ Владимир Сергеевич
      Факультет:        Geek University Android-разработки
      Курс: 		    Алгоритмы и структуры данных на Java.
      Урок: 		    Урок 7. Графы
      Дата правки:      10.08.2020
    */

    public static void main(String[] args) {

        Graph graph = new Graph(10);

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,0);

        graph.addEdge(4,6);
        graph.addEdge(6,7);
        graph.addEdge(7,8);


        /*
        1. Реализовать программу, в которой задается граф из 10 вершин.
        Задать ребра и найти кратчайший путь с помощью поиска в ширину. Так же укажите длину пути.
        */
        findGraph(graph);

        
        /*
        2 *. Сделать рефакторинг кода, унаследовав от одного касса классы обхода в глубину и ширину.
        */
        refact(graph);

    }

    private static void findGraph(Graph graph) {

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(8) + " Длина пути = "+ bfp.pathTo(8).size());
    }


    private static void refact(Graph graph) {

        System.out.println("-- Breadt --");
        MyDBFirstPath mbfp = new MyDBFirstPath(graph, 0 );
        System.out.println(mbfp.hasPathTo(8));
        System.out.println(mbfp.pathTo(8));

        System.out.println("-- Depth --");
        MyDBFirstPath mdfp = new MyDBFirstPath(graph, 0,false );
        System.out.println(mdfp.hasPathTo(8));
        System.out.println(mdfp.pathTo(8));

    }

}
