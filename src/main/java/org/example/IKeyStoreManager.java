package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javafx.util.Pair;

public interface IKeyStoreManager {

    void putManager(String key, List<Pair<Object, Object>> list);

    void getAllKeys();

    void delete_manager(String key);

    public HashMap<String,List<Pair<Object,Object>>> getAll();
}
