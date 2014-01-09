package chess_clock;

//import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.sound.sampled.*;
import java.io.*;

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
    gridLayout1.setRows(2);
    gridLayout1.setVgap(0);
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
    gridLayout2.setColumns(1);
    gridLayout2.setRows(3);
    jPanel2.setLayout(gridLayout3);
    gridLayout3.setColumns(2);
    gridLayout3.setHgap(4);
    gridLayout3.setRows(2);
    gridLayout3.setVgap(10);
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
    pnBlack.setBackground(Color.black);
    contentPane.add(jPanel1, BorderLayout.CENTER);
    jPanel1.add(pnClock,     new GridBagConstraints(0, 0, 1, 1, 1.0, 1.0
            ,GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL, new Insets(4, 4, 4, 4), 0, 0));
    jPanel1.add(pnOptions,    new GridBagConstraints(0, 1, 1, 1, 1.0, 1.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.VERTICAL, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(pnBlackCont,            new GridBagConstraints(2, 0, 1, 1, 0.2, 0.2
            ,GridBagConstraints.EAST, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(pnWhiteCont,           new GridBagConstraints(0, 0, 1, 1, 0.2, 0.2
            ,GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    pnClock.add(jPanel4,    new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1
            ,GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(4, 4, 4, 4), 0, 0));
    jPanel4.add(jLabel1, null);
    jPanel4.add(jLabel5, null);
    pnOptions.add(pnDefault,               new GridBagConstraints(0, 0, 1, 2, 1.1, 1.1
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
    pnOptions.add(jButton1,        new GridBagConstraints(2, 0, 1, 1, 1.0, 1.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
    pnOptions.add(jButton2,        new GridBagConstraints(3, 0, 1, 1, 1.0, 1.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
    pnOptions.add(jPanel3,       new GridBagConstraints(4, 0, 1, 2, 1.7, 1.7
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
    pnOptions.add(jPanel2,        new GridBagConstraints(1, 0, 1, 2, 1.0, 1.0
            ,GridBagConstraints.NORTHWEST, GridBagConstraints.NONE, new Insets(4, 4, 4, 4), 0, 0));
    jPanel2.add(jLabel4, null);
    jPanel2.add(spnTime, null);
    jPanel2.add(jLabel3, null);
    jPanel2.add(spnIncr, null);
    pnBlackCont.add(pnBlack, BorderLayout.CENTER);
    pnWhiteCont.add(pnWhite, BorderLayout.CENTER);
    pnWhite.setBackground(Color.BLACK);
    this.addKeyListener(new KeyAdapter() {
      public void keyTyped(KeyEvent e) {
        keyTypedEvent(e);
      }
    });
    jLabel5.setIcon(new ImageIcon("./imagenes/white_knight.jpg"));
    jLabel1.setIcon(new ImageIcon("./imagenes/black_kinght3.jpg"));
//    File f = new File("./sounds/bip.wav");
//    AudioClip a = Applet.newAudioClip(f.toURL());
//    a.loop();
  }

  /**
   * initChessTime
   */
  private void initChessTime() {
    pnBlack.setBackground(Color.black);
    spnTime.setBackground(Color.black);
    spnTime.setForeground(Color.yellow);
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
    if (whiteWin()) {
      player_white.finished();
      player_black.finished();
      JOptionPane.showMessageDialog(this, "White Win!!!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
    }
    else if (blackWin()) {
      //JOptionPane p = new JOptionPane("Black Win", JOptionPane.INFORMATION_MESSAGE, JOptionPane.OK_OPTION);
      //p.setVisible(true);
      player_white.finished();
      player_black.finished();
      JOptionPane.showMessageDialog(this, "Black Win!!!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
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
  GridLayout gridLayout3 = new GridLayout();
  JSpinner spnIncr = new JSpinner();
  JLabel jLabel3 = new JLabel();
  JSpinner spnTime = new JSpinner();
  JLabel jLabel4 = new JLabel();

  void jButton1_actionPerformed(ActionEvent e) {
    enableAll(false);
    this.requestFocus(true);
    prepared_game();
    active_white = false;
    //change_player(true);
  }

  private void change_player(boolean white) {
    if (white){
      player_white = new ChessTime(player_white);
      active_white = true;
      player_white.arranca();
      player_white.start();
    }
    else{
      player_black = new ChessTime(player_black);
      active_white = false;
      player_black.arranca();
      player_black.start();
    }
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
    jLabel3.setEnabled(b);
    jLabel4.setEnabled(b);
  }

  void jButton2_actionPerformed(ActionEvent e) {
    player_black.finished();
    player_white.finished();
    enableAll(true);
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
    player_white.addTimeOverListener(new TimeOverListener() {
      public void timeOver() {
        time_over = true;
        game_state = WHITE_WIN;
        game_over_action();
      }
    });
    player_black.addTimeOverListener(new TimeOverListener(){
      public void timeOver() {
        time_over = true;
        game_state = BLACK_WIN;
        game_over_action();
      }
    });
    player_white.addTimePulse(new TimePulseListener() {
      public void timePulseOver() {
//        player_white.setNotifyPulse(false);
        showTime(min1_white, min2_white, sec1_white, sec2_white, player_white, m_dec_white, m_uni_white, s_dec_white, s_uni_white);
//        player_white.setNotifyPulse(true);
      }
    }, 800);
    player_black.addTimePulse(new TimePulseListener() {
      public void timePulseOver() {
//        player_black.setNotifyPulse(false);
        showTime(min1_black, min2_black, sec1_black, sec2_black, player_black, m_dec_black, m_uni_black, s_dec_black, s_uni_black);
//        player_black.setNotifyPulse(false);
      }
    }, 800);
    showTime(min1_white, min2_white, sec1_white, sec2_white, player_white, m_dec_white, m_uni_white, s_dec_white, s_uni_white);
    showTime(min1_black, min2_black, sec1_black, sec2_black, player_black, m_dec_black, m_uni_black, s_dec_black, s_uni_black);
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


  public void keyTypedEvent(KeyEvent e){
    if (active_white){
      player_white.finished();
      change_player(false);
      active_white = false;
    }
    else{
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

  public boolean whiteWin() {
    return game_state == WHITE_WIN;
  }

  public boolean blackWin() {
    return game_state == BLACK_WIN;
  }

  private void showTime(JLabel min1, JLabel min2, JLabel sec1, JLabel sec2, ChessTime chessTime, int m_dec, int m_uni, int s_dec, int s_uni) {
    int m = chessTime.getMinutes();
    int s = chessTime.getSeconds();
    int new_m_dec = 0;
    if (m >= 10){
      new_m_dec = (m-m%10)/10;
      if (new_m_dec != m_dec){
        min1.setIcon(getNumberIcon(new_m_dec));
      }
    }
    else{
      min1.setIcon(CERO);
    }
    m_dec(new_m_dec);
    showTimeRemain(m%10, (s-s%10)/10, s%10, min1, min2, sec1, sec2, m_dec, m_uni, s_dec, s_uni);
  }

  private void m_dec(int new_m_dec) {
    if (active_white){
      m_dec_white = new_m_dec;
    }
    else{
      m_dec_black = new_m_dec;
    }
  }

  private void showTimeRemain(int min, int s1, int s2, JLabel min1, JLabel min2, JLabel sec1, JLabel sec2, int m_dec, int m_uni, int s_dec, int s_uni) {
    if (min == m_uni && s1 == s_dec && s2 == s_uni)
      return;
    if (min != m_uni) {
      min2.setIcon(getNumberIcon(min));
      m_uni(min);
    }
    if (s1 != s_dec) {
      sec1.setIcon(getNumberIcon(s1));
      s_dec(s1);
    }
    if (s2 != s_uni) {
      sec2.setIcon(getNumberIcon(s2));
      s_uni(s2);
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
}
