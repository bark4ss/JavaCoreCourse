package completeablefeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class FeatureDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //https://vertex-academy.com/tutorials/ru/java-8-completablefuture/
        //https://dzone.com/articles/20-examples-of-using-javas-completablefuture
        //https://annimon.com/article/3462
        //https://www.callicoder.com/java-8-completablefuture-tutorial/
        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Rajeev";
        });

        System.out.println("Hello");

// Добавляем колбэк к Future, используя thenApply()
        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
            return "Привет," + name;
        });

        System.out.println(greetingFuture.get());
    }
}
