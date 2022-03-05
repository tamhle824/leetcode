
import java.text.NumberFormat.Style;
import java.util.*;

import javax.sound.midi.Sequencer.SyncMode;

public class LongestPalindrome{

   public static boolean isPali(String aString, int size){


       char ch;
       String nstr ="";
       int len = aString.length();
    
    if(len < size){
        return false;
    }

    for(int i =0; i< len;i++){
        ch = aString.charAt(i);
        nstr = ch + nstr;
    }

    if(nstr.equals(aString)){
        return true;
    }
    return false;

    }

    public static void main(String[] args){

        String s = "babad";
        String c ="";
        int array[] = new int[s.length()];
        int max = 0;
        int Center =0;
   
        while(Center <s.length()){
            int Radius =0;
            while(Center-(Radius+1)>=0 && Center+(Radius+1) < s.length() && s.charAt(Center-(Radius+1))== s.charAt(Center+(Radius+1))){
                Radius++;
            }

            array[Center] = Radius;
            Center++;

        

        }

        for(int i = 0;i< s.length();i++){
            System.out.println(array[i]);
        }

        



        if(max ==0){
            System.out.println(s.substring(0, 1));;
        }else{
            System.out.println(c);;

        }


        



        
     

        
    

    }
}