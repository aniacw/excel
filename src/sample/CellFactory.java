package sample;

import javafx.util.Callback;
import org.controlsfx.control.GridCell;
import org.controlsfx.control.GridView;

public class CellFactory implements Callback<GridView<CellData>, GridCell<CellData>> {

    @Override
    public GridCell<CellData> call(GridView<CellData> param) {
        return new Cell();
    }
}
