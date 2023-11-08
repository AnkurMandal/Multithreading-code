public class Main {
    /*
    1) extend thread
     */
//    public static class Messi extends Thread{
//        public void run(){
//            for(int i=0;i<5;i++){
//                System.out.println("Messi");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
//    }

    /*
    2) implementing the runnable interface
     */
    public static class Messi implements Runnable{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("Messi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Messi messi=new Messi();
        //1) extends Thread
//        messi.start();

        //2) implementing Runnable
        Thread t=new Thread(messi);
        t.start();

        for(int i=0;i<5;i++){
            System.out.println("Ronaldo");
            Thread.sleep(2000);
        }

    }
//    accured
}