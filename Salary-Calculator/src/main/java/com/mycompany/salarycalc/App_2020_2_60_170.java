package com.mycompany.salarycalc;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * JavaFX App
 */



public class App_2020_2_60_170 extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Students GPA Calculation");
        primaryStage.setMaximized(true);
        GridPane gridPane = createRegistrationFormPane();

        addUIControls(gridPane);

        Scene scene = new Scene(gridPane, 1000, 500);

        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    private GridPane createRegistrationFormPane() {
        GridPane gridPane = new GridPane();

        gridPane.setAlignment(Pos.CENTER);

        gridPane.setPadding(new Insets(40, 40, 40, 40));

        gridPane.setHgap(10);

        gridPane.setVgap(10);


        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

        return gridPane;
    }

    private void addUIControls(GridPane gridPane) {

        Label headerLabel = new Label("Students GPA Calculation");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));


        Label studentRoll = new Label("Student Roll No : ");
        gridPane.add(studentRoll, 0,1);


        TextField studentRollField = new TextField();
        studentRollField.setPrefHeight(40);
        gridPane.add(studentRollField, 1,1);


        Label studentName = new Label("Student Name : ");
        gridPane.add(studentName, 0, 2);

        TextField studentNameField = new TextField();
        studentNameField.setPrefHeight(40);
        gridPane.add(studentNameField, 1, 2);


        Label benLabel = new Label("Marks in Bengali : ");
        gridPane.add(benLabel, 0, 3);

        TextField benField = new TextField();
        benField.setPrefHeight(40);
        gridPane.add(benField, 1, 3);


        Label engLabel = new Label("Marks in English : ");
        gridPane.add(engLabel, 0, 4);

        TextField engField = new TextField();
        engField.setPrefHeight(40);
        gridPane.add(engField, 1, 4);

        Label mathLabel = new Label("Marks in Mathmatics : ");
        gridPane.add(mathLabel, 0, 5);

        TextField mathField = new TextField();
        mathField.setPrefHeight(40);
        gridPane.add(mathField, 1, 5);


        Button calcGPA = new Button("Calculate GPA");
        calcGPA.setPrefHeight(40);
        calcGPA.setDefaultButton(true);
        calcGPA.setPrefWidth(300);
        gridPane.add(calcGPA, 0, 6, 2, 1);
        GridPane.setHalignment(calcGPA, HPos.CENTER);
        GridPane.setMargin(calcGPA, new Insets(20, 0,20,400));






        Label gradeAvgPoint = new Label("Grade Point Average : ");
        gridPane.add(gradeAvgPoint, 0,7);


        Label gradeAvgPointLabel = new Label("");
        gridPane.add(gradeAvgPointLabel, 1,7);

        

        Button saveData = new Button("Save Data");
        saveData.setPrefHeight(40);
        saveData.setDefaultButton(true);
        saveData.setPrefWidth(300);
        gridPane.add(saveData, 0, 4, 6, 40);
        GridPane.setHalignment(saveData, HPos.CENTER);
        GridPane.setMargin(saveData, new Insets(20, 0,20,400));


        Button refresh = new Button("Refresh Button");
        refresh.setPrefHeight(40);
        refresh.setDefaultButton(true);
        gridPane.add(refresh,1, 10, 1, 10);

        Button closeFile = new Button("Close File");
        closeFile.setPrefHeight(40);
        closeFile.setDefaultButton(true);
        gridPane.add(closeFile,1, 15, 1, 10);

        calcGPA.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    Integer bengaliMark = Integer.parseInt(benField.getText().toString());
                    Integer englishMark = Integer.parseInt(engField.getText().toString());
                    Integer mathMark = Integer.parseInt(mathField.getText().toString());

                
                float result = Calculate_2020_2_60_170.calculateGPA(bengaliMark, englishMark, mathMark);


                gradeAvgPointLabel.setText(""+result);

                
           }
        });


closeFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             Stage stage = (Stage) closeFile.getScene().getWindow();
            stage.close();
                
           }
        });

        refresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                studentRollField.setText("");
                 engField.setText("");
                   benField.setText("");
                    mathField.setText("");
                     studentNameField.setText("");
                     gradeAvgPointLabel.setText("");
           }
        });



        saveData.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                            String roll = studentRollField.getText().toString();
                            String bMarks = benField.getText().toString();
                            String eMarks = engField.getText().toString();
                            String mMarks = mathField.getText().toString();
                            String name = studentNameField.getText().toString();



                    Student_2020_2_60_170 s = new Student_2020_2_60_170(roll, name, Integer.parseInt(bMarks), Integer.parseInt(eMarks), Integer.parseInt(mMarks));

                    SaveDataToFile_2020_2_60_170.WriteObjectToFile(s);

                   }
                });
    }

    public static void main(String[] args) {
        launch(args);
    }

}