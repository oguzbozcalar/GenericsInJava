import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {
    private T[] data;
    private int elemanSayisi;


    public MyList() {
        this.data = (T[]) new Object[10];
        this.elemanSayisi = 0;
    }

    public MyList(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.elemanSayisi = 0;
    }

    public int size() {
        return this.elemanSayisi;
    }

    public int getCapacity() {
        return this.data.length;
    }

    public void add(T t) {
        if (elemanSayisi == data.length) {
            kapasiteArtir();
        }
        data[elemanSayisi++] = t;

    }

    private void kapasiteArtir() {
        T[] newData = (T[]) new Object[data.length * 2];
        for (int i = 0; i < this.data.length; i++) {
            newData[i] = this.data[i];
        }
        this.data = newData;
    }

    public T get(int index) {
        if (index < 0 || index >= this.data.length) {
            return null;
        }
        return this.data[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= this.data.length) {
            System.out.println("Geçersiz index değeri");
        } else {
            this.data[index] = null;
            for (int i = index; i < this.data.length; i++) {
                if (i == this.size()) {
                    break;
                }
                this.data[i] = this.data[i + 1];
            }
        }

    }

    public void set(int index, T data) {
        if (index < 0 || index >= this.data.length) {
            System.out.println("Geçersiz index değeri");
        } else {

            this.data[index] = data;
        }

    }


    public void print() {
        System.out.print("Dizi :");
        for (T datum : this.data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.data.length; i++) {
            sb.append(data[i]);
            if (i != this.data.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();

    }

    public int indexOf(T t) {
        for (int i = 0; i < this.data.length; i++) {
            if (data[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T t) {

        for (int i = this.data.length - 1; i >= 0; i--) {
            if (Objects.equals(this.data[i], t)) {
                return i;
            }
        }
        return -1;

    }

    public boolean isEmpty() {
        return this.elemanSayisi == 0;
    }

    public T[] toArray() {
        T[] newArray = (T[]) new Object[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] != null) {
                newArray[i] = this.data[i];
            }

        }

        return newArray;
    }

    public void clear() {
        Arrays.fill(this.data, null);
        this.elemanSayisi = 0;
    }

    public MyList<T> subList(int fromIndex, int toIndex) {
        MyList<T> newList = new MyList<>();
        for (int i = fromIndex; i < toIndex; i++) {
            newList.add(this.data[i]);
        }
        return newList;
    }

    public boolean contains(T t) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == t) {
                return true;
            }
        }
        return false;
    }


    public T[] getData() {
        return this.data;
    }

    public void setData(T[] data) {
        this.data = data;
    }


}