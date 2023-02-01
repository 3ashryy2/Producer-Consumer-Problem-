public class Prod extends Thread {

  buffer buf;


  public Prod( buffer buf) {
    this.buf = buf;

  }


  public void run() {

    for (int i = 1; i <= buf.get_sz(); i++) {
      buf.produce(i);
    }
  }
}
