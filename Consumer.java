import java.io.FileWriter;
import java.io.IOException;

public class Consumer extends Thread {

  buffer buf;



  public Consumer(buffer buf) {
    this.buf = buf;

  }

  public void run() {
    for (int i = 0; i < buf.get_sz(); i++) {
      int Prime = buf.consume();
      boolean flag = true;
      for (int j = 2; j < Prime / 2; j++) {
        if (Prime % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag&&Prime!=1) {

          System.out.println(Prime);

        }
      }
    }
}
