package main.java.tasks.day6;

public class anonimClasses2 {

    public static class Z {
        public int foo(int x) {
            return x * 5;
        }
    }

    public static class R {
        public static void main(String[] args) {
            Z r = new Z();
            r.foo(5);

            Z z2 = new Z() {
                public int foo(int x) {
                    int y = x * 5;
                    System.out.println(y);
                    return y;
                }

            };
            z2.foo(5);
        }
    }
}
