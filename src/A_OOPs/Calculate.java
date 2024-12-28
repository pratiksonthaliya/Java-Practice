package A_OOPs;

public class Calculate {
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static int sum(int ...a){
        int res = 0;
        for (int j : a) {
            res += j;
        }
        return res;
    }
}
