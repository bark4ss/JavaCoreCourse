package knowledgebase;

import knowledgebase.internal.KnowledgeHelper;

public class Knowledge {
    public String obtain(String requirements) {
        String knowledge = KnowledgeHelper.obtainDomainKnowledge(requirements);
        System.out.println("Теперь я всеееее знаю");
        System.out.println(knowledge);

        return knowledge;
    }
}
