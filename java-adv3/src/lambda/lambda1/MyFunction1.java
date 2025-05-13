package lambda.lambda1;

import lambda.start.MyFuction;

public class MyFunction1 {
    public static void main(String[] args) {
        MyFuction myFuction = new MyFuction(){

            @Override
            public int apply(int a, int b) {
                return a+b;
            }
        };

        int result = myFuction.apply(1, 2);
        System.out.println("result = " + result);
    }
}
