package lecture.map;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /*
        *
        * Map
        *  ->  Collection 인터페이스들과는 다른 저장방식
        * key , value 쌍으로 저장하는 방식
        *
        * Key란?
        * -> 값을 찾기 위한 이름 역할의 객체
        * -> 키는 중복을 허용하지 않음. 키가 다르면 중복되는 값은 저장 가능
        * */

        HashMap<String, String> hashMap = new HashMap();

        hashMap.put("1", "java");
        hashMap.put("2","orcale");
        hashMap.put("3", "jdbc");
        hashMap.put("4", "html5");
        hashMap.put("5", "css3");
//        hashMap.put("5", "css"); // --->> key는 중복저장되지 않고 최근 키의 value로 덮어씌워짐

        System.out.println("hashMap : " + hashMap);
        System.out.println("===========================");

//        삭제
        hashMap.remove("1");
        System.out.println("hashMap : " + hashMap);

//        getOrDefault(key, DefaultValue)
//        지정한 키가 맵에 없을때 기본값을 반환, 있을때는 해당키의 value을 반환
        System.out.println("getOrDefault 테스트 : "  + hashMap.getOrDefault("2","기본값"));

//        Iteratror로 key value 출력
        System.out.println("========= Set을 이용해 Iterator로 변환 ===========");

//        keySet()  : map에 저장된 모든 key를 Set형태로 반환
        Set<String> keys  = hashMap.keySet();

//        iterator()  -> iterator 객체 반환
        Iterator<String> keyIter = keys.iterator();
        while (keyIter.hasNext()) {
            String key =keyIter.next();

//            key값을  value로 꺼냄
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("==========Set을 이용해 for-each로 변환 ===============");
        for(String key : keys) {
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("==========Map 내부의 EntrySet을 이용===============");
//        entrySet() : Map에 저장된 key 와 value쌍을 Set형태로 "뷰"로 반환
//         -> 이때 반환된 Set은 Map이랑 연결되어있어서 추가수정삭제를하면 원본에도 반영
//        Set<Map.Entry<K, V>> set = map.entrySet()
        Set<Map.Entry<String, String>> set = hashMap.entrySet();

        Iterator<Map.Entry<String, String>> entryIterator = set.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
