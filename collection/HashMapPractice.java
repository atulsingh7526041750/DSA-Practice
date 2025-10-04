package collection;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.frequencyOfArrayElement();


    }

    public void HashMapIMpl(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Atul");
        map.put(2,"Alok");
        map.put(3,"Anuj");

        // get(key)
        System.out.println("Get key 2: " + map.get(2));  // Banana

        // containsKey / containsValue
        System.out.println("Contains key 1? " + map.containsKey(1));  // true
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));  // false

        System.out.println(map.remove(2));

        // size()
        System.out.println("Size: " + map.size());


        System.out.println("Keys:"+map.keySet());
        System.out.println("Values:"+map.values());
        System.out.println("Key, Values"+map.entrySet());

        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println("Keys:"+entry.getKey()+"Values:"+entry.getValue());
            
        }
    }

    public void frequencyOfArrayElement(){
        int arr[] = {1,2,3,4,3,4,2,4};
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n :");
//        int n = sc.nextInt();
//        int arr1[] = new int[n];
//        for(int i = 0;i<n;i++){
//            arr1[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr1));

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:arr) {
            if(map.containsKey(i)){

                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }

        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()
             ) {
            System.out.println("Keys:"+entry.getKey()+"Values:"+entry.getValue());

        }

    }


    public void frequencyOfListElement(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);

        HashMap<Integer,Integer> map = new HashMap<>();



    }
}
