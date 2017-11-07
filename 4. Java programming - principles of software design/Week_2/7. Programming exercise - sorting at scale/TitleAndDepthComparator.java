
import java.util.*;
/**
 * Sorts earthquakes by title first and breaks ties by depth.
 * 
 
 */
public class TitleAndDepthComparator implements Comparator <QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        int value = q1.getInfo().compareTo(q2.getInfo());  // a String method
        if (value == 0) {
            return Double.compare(q1.getDepth(), q2.getDepth());
        }
        return value;
    }
}
