package ArrayPractice;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr [] = {1,2,3,1,2};
        for(int i=0;i<arr.length;i++){
            int temp=1;
            if(map.containsValue(arr[i])){
                temp = map.get(arr[i]);
                temp = temp+1;
                map.put(arr[i],temp);
            }
            else {
                map.put(arr[i],temp);
            }
        }

        int temp1=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue()==1){
                temp1= entry.getKey();;
                break;

            }
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println(temp1);

    }
}
