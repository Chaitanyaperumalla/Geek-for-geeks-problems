//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int A = Integer.parseInt(S[0]);
            int B = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.isAmicable(A,B));
        }
    }
}
// } Driver Code Ends




class Solution {
    static int isAmicable(int A , int B) {
        // code here
        if(A == 1 || B == 1) return 0;
          // Function to calculate the sum of proper divisors
        int sumA = sumOfDivisors(A);
        int sumB = sumOfDivisors(B);
        
        // Check if the sums are equal to the respective numbers
        return (sumA == B && sumB == A) ? 1 : 0;
    }
     static int sumOfDivisors(int N) {
        int sum = 1; // 1 is a proper divisor of any number
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }
        return sum;
    }
};