package exercicio_fibonacci;

public class Fibonacci {
    public int calculaFibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        }
    }
}

//public class Fibonacci {
//    public int calculaFibonacci(int n) {
//        return (n <= 2) ? 1 : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
//    }
//}
