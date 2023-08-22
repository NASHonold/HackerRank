import java.util.ArrayList;
import java.util.List;

public abstract class Result {
    /* My solution here. Simple. Not Fancy. Works. */
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int bestCount = 0;
        int worstCount = 0;
        int min = scores.get(0);
        int max = scores.get(0);
        List<Integer> returnList = new ArrayList<Integer>();

        for (Integer score : scores) {
            if (score < min) {
                min = score;
                worstCount++;
            } else if (score > max) {
                max = score;
                bestCount++;
            }
        }
        returnList.add(bestCount);
        returnList.add(worstCount);

        return returnList;
    }
}
