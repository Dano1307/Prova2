package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        for(int i=0; i<10; i++){
            System.out.println("Bla bla bla");
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Bro cmon!");
        stage.setScene(scene);
        stage.show();

        System.out.println("Doing other stuffs...");
    }

    public static void main(String[] args) {
        launch();
    }
}