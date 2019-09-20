package code_wars.sixth_kyu;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/cure-cancer/train/java">here</a>
 * Note that only one or none at all mutated cell is to be found.
 */
public class CureCancer {

    public static int[] mutationLocation(char[][] body) {

        if (body.length < 3)
            throw new RuntimeException("No bodies have less than 3 cells");
        int mutatedCellNumber = 0;
        int mutatedCharNumber = 0;

        /* We will start off by finding the `right` cell */
        char[] idealCell;
        char[] mutatedCell = null;
        /* If first two cells are identical, both are healthy */
        if (String.valueOf(body[0]).equals(String.valueOf(body[1]))) {
            idealCell = body[0];
            /* Continue search for the mutated one */
            for (int i = 2; i < body.length; i++) {
                String idealCellAsString = String.valueOf(idealCell);
                if (!String.valueOf(body[i]).equals(idealCellAsString)) {
                    mutatedCell = body[i];
                    mutatedCellNumber = i;
                    break;
                }
            }
            /* If all cell are identical the body is fully healthy */
            if (mutatedCell == null)
                return new int[]{};
        /* If first two cells are different, we need to find the one healthy amongst them */
        } else {
            if (String.valueOf(body[0]).equals(String.valueOf(body[2]))) {
                idealCell = body[0];
                mutatedCell = body[1];
                mutatedCellNumber = 1;
            } else {
                idealCell = body[1];
                mutatedCell = body[0];
                mutatedCellNumber = 0;
            }
        }

        /* At this point we have to only compare ideal cell to mutated one to find the ordinal of mutated char */
        for (int i = 0; i < idealCell.length; i++) {
            if (!Character.valueOf(idealCell[i]).equals(mutatedCell[i])) {
                mutatedCharNumber = i;
            }
        }

        return new int[]{mutatedCellNumber, mutatedCharNumber};
    }

}