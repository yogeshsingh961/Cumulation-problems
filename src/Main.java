import java.util.Arrays;
import java.util.Scanner;
//********************* checkAnagram*************************
//public class Main {
//    // Anagram problem
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String s= sc.next();
//        String t= sc.next();
//        boolean ans=checkAnagram(s,t);
//        System.out.print(ans);
//
//    }
//    static boolean checkAnagram(String s, String t){
//        if(s.length()!=t.length()) return false;
//
//        int[]freq= new int[26];
//
//        for(int i=0; i<s.length(); i++){
//            char c=s.charAt(i);
//            freq[c-'a']++;
//        }
//        for(int i=0; i<t.length(); i++){
//            char ch=t.charAt(i);
//            freq[ch-'a']--;
//        }
//        for(int i=0; i<26; i++){
//            if(freq[i]!=0) return false;
//
//        }
//        return true;
//    }
//}

//**********************Bubble sort to sort the array**************************

//public class Main {
//    // Anagram problem
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        int[]arr= new int[n];
//        for(int i=0;i<n; i++){
//            arr[i]=sc.nextInt();
//
//        }
//        bubbleSort(arr);
//        System.out.print(Arrays.toString(arr));
//    }
//    static void bubbleSort(int[]arr){
//        int n=arr.length;
//        for(int i=0; i<n; i++){ // i need n pass
//            int flag=0;
//            for(int j=0; j<n-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    flag=1;
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//            if(flag==0) break;
//        }
//    }
//}


public class Main {
    // Anagram problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        inPlaceChange(arr);
        System.out.print(Arrays.toString(arr));

    }
    static void inPlaceChange(int[]arr){
        int n=arr.length;

        for(int i=0; i<n-1;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}

