/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedColorChooser;

import javafx.application.Application;
 import javafx.fxml.FXMLLoader;
 import javafx.scene.Parent;
 import javafx.scene.Scene;
 import javafx.stage.Stage;

 public class EnhancedColorChooser extends Application {
 @Override
 public void start(Stage stage) throws Exception {
 Parent root =
 FXMLLoader.load(getClass().getResource("EnhancedColorChooser.fxml"));

 Scene scene = new Scene(root);
 stage.setTitle("Color Chooser");
 stage.setScene(scene);
 stage.show();
 }

 public static void main(String[] args) {
 launch(args);
 }
}