package generic;

public interface BaseDAO <T>{

    T getAllItems();
    boolean save(T entity);

}
