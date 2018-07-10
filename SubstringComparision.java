import java.util.*;

class SubstringComparision{
    public static String getSmallestAndLargest(String s, int k) {

        int j = s.length()-k+1;
        String arr[] = new String[j];

        for(int i=0; i<=j-1; i++){

            arr[i] = s.substring(i, i + k);
        }

        String smallest = arr[0];
        String largest = arr[0];

        for(int i=0; i < j; i++){
            System.out.println(arr[i]);
            if((arr[i].compareTo(smallest))<0){
                smallest = arr[i];
            }
            else if ((arr[i].compareTo(largest))>0){
                largest = arr[i];
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
