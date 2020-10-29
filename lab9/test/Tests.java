package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import adapters.ListToMap;
import adapters.MapToList;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;


public class Tests {
    private static List<String> list;
    private static Map<String, String> map;


    @Test
    public void testListAdd() {
        list = new ListToMap<>(new HashMap<>());
        list.add("João");
        assertEquals(1, list.size());
    }

    @Test
    public void testListGet() {
        list = new ListToMap<>(new HashMap<>());
        list.add("Maria");
        assertEquals("Maria", list.get(0));
    }

    @Test
    public void testListSize() {
        list = new ListToMap<>(new HashMap<>());
        list.add("Barbara");
        assertEquals(1, list.size());
    }

    @Test
    public void testListRemove() {
        list = new ListToMap<>(new HashMap<>());
        list.add("Barbara");
        list.remove("Barbara");
        assertEquals(0, list.size());
    }

    @Test
    public void testListContains() {
        list = new ListToMap<>(new HashMap<>());
        list.add("Maria");
        assertTrue(list.contains("Maria"));
    }

    @Test
    public void testLisClear() {
        list = new ListToMap<>(new HashMap<>());
        list.add("Barbara");
        list.add("Maria");
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testListIsEmpty() {
        list = new ListToMap<>(new HashMap<>());
        assertTrue(list.isEmpty());
    }

    @Test
    public void testListEquals() {
        List<String> list1 = new ListToMap<>(new HashMap<>());
        list1.add("Gabriel");
        list1.add("Maria");

        
        List<String> list2 = new ListToMap<>(new HashMap<>());
        list2.add("Gabriel");
        list2.add("Maria");

        assertTrue(list1.equals(list2));
    }

    @Test
    public void testListToArray() {
        List<String> list1 = new ListToMap<>(new HashMap<>());
        list1.add("Gabriel");
        list1.add("Maria");

        
        List<String> list2 = new ListToMap<>(new HashMap<>());
        list2.add("Gabriel");
        list2.add("Maria");

        assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void testListIterator() {
        List<String> list1 = new ListToMap<>(new HashMap<>());
        list1.add("Gabriel");
        list1.add("Maria");

        List<String> list2 = new ListToMap<>(new HashMap<>());

        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()) {
            list2.add(itr.next());
        }

        assertArrayEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void testMapPut() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        assertEquals(2, map.size());
    }

    @Test
    public void testMapSize() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("sobrenome", "Coutinho");
        assertEquals(1, map.size());
    }

    @Test
    public void testMapGet() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        assertEquals("Coutinho", map.get("sobrenome"));
    }

    @Test
    public void testMapIsEmpty() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        assertTrue(map.isEmpty());
    }

    @Test
    public void testMapRemove() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        map.remove("nome");
        assertEquals(1, map.size());
    }

    @Test
    public void testMapClear() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        map.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testMapContainsKey() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        assertTrue(map.containsKey("sobrenome"));
    }

    @Test
    public void testMapContainsValue() {
        Map<String, String> map = new MapToList<>(new ArrayList<>());
        map.put("nome", "João");
        map.put("sobrenome", "Coutinho");
        assertTrue(map.containsValue("Coutinho"));
    }

    @Test
    public void testMapValues() {
        Map<String, String> map1 = new MapToList<>(new ArrayList<>());
        map1.put("nome", "João");
        map1.put("sobrenome", "Coutinho");

        Map<String, String> map2 = new MapToList<>(new ArrayList<>());
        map2.put("nome", "João");
        map2.put("sobrenome", "Coutinho");
        assertArrayEquals(map1.values().toArray(), map2.values().toArray());
    }

    @Test
    public void testMapEquals() {
        Map<String, String> map1 = new MapToList<>(new ArrayList<>());
        map1.put("nome", "João");
        map1.put("sobrenome", "Coutinho");

        Map<String, String> map2 = new MapToList<>(new ArrayList<>());
        map2.put("nome", "João");
        map2.put("sobrenome", "Coutinho");
        assertTrue(map1.equals(map2));
    }


}
