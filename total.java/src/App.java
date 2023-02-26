import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum1(arr));
        System.out.println(product(arr));

        int n = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        n = s.nextInt();
        int a[] = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Sum = "+sum1(a));
        System.out.println("Product = "+product(a));
        s.close();
    }

    public static int sum1(int []copy) 
    {
        int sum=0;
        
        for(int i=0; i< copy.length;i++)
        {
            sum+= copy[i]; 
        }
    
        return sum;
    }

    public static int product(int []copy) 
    {
        int product=1;
        
        for(int i=0; i< copy.length;i++)
        {
            product= product*copy[i];
        }
    
        return product;
    }


}
