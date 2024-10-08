
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame 
{
   private JTextField textField; 
   private Font plainFont; 
   private Font boldFont; 
   private Font italicFont; 
   private Font boldItalicFont; 
   private JRadioButton plainJRadioButton; 
   private JRadioButton boldJRadioButton; 
   private JRadioButton italicJRadioButton; 
   private JRadioButton boldItalicJRadioButton; 
   private ButtonGroup radioGroup; 
   private ButtonGroup colorRadioGroup;

   private JRadioButton blackRadioButton; 
   private JRadioButton redRadioButton; 
   private JRadioButton blueJRadioButton; 
   private JRadioButton yellowRadioButton;

   private Color blackColor; 
   private Color redColor; 
   private Color blueColor; 
   private Color yellowcolor; 
  
   public RadioButtonFrame()
   {
      super("RadioButton Test");
      setLayout(new FlowLayout()); 

      textField = new JTextField("Watch the font style change", 25);
      add(textField); 

      
blackRadioButton = new JRadioButton("black", true);
redRadioButton = new JRadioButton("red", false);
blueJRadioButton = new JRadioButton("blue", false);
yellowJRadioButton = new JRadioButton("yellow", false);
add(blackJRadioButton); 
add(redJRadioButton); 
add(blueJRadioButton); 
add(yellowJRadioButton); 


radioGroup = new ButtonGroup(); 
radioGroup.add(plainJRadioButton); 
radioGroup.add(boldJRadioButton); 
radioGroup.add(italicJRadioButton); 
   radioGroup.add(boldItalicJRadioButton); 


plainFont = new Font("Serif", Font.PLAIN, 14);
boldFont = new Font("Serif", Font.BOLD, 14);
italicFont = new Font("Serif", Font.ITALIC, 14);
boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
textField.setFont(plainFont);


plainJRadioButton.addItemListener(
new RadioButtonHandler(plainFont));
boldJRadioButton.addItemListener(
new RadioButtonHandler(boldFont));
italicJRadioButton.addItemListener(
new RadioButtonHandler(italicFont));
boldItalicJRadioButton.addItemListener(
new RadioButtonHandler(boldItalicFont));

plainJRadioButton = new JRadioButton("Plain", true);
boldJRadioButton = new JRadioButton("Bold", false);
italicJRadioButton = new JRadioButton("Italic", false);
boldItalicJRadioButton = new JRadioButton("Bold/Italic", false);
add(plainJRadioButton); 
add(boldJRadioButton); 
add(italicJRadioButton); 
add(boldItalicJRadioButton); 


radioGroup = new ButtonGroup(); 
radioGroup.add(plainJRadioButton); 
radioGroup.add(boldJRadioButton); 
radioGroup.add(italicJRadioButton); 
radioGroup.add(boldItalicJRadioButton); 


blackColor = Color.BLACK;
redColor = Color.RED;
blueColor = Color.BLUE;
yellowColor = Color.Yellow;
textField.setForeground(blackColor);


blackRadioButton.addItemListener(
   new RadioButtonHandler(blackColor));
redRadioButton.addItemListener(
   new RadioButtonHandler(redColor));
blueRadioButton.addItemListener(
   new RadioButtonHandler(blueColor));
yellowRadioButton.addItemListener(
   new RadioButtonHandler(yellowcolor));
   } 

   
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; 

      public RadioButtonHandler(Font f)
      {
         font = f; 
      } 
   
      
      @Override
      public void itemStateChanged(ItemEvent event)
      {
         textField.setFont(font); 
      } 
   } 
} 


