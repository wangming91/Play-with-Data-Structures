/**
 * @Author: ming.wang
 * @Date: 2020/11/18 0018 13:53
 * @Description:
 */
public class ArrayStack<E> implements Stack<E> {
    Array<E> array;

    public ArrayStack() {
        array = new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.get(0);
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "array=" + array +
                '}';
    }
}

