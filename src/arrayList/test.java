package arrayList;

public class test {

    public static void fibo(int n){
        int first=0, second=1;
        for(int i=0; i<=n; i++) {
            System.out.println("fibo "+first);
            int  next = first + second;
            first = second;
            second = next;
        }

    }


    public static void main(String[] args) {
       int n =10;
        fibo(n);


    }
}
