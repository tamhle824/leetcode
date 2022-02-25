import java.util.*;

public class LongestSubstring {


    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int max_size = 1;

        String s = "dvdf";
        
        if(s.length()==0){
            max_size = 0;
        }
        
        for(int i =0;i < s.length(); i++){
            
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }else{
                i = map.get(s.charAt(i));
                map.clear();
            }
            if(max_size < map.size()){
                max_size = map.size();
            }
          
        }
        

        System.out.println(max_size);
    }
}
