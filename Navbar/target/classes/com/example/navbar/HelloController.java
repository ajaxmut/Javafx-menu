package com.example.navbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class HelloController {




    @FXML
    private AnchorPane Layout;

    @FXML
    private ColorPicker colorpicker;


    @FXML
    void colorpicker(ActionEvent event) {
        Layout.setBackground(new Background(new BackgroundFill(colorpicker.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
    }


}
