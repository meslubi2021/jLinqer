package com.github.jlinqer.collections;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Keisuke Kato
 */
public class DictionaryTest {
// -------------------------- OTHER METHODS --------------------------

    @Test
    public void functions() throws Exception {
        // arrange
        Dictionary<String, Integer> dic = new Dictionary<>();

        // act
        Integer put = dic.put("ES", 7);
        Enumeration elements = dic.elements();
        Integer get = dic.get("ES");
        boolean isEmpty = dic.isEmpty();
        Enumeration<String> keys = dic.keys();
        Iterator<Map.Entry<String, Integer>> iterator = dic.iterator();
        Integer remove = dic.remove("ES");
        int size = dic.size();

        // assert
        assertEquals(null, put);
        assertEquals(false, elements.hasMoreElements());
        assertEquals(7, get.intValue());
        assertEquals(false, isEmpty);
        assertEquals(false, keys.hasMoreElements());
        assertEquals(true, iterator.hasNext());
        assertEquals(7, remove.intValue());
        assertEquals(0, size);
    }
}