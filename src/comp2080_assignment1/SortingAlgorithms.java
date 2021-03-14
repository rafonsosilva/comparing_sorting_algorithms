package comp2080_assignment1;
        
public class SortingAlgorithms {
    //Student name: Rafael Afonso Silva
    //Student ID: 101202754
    
    public SortingAlgorithms(){}
    
    public long selectionSortAsc(int[] array){
        long start = System.nanoTime();
        for(int x = 0; x < array.length; x++){
            int locSmallest = x;
            for(int y = x+1; y < array.length; y++){
                if(array[locSmallest] > array[y]){
                    locSmallest = y;
                }
            }
            int temp = array[locSmallest];
            array[locSmallest] = array[x];
            array[x] = temp;
        }
        long end = System.nanoTime();
        long timeTaken = end - start;
        return timeTaken;
    }
    
    public long insertionSortAsc(int[] array){
        long start = System.nanoTime();
        for(int x = 1; x < array.length; x++){
            int currentValue = array[x];
            while(x > 0 && currentValue < array[x-1]){
                array[x] = array[x-1];
                array[x-1] = currentValue;
                x--;
            }
        }
        long end = System.nanoTime();
        long timeTaken = end - start;
        return timeTaken;
    }
    
    public long mergeSort(int[] arrayCopy){ //this method invoques the actual mergesort method passing the necessary parameters
        long start = System.nanoTime();
        mergeSort(arrayCopy, new int[arrayCopy.length], 0, arrayCopy.length-1);
        //parameters are(original array, temp array, starting index, end index)
        long end = System.nanoTime();
        long timeTaken = end - start;
        return timeTaken;
    }
    
    public void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd){
        if(leftStart >= rightEnd){ //base case of the recursive method
            return;
        }
        int middle = (leftStart + rightEnd)/2;
        
        //recursive steps
        mergeSort(array, temp, leftStart, middle); //
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }
    
    public void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (rightEnd + leftStart)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        
        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            }else{
                temp[index] = array[right];
                right++;
            }
            index++;
        }
        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
    
    public long quickSort(int[] array){
        long start = System.nanoTime();
        quickSort(array, 0, array.length - 1);
        long end = System.nanoTime();
        long timeTaken = end - start;
        return timeTaken;
    }
    
    public void quickSort(int[] array, int left, int right){
        if(left >= right){
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index-1);
        quickSort(array, index, right);
    }
    
    public int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            
            while(array[right] > pivot){
                right--;
            }
            
            if(left <= right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
