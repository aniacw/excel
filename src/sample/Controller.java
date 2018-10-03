package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TableView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import org.controlsfx.control.GridView;

public class Controller {
    @FXML
    GridView<CellData> table;

    @FXML
    ColorPicker colorPicker;

    @FXML
    public void initialize(){
        table.setCellFactory(new CellFactory());
        table.setHorizontalCellSpacing(0);
        table.setVerticalCellSpacing(0);
        CellData c1 = new CellData("C1");
        CellData c2 = new CellData("C2");

        table.getItems().addAll(new CellData[]{c1,c2});
    }

    @FXML
    public void onColorPickerAction(ActionEvent event) {
        Color color = colorPicker.getValue();
        for (CellData cd : table.getItems()){
            cd.setBackground(new Background(new BackgroundFill(color, null, null)));
        }
        refreshTable();
    }

    private void refreshTable(){
        table.setVisible(false);
        table.setVisible(true);
    }
}
