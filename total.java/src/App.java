public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

         int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(sum1(arr));
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
}
