package org.example;

import javafx.util.Pair;

import javax.print.attribute.standard.JobKOctets;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class KeyStoreManager implements IKeyStoreManager{
    IKeyStore keyStore;

    public KeyStoreManager(IKeyStore keyStore) {
        this.keyStore = keyStore;
    }

    @Override
    public void putManager(String key, List<Pair<Object, Object>> list) {
        keyStore.put(key,list);
    }

    @Override
    public void getAllKeys() {
        Set<String> keys = keyStore.getKeys();
        for (String key : keys) {
            System.out.println(key);
        }

    }

    @Override
    public void delete_manager(String key) {
        keyStore.delete(key);
    }

    @Override
    public HashMap<String,List<Pair<Object,Object>>> getAll() {
        HashMap<String,List<Pair<Object,Object>>> mp = keyStore.getKeyStore();
        return mp;
    }

}
