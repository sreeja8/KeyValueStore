package org.example;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class KeyStoreTest {

    @Test
    void getKeysTest() {
        String key = "John";
        List<Pair<Object,Object>> list = new ArrayList<>();
        list.add(new Pair<Object, Object>("Surname","Doe"));
        list.add(new Pair<Object, Object>("Age",24));

        KeyStore keyStore = new KeyStore();

        keyStore.put("John", list);
        Set<String> s =  keyStore.getKeys();
        String set0 = s.iterator().next();

        assert set0 == "John";
    }
}