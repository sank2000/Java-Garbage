import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
public class FXwithlambda extends Application {
    public void start(Stage primarystage)throws Exception
    {
        Button b1=new Button("Click me!");
        StackPane layout=new StackPane();
        layout.getChildren().add(b1);
        primarystage.show();
        primarystage.setTitle("First FX");
        primarystage.setResizable(false);
        Scene s1=new Scene(layout,300,300);
        primarystage.setScene(s1);
        b1.setOnAction(e ->
        {
          System.out.println("This is san");
         }  );
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
