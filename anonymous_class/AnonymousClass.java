package anonymous_class;

public class AnonymousClass {

    public static void main(String[] args) {

        Math m = new Math() { // Anonymous class
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };

        Math m2 = new Math() { // Anonymous class
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };


    }
}

interface Math {
    int doOperation(int a, int b);
}
