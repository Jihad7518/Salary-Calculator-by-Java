package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {

    @FXML
    private Label lblGrossSalary;

    @FXML
    private Label lblBasicSalary;

    @FXML
    private TextField txtHouseRent;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtGrossSalary;

    @FXML
    private TextField txtBasicSalary;

    @FXML
    private Label lblHouseRent;

    @FXML
    private TextField txtMedicalAllowance;

    @FXML
    private Label title;

    @FXML
    private Label lblId;

    @FXML
    private TextField txtId;

    @FXML
    private Label lblMedicalAllowance;

    @FXML
    private Label lblName;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCalculateGrossSalary;

    @FXML
    private TextField txtStrikeRate;
    

    @FXML
    void calcGrossSalary(ActionEvent event) {
    	double basicSalary = Double.parseDouble(txtBasicSalary.getText());
    	double medical = Double.parseDouble(txtMedicalAllowance.getText());
    	
    	double houseRent = basicSalary * 0.5;
    	double grossSalary = basicSalary + medical + houseRent;
    	
    	txtHouseRent.setText(""+houseRent);
    	txtGrossSalary.setText(""+grossSalary);

    }

    @FXML
    void saveData(ActionEvent event) {
    	System.out.println("When click data will save");

    }

}
