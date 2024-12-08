public class SortingFlag {
    public static void main(String[] args){

        int[] number = {1,2,3,4};
        int flag = sorting(number);

        if(flag == 1)
            System.out.println("Assending array");
        
        else if(flag == -1)
            System.out.println("Decending array");
        
        else if(flag == 0)
            System.out.println("Not sorted array");
        
    }

    public static int sorting(int[] arr){

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < arr.length - 1; i++){

            if(arr[i] < arr[i+1])
                descending = false;
            else if(arr[i] > arr[i+1])
                ascending = false;
        }

        if(ascending)
            return 1;
        else if(descending)
            return -1;
        else
            return 0;
    }
}
