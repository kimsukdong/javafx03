module myfx3 {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.sql;
	requires java.desktop;
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
}
