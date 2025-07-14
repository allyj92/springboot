package javalab.javalab.ch05;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("아이폰",1000000);
        Phone phone1 = new Phone("갤럭시", 1000000);

        Customer customer = new Customer("홍길동",1000000);
        PhoneStore store = new PhoneStore("대리점1",phone);

        customer.buyPhone(store);
    }
}
