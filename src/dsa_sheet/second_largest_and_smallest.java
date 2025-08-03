package dsa_sheet;

public class second_largest_and_smallest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 7, 7, 5};
        System.out.println(secondSmall(arr,arr.length));
        System.out.println(secondLargest(arr,arr.length));

    }

    static int secondSmall(int arr[], int n){
     int small = Integer.MAX_VALUE;
     int secondSmall = Integer.MAX_VALUE;

     for(int i = 0;i<n;i++){
         if(arr[i] < small){
             secondSmall = small;
             small = arr[i];
         }else if(arr[i] < secondSmall && arr[i] != small){
             secondSmall =arr[i];
         }
     }

     return secondSmall;
    }

    static int secondLargest(int arr[],int n){
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for(int i = 0 ; i<n;i++){
            if(arr[i] > large){
                secondLarge = large;
                large = arr[i];

            }else if(arr[i] > secondLarge && large != arr[i]){
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }
}
