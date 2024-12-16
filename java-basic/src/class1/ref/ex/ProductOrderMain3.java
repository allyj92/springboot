package class1.ref.ex;
import java.util.Scanner;


public class ProductOrderMain3 {
    public static void main(String[] args) {

        // 입력할 주문의 개수를 입력하세요
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();
        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 0; i < orders.length;i++){
            System.out.println((i+1) + "번쨰 주문 정보를 입력하세요");

            System.out.println("상품명: ");
            String productName = sc.nextLine();

            System.out.println("가격: ");
            int price = sc.nextInt();

            System.out.println("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            orders[i] = createProductOrder(productName,price,quantity);// 입력 버퍼를 비우기 위한 코드
        }




        printOrder(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액:" + totalAmount);













    }



    static public ProductOrder createProductOrder(String productName ,int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;


    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("이름 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }}

        static int getTotalAmount(ProductOrder[] orders){
            int totalAmount = 0;
            for (ProductOrder order : orders) {
                totalAmount += order.price * order.quantity;
            }
            return totalAmount;
        }
    }
