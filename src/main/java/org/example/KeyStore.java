package org.example;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class KeyStore implements IKeyStore {

    HashMap<String, List<Pair<Object, Object>>> keyStore;

    public KeyStore() {
        this.keyStore = new HashMap<>();
    }

    @Override
    public void put(String key, List<Pair<Object, Object>> list) {
        keyStore.put(key, list);
    }

    @Override
    public HashMap<String, List<Pair<Object, Object>>> getKeyStore() {
        return this.keyStore;
    }

    @Override
    public Set<String> getKeys(){
        return this.keyStore.keySet();
    }

    @Override
    public void delete(String key){
        this.keyStore.remove(key);
    }
}
//String key, List<Pair<Object, Object>> keyStore