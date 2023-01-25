/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in. Additionally, if the number is negative, return 0 (for languages that do have them).
Note: If the number is a multiple of both 3 and 5, only count it once. */


public class MultiplesOf3Or5 {
    public static int solution(int n) {
        int sum = 0;
            for (var i = 1; i < n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    sum += i;
                }
            }
            return sum;
        }
 
 
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 25;
        int n3 = 99;
        System.out.println(solution(n1));
        System.out.println(solution(n2));
        System.out.println(solution(n3));
    }
 }
 