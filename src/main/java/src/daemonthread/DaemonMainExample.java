package daemonthread;


// 2020/09/02 lesson
public class DaemonMainExample {

    public static void main(String[] args) {

        int activecount = Thread.activeCount();
        Thread[] threads = new Thread[activecount];
        Thread.enumerate(threads);

        for(Thread ti : threads)
        {
            System.out.println("Name " + ti.getName());
            System.out.println("daemon " + (ti.isDaemon() ? "yes" : "No") ) ;
        }       System.out.println(activecount);
    }
}
