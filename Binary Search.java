import java.util.*;
public class BinarySearch
{
    public static void main(String[] args)
    {
        int mid,first,last;
    Scanner sc= new Scanner(System.in);
        System.out.println("------Enter the limit of array-------");
    int n = sc.nextInt();
    int arr[]= new int[n];
    first=0;
    last=n;
    mid= (first+last)/2;
        System.out.println("Enter array in sorted order");
    for(int i=0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
        System.out.println("-----Enter element to be searched-----");
    int item= sc.nextInt();
    for(int i=0;i<n/2;i++)
    {
        if(arr[mid]==item)
        {
            System.out.println("Search successful....Element found at -------->>> "+mid);
            break;
        }
        if(arr[mid]>item)
        {
            last= mid-1;
            mid=(first+last)/2;
        }
        else
        {
            first= mid+1;
            mid= (first+last)/2;
        }
    }
    }
}
