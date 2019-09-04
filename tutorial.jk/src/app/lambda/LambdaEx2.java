package app.lambda;

@FunctionalInterface
interface MyFunction{
    void myMethod();   //public abstract void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; //MyFunction f = (MyFunction)(() -> {});
        Object obj = (MyFunction) ( () -> {});
        String str = ( (Object) (MyFunction) (() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        System.out.println((MyFunction)(() -> {}));
        System.out.println(((Object)(MyFunction)(()->{})).toString());

        String s = new String("ABC");
        String v = new String("ABC");

        System.out.println(s.equals(v));
        System.out.println(s==v);
    }        
}

