package arrays.lambda;


interface  AddInter{
    int sum(int a, int b);
}
public abstract class LamdaTest implements AddInter {
    public static void main(String[] args) {
        AddInter add = (a,b) -> a+b;

        int result = add.sum(7,9);
        System.out.println(result);

    }


}
