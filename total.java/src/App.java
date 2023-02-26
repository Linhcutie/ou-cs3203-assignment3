public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum1(arr));
        System.out.println(product(arr));
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
