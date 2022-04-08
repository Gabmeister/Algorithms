package Algo;

public class Main {
    public static void main(String[] args) throws Exception {
    
        int arr[] = {69, 15, 13, 5, 2, 7, 120, 1, 1};
      
        Heapsort gab = new Heapsort();
        gab.sort(arr);
      
        System.out.println("Sorted array is");
        gab.printArray(arr);
        
    }
}
