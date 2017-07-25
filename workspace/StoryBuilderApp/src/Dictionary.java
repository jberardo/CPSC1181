import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Dictionary
{
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Map<String,String> dictionary = new HashMap<>();

    public void set(String key, String value)
    {
        readWriteLock.writeLock().lock();

        try
        {
            dictionary.put(key, value);
        }
        finally
        {
             readWriteLock.writeLock().unlock();
        }
    }
 
    public String get(String key)
    {
        readWriteLock.readLock().lock();
        try
        {
            return dictionary.get(key);
        }
        finally
        {
            readWriteLock.readLock().unlock();
        }
    }
 
    public String[] getKeys() {
        readWriteLock.readLock().lock();

        try
        {
            return (String[]) dictionary.keySet().toArray();
        }
        finally
        {
            readWriteLock.readLock().unlock();
        }
    }
    public static void main(String[] args)
    {
        Dictionary dictionary = new Dictionary();

        dictionary.set("java",  "object oriented");
        dictionary.set("linux", "rules");

        Writer writer  = new Writer(dictionary, "Writer");
        Reader reader1 = new Reader(dictionary ,"ReaderOne");
        Reader reader2 = new Reader(dictionary ,"ReaderTwo");
        Reader reader3 = new Reader(dictionary ,"ReaderThree");
        Reader reader4 = new Reader(dictionary ,"ReaderFour");

        writer.start();
        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();
    }
}
