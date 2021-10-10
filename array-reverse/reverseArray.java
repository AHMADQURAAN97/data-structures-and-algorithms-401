
public class reverseArray {

    public static void main(String[] args)
    {
        int [] array = {1, 2, 3, 4, 5, 6};
        reverse(array, array.length);
    };

    static void reverse(int x[],int u){

        int[] b = new int[u];
        int G = u;
        for (int i=0;i < u; i++){


            b[G-1]=x[i];
            G=G-1;
        }

        System.out.println("Reversed Array:");
        for(int k = 0; k < u ; k++){ 
        
        System.out.println(b[k]);
        }
    }
}

