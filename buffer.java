public class buffer {

  private int size;
  private int sz;
  private int store[];
  private int inptr = 0;
  private int outptr = 0;

  Semaphor spaces;
  Semaphor elements;

  public buffer(int size,int sz) {
    this.size = size;
    this.sz=sz;
    this.store = new int[size];
    spaces = new Semaphor(size);
    elements = new Semaphor(0);
  }

  public void produce(int value) {
    spaces.P();
    store[inptr] = value;
    inptr = (inptr + 1) % size;
    elements.V();
  }

  public int consume() {
    int value;
    elements.P();
    value = store[outptr];
    outptr = (outptr + 1) % size;
    spaces.V();
    int v = value;
    return v;
  }

  public int get_sz() {
    return sz;
  }
}
