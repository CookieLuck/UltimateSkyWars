package me.CookieLuck.utils;

import cn.nukkit.utils.Config;

import java.util.Objects;

/**
 * @author lt_name
 */
public class Language {

    private final Config config;

    public Language(Config config) {
        this.config = config;
    }

    public String translateString(String key) {
        return this.translateString(key, new Object[]{});
    }

    public String translateString(String key, Object... params) {
        String string = this.config.getString(key, "§c Language reading error! ");
        if (params != null && params.length > 0) {
            for (int i = 1; i < params.length + 1; i++) {
                string = string.replace("%" + i, Objects.toString(params[i-1]));
            }
        }
        return string;
    }


}
