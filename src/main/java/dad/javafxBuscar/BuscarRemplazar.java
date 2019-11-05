package dad.javafxBuscar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarRemplazar extends Application {

	
	private Label buscar;
	private Label remplazar;
	private TextField text1;
	private TextField text2;
	private CheckBox Mayus;
	private CheckBox backsearch;
	private CheckBox regularEx;
	private CheckBox result;
	private Button search;
	private Button remp;
	private Button rempAll;
	private Button close;
	private Button help;
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		buscar= new Label("Buscar: ");
		
		remplazar= new Label("Reemplazar: ");
		
		text1= new TextField();	
		text1.setMaxWidth(Double.MAX_VALUE);
		
		text2= new TextField();
		text2.setMaxWidth(Double.MAX_VALUE);
		
		Mayus= new CheckBox();
		Mayus.setText("Es M¨¢yusculas y min¨²sculas");
		
		backsearch= new CheckBox();
		backsearch.setText("Buscar hacia atr¨¢s");
		
		regularEx= new CheckBox();
		regularEx.setText("Expresi¨®n regular");

		result= new CheckBox();
		result.setText("Resaltar resultados");
		
		search= new Button("Buscar");
		search.setMaxWidth(Double.MAX_VALUE);
		
		remp= new Button("Reemplazar");
		remp.setMaxWidth(Double.MAX_VALUE);

		rempAll= new Button("Reemplazar todo");
		rempAll.setMaxWidth(Double.MAX_VALUE);
		
		close= new Button("Cerrar");
		close.setMaxWidth(Double.MAX_VALUE);
		
		help= new Button("Ayuda");
		help.setMaxWidth(Double.MAX_VALUE);
		
		VBox check= new VBox(5,Mayus,regularEx);
		
		VBox check2= new VBox(5,backsearch,result);
		
		HBox Hcheck=new HBox(5,check,check2);
		
		
		
		GridPane grid = new GridPane();
		 grid.setHgap(5);
		 grid.setVgap(5);
		 grid.setPadding(new Insets(20));
		 
		 ColumnConstraints column1 = new ColumnConstraints();
		 
		 ColumnConstraints column2 = new ColumnConstraints();
		 
		 ColumnConstraints column3 = new ColumnConstraints();
		 
		 
		 
		 column2.setHgrow(Priority.ALWAYS);
		 grid.getColumnConstraints().addAll(column1, column2,column3);
		 
		 GridPane.setRowIndex(buscar, 0);
		 GridPane.setColumnIndex(buscar, 0);
		 
		 GridPane.setRowIndex(text1, 0);
		 GridPane.setColumnIndex(text1, 1);
		 
		 
		 GridPane.setRowIndex(remplazar, 1);
		 GridPane.setColumnIndex(remplazar, 0);
		 
		 GridPane.setRowIndex(text2, 1);
		 GridPane.setColumnIndex(text2, 1);
		
		 
		 GridPane.setRowIndex(Hcheck, 2);
		 GridPane.setColumnIndex(Hcheck, 1);
		 
		 
		 GridPane.setRowIndex(search, 0);
		 GridPane.setColumnIndex(search, 3);
		 
		 GridPane.setRowIndex(remp, 1);
		 GridPane.setColumnIndex(remp, 3);
		 
		 GridPane.setRowIndex(rempAll, 2);
		 GridPane.setColumnIndex(rempAll, 3);
		 
		 GridPane.setRowIndex(close, 3);
		 GridPane.setColumnIndex(close, 3);
		 
		 GridPane.setRowIndex(help, 4);
		 GridPane.setColumnIndex(help, 3);
		 
		 GridPane.setFillWidth(text1, true);
		 GridPane.setFillWidth(text2, true);
		 
		 grid.getChildren().addAll(buscar,text1,remplazar,text2,Hcheck,search,remp,rempAll,close,help);
		 
		 Scene scene = new Scene(grid, 500,200);
			
			primaryStage.setTitle("Buscar y reemplazar");
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}
