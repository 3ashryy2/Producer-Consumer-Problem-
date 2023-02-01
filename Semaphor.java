public class Semaphor {

  protected int value = 0;

  protected Semaphor() {
    value = 0;
  }

  protected Semaphor(int initial) {
    value = initial;
  }

  public synchronized void P() {
    value--;
    if (value < 0) try {
      wait();
    } catch (InterruptedException e) {}
  }

  public synchronized void V() {
    value++;
    if (value <= 0) notify();
  }
}
