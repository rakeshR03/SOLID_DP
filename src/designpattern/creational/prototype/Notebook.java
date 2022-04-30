package designpattern.creational.prototype;

public class Notebook {
    private Pagetype pagetype;
    private int pageCount;
    private Ruletype ruletype;
    private FrontPage frontPage;
    private BackPage backPage;


    private Notebook(){};

    Notebook(Pagetype pagetype, int pageCount, Ruletype ruletype){
        this.pagetype = pagetype;
        this.pageCount = pageCount;
        this.ruletype = ruletype;
    }

    public void setFrontPage(FrontPage frontPage){
        this.frontPage = frontPage;
    }
    public FrontPage setFrontPage(){
        return frontPage;
    }
    public void setBackPage(BackPage backPage){
        this.backPage = backPage;
    }
    public BackPage setBackPage(){
        return backPage;
    }

    public Notebook clone(){
        Notebook newNotebook = new Notebook();
        newNotebook.pagetype = this.pagetype;
        newNotebook.pageCount = this.pageCount;
        newNotebook.ruletype = this.ruletype;
        newNotebook.frontPage = this.frontPage;
        newNotebook.backPage = this.backPage;
        return newNotebook;
    }
}
