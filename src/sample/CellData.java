package sample;

import javafx.scene.layout.Background;

public class CellData {
    private String text;
    private Background background;
    //... pola parametry komrki
    boolean changed;

    public CellData(String text) {
        this.text = text;
        this.background = null;
        this.changed = true;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        changed = true;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
        changed = true;
    }

    void updated() {
        changed = false;
    }

    boolean hasChanged() {
        return changed;
    }
}
