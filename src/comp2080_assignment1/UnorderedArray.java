package comp2080_assignment1;
import java.util.Random;

public class UnorderedArray {
    //Student name: Rafael Afonso Silva
    //Student ID: 101202754
    
    private static int[] coreData;
    private int maxSize;
    private static int numItems;
    private Random rand;
    
    public UnorderedArray(int maxSize){
        this.maxSize = maxSize;
        numItems = 0;
        coreData = new int[maxSize];
        rand = new Random();
    }
    
    public void fillCoreData(int maxRange){
        for(int x = 0; x < maxSize; x++){
            coreData[x] = rand.nextInt(maxRange);
            numItems++;
        }
    }
    
    public int[] copyCoreData(int dataSize){
        int[] copy = new int[dataSize];
        for(int x = 0; x < dataSize; x++){
            copy[x] = coreData[x];
        }
        return copy;
    }
    
    public String listItems()
    {
        String s = "";
        for(int x = 0; x < numItems; x++)
        {
            s += coreData[x] + " ";
        }
        return s;
    }
}
