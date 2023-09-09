public class homeworkpiramida {

    public static void main(String[] args) {
        int[] array1 = {3,1,4,6,745,45,342,245,1,3};
        sort(array1);
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index]+ " ");
        }
    }

    public static void sort(int[] array){

        for (int i = array.length /2 -1; i >= 0; i--) 
            {heapify(array,array.length,i);}

            for (int i=array.length-1; i>=0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i]= temp;

                heapify(array,i,0);
            }

        
    }

    public static void heapify(int[] array, int heapsize, int rootindex){
        int largest = rootindex;
        int leftchild = 2* rootindex+1;
        int rightchild = 2*rootindex+2;

        if(leftchild<heapsize && array[leftchild]>array[largest]) {largest=leftchild;}
        if(rightchild<heapsize && array[rightchild]>array[largest]) {largest=rightchild;}

        if (largest!=rootindex) {
            int temp = array[rootindex];
            array[rootindex]=array[largest];
            array[largest]=temp;

            heapify(array, heapsize, largest);
        }
    }



}