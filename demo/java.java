public class HelloWorld {
    public static final String STATIC_FINAL = "Hello";
    public final String NONSTATIC_FINAL = "Hello";
    private Integer integer1 = 123;
    private Double double1 = 123.0D;
    private String pattern = "~!@#$%^&*())";

    /**
     * Java docs https://google.com
     */
    public static void main(String args[]) {
        var object = new Object();
        System.out.println("Hello, World");

        if (true) {

        } else if (false) {

        }

        var monday = WEEK.MONDAY;

        switch (monday) {
            case MONDAY:
                break;
            case TUESTAY:
                break;
        }

        var record = new Record("New Record", 10);
    }
}

abstract class Abstract {

}

class Inherited extends Abstract implements Interface{

}

interface Interface {

}

record Record(String name, int age) {
}

enum WEEK {
    MONDAY, TUESTAY
}