import java.util.*;


public class LongestSub {

    public static int getLongest(int K, String arr){

        HashMap<Integer,Character> map = new HashMap<Integer,Character>();


        int count = 0;

        for(int i=0;i<arr.length();i++){

            // if(!map.containsKey(key).charAt(i) && count < K){
            //     count++;
            // }

            if(count == K){
                if(map.containsValue(arr.charAt(i))){
                    map.put(i,arr.charAt(i));
                }
                else{
                    return map.size();
                }
            }else{
                if(!map.containsValue(arr.charAt(i))){
                    count++;
                }
                map.put(i,arr.charAt(i));

            }

            
            // if(map.size()==K && !map.containsKey(arr.charAt(i))){
            //     System.out.println(arr.charAt(i));
            // }


        }


        return map.size();
    }



    public static void main(String[] args){
        System.out.println(getLongest(1,"araaci"));
    }
}
