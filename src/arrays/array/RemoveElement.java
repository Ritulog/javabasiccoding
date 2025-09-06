package arrays.array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a={10,40,30,80,60,20};
        int delete=30;
        int count=0;
        for(int i=0; i<a.length; i++){
            if(delete == a[i]){
                for(int j=i; j<a.length-1; j++){
                    a[j]=a[j+1];
                }
                count=count+1;
                break;
            }
        }
        //traverse array
        if(count==0){
            System.out.println("element not found" + " "+count);
        }
        else{
            System.out.println("element deleted successfully" + count);
            for(int i=0; i<a.length-1; i++){
                System.out.println(a[i]);
            }
        }
    }
}
