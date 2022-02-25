
import java.text.NumberFormat.Style;
import java.util.*;

public class LongestPalindrome{

   public static boolean isPali(String aString){
       char ch;
       String nstr ="";
       int len = aString.length();

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

        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        String c ="";
        int max = 0;

        // if(s.length()==1){
        //     c = s;
        // }

        for(int i =0;i<s.length();i++){
            for(int k=i+1;k<s.length();k++){
            if(isPali(s.substring(i,k+1))){
                if(s.substring(i,k+1).length()>max){
                    c = s.substring(i,k+1);
                    max = c.length();
                }
             }
            }
        }
        if(max ==0){
            System.out.println(s.substring(0, 1));;
        }else{
            System.out.println(c);;

        }


        



        
     

        
    

    }
}