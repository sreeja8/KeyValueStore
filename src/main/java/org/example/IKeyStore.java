package org.example;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public interface IKeyStore {

    public void put(String key, List<Pair<Object,Object>> list);
    public HashMap<String, List<Pair<Object, Object>>> getKeyStore();
    public void delete(String key);
    public Set<String> getKeys();

}
