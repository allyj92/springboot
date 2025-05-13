package lambda.lambda1;

import lambda.start.MyFuction;

public class MyFunction2 {
    public static void main(String[] args) {
        MyFuction myFuction =
            (int a, int b) -> {
                return a + b;

        };

        int result = myFuction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
