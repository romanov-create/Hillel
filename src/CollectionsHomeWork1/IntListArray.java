package CollectionsHomeWork1;

import java.util.Arrays;

public class IntListArray implements IntList{
    private int[] arr = new int[10];
    private int size = 0;

/* не понял как выводить массив при распечатки его в консоле(метод toString) без 0 */
    @Override
    public void add(int element) {
        if (size >= arr.length) {
            int newSize = arr.length * 3 / 2 + 1;
            int[] newArr = new int[newSize];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = element;
        size++;
    }

    @Override
    public boolean add(int index, int element) {
        if(index < size && index >= 0) {
            int[] arr1 = new int [size + 1];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            System.arraycopy(arr1, index, arr1, index + 1, size - index);
            arr1[index] = element;
            arr = arr1;
            size = size + 1;

            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        arr = null;
        size = 0;
    }

    @Override
    public int get(int index) {
      int i = arr[index];
        return i;
    }

    @Override
    public boolean isEmpty() {
        if(size > 0) {
            return true;
        } else return false;
    }
    /* вопрос, как можно обойтись без создания доп массива.
     я его создал т.к. не могу убрать последний пустой елемент массива arr */
    @Override
    public boolean remove(int index) {
        int[] newArr = new int [size - 1];
        if(index >= 0 && index < size) {
            System.arraycopy(arr, index + 1, arr, index, size - 1 - index);
            System.arraycopy(arr, 0, newArr, 0, newArr.length);
            arr = newArr;
            size = newArr.length;
//        arr[size - 1] = 0;
//        size = size - 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeByValue(int value) {
        int[] newArr = new int [size - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.arraycopy(arr, i + 1, arr, i, size - 1 - i);
                System.arraycopy(arr, 0, newArr, 0, newArr.length);
                arr = newArr;
                size = newArr.length;
            }
        }
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

/* не сообразил как вернуть результат типа IntList . Сделал String чтобы корректно отображалось в консоле */
    @Override
    public String subList(int fromIndex, int toIndex) {
        int[] subArray = new int[toIndex - fromIndex + 1];
        int i = fromIndex;
        for (int j = 0; j < subArray.length; j++) {
            subArray[j] = arr[i];
            i++;
        }
        return Arrays.toString(subArray);
    }



    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    @Override
    public String toString() {
        return "arr= " + Arrays.toString(arr) + ", size= " + size;
    }

}
