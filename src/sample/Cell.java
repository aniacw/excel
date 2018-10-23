package sample;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import org.controlsfx.control.GridCell;

public class Cell extends GridCell<CellData> {

    private Background background;

    public Cell() {
        background = new Background(new BackgroundFill(Color.CHOCOLATE, null, null));
    }

    @Override
    protected void updateItem(CellData item, boolean empty) {
        super.updateItem(item, empty);
        if (empty || item == null) {
            setText("NULL");
            setGraphic(null);
        } else {
            setText(item.toString());
            setBackground(item.getBackground());
        }
    }
}
