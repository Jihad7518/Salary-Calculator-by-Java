/* doesn't work with source level 1.8:
module com.mycompany.salarycalc {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.salarycalc to javafx.fxml;
    exports com.mycompany.salarycalc;
}
*/
