import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Main extends Application {

    public Pane pane = new Pane();
    public Scene scene = new Scene(pane, 600, 180);

    @Override
    public void start(Stage primaryStage) throws Exception {
        javaFX();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    public static void collectionsSearchinSorting(){
        /*
        Question 01: In which of the labelled positions (A-H) is the number 17 to be placed, if inserted correctly?
        Answer: The number 17 can be placed in spot B, E or G.

        Question 02: In the worst case, how many elements do we need to check (compare with) if searching for a specific
        value?
        Answer 4 elements, because binary search cuts the amount of elements in half, every time you take a step.
         */
    }

    public static void terminology(){
        /*
        Question 03: Using a linear search algorithm in an array of N elements (starting in one end, and finishing in
        the other)
        With what Big-Oh expression would you describe the efficiency of this search algorithm?
        Answer: O(n). It is a linear search function, so you will access every single element. Therefore the amount of
        steps you take, will be a 1 to 1 ratio with the size of the array.

        Question 04: What is an anonymous inner class and does it have any advantages compared to using a normal Class?
        Answer: An anonymous inner class is when you create an object (often in JavaFX), and leave it nameless. You
        only tend to do this, if it is an object you only use once, and don't need to use on multiple occasions. The
        same can be done to event handlers, listeners and the like. The programmer then doesn't need to struggle with
        figuring out a name, that often already has been used. If it's a simple button, that isn't crucial to the
        structure of your program, that you only have to use once, you often just call it b or button, which often
        already is taken. Therefore you can leave it nameless and make it anonymous.

        Question 05: Suppose C is a class that implements the interfaces I and J.
            The following is given:
                I i = new C();

         Which of the following statements will throw an exception;
                A:  C c = (C) i;
                B:  J j = (J) i;
                C:  I = (I) null;
         Answer: B will throw an exception, since I and J are two different interfaces, that has nothing with each
         other to do. And if the user tries to create a new class based off of the two, with no implementations, you
         you will receive an exception.

         Question 06: What is an instance method and how does it differ from a static method?
         Answer: An instance method is a method created within a scope of your program. This method cannot be used in
         scopes outside the current scope that you created the method in. A static method is a method with the static
         property. This is a method you create outside the scope of your other methods, that can then be used in every
         scope with the static property.

         Example:

         public Class Main{

            public static void main(String[] args){

                public void exampleMethod(){
                I am an instance method
                }

                anotherMethod();

            }

         public static void anotherMethod(){
         I am a static method
         }
         */
    }

    public void javaFX(){
        /*
        Question: Create a calculator that can add two whole numbers
        Answer:
         */

        Label labelCalc = new Label("Calculator");
        labelCalc.setLayoutX(14);
        labelCalc.setLayoutY(14);

        TextField textFieldNr1 = new TextField();
        textFieldNr1.setLayoutX(14);
        textFieldNr1.setLayoutY(31);

        Label labelPlus = new Label("+");
        labelPlus.setLayoutX(163);
        labelPlus.setLayoutY(35);

        TextField textFieldNr2 = new TextField();
        textFieldNr2.setLayoutX(171);
        textFieldNr2.setLayoutY(31);


        Label labelEquals = new Label("=");
        labelEquals.setLayoutX(320);
        labelEquals.setLayoutY(35);

        TextField textFieldResult = new TextField();
        textFieldResult.setLayoutX(328);
        textFieldResult.setLayoutY(31);

        Button addButton = new Button("Add");
        addButton.setLayoutX(534);
        addButton.setLayoutY(116);
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textFieldResult.setText(""+(Integer.parseInt(textFieldNr1.getText())+
                        Integer.parseInt(textFieldNr2.getText())));
            }
        });

        pane.getChildren().addAll(labelCalc, labelEquals, labelPlus, textFieldNr1, textFieldNr2, textFieldResult,
                addButton);

    }

    public static void batchQueries(){
        /*
        Question 13: Write a batch query that creates the database structure given above.
        Answer:
        CREATE DATABASE DB_Bikes;

        GO

        USE DB_Bikes;

        CREATE TABLE tbl_category	(bike_type varchar(20) PRIMARY KEY NOT NULL,
							        category_name nchar(12) NOT NULL);

        CREATE TABLE tbl_bike		(bike_no smallint PRIMARY KEY NOT NULL,
                                     bike_type varchar(20) NOT NULL,
                                     bike_created date NULL,
                                     bike_make nchar(20) NULL);
         */
    }

    public static void jbdc(){
        /*
        Question 14:
         */
        DB.insertCategoryRecord("sport 123", "mountain bike");
    }

    public static void storedProceduresAndUDFs(){
        /*
        Question 15: Write a UDF that counts and returns the number of records in the tbl_bike table
        Answer:
        USE DB_Bikes;

        GO

        CREATE FUNCTION countRecord(@x INTEGER)
                Returns INTEGER
            BEGIN

            DECLARE @count INTEGER = 0;
            IF (@x < 5)
                SET @count = (SELECT COUNT(*) FROM tbl_bike);

            RETURN @count;
            END
         */
    }

    public static void collectionsRecursions(){
        /*
        Question 08: Create a class named "Customer", which contains the information of the test customers

        Add the four customers to a list.

        Answer:
         */

        Customer hugo = new Customer("Hugo", 95, 55);
        Customer svenja = new Customer("Svenja", 35, 150);
        Customer antonio = new Customer("Antonio", 45, 250);
        Customer christina = new Customer("Christina-Antoinette", 19, 400);

        ArrayList<Customer> list = new ArrayList<Customer>();
        list.add(hugo);
        list.add(svenja);
        list.add(antonio);
        list.add(christina);

        /*
        Question 09: Implement the necessary change to enable the list of Customers in being sorted by the method of
        "sort" of the class "java.util.Collections".

        The list must be sorted ascending in regards to the property Age.
         */

        list.sort(Customer::compareTo);
    }

    /*
    Github link for testing code: https://github.com/nico294c/InternJavaTest2021
     */

}
