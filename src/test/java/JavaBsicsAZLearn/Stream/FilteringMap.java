package JavaBsicsAZLearn.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringMap {
    public static void main(String[] args){

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"adam");
        map.put(2,"Joe");
        map.put(3,"Charlie");
        map.put(4,"Kevin");
        map.put(5,"Sam");

        Map<Integer,String> resultMap =
                map.entrySet().stream().filter(m->m.getKey()<4)
                        .skip(1)
                        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(resultMap);

    }
}
