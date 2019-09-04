package app.overloading;

public class OverloadingTest {
    public static void main(String args[]) {
        MyMath3 mm = new MyMath3();
        System.out.println(mm.add(3, 3));
        System.out.println(mm.add(3, 3L));
        System.out.println(mm.add(3L, 3));
        System.out.println(mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println(mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b){
        System.out.println("i+i");
        return a+b;
    }

    long add(int a, long b){
        System.out.println("i+l");
        return a+b;
    }

    long add(long a, int b){
        System.out.println("l+i");
        return a+b;
    }

    long add(long a, long b){
        System.out.println("l+l");
        return a+b;
    }

    int add(int[] a){
        System.out.println("모든 a배열의 합");
        int result = 0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
}

