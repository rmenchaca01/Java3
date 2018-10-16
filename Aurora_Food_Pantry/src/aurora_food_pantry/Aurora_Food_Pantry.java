package aurora_food_pantry;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
* Aurora Food Pantry by Half Empty
* 
* @lastModifiedBy	Rafael
* @modified		9/30/2018 
* @version		0.1
*/

public class Aurora_Food_Pantry extends Application {
	Scene scene00, scene01, scene02;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Aurora Food Pantry");
		BorderPane bPaneLogin = new BorderPane();
		//bPaneLogin.setPadding(new Insets(30, 30, 30, 30));
		HBox hBox0Top = new HBox();
		hBox0Top.setPadding(new Insets(10, 10, 10, 10));
		Label lblSceneZeroTitle = new Label("Aurora Food Pantry");
		lblSceneZeroTitle.setTextFill(Color.web("#e2620d"));
		lblSceneZeroTitle.setFont(Font.font("Courier, New", FontWeight.BOLD,25));
		HBox hBox0Bottom = new HBox();
		hBox0Bottom.setPadding(new Insets(10, 10, 10, 10));
		hBox0Bottom.setStyle("-fx-background-color: #372001");
		Button btnLogin = new Button("Login");
		//btnLogin.setStyle("-fx-background-color: #739e25");
		//btnLogin.setTextFill(Color.web("#FFF"));
		
		GridPane gridLogin = new GridPane();
		gridLogin.setAlignment(Pos.CENTER);
		gridLogin.setHgap(10);
		gridLogin.setPadding(new Insets(30, 30, 30, 30));
		gridLogin.setStyle("-fx-font-weight: bold; -fx-border-color:gray;");
		
		TextField username = new TextField();
		TextField password = new TextField();
		
		gridLogin.addRow(1, new Label("Username"));
		gridLogin.addRow(2, username);
		gridLogin.addRow(3, new Text(""));
		gridLogin.addRow(4, new Label("Password"));
		gridLogin.addRow(5, password);
		
		hBox0Top.getChildren().add(lblSceneZeroTitle);
		hBox0Bottom.getChildren().add(btnLogin);
		bPaneLogin.setCenter(gridLogin);
		bPaneLogin.setTop(hBox0Top);
		bPaneLogin.setBottom(hBox0Bottom);
		
		scene00 = new Scene(bPaneLogin, 400, 400);
		primaryStage.setScene(scene00);
		
		/*Scene 1 - the Volunteer Database */
		
		BorderPane bPaneHome = new BorderPane();
		//bPaneHome.setPadding(new Insets(30, 30, 30, 30));
		bPaneHome.setStyle("-fx-background-color: #739e25");
		
		VBox vBoxSceneOne = new VBox();
		vBoxSceneOne.setPadding(new Insets(10, 10, 10, 10));
		vBoxSceneOne.setStyle("-fx-background-color: #FFF");
		
		HBox hBoxSceneOneRow1 = new HBox(10);
		hBoxSceneOneRow1.setAlignment(Pos.CENTER);
		hBoxSceneOneRow1.setPadding(new Insets(10, 10, 10, 10));
		
		HBox hBoxSceneOne = new HBox(10);
		hBoxSceneOne.setPadding(new Insets(10, 10, 10, 10));
		
		GridPane gridVolunteers = new GridPane();
		gridVolunteers.setAlignment(Pos.CENTER);
		gridVolunteers.setHgap(10);
		gridVolunteers.setVgap(10);
		gridVolunteers.setStyle("-fx-border-color:green; -fx-background-color: #EEE;");
		bPaneHome.setCenter(gridVolunteers);
		
		Label lblSceneOneTitle = new Label("Aurora Food Pantry");
		lblSceneOneTitle.setTextFill(Color.web("#e2620d"));
		Label lblWelcome = new Label("Welcome, username");
		lblWelcome.setFont(Font.font("Courier, New",14));
		lblSceneOneTitle.setFont(Font.font("Courier, New", FontWeight.BOLD,25));
		Button btnAddNewVolunteer = new Button("Add a new volunteer");
		TextField tfSearch = new TextField("Search:");
		ComboBox<String> cboSearch = new ComboBox<>();
		cboSearch.getItems().addAll("Hours by company", "User", "Court ordered", "Start date", "End date");
		cboSearch.getSelectionModel().selectFirst();
		Button btnLogout = new Button("Logout");
		btnLogout.setOnAction(e -> primaryStage.setScene(scene00));
		
		hBoxSceneOneRow1.getChildren().addAll(lblSceneOneTitle, lblWelcome, btnLogout);
		hBoxSceneOne.getChildren().addAll(btnAddNewVolunteer, tfSearch, cboSearch);
		vBoxSceneOne.getChildren().addAll(hBoxSceneOneRow1, hBoxSceneOne);
		bPaneHome.setTop(vBoxSceneOne);
		
