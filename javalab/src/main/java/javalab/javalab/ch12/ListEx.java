package javalab.javalab.ch12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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



    }
}
