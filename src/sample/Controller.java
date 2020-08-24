package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView userArrow;

    @FXML
    private ImageView locationArrow;

    @FXML
    private ImageView educationArrow;

    @FXML
    private AnchorPane userPanel;

    @FXML
    private AnchorPane locationPanel;

    @FXML
    private AnchorPane educationPanel;

    @FXML
    private ComboBox<String> comboBoxId;

    @FXML
    private ComboBox<String> comboBoxRelation;

    @FXML
    private ComboBox<String> comboBoxGenero;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> comboIdContent= FXCollections.observableArrayList(
                "C.C.",
                "C.E.",
                "T.I.",
                "R.C."
        );
        comboBoxId.setItems(comboIdContent);

        ObservableList<String> comboRelationContent= FXCollections.observableArrayList(
                "Casado",
                "Soltero",
                "Unión libre"
        );
        comboBoxRelation.setItems(comboRelationContent);

        ObservableList<String> comboGeneroContent= FXCollections.observableArrayList(
                "Masculino",
                "Femenino"
        );
        comboBoxGenero.setItems(comboGeneroContent);

    }

    public void onExitButtonClicked(MouseEvent event){
        Platform.exit();
        System.exit(0);
    }

    public void onUserButtonClicked(MouseEvent event){
         if(userPanel.isVisible()) {
             userPanel.setVisible(false);
             userArrow.setVisible(false);
         }else {
             userPanel.setVisible(true);
             userArrow.setVisible(true);
         }

        locationPanel.setVisible(false);
        locationArrow.setVisible(false);
        educationArrow.setVisible(false);
        educationPanel.setVisible(false);

    }

    public void onLocationButtonClicked(MouseEvent event){
        if (locationPanel.isVisible()){
            locationPanel.setVisible(false);
            locationArrow.setVisible(false);
        }else {
            locationPanel.setVisible(true);
            locationArrow.setVisible(true);
        }

        userPanel.setVisible(false);
        userArrow.setVisible(false);
        educationArrow.setVisible(false);
        educationPanel.setVisible(false);

    }

    public void onEducationButtonClicked(MouseEvent event){
        if (educationPanel.isVisible()){
            educationArrow.setVisible(false);
            educationPanel.setVisible(false);
        }else {
            educationArrow.setVisible(true);
            educationPanel.setVisible(true);
        }

        userPanel.setVisible(false);
        userArrow.setVisible(false);
        locationPanel.setVisible(false);
        locationArrow.setVisible(false);
    }


}
