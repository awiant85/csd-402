// Name: Austin Wiant
// Date: 5/11/2025
// Assignment: Module 11 – JavaFX VBox and HBox Layouts

// Purpose: This program demonstrates the use of VBox and HBox layouts in JavaFX

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class VBoxHBoxExamples extends Application {

    @Override
    public void start(Stage stage) {

        // Create a tab pane to show multiple layout examples in separate tabs
        TabPane tabPane = new TabPane();

        tabPane.getTabs().add(new Tab("Login Form", createLoginForm()));
        tabPane.getTabs().add(new Tab("Navigation Menu", createNavigationMenu()));
        tabPane.getTabs().add(new Tab("Preferences Panel", createPreferencesPanel()));
        tabPane.getTabs().add(new Tab("Form Input Row", createFormInputRow()));
        tabPane.getTabs().add(new Tab("Toolbar", createToolbar()));
        tabPane.getTabs().add(new Tab("Footer", createFooter()));

        // Set up the scene and stage
        Scene scene = new Scene(tabPane, 400, 250);
        stage.setTitle("VBox and HBox Examples");
        stage.setScene(scene);
        stage.show();
    }

    // VBox Example 1: Login form with labels, text fields, and a button
    private VBox createLoginForm() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(
            new Label("Username"),
            new TextField(),
            new Label("Password"),
            new PasswordField(),
            new Button("Login")
        );
        return vbox;
    }

    // VBox Example 2: Vertical navigation menu with stacked buttons
    private VBox createNavigationMenu() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(
            new Button("Home"),
            new Button("Profile"),
            new Button("Settings")
        );
        return vbox;
    }

    // VBox Example 3: Preferences panel with checkboxes
    private VBox createPreferencesPanel() {
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(
            new Label("Preferences"),
            new CheckBox("Dark Mode"),
            new CheckBox("Notifications"),
            new CheckBox("Mute Volume")
        );
        return vbox;
    }

    // HBox Example 1: Horizontal form input row with a label, field, and button
    private HBox createFormInputRow() {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(20));
        hbox.getChildren().addAll(
            new Label("Name"),
            new TextField(),
            new Button("Submit")
        );
        return hbox;
    }

    // HBox Example 2: Horizontal toolbar with navigation buttons
    private HBox createToolbar() {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(20));
        hbox.getChildren().addAll(
            new Button("Home"),
            new Button("Settings"),
            new Button("Logout")
        );
        return hbox;
    }

    // HBox Example 3: Footer with a label and contact button
    private HBox createFooter() {
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(20));
        hbox.getChildren().addAll(
            new Label("© 2025 MyApp"),
            new Button("Contact Us")
        );
        return hbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
