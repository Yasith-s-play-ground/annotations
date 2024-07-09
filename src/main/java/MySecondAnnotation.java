public @interface MySecondAnnotation /*extends MyFirstAnnotation*/ {

//    int marks() default MyUtilityClass.add(10,20);

    int x = 5, y = 10;

    int marks() default x + y;

    String name() default "Tharindu" + "Kasun";

    public static class Customer {
    }

    public static enum MyEnum {}

    public static record MyRecord() {
    }

    public static interface MyTopLevelInterface {
    }

    public static @interface MyAnnotation {
    }

    class MyUtilityClass {
        static int add(int a, int b) {
            return a + b;
        }
    }


}
