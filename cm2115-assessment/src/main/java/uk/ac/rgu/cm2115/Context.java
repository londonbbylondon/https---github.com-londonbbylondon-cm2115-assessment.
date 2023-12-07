package uk.ac.rgu.cm2115;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private static Context instance = null;
    private Map<String, Object> contextData;

    private Context() {
        contextData = new HashMap<>();
    }

    public static Context getInstance() {
        if (instance == null) {
            instance = new Context();
        }
        return instance;
    }

    public Object get(String key) {
        return contextData.get(key);
    }

    public void put(String key, Object value) {
        contextData.put(key, value);
    }
}