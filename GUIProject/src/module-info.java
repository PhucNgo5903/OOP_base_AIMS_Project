/**
 * 
 */
/**
 * 
 */
module GUIProject {
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	requires javafx.base;
	
	exports hust.soict.hedspi.javafx;
    opens hust.soict.hedspi.javafx to javafx.fxml;
}