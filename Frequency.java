package testing;


import java.util.HashMap;
import java.util.Map;

class Frequency {
    
    public static void binary(int[] a, int l, int h, Map<Integer,Integer> map)
    {
        // System.out.println(" Method STart low " + l + " high " + h);
        if(l>h) {
            return;
        }
        
        if(a[l] == a[h])
        {
            //System.out.println(" low " + l + " high " + h);
            int value = h - l + 1;
            put(map,a[l],h-l+1);
        }
        else 
        {
            int mid = (l + h)/2;
            //System.out.println(" low = " + l + " high " + h + " mid " + mid);
            binary(a, l, mid ,map);
            binary(a, mid+1, h ,map);
        }
    }
        
    private static void put(Map<Integer, Integer> map, int key, int value) {
         if(map.containsKey(key)){
            map.put(key,map.get(key)+value);
         } else{
            map.put(key, value);
         }
    }
    
    private static void print(Map<Integer, Integer> map) {
        for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " Occured " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        int[] arr={1, 1, 1, 2, 3, 3, 5, 5,8, 8, 8, 9, 9, 10 };
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        binary(arr, 0, arr.length-1, map);
        print(map);
    }
    
}