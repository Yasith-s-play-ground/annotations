@MyMarkerAnnotation()
public class DemoClass {

    @MyMarkerAnnotation()
    int instanceVariable;

    @MyMarkerAnnotation()
    public static void myMethod1() {

    }
    /* it is not compulsory to have parantheses in marker annotations */

    @MySingleElementAnnotation(10)
    @MySingleElementAnnotationFake(myValue = 10)
//    @MySingleElementAnnotationFake(10)
    public void myMethod2() {

    }
}
