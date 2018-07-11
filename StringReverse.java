import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        char a[] = new char[A.length()];

        for (int i=0,j=(A.length()-1); i<A.length();i++,j--){
            a[j] = A.charAt(i); // Separates indivisual characters and stores them in reverse order.
        }

        String comp = new String(a); //Create new String out of reversed characters.

        if((A.equals(comp))){       //Compares the Strings. Also can be done using comapreTO() method.
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
