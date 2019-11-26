package code_wars.fourth_kyu.path_finder;

import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/path-finder-number-2-shortest-path/train/java">here</a>
 */
public class Finder2 {

    public static int pathFinder(String maze) {

        try {
            AStarPathFinder pathFinder = new AStarPathFinder(maze);
            List<Point> path = pathFinder.findPath();
            int size = path.size();
            return size == 0 ? -1 : size - 1;
        } catch (Exception e) {
            return -1;
        }
    }
}