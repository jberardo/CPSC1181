
public class MemUsage
{
    /**
     * Returns the current memory use.
     * 
     * @return the current memory use
     */
    public static long getMemoryUse()
    {
        garbageCollect();
        garbageCollect();
        garbageCollect();
        garbageCollect();
        long totalMemory = Runtime.getRuntime().totalMemory();
        garbageCollect();
        garbageCollect();
        long freeMemory = Runtime.getRuntime().freeMemory();
        return (totalMemory - freeMemory);
    }
    
    /**
     * Makes sure all garbage is cleared from the memory.
     */
    private static void garbageCollect() {
        try {
            System.gc();
            Thread.sleep(200);
            System.runFinalization();
            Thread.sleep(200);
            System.gc();
            Thread.sleep(200);
            System.runFinalization();
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}