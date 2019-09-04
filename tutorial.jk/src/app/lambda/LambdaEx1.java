package app.lambda;


@FunctionalInterface
interface MyFunction {
    void ran();    
}

class LambdaEx1 {
    static void execute(MyFunction f){
        f.ran();
    }

    static MyFunction getMyFunction(){
        MyFunction f = () -> System.out.println("f3.ran()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f.ran()");

        MyFunction f2 = new MyFunction(){
        
            
            public void ran() {
                System.out.println("f2.ran()");
            }
        };

        MyFunction f3 = getMyFunction();

        System.out.println(f1);
        f2.ran();
        f3.ran();

        execute(f1);
        execute( () -> System.out.println("ran()"));
    }
}