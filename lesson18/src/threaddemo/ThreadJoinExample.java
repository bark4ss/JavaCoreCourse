package threaddemo;

import threaddemo.model.RThread;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RThread(), "t1");
        Thread t2 = new Thread(new RThread(), "t2");
        Thread t3 = new Thread(new RThread(), "t3");

        t1.start();

        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //стартуем второй поток только после 2-секундного ожидания первого потока (или когда он умрет/закончит выполнение)
        t2.start();


        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //стартуем 3-й поток только после того, как 1 поток закончит свое выполнение
        t3.start();

        //даем всем потокам возможность закончить выполнение перед тем, как программа (главный поток) закончит свое выполнение
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Все потоки отработали, завершаем программу");
    }
}

