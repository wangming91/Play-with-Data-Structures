/**
 * @Author: ming.wang
 * @Date: 2020/11/18 0018 10:19
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Array<Integer> array = new Array<>();

        array.addFirst(0);
        System.out.println(array);
        array.add(1, 1);
        array.add(2, 3);
        array.add(3, 4);
        array.add(4, 5);
        System.out.println(array);
        array.add(2, 2);
        System.out.println(array);
        array.addLast(6);
        System.out.println(array);

        System.out.println("==============remove==============");
        array.removeLast();
        System.out.println(array);
        array.remove(2);
        System.out.println(array);
        array.remove(4);
        array.remove(3);
        System.out.println(array);
        array.removeFirst();
        System.out.println(array);
    }

}

