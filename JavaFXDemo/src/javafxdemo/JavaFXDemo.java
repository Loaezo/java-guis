package javafxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("JavaFX label");
        TextField textField = new TextField("JavaFX text field");
        Button button = new Button("JavaFX button");
        CheckBox checkBox = new CheckBox("JavaFX checkbox");
        RadioButton radioButton = new RadioButton("Botón de opción");

        VBox contenedor = new VBox(label, textField, button, checkBox, radioButton);

        Scene scene = new Scene(contenedor, 300, 200);

        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
