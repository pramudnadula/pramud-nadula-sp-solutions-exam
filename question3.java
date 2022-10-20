// Write a function that computes the list of the first 100 fibonaccionacci numbers. By definition, 
// the first two numbers in the fibonaccionacci sequence are 0 and 1, and each subsequent number is the sum of the previous two. 
// As an example, here are the first 10 fibonaccionacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.


public class question3 {
    public static void main(String[] args) {
        int n = 100;

        int[] fibonacci = new int[n];

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + ", ");
        }   
        
    }
}
