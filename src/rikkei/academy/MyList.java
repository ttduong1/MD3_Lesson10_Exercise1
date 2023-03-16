package rikkei.academy;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }
    public void add(int index, E element){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size);
        }
        E[] addArrays=clone();
        if(this.size==DEFAULT_CAPACITY){
            addArrays= (E[]) new Object[this.size+1];
        }
        for (int i = 0; i < size+1; i++) {
            if(i < index){
                addArrays[i] = elements[i];
            }else if (i == index){
                addArrays[i] = element;
            }else {
                addArrays[i]=elements[i - 1];
            }

        }
        this.elements= addArrays;
        this.size+=1;

    }
    public int size(){
        return this.size;
    }
    public E[] clone(){
       E listClone[] = (E[]) new Object[this.size];
        for (int i = 0; i < size; i++) {
            listClone[i] = elements[i];
        }
        return listClone;
    }
    public boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                return true;
            }
        }return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                return i;
            }
        }return -1;
    }
    public boolean add(E o){
        if(this.size==DEFAULT_CAPACITY){
            E[] addArrays= (E[]) new Object[this.size+1];
            for (int i = 0; i < size; i++) {
                addArrays[i]=elements[i];
            }
            addArrays[size+1]=o;


        }else {
            elements[size]=o;
        }
        this.size+=1;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if ((minCapacity <= 10)) {
            throw new IllegalArgumentException("Độ rộng tối thiểu của mảng là 10");
        }
        E ensureList[] = (E[]) new Object[minCapacity];
        for (int i = 0; i < size; i++) {
            ensureList[i] = elements[i];
        }
        this.elements = ensureList;
    }
    public E get(int i){
        if (i<0&&i>=size){
            throw new IndexOutOfBoundsException(i +" khong ton tai ");
        }
        return elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
}
