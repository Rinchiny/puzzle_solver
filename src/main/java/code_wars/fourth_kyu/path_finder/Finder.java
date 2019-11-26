package code_wars.fourth_kyu.path_finder;

import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://www.codewars.com/kata/path-finder-number-1-can-you-reach-the-exit/train/java">here</a>
 */
public class Finder {

    public static boolean pathFinder(String maze) {

        try {
            AStarPathFinder pathFinder = new AStarPathFinder(maze);
            List<Point> path = pathFinder.findPath();
            return path.size() != 0;
        } catch (Exception e) {
            return false;
        }
    }
}