package arrays.lambda;

interface MyInter{
    public abstract void sayHello();
}

interface SumInter{
    int Sum(int a, int b);
}
 class Basic implements MyInter, SumInter,LengthInter{
    public static void main(String[] args) {
        MyInter myInter=new Basic();
        myInter.sayHello();

        //using Lambda expression
        MyInter myInterL =()->{
            System.out.println("this is the first time i am using lambda");
        };
        myInterL.sayHello();

        //without curly braces
        MyInter i3=()-> System.out.println("this is the second time using lambda expression");
        i3.sayHello();

        SumInter s=(a,b) ->a+b;
        System.out.println(s.Sum(9,8));
        LengthInter l=str-> str.length();
        System.out.println(l.getLength("ritu"));

    }

     @Override
     public void sayHello() {
         System.out.println("I am saying hello from MyInter");
     }

     @Override
     public int Sum(int a, int b) {
         return a+b;
     }

     @Override
     public int getLength(String str) {
         return 0;
     }
 }
