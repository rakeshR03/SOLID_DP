package designpattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class NotebookRegistry {
    Map<String, Notebook> notebooks = new HashMap<>();

    public void addNotebook(String name, Notebook notebook){
        notebooks.put(name, notebook);
    }

    public Notebook getNotebook(String name){
        return notebooks.get(name).clone();
    }
}
