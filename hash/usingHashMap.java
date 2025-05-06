package hash;

import java.util.HashMap;
import java.util.Map;

public class usingHashMap {
    public static void main(String[] args) {

        int [] arr = {1,2,1,2,1,3};


        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i<arr.length;i++){
            int key = arr[i];
            int freq = 0;
            if(hashMap.containsKey(arr[i]))
              freq = hashMap.get(key);
              freq++;
              hashMap.put(key,freq);

        }


        for(Map.Entry m : hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
