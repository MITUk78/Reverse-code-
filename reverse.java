import java.util.*;
//reverse an array

public class reverse {

    public static void reverses(int num[]){
        int first=0, last =num.length-1;

        while(first< last){
            //swap

        int temp=num[last];
        num[last]=num[first];
        num[first]=temp;

        first++;
        last--;
        }
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10};

        
        
        reverses(num);
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]+" ");
        }
        System.out.println();
    }
}