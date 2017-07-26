package snippet;

public class Snippet {
	/**
	 * Makes sure all garbage is cleared from the memory.
	 */
	public static void garbageCollect() {
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

