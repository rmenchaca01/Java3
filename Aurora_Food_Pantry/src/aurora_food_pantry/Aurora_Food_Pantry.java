package aurora_food_pantry;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.ListView;
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
	ObservableList<String> entries = FXCollections.observableArrayList();    
    ListView listVolunteers = new ListView();
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
		
		Label lblSceneOneTitle = new Label("Aurora Food Pantry");
		lblSceneOneTitle.setTextFill(Color.web("#e2620d"));
		Label lblWelcome = new Label("Welcome, username");
		lblWelcome.setFont(Font.font("Courier, New",14));
		lblSceneOneTitle.setFont(Font.font("Courier, New", FontWeight.BOLD,25));
		Button btnAddNewVolunteer = new Button("Add a new volunteer");
		TextField tfSearch = new TextField();
		tfSearch.setPromptText("Search");
		tfSearch.textProperty().addListener(
	            new ChangeListener() {
	                public void changed(ObservableValue observable, 
	                                    Object oldVal, Object newVal) {
	                    handleSearchByKey2((String)oldVal, (String)newVal);
	                }
	            });
		ComboBox<String> cboSearch = new ComboBox<>();
		cboSearch.getItems().addAll("Hours by company", "User", "Court ordered", "Start date", "End date");
		cboSearch.getSelectionModel().selectFirst();
		Button btnLogout = new Button("Logout");
		btnLogout.setOnAction(e -> primaryStage.setScene(scene00));
		
		hBoxSceneOneRow1.getChildren().addAll(lblSceneOneTitle, lblWelcome, btnLogout);
		hBoxSceneOne.getChildren().addAll(btnAddNewVolunteer, tfSearch, cboSearch);
		vBoxSceneOne.getChildren().addAll(hBoxSceneOneRow1, hBoxSceneOne);
		bPaneHome.setTop(vBoxSceneOne);
		
		/*Text txtVolun = new Text("Volunteers");
		Text txtHours = new Text("Hours");
		Text txtCourt = new Text("Court ordered");
		Text txtStart = new Text("Start date");
		Text txtEnd = new Text("End date");*/
		
		listVolunteers.setMaxHeight(180);
        // Populate the list's entries
		entries.add("Sample name 1\t1\tNo\t1/1/2000\t1/1/2010");
        entries.add("Sample name 2\t2\tNo\t1/1/2001\t1/1/2011");
        entries.add("Sample name 3\t3\tNo\t1/1/2002\t1/1/2012");
        entries.add("Sample name 4\t4\tNo\t1/1/2003\t1/1/2013");
        entries.add("Sample name 5\t5\tYes\t1/1/2004\t1/1/2014");
        entries.add("Sample name 6\t6\tYes\t1/1/2005\t1/1/2015");
        entries.add("Sample name 7\t7\tYes\t1/1/1998\t1/1/2016");
        entries.add("Sample name 8\t8\tYes\t1/1/1999\t1/1/2017");
        
        for ( int i = 0; i < 100; i++ ) {
            entries.add("Item " + i);
        }
        listVolunteers.setItems( entries );
        bPaneHome.setCenter(listVolunteers);
        
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
	
	public void handleSearchByKey(String oldVal, String newVal) {
        // If the number of characters in the text box is less than last time
        // it must be because the user pressed delete
        if ( oldVal != null && (newVal.length() < oldVal.length()) ) {
            // Restore the lists original set of entries 
            // and start from the beginning
            listVolunteers.setItems( entries );
        }
         
        // Change to upper case so that case is not an issue
        newVal = newVal.toUpperCase();
 
        // Filter out the entries that don't contain the entered text
        ObservableList<String> subentries = FXCollections.observableArrayList();
        for ( Object entry: listVolunteers.getItems() ) {
            String entryText = (String)entry;
            if ( entryText.toUpperCase().contains(newVal) ) {
                subentries.add(entryText);
            }
        }
        listVolunteers.setItems(subentries);
    }
 
    public void handleSearchByKey2(String oldVal, String newVal) {
        // If the number of characters in the text box is less than last time
        // it must be because the user pressed delete
        if ( oldVal != null && (newVal.length() < oldVal.length()) ) {
            // Restore the lists original set of entries 
            // and start from the beginning
            listVolunteers.setItems( entries );
        }
         
        // Break out all of the parts of the search text 
        // by splitting on white space
        String[] parts = newVal.toUpperCase().split(" ");
 
        // Filter out the entries that don't contain the entered text
        ObservableList<String> subentries = FXCollections.observableArrayList();
        for ( Object entry: listVolunteers.getItems() ) {
            boolean match = true;
            String entryText = (String)entry;
            for ( String part: parts ) {
                // The entry needs to contain all portions of the
                // search string *but* in any order
                if ( ! entryText.toUpperCase().contains(part) ) {
                    match = false;
                    break;
                }
            }
 
            if ( match ) {
                subentries.add(entryText);
            }
        }
        listVolunteers.setItems(subentries);
    }

	public static void main(String[] args) {
		launch(args);
	}
}
