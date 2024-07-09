import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyFirstAnnotation {

    public static final int x=10;


    //void myFn();

    //public abstract String getSomething(int x);

    //public abstract <T> String getSomethingElse();

//    public abstract int getX() throws Exception;
//
//    public static int myStaticMethod();
//
//    private static int myStaticMethod2();
//
//    public default int myDefaultMethod();
//
//    private int myInstanceMethod();

}
