package javalab.javalab.ch11;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        str2 += "d";

        System.out.println(str1 == str2);
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str3 == str4); // 두 객체의 주소가 다르다.
        System.out.println(str3.hashCode()); // String pool의 주소가 같다.
        System.out.println(str4.hashCode());

        System.out.println(str3.equals(str4)); // 값의 비교

        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소: "  +System.identityHashCode(buffer));
        buffer.append("and");
        buffer.append("android");
        buffer.append("programming is fun!!");
        System.out.println("연산 후 메모리 주소" + System.identityHashCode(buffer));

//        Test Block

        String str5 = "안녕하세요. \n\t반갑습니다. \t다음에 또 만나요.";
        String str6 = """
                    안녕하세요.  
                        반갑습니다.    다음에 또 만낭.
                """;
        System.out.println(str6);

        // formatted
        String str7 = """
                    안녕하세요.  %s 님 
                    반갑습니다. %d 번째 만남입니다.
                    당산의 포인트는 %.1f 다음에 또 만낭.
                """.formatted("홍길동",3,71.2);

        System.out.println(str7);



    }
}
