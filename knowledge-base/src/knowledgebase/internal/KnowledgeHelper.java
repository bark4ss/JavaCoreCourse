package knowledgebase.internal;

import java.util.Random;

public class KnowledgeHelper {
    private static final Random random = new Random();
    private static final String bankArea = "Банковская сфера, точно тебе говорю";
    private static final String stockExchangeArea = "Да ну, это ведь биржа";

    public static String obtainDomainKnowledge(String requirements) {
        return Math.random() > 0.5 ? bankArea : stockExchangeArea;
    }
}
