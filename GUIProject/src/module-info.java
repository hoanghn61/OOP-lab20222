module GUIProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.desktop;
	requires javafx.base;
	exports hust.soict.cybersec.javafx;
	opens hust.soict.cybersec.javafx to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
