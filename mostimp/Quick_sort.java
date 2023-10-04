package top50;
//30 WQUICK SORT FOR ARRAY
import java.util.Scanner;
import java.util.Random;
public class Quick_sort {
    int a[];
    int n;

    Quick_sort(int size)
    {
        n=size;
        a=new int[n+1];
        a[n]=101;
    }
    void read(){
        Random rd=new Random();
        System.out.println("array elements: ");
        for(int i=0;i<n;i++){
            a[i]=rd.nextInt(100);
        }
    }
    void display() {
        System.out.println("sorted elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    void quicksort(int low,int high){
        if(low<high){
            int j=partition(low,high);
            quicksort(low,j-1);
            quicksort(j+1,high);
        }
    }
    int partition(int low,int high){
        int i=low;int j=high+1;
        int pivot=a[low];
        while(i<j){
            do{
                i++;
            }while(pivot>a[i]);
            do{
                j--;
            }while(pivot<=a[j]);
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=in.nextInt();
        Quick_sort a=new Quick_sort(n);
        a.read();
        a.display();
        long start=System.nanoTime();
        a.quicksort(0,n-1);
        long end=System.nanoTime();
        a.display();
        long start1=System.nanoTime();
        a.display();
        long end1=System.nanoTime();
        System.out.println("Time complexity is "+(end-start)+"ns");
        System.out.println("time after sorted: "+(end1-start1)+"ns");
    }
}