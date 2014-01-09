package chess_clock;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Hashtable;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ventana extends JFrame {
  JPanel contentPane;
  BorderLayout borderLayout1 = new BorderLayout();
  JPanel pnClock = new JPanel();
  JPanel jPanel1 = new JPanel();
  GridBagLayout gridBagLayout1 = new GridBagLayout();
  JPanel pnOptions = new JPanel();
  GridBagLayout gridBagLayout2 = new GridBagLayout();
  JPanel pnBlackCont = new JPanel();
  JLabel jLabel1 = new JLabel();
  JPanel pnWhiteCont = new JPanel();

  private static final ImageIcon WHITE_ICON = new ImageIcon("./imagenes/white_knight.jpg");
  private static final ImageIcon BLACK_ICON = new ImageIcon("./imagenes/black_kinght3.jpg");
  //temporales

  //Construct the frame
  public Ventana() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    border1 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151));
    titledBorder1 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151)),"");
    border2 = new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151));
    titledBorder2 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151)),"");
    border3 = BorderFactory.createLineBorder(SystemColor.controlText,1);
    titledBorder3 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,Color.white,new Color(165, 163, 151)),"");
    border4 = new EtchedBorder(EtchedBorder.RAISED,new Color(3, 3, 3),Color.black);
    titledBorder4 = new TitledBorder(border4,"sdgsdf");
    border5 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.white,Color.white,new Color(115, 114, 105),new Color(165, 163, 151));
    border6 = BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.white,Color.white,new Color(115, 114, 105),new Color(165, 163, 151));
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(400, 300));
    this.setTitle("Chess Clock");
    jPanel1.setLayout(gridBagLayout1);
    pnClock.setLayout(gridBagLayout2);
    jLabel1.setBorder(null);
    jLabel1.setText("");
    pnBlackCont.setBackground(Color.black);
    pnBlackCont.setFont(new java.awt.Font("MS Sans Serif", 0, 11));
    pnBlackCont.setAlignmentY((float) 0.5);
    pnBlackCont.setBorder(titledBorder1);
    pnBlackCont.setLayout(borderLayout2);
    pnWhiteCont.setBackground(Color.black);
    pnWhiteCont.setBorder(titledBorder2);
    pnWhiteCont.setLayout(borderLayout3);
    pnDefault.setBackground(Color.black);
    pnDefault.setBorder(titledBorder3);
    pnDefault.setLayout(gridLayout1);
    pnOptions.setLayout(gridBagLayout3);
    gridLayout1.setColumns(4);
    gridLayout1.setHgap(0);
    gridLayout1.setRows(2);
    gridLayout1.setVgap(2);
    rb5m10s.setBackground(Color.black);
    rb5m10s.setForeground(SystemColor.inactiveCaptionText);
    rb5m10s.setText("5 min + 10s");
    rb5m10s.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb5m10s_actionPerformed(e);
      }
    });
    rb90m30s.setBackground(Color.black);
    rb90m30s.setForeground(SystemColor.inactiveCaptionText);
    rb90m30s.setText("90 min + 30s");
    rb90m30s.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb90m30s_actionPerformed(e);
      }
    });
    rb2m12s.setBackground(Color.black);
    rb2m12s.setForeground(SystemColor.inactiveCaptionText);
    rb2m12s.setText("2 min + 12s");
    rb2m12s.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb2m12s_actionPerformed(e);
      }
    });
    rb60m.setBackground(Color.black);
    rb60m.setForeground(SystemColor.inactiveCaptionText);
    rb60m.setText("60 min");
    rb60m.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb60m_actionPerformed(e);
      }
    });
    rb10m.setBackground(Color.black);
    rb10m.setForeground(SystemColor.inactiveCaptionText);
    rb10m.setText("10 min");
    rb10m.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb10m_actionPerformed(e);
      }
    });
    rb4m2s.setBackground(Color.black);
    rb4m2s.setForeground(SystemColor.inactiveCaptionText);
    rb4m2s.setText("4 min + 2s");
    rb4m2s.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb4m2s_actionPerformed(e);
      }
    });
    rb25m.setBackground(Color.black);
    rb25m.setForeground(SystemColor.inactiveCaptionText);
    rb25m.setText("25 min");
    rb25m.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb25m_actionPerformed(e);
      }
    });
    rb5m.setBackground(Color.black);
    rb5m.setForeground(SystemColor.inactiveCaptionText);
    rb5m.setSelected(true);
    rb5m.setText("5 min");
    rb5m.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        rb5m_actionPerformed(e);
      }
    });
    jButton1.setBackground(Color.black);
    jButton1.setForeground(Color.black);
    jButton1.setText("Start");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jButton2.setBackground(Color.black);
    jButton2.setEnabled(false);
    jButton2.setText("Stop");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton2_actionPerformed(e);
      }
    });
