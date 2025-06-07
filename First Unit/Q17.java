public class Q17 {
    int a,b;

    Q17(int m, int n) {
        a = m;
        b = n;
    }

    int sum () {
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Q17 obj = new Q17(4,5);
        int result = obj.sum ();
        System.out.println(result);
    }
}
