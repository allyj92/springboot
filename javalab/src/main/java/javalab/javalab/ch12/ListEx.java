package javalab.javalab.ch12;

import java.util.*;

// List
// 중복허용, 입력순서유지
// 인덱스, 순차적인 저장
public class ListEx {

    public static void main(String[] args) {

        System.out.println("===== ArrayList ======");
        List<Integer> array_list = new ArrayList<>(); // up casting

        array_list.add(1); // 등록
        array_list.add(2);
        array_list.add(3);
        array_list.add(4);
        array_list.add(5);

        for(Integer i : array_list){
            System.out.println(i);
        }

        System.out.println(array_list.size());
        System.out.println(array_list.indexOf(3));
        System.out.println(array_list.indexOf(7)); // 없는 요소는 -1을 반환함

        System.out.println("============================");

        array_list.set(2, 7); // index 2가 7로 변경
        array_list.remove(3); // index 3 제거


        for(Integer i : array_list){
            System.out.println(i);
        }

        array_list.clear();

        // List 인터페이스
        System.out.println("===== LinkedList ======");
        List<Integer> linked_list = new LinkedList<>(); // up casting

        linked_list.add(1); // 등록
        linked_list.add(2);
        linked_list.add(3);
        linked_list.add(4);
        linked_list.add(5);

        for(Integer i : linked_list){
            System.out.println(i);
        }

        System.out.println(linked_list.size());
        System.out.println(linked_list.indexOf(3));
        System.out.println(linked_list.indexOf(7)); // 없는 요소는 -1을 반환함

        // 이중괄호 초기화 - 이중클래스를 이용한 방법. 익명클래스가 사용한 횟수만큼 생성됨
        List<Integer> linked_list2 = new LinkedList<>()
        {{add(1); add(2); add(3);add(4);add(5);}}; // up casting
        linked_list2.forEach((item) ->{
            System.out.println(item);
        });

        /// Set 인터페이스
        System.out.println("===== Set ======");

        Set<Integer> hashSet = new HashSet<>(); // up casting

        hashSet.add(1); // 등록
        hashSet.add(3);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);

        for(Integer i : hashSet){
            System.out.println(i);
        }

        System.out.println("hashSet Size : "+hashSet.size());





    }
}
