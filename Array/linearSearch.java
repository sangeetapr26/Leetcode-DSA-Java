// linear search of array
import java.util.*;
public class linearSearch {
    //this will search keys in array and return index of key
    public static int search(int arr[],int key) { //function to search key in array
    for(int i=0;i<arr.length;i++){ //arr.length gives size of array
        if(arr[i]==key){ //comparing each element with key
            return i;//if found return index
        }
    }
    return -1; //if not found return -1
}
public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)){ //scanner class to take input
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();//size of array
        int arr[]=new int[n]; //declaration of array
        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); //input elements of array
        }
        System.out.print("Enter the key to be searched: ");
        int key=sc.nextInt(); //input key to be searched
        int result=search(arr,key); //calling search method
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result);
        }
    }
}
}