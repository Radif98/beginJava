package Lesson5.Seminar;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    Map<String, String> passport = new HashMap<>();

    public void addPassport(String id, String name) {
        passport.put(id, name);
    }

    public String seach(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key: passport.keySet()) {
            if (passport.get(key).equals(name)) {
                stringBuilder.append(key);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
