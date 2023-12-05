package Chapter_12;

public class _03_PriorityExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            Thread thread = new _03_CalcThread("thread" + i);
            if (i != 10){
                thread.setPriority(Thread.MIN_PRIORITY);
            } else {
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
