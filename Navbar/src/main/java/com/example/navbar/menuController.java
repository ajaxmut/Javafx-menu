package com.example.navbar;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.shape.Sphere;

public class menuController {


    @FXML
    private AnchorPane Layout;

    @FXML
    private ColorPicker colorpicker;

    @FXML
    private TextField textField;


    @FXML
    void colorpicker(ActionEvent event) {
        Layout.setBackground(new Background(new BackgroundFill(colorpicker.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
    }

}











