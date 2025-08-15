package hash;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class usingHashMap{

    public static void main(String[] args) {

        t t = new t();
        Thread thread = new Thread(t);
        thread.start();

        int [] arr = {1,2,1,2,1,3};
        findtheFreq(arr);
//
//
//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        for (int i=0; i<arr.length;i++){
//            int key = arr[i];
//            int freq = 0;
//            if(hashMap.containsKey(arr[i]))
//              freq = hashMap.get(key);
//              freq++;
//              hashMap.put(key,freq);
//
//        }
//
//
//        for(Map.Entry m : hashMap.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }

    }

    public static void findtheFreq(int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry map1: map.entrySet()) {
            System.out.println(map1.getKey()+" "+map1.getValue());

        }
        System.out.println(map);
    }

//    public static int firstUNique(List<Integer>list){
//        Map<Integer,Integer>map = new LinkedHashMap<>();
//        for(Map.Entry map1: map.entrySet()){
////            map1.ge
//        }
//    }
}


class t implements Runnable{


    @Override
    public void run() {
        System.out.println("lasdbvjsadn");

    }
}