//    spnTime.addChangeListener(new ChangeListener(){
//      public void stateChanged(ChangeEvent e) {
//        JSpinner sp = (JSpinner)e.getSource();
//        Integer s = (Integer)sp.getValue();
//        System.out.println(s);
//      }
//    });
    gridLayout2.setColumns(1);
    gridLayout2.setRows(3);
    jPanel2.setLayout(gridBagLayout5);
    jLabel3.setBackground(Color.black);
    jLabel3.setForeground(SystemColor.inactiveCaptionText);
    jLabel3.setText("Increase (sg) ");
    jLabel4.setBackground(Color.black);
    jLabel4.setForeground(SystemColor.inactiveCaptionText);
    jLabel4.setToolTipText("");
    jLabel4.setText("Time (min) ");
    jPanel1.setBackground(Color.black);
    pnClock.setBackground(Color.black);
    pnOptions.setBackground(Color.black);
    jPanel2.setBackground(Color.black);
    jPanel2.setBorder(titledBorder3);
    jPanel3.setBackground(Color.black);
    jLabel5.setText("");
    jPanel4.setBackground(Color.black);
    jPanel5.setBackground(Color.black);
    jPanel5.setLayout(gridLayout5);
    jPanel6.setBackground(Color.black);
    jPanel6.setBorder(titledBorder3);
    jPanel6.setDebugGraphicsOptions(0);
    jPanel6.setLayout(gridBagLayout4);
    jLabel2.setForeground(SystemColor.inactiveCaptionText);
    jLabel2.setText("White Key");
    jLabel6.setForeground(SystemColor.inactiveCaptionText);
    jLabel6.setToolTipText("");
    jLabel6.setText("Black Key");
    gridLayout5.setColumns(1);
    gridLayout5.setHgap(4);
    gridLayout5.setRows(2);
    gridLayout5.setVgap(8);
    chbSound.setBackground(Color.black);
    chbSound.setForeground(SystemColor.inactiveCaptionText);
    chbSound.setSelected(true);
    chbSound.setText("Sound");
    chbSound.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        chbSound_actionPerformed(e);
      }
    });
    btBlackKey.setText("...");
    btBlackKey.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btBlackKey_actionPerformed(e);
      }
    });
    btWhiteKey.setText("...");
    btWhiteKey.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btWhiteKey_actionPerformed(e);
      }
    });
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(pnClock,       new GridBagConstraints(0, 0, 2, 1, 1.0, 1.0
            ,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    jPanel1.add(pnOptions,      new GridBagConstraints(0, 1, 2, 1, 1.0, 1.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.VERTICAL, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(pnBlackCont,            new GridBagConstraints(2, 0, 1, 1, 0.2, 0.2
            ,GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(pnWhiteCont,           new GridBagConstraints(0, 0, 1, 1, 0.2, 0.2
            ,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(jPanel4,    new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    jPanel4.add(jLabel1, null);
    jPanel4.add(jLabel5, null);
    pnOptions.add(pnDefault,                     new GridBagConstraints(0, 0, 1, 1, 1.1, 1.1
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    ButtonGroup g = new ButtonGroup();
    g.add(rb5m);
    g.add(rb25m);
    g.add(rb4m2s);
    g.add(rb10m);
    g.add(rb60m);
    g.add(rb2m12s);
    g.add(rb90m30s);
    g.add(rb5m10s);
    pnDefault.add(rb5m, null);
    pnDefault.add(rb25m, null);
    pnDefault.add(rb4m2s, null);
    pnDefault.add(rb10m, null);
    pnDefault.add(rb60m, null);
    pnDefault.add(rb2m12s, null);
    pnDefault.add(rb90m30s, null);
    pnDefault.add(rb5m10s, null);
    pnOptions.add(jPanel2,                new GridBagConstraints(1, 0, 1, 1, 1.1, 1.1
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    jPanel2.add(jLabel4,       new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(2, 2, 4, 2), 0, 0));
    jPanel2.add(spnTime,          new GridBagConstraints(1, 0, 1, 1, 1.3, 1.3
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(2, 2, 4, 2), 0, 0));
    jPanel2.add(jLabel3,       new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(4, 2, 2, 2), 0, 0));
    jPanel2.add(spnIncr,        new GridBagConstraints(1, 1, 1, 1, 1.3, 1.3
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(4, 2, 2, 2), 0, 0));
    pnOptions.add(jPanel5,         new GridBagConstraints(3, 0, 1, 1, 2.0, 2.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    jPanel5.add(jButton2, null);
    jPanel5.add(jButton1, null);
    pnOptions.add(jPanel6,   new GridBagConstraints(2, 0, 1, 1, 1.1, 1.1
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    jPanel6.add(jLabel2,       new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 2, 1, 2), 0, 0));
    jPanel6.add(jLabel6,       new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(1, 2, 0, 2), 0, 0));
    jPanel6.add(cbBlackKey,        new GridBagConstraints(1, 1, 1, 1, 0.1, 0.1
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(1, 2, 0, 2), 0, 0));
    jPanel6.add(cbWhiteKey,       new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1
            ,GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 2, 1, 2), 0, 0));
    jPanel6.add(btBlackKey,       new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(1, 2, 0, 2), 0, 0));
    jPanel6.add(btWhiteKey,       new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0
            ,GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 2, 1, 2), 0, 0));
    jPanel1.add(jPanel3,    new GridBagConstraints(0, 2, 2, 1, 1.0, 1.0
            ,GridBagConstraints.SOUTHWEST, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
    jPanel3.add(chbSound, null);
    pnBlackCont.add(pnBlack, BorderLayout.CENTER);
    pnWhiteCont.add(pnWhite, BorderLayout.CENTER);
    pnWhite.setBackground(Color.BLACK);
//    chbSound.addFocusListener(new FocusAdapter(){
//      public void focusGained(FocusEvent e) {
//        focusGained_action(e);
//      }
//    });
    //jPanel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
    this.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) {
        if (game_state != NOT_DEFINED) return;
        keyTypedEvent(e);
      }
      public void keyPressed(KeyEvent e) {
        if (game_state != NOT_DEFINED) return;
        keyPressedEvent(e);
      }
    });
    fillComboKey();
    jLabel5.setIcon(WHITE_ICON);
    jLabel1.setIcon(BLACK_ICON);
    try {
      tick_audio = Applet.newAudioClip(tick_file.toURL());
      end_game_audio = Applet.newAudioClip(end_game_file.toURL());
      change_player_audio = Applet.newAudioClip(change_player_file.toURL());
    } catch (MalformedURLException ex) {
    }
    initChessTime();
  }

  private void focusGained_action(FocusEvent e){
    this.requestFocus();
  }

  private static final int[] keys = new int[]{KeyEvent.VK_SPACE, KeyEvent.VK_ENTER, KeyEvent.VK_BACK_SLASH, KeyEvent.VK_SLASH};

  private static final String[] key_names = new String[]{"Space", "Enter", "Back Slash", "Slash"};

  private void fillComboKey() {
    for (int i = 0; i < key_names.length; i++){
      cbBlackKey.addItem(key_names[i]);
      cbWhiteKey.addItem(key_names[i]);
    }
    cbBlackKey.setSelectedIndex(1);
    cbBlackKey.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cbBlackKey_actionPerformed(e);
      }
    });
    cbWhiteKey.setSelectedIndex(0);
    cbWhiteKey.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        cbWhiteKey_actionPerformed(e);
      }
    });
  }

  File tick_file = new File("./sounds/Tick.WAV");
  AudioClip tick_audio = null;
  File change_player_file = new File("./sounds/click3.wav");
  AudioClip change_player_audio = null;
  File end_game_file = new File("./sounds/ding.wav");
  AudioClip end_game_audio = null;

  /**
   * initChessTime
   */
  private void initChessTime() {
    pnBlack.setBackground(Color.black);
    spnTime.setBackground(Color.black);
    spnTime.setPreferredSize(new Dimension(50, 18));
    spnIncr.setBackground(Color.black);
    spnIncr.setPreferredSize(new Dimension(50, 18));
    pnBlack.add(min1_black, BorderLayout.WEST);
    pnBlack.add(min2_black, BorderLayout.CENTER);
    pnBlack.add(new JLabel(DOT_DOT));
    pnBlack.add(sec1_black, BorderLayout.EAST);
    pnBlack.add(sec2_black, BorderLayout.SOUTH);

    pnWhite.add(min1_white, BorderLayout.WEST);
    pnWhite.add(min2_white, BorderLayout.CENTER);
    pnWhite.add(new JLabel(DOT_DOT));
    pnWhite.add(sec1_white, BorderLayout.EAST);
    pnWhite.add(sec2_white, BorderLayout.SOUTH);
    spnTime.setValue(new Integer(5));
    spnIncr.setValue(new Integer(0));
  }

  public static final ImageIcon DOT_DOT = new ImageIcon("./imagenes/dot_dot.jpg");
  public static final ImageIcon CERO = new ImageIcon("./imagenes/0.jpg");
  public static final ImageIcon UNO = new ImageIcon("./imagenes/1.jpg");
  public static final ImageIcon DOS = new ImageIcon("./imagenes/2.jpg");
  public static final ImageIcon TRES = new ImageIcon("./imagenes/3.jpg");
  public static final ImageIcon CUATRO = new ImageIcon("./imagenes/4.jpg");
  public static final ImageIcon CINCO = new ImageIcon("./imagenes/5.jpg");
  public static final ImageIcon SEIS = new ImageIcon("./imagenes/6.jpg");
  public static final ImageIcon SIETE = new ImageIcon("./imagenes/7.jpg");
  public static final ImageIcon OCHO = new ImageIcon("./imagenes/8.jpg");
  public static final ImageIcon NUEVE = new ImageIcon("./imagenes/9.jpg");


  protected void game_over_action(){
    jButton2_actionPerformed(null);
    if (end_game_audio != null && sound) end_game_audio.play();
    if (tick_audio != null && sound) tick_audio.stop();
    if (whiteWin()) {
      showTime(min1_white, min2_white, sec1_white, sec2_white, player_white, m_dec_white, m_uni_white, s_dec_white, s_uni_white, true);
      JOptionPane.showMessageDialog(this, "Black Win!!!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }
    else if (blackWin()) {
      showTime(min1_black, min2_black, sec1_black, sec2_black, player_black, m_dec_black, m_uni_black, s_dec_black, s_uni_black, false);
      JOptionPane.showMessageDialog(this, "White Win!!!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }
    else throw new RuntimeException("aqui hay un bugs");
  }


  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }

  boolean state = true;
  Border border1;
  TitledBorder titledBorder1;
  Border border2;
  TitledBorder titledBorder2;
  JPanel pnDefault = new JPanel();
  Border border3;
  TitledBorder titledBorder3;
  GridBagLayout gridBagLayout3 = new GridBagLayout();
  GridLayout gridLayout1 = new GridLayout();
  JRadioButton rb5m10s = new JRadioButton();
  JRadioButton rb90m30s = new JRadioButton();
  JRadioButton rb2m12s = new JRadioButton();
  JRadioButton rb60m = new JRadioButton();
  JRadioButton rb10m = new JRadioButton();
  JRadioButton rb4m2s = new JRadioButton();
  JRadioButton rb25m = new JRadioButton();
  JRadioButton rb5m = new JRadioButton();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JPanel jPanel3 = new JPanel();
  GridLayout gridLayout2 = new GridLayout();
  JPanel jPanel2 = new JPanel();
  JSpinner spnIncr = new JSpinner(new SpinnerNumberModel(0, 0, 30, 1));
  JLabel jLabel3 = new JLabel();
  JSpinner spnTime = new JSpinner(new SpinnerNumberModel(0, 0, 90, 1));
  JLabel jLabel4 = new JLabel();

  void jButton1_actionPerformed(ActionEvent e) {
    enableAll(false);
    prepared_game();
    active_white = false;
    this.requestFocus(true);
    //change_player(true);
  }

  boolean first_time = true;

  private void change_player(boolean white) {
    if (first_time){
      if (tick_audio != null && sound)  tick_audio.loop();
      first_time = false;
    }
    else{
      if (change_player_audio != null && sound)  change_player_audio.play();
    }
    if (white){
      player_white = new ChessTime(player_white);
      player_white.arranca();
      player_white.start();
      active_white = true;
    }
    else{
      player_black = new ChessTime(player_black);
      player_black.arranca();
      player_black.start();
      active_white = false;
    }
    this.requestFocus(true);
  }

  private ChessTime createTime() {
    int m = ((Integer)spnIncr.getValue()).intValue();
    int s = ((Integer)spnTime.getValue()).intValue();
    return new ChessTime(s,0,m);
  }

  /**
   * disableRadio
   */
  private void enableAll(boolean b) {
    rb10m.setEnabled(b);
    rb25m.setEnabled(b);
    rb2m12s.setEnabled(b);
    rb4m2s.setEnabled(b);
    rb5m.setEnabled(b);
    rb5m10s.setEnabled(b);
    rb60m.setEnabled(b);
    rb90m30s.setEnabled(b);
    spnTime.setEnabled(b);
    spnIncr.setEnabled(b);
    jButton2.setEnabled(!b);
    jButton2.setFocusable(false);
    jButton1.setEnabled(b);
//    jLabel3.setEnabled(b);
//    jLabel4.setEnabled(b);
    cbBlackKey.setEnabled(b);
    cbWhiteKey.setEnabled(b);
    btBlackKey.setEnabled(b);
    btWhiteKey.setEnabled(b);
  }

  void jButton2_actionPerformed(ActionEvent e) {
    player_black.finished();
    player_white.finished();
    tick_audio.stop();
    enableAll(true);
    first_time = true;
  }

  void rb5m_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(5));
    spnIncr.setValue(new Integer(0));
  }

  void rb25m_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(25));
    spnIncr.setValue(new Integer(0));
  }

  void rb4m2s_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(4));
    spnIncr.setValue(new Integer(2));
  }

  void rb12m10s_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(12));
    spnIncr.setValue(new Integer(10));
  }

  void rb10m_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(10));
    spnIncr.setValue(new Integer(0));
  }

  void rb60m_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(60));
    spnIncr.setValue(new Integer(0));
  }

  void rb2m12s_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(2));
    spnIncr.setValue(new Integer(12));
  }

  void rb90m30s_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(90));
    spnIncr.setValue(new Integer(30));
  }

  void rb5m10s_actionPerformed(ActionEvent e) {
    spnTime.setValue(new Integer(5));
    spnIncr.setValue(new Integer(10));
  }

  protected ChessTime player_white, player_black;
  private boolean active_white = true;
  protected boolean change_player = false;
  private boolean time_over = false;
  protected boolean game_over = false;

  private static byte WHITE_WIN = 1;
  private static byte BLACK_WIN = 2;
  private static byte NOT_DEFINED = 0;

  private byte game_state = NOT_DEFINED;//0 si no esta definido, 1 white win, 2 black win

  public void prepared_game() {
    player_black = createTime();
    player_white = createTime();
    game_over = false;
    game_state = NOT_DEFINED;
    player_white.addTimeOverListener(new TimeOverListener() {
      public void timeOver() {
        player_black.finished();
        player_white.finished();
        if (game_state != NOT_DEFINED) return;//ya alguien gano antes
        time_over = true;
        game_state = WHITE_WIN;
        game_over_action();
      }
    });
    player_black.addTimeOverListener(new TimeOverListener(){
      public void timeOver() {
        player_white.finished();
        player_black.finished();
        if (game_state != NOT_DEFINED) return;//ya alguien gano antes
        time_over = true;
        game_state = BLACK_WIN;
        game_over_action();
      }
    });
    player_white.addTimePulse(new TimePulseListener() {
      public void timePulseOver() {
//        player_white.setNotifyPulse(false);
        showTime(min1_white, min2_white, sec1_white, sec2_white, player_white, m_dec_white, m_uni_white, s_dec_white, s_uni_white, true);
//        player_white.setNotifyPulse(true);
      }
    }, 300);
    player_black.addTimePulse(new TimePulseListener() {
      public void timePulseOver() {
//        player_black.setNotifyPulse(false);
        showTime(min1_black, min2_black, sec1_black, sec2_black, player_black, m_dec_black, m_uni_black, s_dec_black, s_uni_black, false);
//        player_black.setNotifyPulse(false);
      }
    }, 300);
    showTime(min1_white, min2_white, sec1_white, sec2_white, player_white, m_dec_white, m_uni_white, s_dec_white, s_uni_white, true);
    showTime(min1_black, min2_black, sec1_black, sec2_black, player_black, m_dec_black, m_uni_black, s_dec_black, s_uni_black, false);
  }


  JLabel min1_white = new JLabel(CERO);
  JLabel min2_white = new JLabel(CERO);
  JLabel sec1_white = new JLabel(CERO);
  JLabel sec2_white = new JLabel(CERO);
  int m_dec_white;
  int m_uni_white;
  int s_dec_white;
  int s_uni_white;
  JLabel min1_black = new JLabel(CERO);
  JLabel min2_black = new JLabel(CERO);
  JLabel sec1_black = new JLabel(CERO);
  JLabel sec2_black = new JLabel(CERO);
  int m_dec_black;
  int m_uni_black;
  int s_dec_black;
  int s_uni_black;


  private int key_white = KeyEvent.VK_SPACE;
  private int key_black = KeyEvent.VK_ENTER;

  public void keyTypedEvent(KeyEvent e){
    if (active_white){
      if (using_white_pressed_key) return;
      if (e.getKeyChar() != key_white) return;
      player_white.finished();
      change_player(false);
      active_white = false;
    }
    else{
      if (using_black_pressed_key) return;
      if (e.getKeyChar() != key_black) return;
      player_black.finished();
      change_player(true);
      active_white = true;
    }
    change_player = true;
  }

  public void keyPressedEvent(KeyEvent e){
    if (active_white){
      if (!using_white_pressed_key) return;
      if (e.getKeyCode() != white_key_pressed) return;
      player_white.finished();
      change_player(false);
      active_white = false;
    }
    else{
      if (!using_black_pressed_key) return;
      if (e.getKeyCode() != black_key_pressed) return;
      player_black.finished();
      change_player(true);
      active_white = true;
    }
    change_player = true;
  }


  private void stopBothTimer() {
    player_black.finished();
    player_white.finished();
  }

  private boolean timeOver() {
    return time_over;
  }

    private boolean changePlayer() {
    return change_player;
  }

  private boolean playing = false;
  BorderLayout borderLayout2 = new BorderLayout();
  BorderLayout borderLayout3 = new BorderLayout();
  JPanel pnBlack = new JPanel();
  JPanel pnWhite = new JPanel();
  Border border4;
  TitledBorder titledBorder4;
  JLabel jLabel5 = new JLabel();
  Border border5;
  Border border6;
  JPanel jPanel4 = new JPanel();
  JPanel jPanel5 = new JPanel();
  JPanel jPanel6 = new JPanel();
  JLabel jLabel2 = new JLabel();
  JComboBox cbBlackKey = new JComboBox();
  JLabel jLabel6 = new JLabel();
  JComboBox cbWhiteKey = new JComboBox();
  GridLayout gridLayout5 = new GridLayout();
  JCheckBox chbSound = new JCheckBox();

  public boolean whiteWin() {
    return game_state == WHITE_WIN;
  }

  public boolean blackWin() {
    return game_state == BLACK_WIN;
  }

  private void showTime(JLabel min1, JLabel min2, JLabel sec1, JLabel sec2, ChessTime chessTime, int m_dec, int m_uni, int s_dec, int s_uni, boolean white) {
    int m = chessTime.getMinutes();
    int s = chessTime.getSeconds();
    int new_m_dec = 0;
    if (m > 99) m = m%100;//parche debido a que no pongo mas de dos cifras en los minutos
    //realmente no lo admito, si se va ajugar tan rapido, pues que pongan partidas rapidas.
    //Esto en un futuro si realmente es necesario se puede arreglar
    if (m >= 10){
      new_m_dec = (m-m%10)/10;
      if (new_m_dec != m_dec){
        min1.setIcon(getNumberIcon(new_m_dec));
      }
    }
    else{
      min1.setIcon(CERO);
    }
    if (white) m_dec_white = new_m_dec;
    else m_dec_black = new_m_dec;
    showTimeRemain(m%10, (s-s%10)/10, s%10, min1, min2, sec1, sec2, m_dec, m_uni, s_dec, s_uni, white);
  }

  private void m_dec(int new_m_dec) {
    if (active_white){
      m_dec_white = new_m_dec;
    }
    else{
      m_dec_black = new_m_dec;
    }
  }

  private void showTimeRemain(int min, int s1, int s2, JLabel min1, JLabel min2, JLabel sec1, JLabel sec2, int m_dec, int m_uni, int s_dec, int s_uni, boolean white) {
    if (min == m_uni && s1 == s_dec && s2 == s_uni)
      return;
    if (min != m_uni) {
      min2.setIcon(getNumberIcon(min));
      if (white) m_uni_white = min;
      else m_uni_black = min;
    }
    if (s1 != s_dec) {
      sec1.setIcon(getNumberIcon(s1));
      if (white) s_dec_white = s1;
      else s_dec_black = s1;
    }
    if (s2 != s_uni) {
      sec2.setIcon(getNumberIcon(s2));
      if (white) s_uni_white = s2;
      else s_uni_black = s2;
    }
    pnClock.validate();
  }

  private void s_uni(int s2) {
    if (active_white){
      s_uni_white = s2;
    }
    else{
      s_uni_black = s2;
    }
  }

  private void s_dec(int s1) {
    if (active_white){
      s_dec_white = s1;
    }
    else{
      s_dec_black = s1;
    }
  }

  private void m_uni(int min) {
    if (active_white){
      m_uni_white = min;
    }
    else{
      m_uni_black = min;
    }
  }

  private Icon getNumberIcon(int new_m_dec) {
    switch(new_m_dec){
      case 0 : return Ventana.CERO;
      case 1 : return Ventana.UNO;
      case 2 : return Ventana.DOS;
      case 3 : return Ventana.TRES;
      case 4 : return Ventana.CUATRO;
      case 5 : return Ventana.CINCO;
      case 6 : return Ventana.SEIS;
      case 7 : return Ventana.SIETE;
      case 8 : return Ventana.OCHO;
      case 9 : return Ventana.NUEVE;
      default : throw new RuntimeException("...Esto es un bugs..");
    }
  }

  private boolean sound = true;
  JButton btBlackKey = new JButton();
  JButton btWhiteKey = new JButton();
  GridBagLayout gridBagLayout4 = new GridBagLayout();
  GridBagLayout gridBagLayout5 = new GridBagLayout();

  void chbSound_actionPerformed(ActionEvent e) {
    this.requestFocus();
    sound = !sound;
    if (!first_time){
      if (sound)tick_audio.loop();
      else tick_audio.stop();
    }
  }

  void cbWhiteKey_actionPerformed(ActionEvent e) {
    int index = cbWhiteKey.getSelectedIndex();
//    if (keys[index] == key_black){
//      JOptionPane.showMessageDialog(this, "Black play with \""+key_names[index]+"\" key too", "Error", JOptionPane.ERROR_MESSAGE);
//      cbWhiteKey.setSelectedIndex(((index > 0)?index-1:index+1));
//      return;
//    }
    key_white = keys[index];
    using_white_pressed_key = false;
  }

  void cbBlackKey_actionPerformed(ActionEvent e) {
    int index = cbBlackKey.getSelectedIndex();
//    if (keys[index] == key_white){
//      JOptionPane.showMessageDialog(this, "White play with \""+key_names[index]+"\" key too", "Error", JOptionPane.ERROR_MESSAGE);
//      cbBlackKey.setSelectedIndex(((index > 0)?index-1:index+1));
//      return;
//    }
    key_black = keys[index];
    using_black_pressed_key = false;
  }


  private int black_key_pressed = -1;
  private int white_key_pressed = -1;

  private boolean using_black_pressed_key = false;
  private boolean using_white_pressed_key = false;

  void btBlackKey_actionPerformed(ActionEvent e) {
    KeySelectorDialog dialog = new KeySelectorDialog(this, WHITE_ICON, false);
    dialog.show();
    if (dialog.isKeySelected()){
      black_key_pressed = dialog.getKeySelected();
      using_black_pressed_key = true;
    }
  }

  void btWhiteKey_actionPerformed(ActionEvent e) {
    KeySelectorDialog dialog = new KeySelectorDialog(this, BLACK_ICON, true);
    dialog.show();
    if (dialog.isKeySelected()){
      white_key_pressed = dialog.getKeySelected();
      using_white_pressed_key = true;
    }
  }
}
