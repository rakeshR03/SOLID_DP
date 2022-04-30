package designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        NotebookRegistry notebookRegistry = new NotebookRegistry();
        notebookRegistry.addNotebook("a4_120_plane",new Notebook(Pagetype.A4, 120, Ruletype.PLANE));
        notebookRegistry.addNotebook("a4_120_rule",new Notebook(Pagetype.A4, 120, Ruletype.RULE));
        notebookRegistry.addNotebook("a3_120_plane",new Notebook(Pagetype.A3, 120, Ruletype.PLANE));

        ArrayList<Notebook> notebooks = new ArrayList<>();

        List<String> lists = List.of("a4_120_plane", "a4_120_rule", "a3_120_plane");

        for(String list : lists){
            Notebook prototype = notebookRegistry.getNotebook(list);
            prototype.setFrontPage(new FrontPage());
            prototype.setBackPage(new BackPage());
            notebooks.add(prototype);
        }
        System.out.println(notebooks);
    }
}
