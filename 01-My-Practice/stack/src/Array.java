/**
 * @Author: ming.wang
 * @Date: 2020/11/18 0018 9:44
 * @Description:
 */
public class Array<E> {

    private int size;

    private E[] data;

    public Array() {
        data = (E[]) new Object[3];
    }

    public Array(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public E removeLast() {
        return remove(size - 1);
    }

    public E removeFirst() {
        return remove(0);
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();
        return data[index];
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();
        data[index] = e;
    }

    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (e == data[i])
                return i;
        }
        return -1;
    }

    public boolean contains(E e) {
        return !(-1 == find(e));
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException();

        E result = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if(size == data.length / 4 && data.length / 2 != 0)
            reSize(data.length / 2);
        return result;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException();

        //动态扩容
        if (size == data.length)
            reSize(size * 2);
        //
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;

    }

    private void reSize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;

    }

    @Override
    public String toString() {
        return "Array{" +
                "  capacity=" + data.length +
                ", size=" + size +
                ", data=" + data +
                '}';
    }
}

