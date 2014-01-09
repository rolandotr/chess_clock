package chess_clock;

/** comment 2006-Oct-28 Trujillo
 * Esta es la clase que representa el reloj. No significa que maneja los aunque
* podria hacerlo, esto deberias considerarlo.
 */
public class ChessTime extends Thread implements Cloneable{

  private int minutes, seconds, inc;
  private boolean go = false;
  private boolean finished = false;
  private long elapsed_time = 0;
  private long time;
  private int actual_minutes;
  private int actual_seconds;
  private TimeOverListener listener_time_over;
  private TimePulseListener listener_time_pulse;

  private long tmp;

  private int ms_pulse_count = 0;
  int ms_missed = 0;
  private int ms_pulse;
  private boolean notify_pulse = true;

  public ChessTime(int minutes, int seconds, int inc) {
    super("ChessTime");
    if (minutes < 0) throw new IllegalArgumentException("minutes == "+minutes+" < 0");
    if (seconds < 0) throw new IllegalArgumentException("seconds == "+seconds+" < 0");
    if (inc < 0) throw new IllegalArgumentException("inc == "+inc+" < 0");
    this.minutes = minutes;
    this.seconds = seconds;
    actual_minutes = minutes;
    actual_seconds = seconds;
    this.inc = inc;
    //super.setPriority(Thread.NORM_PRIORITY-2);
  }

  public ChessTime(ChessTime t){
    actual_minutes = t.getMinutes();
    actual_seconds = t.getSeconds();
    this.minutes = actual_minutes;
    this.seconds = actual_seconds;
    this.inc = t.inc;
    this.elapsed_time = t.ms_missed;
    this.listener_time_over = t.listener_time_over;
    this.listener_time_pulse = t.listener_time_pulse;
    this.notify_pulse = t.notify_pulse;
    this.ms_pulse_count = t.ms_pulse_count;
    this.ms_missed = t.ms_missed;
    this.ms_pulse = t.ms_pulse;
  }

  public void arranca() {
    go = true;
    seconds += inc;
    minutes += seconds/60;
    seconds = seconds%60;
    time = System.currentTimeMillis();
    computeActualTime();
    listener_time_pulse.timePulseOver();
  }

  public void para() {
    go = false;
  }

  public int getMinutes() {
    return actual_minutes;
  }

  public int getSeconds() {
    return actual_seconds;
  }


  public void run() {
    while (!finished){
      if (go){
        tmp = System.currentTimeMillis();
        elapsed_time += tmp-time;
        if (ms_pulse_count >= ms_pulse){
          if (notify_pulse) listener_time_pulse.timePulseOver();
          ms_pulse_count = ms_pulse_count - ms_pulse;
        }
        else{
          ms_pulse_count += tmp-time;
        }
        time = tmp;
        computeActualTime();
      }
      try {
        sleep(100);
      } catch (InterruptedException ex) {
      }
    }
  }

  private void computeActualTime() {
    int s = (int)(elapsed_time/1000);
    ms_missed = (int)(elapsed_time%1000);
    int m = (s/60) + ((seconds < s%60)?1:0);
    s = s%60;
    actual_seconds = (seconds < s)?60-s+seconds:(seconds - s);
    actual_minutes = minutes - m;
    if (actual_minutes <= 0 && actual_seconds <= 0){
      actual_minutes = 0;
      actual_seconds = 0;
      if (listener_time_over != null) listener_time_over.timeOver();
      finished = true;
    }
  }

  public Object clone(){
    return new ChessTime(minutes, seconds, inc);
  }

  public void addTimeOverListener(TimeOverListener list){
    assert(list != null) : "assert(list != null)";
    listener_time_over = list;
  }


  public void addTimePulse(TimePulseListener list, int ms){
    assert(list != null) : "assert(list != null)";
    ms_pulse = ms;
    listener_time_pulse = list;
  }

  public void finished() {
    finished = true;
  }

  /**
   * getIncr
   *
   * @return int
   */
  public int getIncr() {
    return inc;
  }


  public void setNotifyPulse(boolean b) {
    notify_pulse = b;
  }

}
