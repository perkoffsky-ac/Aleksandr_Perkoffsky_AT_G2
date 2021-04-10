package tasks.day6;

public class anonimClasses {

    public static class C {
        public int foo(int x) {
            int y = x * 5;
            System.out.println(y);
            return y;
        }

    }

    public class A {
        public int foo(int x) {
            return x * 5;
        }
    }

    public class B {
        public void main(String[] args) {
            A a = new A();
            a.foo(5);

        }
    }

}


