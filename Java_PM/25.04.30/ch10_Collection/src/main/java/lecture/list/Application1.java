package lecture.list;

import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 컬렉션프레임워크는 크게 3가지 인터페이스 중 한가지를 상속받아 구현함
        * List 인터페이스
        * -> 순서가 O , 중복 저장 O
        * -> Vector, ArrayList, LinkedList, Stack, Queue
        *
        * Set 인터페이스
        *  -> 순서 X , 중복 X
        * -> HashSet, TreeSet
        *
        * Map 인터페이스
        * -> 키와 같이 한쌍으로 이루어진 데이터 집합(순서 X , 중복된 키 X )
        * -> HashMap, TreeMap, HashTable, Properties
        * */
//        가변적이고 요소의 추가수정삭제를 메소드로 제공해줌
        ArrayList<Object> alist = new ArrayList<>();
        List<Object> list = new ArrayList<>();

        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        System.out.println(list); // toString() 오버라이딩 되어 있음
        System.out.println("list의 크기 : " + list.size());
        System.out.println("=========================");
        list.add(1, "banana");
        System.out.println(list);
        System.out.println("list의 크기 : " + list.size());
        System.out.println("=========================");
        list.set(1, true);
        System.out.println(list);
        System.out.println("=========================");
        list.remove(1);
        System.out.println(list);
        System.out.println("=========================");

//        List<String> strList = new ArrayList<>();
        /*
        * LinkedList
        * -> 저장한 요소가 순서를 유지하지 않고 저장됨
        * -> 요소들 사이를 링크로 연결하여 구성해 마치 연결된 리스트처럼 만듦
        * -> 요소의 저장과 삭제가 빈번히 일어날때 성능면에서 ArrayList 보다 우수 */
        List<String> strList = new LinkedList<>();

        strList.add("a");
        strList.add("d");
        strList.add("e");
        strList.add("h");
        strList.add("i");
        strList.add("c");
        strList.add("w");
        System.out.println(strList);
        System.out.println("=========================");
        Collections.sort(strList);
        System.out.println(strList);
        System.out.println("=========================");
        Collections.reverse(strList);
        System.out.println(strList);
        System.out.println("=========================");

        /*
        * Iterator(반복자)
        * -> Collection 인터페이스의 iterator() 메소드를 이용해서 생성 가능
        * -> 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용*/
//        strList
        Iterator<String> iterator = strList.iterator(); //Iterator 객체 생성

        /*
        * hasNext() : 다음 요소가 남아있으면 true 없으면 false
        * next() : 커서를 다음요소로 이동시키고 그 요소를 반환
        * */
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
