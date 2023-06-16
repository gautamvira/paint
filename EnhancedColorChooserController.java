/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdvancedColorChooser;

import javafx.beans.value.ChangeListener;
 import javafx.beans.value.ObservableValue;
 import javafx.fxml.FXML;
 import javafx.scene.control.Slider;
 import javafx.scene.control.TextField;
import java.text.NumberFormat;
 import javafx.scene.paint.Color;
 import javafx.scene.shape.Rectangle;

 public class EnhancedColorChooserController {
 // instance variables for interacting with GUI components
 @FXML private Slider redSlider;
 @FXML private Slider greenSlider;
 @FXML private Slider blueSlider;
 @FXML private Slider alphaSlider;
 @FXML private TextField redTextField;
 @FXML private TextField greenTextField;
 @FXML private TextField blueTextField;
 @FXML private TextField alphaTextField;
 @FXML private Rectangle colorRectangle;

 // instance variables for managing
 private int red = 0;
 private int green = 0;
 private int blue = 0;
 private double alpha = 1.0;

 public void initialize() {
 // bind TextField values to corresponding Slider values
 redTextField.textProperty().bindBidirectional(
 redSlider.valueProperty(), 
         NumberFormat.getNumberInstance());
 greenTextField.textProperty().bindBidirectional(
 greenSlider.valueProperty(), 
         NumberFormat.getNumberInstance());
 blueTextField.textProperty().bindBidirectional(
 blueSlider.valueProperty(), 
         NumberFormat.getNumberInstance());
 alphaTextField.textProperty().bindBidirectional(
 alphaSlider.valueProperty(), 
         NumberFormat.getNumberInstance());

 // listeners that set Rectangle's fill based on Slider changes
 redSlider.valueProperty().addListener(
 new ChangeListener<Number>() {
 @Override
 public void changed(ObservableValue<? extends Number> ov,
 Number oldValue, Number newValue) {
 red = newValue.intValue();
 colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
 }
 }
 );
 greenSlider.valueProperty().addListener(
 new ChangeListener<Number>() {
 @Override
 public void changed(ObservableValue<? extends Number> ov,
 Number oldValue, Number newValue) {
 green = newValue.intValue();
 colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
 }
 }
 );
 blueSlider.valueProperty().addListener(
 new ChangeListener<Number>() {
 @Override
 public void changed(ObservableValue<? extends Number> ov,
 Number oldValue, Number newValue) {
 blue = newValue.intValue();
 colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
 }
 }
 );
 alphaSlider.valueProperty().addListener(
 new ChangeListener<Number>() {
 @Override
 public void changed(ObservableValue<? extends Number> ov,
 Number oldValue, Number newValue) {
 alpha = newValue.doubleValue();
 colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
 }
 }
 );
 }
 }