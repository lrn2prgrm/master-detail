package jarmandocordova.masterdetail.global.db;

/**
 * Created by jarma on 10/5/2016.
 */

public interface LocalCache {
    String LAST_BELATRIX_DATA = "LAST_BELATRIX_DATA";
    String LAST_ITEM_CLICKED = "LAST_ITEM_CLICKED";

    <T> void save(String key, T t);

    <T> T read(String key, T t);

    void delete(String key);
}
