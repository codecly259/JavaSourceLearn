package com.maxinchun.test;

import java.util.HashMap;
import java.util.Map;

/**
 * MapTest
 *
 * @author maxinchun
 * @date 2020/4/12 15:20
 */
public class MapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "tes1");
        map.put("key2", "tes2");
        map.put("key3", "tes3");
        map.put("key1", "tes4");
    }

}
