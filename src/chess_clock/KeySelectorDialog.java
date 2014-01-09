package chess_clock;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class KeySelectorDialog extends JDialog {

  JPanel panel1 = new JPanel();
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel jPanel1 = new JPanel();
  JLabel lbPlayerIcon = new JLabel();
  JLabel lbText = new JLabel();
  private int key_selected = -1;
  private ImageIcon image;
  private boolean white;

  public KeySelectorDialog(Frame frame, ImageIcon image, boolean white) {
    super(frame, "Key Selection", true);
    this.image = image;
    this.white = white;
    try {
      jbInit();
      pack();
    }
    catch(Exception ex) {
      ex.printStackTrace();
    }
    this.setLocation(frame.getLocation().x+(frame.getSize().width-this.getSize().width)/2, frame.getLocation().y+(frame.getSize().height-this.getSize().height)/2);
  }

  private void jbInit() throws Exception {
    panel1.setLayout(borderLayout1);
    lbPlayerIcon.setText("");
    lbPlayerIcon.setIcon(image);
    lbText.setFont(new java.awt.Font("Times New Roman", 1, 16));
    lbText.setText("Pressed your preferred key for play !!!!");
    jPanel1.setBackground(Color.black);
    getContentPane().add(panel1);
    panel1.add(jPanel1, BorderLayout.CENTER);
    lbText.setForeground(Color.WHITE);
    if (white){
      jPanel1.add(lbPlayerIcon);
      jPanel1.add(lbText);
    }
    else{
      jPanel1.add(lbText);
      jPanel1.add(lbPlayerIcon);
    }
    this.addKeyListener(new KeyAdapter(){
      public void keyPressed(KeyEvent e) {
        keyPressedAction(e);
      }
    });
  }
  private void keyPressedAction(KeyEvent e){
    key_selected = e.getKeyCode();
    this.dispose();
  }

  public int getKeySelected(){
    assert(isKeySelected()) : "assert(isKeySelected())";
    return key_selected;
  }

  public boolean isKeySelected() {
    return key_selected != -1;
  }

}
