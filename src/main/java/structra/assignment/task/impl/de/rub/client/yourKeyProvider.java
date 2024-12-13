package structra.assignment.task.impl.de.rub.client;

import structra.assignment.framework.llm.KeyProvider;

public class yourKeyProvider implements KeyProvider {
    private String key = "structra-1343abnc-dGhpcyBpcyBub3Qgb3VyIGFwaSBrZXksIG5pY2UgdHJ5IHRobyA6KQ==";

    public yourKeyProvider() {

    }

    @Override
    public String getApiKey() {
        return key;
    }
}
