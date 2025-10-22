package generics;

public class GenericList<T> {

    private T[] array = (T[]) new Object[10];

    private int count;

    public GenericList(){
        count = 0;
    }


    public void add(T item){
        this.array[count++] = item;
    }

    public T get(int index){
        return this.array[index];
    }
}
