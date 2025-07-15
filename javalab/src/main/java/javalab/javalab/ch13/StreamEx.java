package javalab.javalab.ch13;

import java.util.Arrays;

public class StreamEx {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        int sum2  = Arrays.stream(nums).sum();
        Long cnt = Arrays.stream(nums).count();

        System.out.println("sum : " + sum2);
        System.out.println("count : "+ cnt);


        int sum3 = Arrays.stream(nums).filter(i->i%2==0).sum();
        System.out.println(sum3);

        Arrays.stream(nums)
                .filter(i->i%2==0)
                .forEach(System.out::println);

        Arrays.stream(nums)
                .filter(i->i%2==0)
                .map(i->i*2)
                .forEach(System.out::println);
  }
}
