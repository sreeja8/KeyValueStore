package org.example;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

        IKeyStore keyStore = new KeyStore();
        IKeyStoreManager keyStoreManager = new KeyStoreManager(keyStore);

        List<Pair<Object,Object>> list = new ArrayList<Pair<Object, Object>>();
        list.add(new Pair<>("Surname","Musaddi"));
        list.add(new Pair<>("Age",25));
        keyStoreManager.putManager("Mohit", list);

        List<Pair<Object,Object>> list2 = new ArrayList<Pair<Object, Object>>();
        list2.add(new Pair<>("Surname","Bhattacharya"));
        list2.add(new Pair<>("Age",24));
        keyStoreManager.putManager("Sreeja", list2);


        keyStoreManager.getAllKeys();
        keyStoreManager.delete_manager("Mohit");
        HashMap<String, List<Pair<Object,Object>>> mp = keyStoreManager.getAll();
        System.out.println(mp);
    }
}

/*
Requirements:
1. Key: String , Value: Object/map
    "sdeBootcamp" : {"title": "SDE Bootcamp", "price" : "200000"}

    "Sreeja" : {"title" : "SDE-1"}
    "Mohit" : {"title" : "SDE-2"}
    "Adam" : {"title" : "Principal SDE"}

Key:Value should support the following functions :
1. get(String key)
2. put(String key, list of attributes and values)
3. delete(String key)
4. keys() = Returns all keys




"mohit": {"firstname": "mohit", "lastname": "musaddi", "phoneNumber": "234", "edu": "b.tech"}
 */