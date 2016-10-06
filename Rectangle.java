import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setHeaderText("Input Width and Height of a rectangle");
		Optional<String> input = dialog.showAndWait();
		String [] side = input.get().split(" ");
		double width = Double.parseDouble(side[0]);
		double height = Double.parseDouble(side[1]);
		double perimeter = 2*width + 2*height;
		double area = width * height;

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText("The Perimeter of the rectangle is " + perimeter + "\nThe Area of the rectangle is " + area);
		alert.showAndWait();
	}
}
