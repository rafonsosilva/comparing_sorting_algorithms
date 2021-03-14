package comp2080_assignment1;

public class Comp2080_assignment1 {
    //Student name: Rafael Afonso Silva
    //Student ID: 101202754
    
    //method to print items for test purposes
    public static void listCopiedItems(int[] array){
        for(int x = 0; x < array.length; x++){
            System.out.print(array[x] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {     
        UnorderedArray ua = new UnorderedArray(1000000);
        SortingAlgorithms sa = new SortingAlgorithms();
        
        ua.fillCoreData(3000000);
        
        //copying first 50 elements
        int[] copy1 = ua.copyCoreData(50);
        int[] copy2 = ua.copyCoreData(50);
        int[] copy3 = ua.copyCoreData(50);
        int[] copy4 = ua.copyCoreData(50);
        
        //printing time to sort first 50 elements
        System.out.println("===========Data size 50===========");
        System.out.println("Selection sort: \t"+sa.selectionSortAsc(copy1)+" nanoseconds");
        System.out.println("Insertion sort: \t"+sa.insertionSortAsc(copy2)+" nanoseconds");
        System.out.println("Merge sort: \t\t"+sa.mergeSort(copy3)+" nanoseconds");
        System.out.println("Quick sort: \t\t"+sa.quickSort(copy4)+" nanoseconds\n");
        
        
        //copying first 1,000 elements
        int[] copy5 = ua.copyCoreData(1000);
        int[] copy6 = ua.copyCoreData(1000);
        int[] copy7 = ua.copyCoreData(1000);
        int[] copy8 = ua.copyCoreData(1000);
        
        //printing time to sort first 1,000 elements
        System.out.println("===========Data size 1,000===========");
        System.out.println("Selection sort: \t"+sa.selectionSortAsc(copy5)+" nanoseconds");
        System.out.println("Insertion sort: \t"+sa.insertionSortAsc(copy6)+" nanoseconds");
        System.out.println("Merge sort: \t\t"+sa.mergeSort(copy7)+" nanoseconds");
        System.out.println("Quick sort: \t\t"+sa.quickSort(copy8)+" nanoseconds\n");
        
        //copying first 10,000 elements
        int[] copy9 = ua.copyCoreData(10000);
        int[] copy10 = ua.copyCoreData(10000);
        int[] copy11 = ua.copyCoreData(10000);
        int[] copy12 = ua.copyCoreData(10000);
        
        //printing time to sort first 10,000 elements
        System.out.println("===========Data size 10,000===========");
        System.out.println("Selection sort: \t"+sa.selectionSortAsc(copy9)+" nanoseconds");
        System.out.println("Insertion sort: \t"+sa.insertionSortAsc(copy10)+" nanoseconds");
        System.out.println("Merge sort: \t\t"+sa.mergeSort(copy11)+" nanoseconds");
        System.out.println("Quick sort: \t\t"+sa.quickSort(copy12)+" nanoseconds\n");
        
        //copying first 100,000 elements
        int[] copy13 = ua.copyCoreData(100000);
        int[] copy14 = ua.copyCoreData(100000);
        int[] copy15 = ua.copyCoreData(100000);
        int[] copy16 = ua.copyCoreData(100000);
        
        //printing time to sort first 100,000 elements
        System.out.println("===========Data size 100,000===========");
        System.out.println("Selection sort: \t"+sa.selectionSortAsc(copy13)+" nanoseconds");
        System.out.println("Insertion sort: \t"+sa.insertionSortAsc(copy14)+" nanoseconds");
        System.out.println("Merge sort: \t\t"+sa.mergeSort(copy15)+" nanoseconds");
        System.out.println("Quick sort: \t\t"+sa.quickSort(copy16)+" nanoseconds\n");
        
        //copying 1,000,000 elements
        int[] copy17 = ua.copyCoreData(1000000);
        int[] copy18 = ua.copyCoreData(1000000);
        int[] copy19 = ua.copyCoreData(1000000);
        int[] copy20 = ua.copyCoreData(1000000);
        
        //printing time to sort 1,000,000 elements
        System.out.println("===========Data size 1,000,000===========");
        System.out.println("Selection sort: \t"+sa.selectionSortAsc(copy17)+" nanoseconds");
        System.out.println("Insertion sort: \t"+sa.insertionSortAsc(copy18)+" nanoseconds");
        System.out.println("Merge sort: \t\t"+sa.mergeSort(copy19)+" nanoseconds");
        System.out.println("Quick sort: \t\t"+sa.quickSort(copy20)+" nanoseconds\n");
    }
}
