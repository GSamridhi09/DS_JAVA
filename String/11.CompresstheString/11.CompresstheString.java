import java.util.*;
public class Solution {

	public static String getCompressedString(String s){
        String str="";
        int count=1;
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i)!=s.charAt(i+1)) 
           {
               if(count>1)
               str+=s.charAt(i)+Integer.toString(count);
               else
               str+=s.charAt(i)  ; 
               count=1;
           }
           else
           {
                count++;
           }
           if(i==s.length()-2)
            {
               if(s.charAt(i)==s.charAt(i+1))
               {
                  
                  str+=s.charAt(i)+Integer.toString(count); 
               }
                else
                {
                 str+=s.charAt(i+1);   
               }
            }
        }
        return str;
}
    }
