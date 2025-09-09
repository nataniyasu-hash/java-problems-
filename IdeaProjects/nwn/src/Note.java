public class Note {
    private String title;
    private String content;

    public Note (String title, String content){
        this.title= title;
        this.content = content;

    }

    public String getTitle (){
        return title;
    }
    public String getContent(){
        return content;
    }
    public void setTitle(String Title){
        this.title= Title;

    }
    public void setConetnt (String content){
        this.content = content ;
    }
}
