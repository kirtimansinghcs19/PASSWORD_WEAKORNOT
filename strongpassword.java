import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int n=0,c=0,s=0,lc=0,uc=0,length=0,f=0;
        char[] st = in.next().toCharArray();        
        for(int i=0;i<a;i++)
            {
                if(st[i]>=48 && st[i]<=57)
                {
                    n=1;
                }
                if(st[i]=='!'||st[i]=='@'||st[i]=='#'||st[i]=='$'||st[i]=='%'||st[i]=='^'||st[i]=='&'||st[i]=='*'||st[i]=='('||st[i]==')'||st[i]=='-'||st[i]=='+')
                {
                    s=1;
                }
                if(st[i]>=65&&st[i]<=90)
                {
                    uc=1;
                }  
                if(st[i]>=96&&st[i]<=122)
                {
                    lc=1;
                }
            }
            if(a<6)
            {
            length=6-a;
            }
            if(n==0){
                f=f+1;
            }
            if(uc==0){
                f=f+1;
            }
            if(s==0){
                f=f+1;
            }
            if(lc==0)
            {
                f=f+1;
            }
          if(f>length)
            {
                length=length+(f-length);
                System.out.println(length);
            }
            else{
                System.out.println(length);
            }
    
    }
}
