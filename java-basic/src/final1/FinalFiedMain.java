package final1;

public class FinalFiedMain {
    public static void main(String[] args) {

        // final 필드 - 셍성자 초기화
        System.out.println("생성자 초기화");
        ConstuctInit constuctInit1 = new ConstuctInit(10);
        ConstuctInit constuctInit2 = new ConstuctInit(20);
        System.out.println(constuctInit1.value);
        System.out.println(constuctInit2.value);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