		Text txtVolun = new Text("Volunteers");
		Text txtHours = new Text("Hours");
		Text txtCourt = new Text("Court ordered");
		Text txtStart = new Text("Start date");
		Text txtEnd = new Text("End date");
		gridVolunteers.addRow(0, txtVolun, txtHours, txtCourt, txtStart, txtEnd);
		gridVolunteers.addRow(1, new Text("Sample name 1"), new Text("1"), new Text("No"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(2, new Text("Sample name 2"), new Text("2"), new Text("No"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(3, new Text("Sample name 3"), new Text("3"), new Text("Yes"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(4, new Text("Sample name 4"), new Text("4"), new Text("No"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(5, new Text("Sample name 5"), new Text("5"), new Text("Yes"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(6, new Text("Sample name 6"), new Text("6"), new Text("Yes"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(7, new Text("Sample name 7"), new Text("7"), new Text("No"), new Text("1/1/2000"), new Text("1/1/2010"));
		gridVolunteers.addRow(8, new Text("Sample name 8"), new Text("8"), new Text("Yes"), new Text("1/1/2000"), new Text("1/1/2010"));
		
		scene01 = new Scene(bPaneHome);
		
		/*Scene 2 - the Volunteer Registration*/
		
		Label lblSceneTwoTitle = new Label("Volunteer Registration");
		lblSceneTwoTitle.setFont(Font.font("Courier, New", FontWeight.BOLD,25));
		
		GridPane gridVolunteerForm = new GridPane();
		gridVolunteerForm.setAlignment(Pos.CENTER);
		gridVolunteerForm.setHgap(10);
		gridVolunteerForm.setPadding(new Insets(30, 30, 30, 30));
		gridVolunteerForm.setStyle("-fx-font-weight: bold");
		
		HBox hBoxVolunteerForm = new HBox(10);
		
		BorderPane bPaneVolunteerForm = new BorderPane();
		bPaneVolunteerForm.setPadding(new Insets(30, 30, 30, 30));
		bPaneVolunteerForm.setStyle("-fx-background-color: #EEE");
		bPaneVolunteerForm.setTop(lblSceneTwoTitle);
		bPaneVolunteerForm.setCenter(gridVolunteerForm);
		bPaneVolunteerForm.setBottom(hBoxVolunteerForm);
		
		TextField firstName = new TextField();
		TextField lastName = new TextField();
		DatePicker dob = new DatePicker(LocalDate.of(2000, 1, 1));
		TextField affiliation = new TextField();
		CheckBox retired = new CheckBox();
		TextField phone = new TextField();
		TextField email = new TextField();
		TextField street = new TextField();
		TextField city = new TextField();
		TextField state = new TextField();
		state.setPrefWidth(100);
		TextField zip = new TextField();
		zip.setPrefWidth(60);
		TextField emergencyName = new TextField();
		TextField emergencyPhone = new TextField();
		Button btnCancelVolunteer = new Button("Cancel");
		btnCancelVolunteer.setOnAction(e -> primaryStage.setScene(scene01));
		Button btnSaveVolunteer = new Button("Save");
		btnSaveVolunteer.setOnAction(e -> primaryStage.setScene(scene01));
		
		gridVolunteerForm.addRow(1, new Label("First Name"), new Label("Last Name"));
		gridVolunteerForm.addRow(2, firstName, lastName);
		gridVolunteerForm.addRow(3, new Text(""));
		gridVolunteerForm.addRow(4, new Label("Date of Birth"));
		gridVolunteerForm.addRow(5, dob);
		gridVolunteerForm.addRow(6, new Text(""));
		gridVolunteerForm.addRow(7, new Label("Affiliation"), new Label("Retired"));
		gridVolunteerForm.addRow(8, affiliation, retired);
		gridVolunteerForm.addRow(9, new Text(""));
		gridVolunteerForm.addRow(10, new Label("Phone"));
		gridVolunteerForm.addRow(11, phone);
		gridVolunteerForm.addRow(12, new Text(""));
		gridVolunteerForm.addRow(13, new Label("Email"));
		gridVolunteerForm.addRow(14, email);
		gridVolunteerForm.addRow(15, new Text(""));
		gridVolunteerForm.addRow(16, new Label("Street"), new Label("City"), new Label("State"), new Label("Zip"));
		gridVolunteerForm.addRow(17, street, city, state, zip);
		gridVolunteerForm.addRow(18, new Text(""));
		gridVolunteerForm.addRow(19, new Label("Emergency Contact Name"), new Label("Emergency Phone"));
		gridVolunteerForm.addRow(20, emergencyName, emergencyPhone);
		hBoxVolunteerForm.getChildren().addAll(btnCancelVolunteer, btnSaveVolunteer);
		
		scene02 = new Scene(bPaneVolunteerForm);
		
		primaryStage.show();
		
		btnLogin.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				primaryStage.setScene(scene01);
				
			}
		});
		
		btnAddNewVolunteer.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				primaryStage.setScene(scene02);
				
			}
		});
	}

	public static void main(String[] args) {
		launch(args);
	}
}
