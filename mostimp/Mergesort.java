package top50;
/*49  Mergesort */
import java.util.Scanner;
import java.util.Random;
public class Mergesort {
    int a[];
    int n;

    Mergesort(int size){
        n=size;
        a= new int[size];
    }
    void read(){
        Random rd = new Random();
        System.out.println(" array elements are  ");
        for(int i=0;i<n;i++){
            a[i]=rd.nextInt(100);
        }
    }
    void display()
    {
        System.out.println("sorted array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    void mergesort(int low,int high){
        int mid;
        if(low<high){
            mid=(low+high)/2;
            mergesort(low,mid);
            mergesort(mid+1,high);
            merge(low,mid,high);
        }
    }
    void merge(int low, int mid,int high)
    {

        int i=low; int j=mid+1; int k=low;
        int c[]=new int[high+1];
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<=high){
            c[k]=a[j];
            j++;
            k++;
        }
        for(k=low;k<=high;k++){
            a[k]=c[k];
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n=in.nextInt();
        Mergesort a= new Mergesort(n);
        a.read();
        a.display();
        long start = System.nanoTime();
        a.mergesort(0,n-1);
        long end = System.nanoTime();
        a.display();
        System.out.println("Time complexity is "+(end-start)+"ns");
    }
}