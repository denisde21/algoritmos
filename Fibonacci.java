import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    

        public static Fibonacci getInstance() {
            return new Fibonacci();
        }

        static public int fib(int n) {
            HashMap<Integer, Integer> memoizedMap = new HashMap<>();
            if(n == 0){
                memoizedMap.put(0, 0);
                System.out.print(0 + " ");
                
            }else{
                memoizedMap.put(0, 0);
                System.out.print(0 + " ");
                memoizedMap.put(1, 1);
                System.out.print(1 + " ");
            }
            
            
            return fib(n, memoizedMap);
        }

        static private int fib(int n, Map<Integer, Integer> map) {
            if (map.containsKey(n))
                return map.get(n);

            int fibFromN = fib(n - 1, map) + fib(n - 2, map);

            // MEMOIZE the computed value
            map.put(n, fibFromN);
            System.out.print(fibFromN + " ");
            return fibFromN;
        }

        public static void main(String[] args){
            fib(10);
            System.out.print("\n");
        }
    
}


https://dzone.com/articles/do-it-java-8-recursive-and
https://dzone.com/articles/memoized-fibonacci-numbers