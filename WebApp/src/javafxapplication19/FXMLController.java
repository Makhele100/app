/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication19;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class FXMLController implements Initializable {

    


    DraggableMaker draggableMaker = new DraggableMaker();
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private CheckBox chckb1;
    @FXML
    private CheckBox chckb2;
    @FXML
    private CheckBox chckb3;
    @FXML
    private CheckBox chckb4;
    @FXML
    private CheckBox chckb5;
    @FXML
    private ChoiceBox<?> choiceb1;
    @FXML
    private ChoiceBox<?> choice2;
    @FXML
    private ChoiceBox<?> choice3;
    @FXML
    private ChoiceBox<?> choice4;
    @FXML
    private ChoiceBox<?> choice5;
    @FXML
    private ChoiceBox<?> choice6;
    @FXML
    private MenuButton menub1;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private MenuButton menub2;
    @FXML
    private MenuButton menub3;
    @FXML
    private MenuButton menub4;
    @FXML
    private MenuButton menub5;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private PasswordField pass1;
    @FXML
    private PasswordField pass2;
    @FXML
    private PasswordField pass3;
    @FXML
    private PasswordField pass4;
    @FXML
    private PasswordField pass5;
    @FXML
    private RadioButton radiob1;
    @FXML
    private TextField textf1;
    @FXML
    private TextField textf2;
    @FXML
    private TextField textf3;
    @FXML
    private TextField textf4;
    @FXML
    private TextField textf5;
    @FXML
    private TextArea texta1;
    @FXML
    private TextArea texta2;
    @FXML
    private TextArea texta3;
    @FXML
    private TextArea texa4;
    @FXML
    private TextArea texa5;
    @FXML
    private Text text1;
    @FXML
    private Text text2;
    @FXML
    private Text text3;
    @FXML
    private Text text4;
    @FXML
    private Text text5;
    @FXML
    private RadioButton radiob2;
    @FXML
    private RadioButton radiob3;
    @FXML
    private RadioButton radiob4;
    @FXML
    private RadioButton radiob5;
    @FXML
    private RadioButton radiob6;
    @FXML
    private Circle c1;
    @FXML
    private Rectangle r5;
    @FXML
    private Circle c2;
    @FXML
    private Circle c3;
    @FXML
    private Circle c4;
    @FXML
    private Circle c5;
    @FXML
    private Rectangle r1;
    @FXML
    private Rectangle r2;
    @FXML
    private Rectangle r3;
    @FXML
    private Rectangle r4;
    @FXML
    private Button open;
    @FXML
    private Button close;
    @FXML
    private Button save;
    @FXML
    private ImageView img;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        draggableMaker.makeDraggable(btn1);
        draggableMaker.makeDraggable(btn2);
        draggableMaker.makeDraggable(btn3);
        draggableMaker.makeDraggable(btn4);
        draggableMaker.makeDraggable(btn5);
        draggableMaker.makeDraggable(btn6);
        draggableMaker.makeDraggable(chckb1);
        draggableMaker.makeDraggable(chckb2);
        draggableMaker.makeDraggable(chckb3);
        draggableMaker.makeDraggable(chckb4);
        draggableMaker.makeDraggable(chckb5);
        draggableMaker.makeDraggable(choiceb1);
        draggableMaker.makeDraggable(choice2);
        draggableMaker.makeDraggable(choice3);
        draggableMaker.makeDraggable(choice4);
        draggableMaker.makeDraggable(choice5);
        draggableMaker.makeDraggable(choice6);
        draggableMaker.makeDraggable(menub1);
        draggableMaker.makeDraggable(menub2);
        draggableMaker.makeDraggable(menub3);
        draggableMaker.makeDraggable(menub4);
        draggableMaker.makeDraggable(menub5);
        draggableMaker.makeDraggable(img1);
        draggableMaker.makeDraggable(img2);
        draggableMaker.makeDraggable(img3);
        draggableMaker.makeDraggable(img4);
        draggableMaker.makeDraggable(img5);
        draggableMaker.makeDraggable(pass1);
        draggableMaker.makeDraggable(pass2);
        draggableMaker.makeDraggable(pass3);
        draggableMaker.makeDraggable(pass4);
        draggableMaker.makeDraggable(pass5);
        draggableMaker.makeDraggable(radiob1);
        draggableMaker.makeDraggable(radiob2);
        draggableMaker.makeDraggable(radiob3);
        draggableMaker.makeDraggable(radiob4);
        draggableMaker.makeDraggable(radiob5);
        draggableMaker.makeDraggable(radiob6);
        draggableMaker.makeDraggable(textf1);
        draggableMaker.makeDraggable(textf2);
        draggableMaker.makeDraggable(textf3);
        draggableMaker.makeDraggable(textf4);
        draggableMaker.makeDraggable(textf5);
        draggableMaker.makeDraggable(texta1);
        draggableMaker.makeDraggable(texta2);
        draggableMaker.makeDraggable(texta3);
        draggableMaker.makeDraggable(texa4);
        draggableMaker.makeDraggable(texa5);
        draggableMaker.makeDraggable(text1);
        draggableMaker.makeDraggable(text2);
        draggableMaker.makeDraggable(text3);
        draggableMaker.makeDraggable(text4);
        draggableMaker.makeDraggable(text5);
        draggableMaker.makeDraggable(c1);
        draggableMaker.makeDraggable(c2);
        draggableMaker.makeDraggable(c3);
        draggableMaker.makeDraggable(c4);
        draggableMaker.makeDraggable(c5);
        draggableMaker.makeDraggable(r2);
        draggableMaker.makeDraggable(r3);
        draggableMaker.makeDraggable(r4);
        draggableMaker.makeDraggable(r5);
        draggableMaker.makeDraggable(label1);
        draggableMaker.makeDraggable(label2);
        draggableMaker.makeDraggable(label3);
        draggableMaker.makeDraggable(label4);
        draggableMaker.makeDraggable(label5);
    }
    
    @FXML
    private void close()
    {
         
    }

    @FXML
    private void open(ActionEvent event) 
    {
        
    }

    @FXML
    private void save(ActionEvent event) 
    {
        
    }

    @FXML
    private void img(MouseEvent event) 
    {
        
    }
}
