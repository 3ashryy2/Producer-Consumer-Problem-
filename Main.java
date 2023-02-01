
public class Main {

 
    public static void main(String[] args) throws InterruptedException {
        int n=100;
        int sz=15;
        buffer buffer = new buffer(sz,n);
        Prod P = new Prod(buffer);

        Consumer C = new Consumer(buffer);
        
        P.start();
        C.start();

        P.join();
        C.join();


        
       
    }
}

