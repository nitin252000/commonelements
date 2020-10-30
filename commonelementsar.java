import java.util.Scanner;
import java.util.*;
public class commonelementsar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int m=sc.nextInt();
        int[] b = new int[m];
        int l=sc.nextInt();
        int[] c = new int[l];
        System.out.println("enter first array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println( a[i]);
        }
        System.out.println("enter second array elements");
        for (int j = 0; j < a.length; j++) {
            b[j] = sc.nextInt();
        }
        Arrays.sort(b);
        for (int j = 0; j < b.length; j++) {
            System.out.println( b[j]);
        }
        System.out.println("enter third  array elements");
        for (int k = 0; k < c.length; k++) {
            c[k] = sc.nextInt();
        }
        Arrays.sort(c);
        for (int k = 0;k < c.length; k++) {
            System.out.println( c[k]);
        }
        int s1=a.length;
        int s2=b.length;
        int s3=c.length;
        System.out.println("common elements in array are");
        int i=0,j=0,k=0;
        while(i<s1 && j<s2 && k<s3){
            if(a[i]==b[j]&&b[j]==c[k])
            {
                System.out.println(a[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(a[i]<b[j]){
                i++;}
            else if(b[j]<c[k])
            {
                j++;
            }
            else {
                k++;
            }

        }


    }}
