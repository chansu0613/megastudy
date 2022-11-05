package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main_test {
    public static void main(String[] args) {
        List<Map<Integer, String >> list = new ArrayList();
        Map<Integer, String> koreaHashmap = new HashMap();
        koreaHashmap.put(1, "kim");
        koreaHashmap.put(2, "lee");
        koreaHashmap.put(3, "park");
        list.add(koreaHashmap);

        Map<Integer, String> japanHashmap = new HashMap<>();
        japanHashmap.put(1, "nakamura");
        japanHashmap.put(2, "abe");
        japanHashmap.put(3, "tanaka");
        list.add(japanHashmap);

        for (int i = 0;i < list.size();i++){
            Map map = list.get(i);
            for (int j = 0; j < 4;j++){
                System.out.println(map.get(j));
            }
        }
    }
}


