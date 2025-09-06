package arrays.array;

public class InsertElementAtPos {
        public static void insertEleSpecificPos(int[] a, int pos, int element) {
            // Create a new array with one more space
            int[] newArray = new int[a.length + 1];

            // Copy elements up to the insertion position
            for (int i = 0; i < pos - 1; i++) {
                newArray[i] = a[i];
            }

            // Insert the new element
            newArray[pos - 1] = element;

            // Copy the remaining elements
            for (int i = pos; i < newArray.length; i++) {
                newArray[i] = a[i - 1];
            }

            // Print the new array
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }
        }

        //inser element at specific index position
        public static void inserElementatIndexSpecific(int[] a, int index_pos, int element){
            for(int i=a.length-1; i>index_pos; i--){
                a[i]=a[i-1];
            }
            a[index_pos]=element;
            for(int i=0; i<a.length; i++){
                System.out.println(a[i] +" ");
            }
        }
        public static void main(String[] args) {
            int[] a = {10, 20, 30, 40, 50};
            int pos = 3; // Position to insert
            int element = 100; // Element to insert
            insertEleSpecificPos(a, pos, element);
            System.out.println();
            inserElementatIndexSpecific(a,pos,element);
        }
    }


