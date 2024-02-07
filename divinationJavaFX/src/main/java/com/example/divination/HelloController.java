package com.example.divination;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.scene.layout.VBox;

import java.util.List;

public class HelloController {

    /**
     * model for controller
     */
    private Model model;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField stringInput;

    @FXML
    private Button doString;

    @FXML
    private Button doDice;

    @FXML
    private Button doCoin;

    @FXML
    private Button doTwoCoin;

    @FXML
    private Button doTwoCoinTime;

    @FXML
    private Button doTwoCoinDirect;

    @FXML
    private Label hexagram1;

    @FXML
    private Label hexagram2;

    @FXML
    private Label hexagram1Def;

    @FXML
    private Label hexagram2Def;

    @FXML
    private VBox firstPage;

    @FXML
    private VBox secondPage;

    /**
     * constructor that would initialize the model
     */
    public HelloController() {
        model = new Model();
    }

    /**
     * action for Roll Dice button
     */
    @FXML
    protected void onSkipClick() {
        firstPage.setVisible(false);
        firstPage.setManaged(false);
        secondPage.setVisible(true);
    }

    /**
     * action for clicking "Read String button"
     * <p> if there are exceptions, the message would be displayed in the "welcomeText"
     */
    @FXML
    protected void onDoStringClick () {
        try {
            welcomeText.setText("Divining phrase: ");
            List<Hexagram> res = model.doString(stringInput.getText().trim());
            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }

    @FXML
    protected void onDoDiceClick () {
        welcomeText.setText("Rolling dice:");
        try {
            var res = model.doDice();

            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }
    @FXML
    protected void onDoCoinClick () {
        welcomeText.setText("Flipping coin: ");
        try {
            var res = model.doCoin();
            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }
    @FXML
    protected void onDoTwoCoinClick() {
        welcomeText.setText("Flipping two coins: ");
        try {
            var res = model.doTwoCoin();
            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
            welcomeText.setText("");
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }
    @FXML
    protected void onDoTwoCoinTimeClick() {
        welcomeText.setText("Flipping two coins using two methods");
        try {
            var res = model.doTwoCoinTime();
            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
            welcomeText.setText("");
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }

    @FXML
    protected void onDoTwoCoinDirectClick() {
        welcomeText.setText("Flipping two coins using different methods");
        try {
            var res = model.doTwoCoinDirect();
            hexagram1.setText(Character.toString(res.get(0).getHexagram()));
            hexagram1Def.setText(res.get(0).getDefinition());
            hexagram2.setText(Character.toString(res.get(1).getHexagram()));
            hexagram2Def.setText(res.get(1).getDefinition());
            welcomeText.setText("");
        } catch (Exception e) {
            welcomeText.setText(model.getException());
            Duration showText = Duration.seconds(3);
            Timeline timeline = new Timeline(new KeyFrame(showText, event -> welcomeText.setText("")));
            timeline.play();
        }
    }
}
