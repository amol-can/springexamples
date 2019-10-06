package com.mdsol.springdemo;

import java.util.Hashtable;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionPojo {

    private Vector fruits;
    private TreeSet cricketers;
    private Hashtable hTable;

    public void setFruits(Vector vc) {
        this.fruits = vc;
    }

    public void setCricketers(TreeSet tree) {
        this.cricketers = tree;
    }

    public void sethTable(Hashtable hTable) {
        this.hTable = hTable;
    }

    @Override
    public String toString() {
        return "fruits: "+ fruits+
                "Cricketers: "+ cricketers+
                "Map: "+ hTable;
    }
}
