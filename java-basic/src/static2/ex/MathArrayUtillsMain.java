package static2.ex;

public class MathArrayUtillsMain {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum= " + MathArrayUtills.sum(values));
        System.out.println("average= "+ MathArrayUtills.average(values));
        System.out.println("min= " + MathArrayUtills.min(values));
        System.out.println("max= " + MathArrayUtills.max(values));
    }
}
