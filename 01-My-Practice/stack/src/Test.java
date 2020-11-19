/**
 * @Author: ming.wang
 * @Date: 2020/11/18 0018 14:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
//        test01();
        test02();
    }

    private static void test02() {
        System.out.println("括号匹配问题测试");

        System.out.println("() is  " + isValid("()"));

        System.out.println("()) is  " + isValid("())"));
        System.out.println("([]){ is  " + isValid("([]){"));

    }

    class Solution {
        public boolean isValid(String s) {
            ArrayStack<Character> stack = new ArrayStack<>();

            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (c.equals("{") || c.equals("[") || c.equals("(")) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty())
                        return false;

                    Character pop = stack.pop();
                    if (!(pop.equals("{") && c.equals("}")))
                        return false;
                    if (!(pop.equals("(") && c.equals(")")))
                        return false;
                    if (!(pop.equals("[") && c.equals("]")))
                        return false;
                }
            }
            return stack.isEmpty();

        }
    }

    private static boolean isValid(String src) {
        ArrayStack<String> stack = new ArrayStack<>();

        for (int i = 0; i < src.length(); i++) {
            String c = ((Character) src.charAt(i)).toString();
            if (c.equals("{") || c.equals("[") || c.equals("(")) {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                String pop = stack.pop().toString();
                if (pop.equals("{")) {
                    if (!c.equals("}"))
                        return false;
                } else if (pop.equals("(")) {
                    if (!c.equals(")")) {
                        return false;
                    }
                } else if (pop.equals("[")) {
                    if (!c.equals("]")) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }

    private static void test01() {
        System.out.println("stack 基础测试");
        ArrayStack<Integer> arrayStack = new ArrayStack<>();

        arrayStack.push(4);
        arrayStack.push(3);
        arrayStack.push(2);
        arrayStack.push(1);
        System.out.println(arrayStack);

        System.out.println(arrayStack.peek());

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        System.out.println(arrayStack);
    }
}

