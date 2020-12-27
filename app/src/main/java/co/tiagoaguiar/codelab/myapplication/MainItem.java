package co.tiagoaguiar.codelab.myapplication;

public class MainItem {


    private int id;
    private int drawabled;
    private int color;
    private int textStringId;

    public MainItem(int id, int drawabled, int textStringId,int color) {
        this.id = id;
        this.drawabled = drawabled;
        this.textStringId = textStringId;
        this.color = color;
    }

    public int getTextStringId() {
        return textStringId;
    }

    public void setTextStringId(int textStringId) {
        this.textStringId = textStringId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrawabled() {
        return drawabled;
    }

    public void setDrawabled(int drawabled) {
        this.drawabled = drawabled;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
