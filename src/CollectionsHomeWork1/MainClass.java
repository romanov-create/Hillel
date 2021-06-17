package CollectionsHomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        IntList myList = new IntListArray(); // 11 элементов в массиве
        IntList myList2 = new IntListArray(); // пустой массив
        /* метод add , добавляем элементы*/
        myList.add(6);
        myList.add(90);
        myList.add(63);
        myList.add(77);
        myList.add(666);
        myList.add(6232);
        myList.add(903423);
        myList.add(6353);
        myList.add(773);
        myList.add(66622);
        myList.add(555);


        System.out.println("печать массива 11 элементов: " + myList);

        System.out.println("метод get: " + myList.get(3));

        System.out.println("метод size: " + myList.size());

        System.out.println("метод sublist: " + myList.subList(1, 8));

        System.out.println("метод isEmpty: " + myList.isEmpty());

        System.out.println("метод isEmpty для пустого массива: " + myList2.isEmpty());

        System.out.println("метод size для пустого массива: " + myList2.size());

        System.out.println("метод remove удаляем с индексом 2: " + myList.remove(2));
        System.out.println(myList);

        System.out.println("метод removeByValue удаляем 666: " + myList.removeByValue(666));
        System.out.println(myList);

        System.out.println("метод set заменяем с индексом 7: " + myList.set(7, 777));
        System.out.println(myList);

        System.out.println("метод add добавляем под индекс 0 число 888: " + myList.add(0, 888));
        System.out.println(myList);

        System.out.println("метод toArray: " + Arrays.toString(myList.toArray()));

        myList.clear();
        System.out.println("метод clear: " + myList);


    }
}
