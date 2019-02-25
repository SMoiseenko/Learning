package by.moiseenko;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ResourceManager {
    INSTANCE;
    private ResourceBundle resourceBundle;
    private final String resourceNameFile = "lang_res/apptextresources";

    private ResourceManager() {
        this.resourceBundle = ResourceBundle.getBundle(resourceNameFile, Locale.getDefault());
    }

    public void changeResource (Locale locale){
        resourceBundle = ResourceBundle.getBundle(resourceNameFile, locale);
    }

    public String getString (String key){
        return resourceBundle.getString(key);
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }
}
