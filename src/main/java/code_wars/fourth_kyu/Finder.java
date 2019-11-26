package code_wars.fourth_kyu;

import java.util.*;

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


class AStarPathFinder {

    private static final int straightMoveCost = 1;

    private Point initialPoint;
    private Point endPoint;
    private Point[][] field;
    private PriorityQueue<Point> openList;
    private Set<Point> closedList;

    /* First we initialize our maze.
    In this task the field is always square */
    AStarPathFinder(String maze) {
        this.openList = new PriorityQueue<>(Comparator.comparingInt(Point::getFValue));
        this.closedList = new HashSet<>();
        String[] rows = maze.split("\\n");
        this.field = new Point[rows.length][rows.length];
        this.initialPoint = new Point(0, 0, false);
        this.endPoint = new Point(rows.length-1, rows.length-1, false);
        for (int rowNumber = 0; rowNumber < rows.length; rowNumber++) {
            String row = rows[rowNumber];
            for (int columnNumber = 0; columnNumber < row.length(); columnNumber++) {
                Point point = new Point(rowNumber, columnNumber, row.charAt(columnNumber));
                point.calculateHeuristicValue(endPoint);
                field[rowNumber][columnNumber] = point;
            }
        }
    }

    List<Point> findPath() {
        openList.add(initialPoint);
        while (!openList.isEmpty()) {
            Point currentPoint = openList.poll();
            closedList.add(currentPoint);
            if (currentPoint.equals(endPoint)) {
                return getPath(currentPoint);
            } else {
                discoverSurroundings(currentPoint);
            }
        }
        return Collections.emptyList();
    }

    private List<Point> getPath(Point currentPoint) {
        List<Point> path = new ArrayList<>();
        path.add(currentPoint);
        Point parent;
        while ((parent = currentPoint.previousPoint) != null) {
            path.add(0, parent);
            currentPoint = parent;
        }
        return path;
    }

    private void discoverSurroundings(Point currentPoint) {
        discoverSurroundingsAbove(currentPoint);
        discoverSurroundingsAround(currentPoint);
        discoverSurroundingsBelow(currentPoint);
    }

    private void discoverSurroundingsAbove(Point currentPoint) {
        int currentRowNumber = currentPoint.y;
        int currentColumnNumber = currentPoint.x;
        int upperRowNumber = currentRowNumber - 1;
        if (upperRowNumber < 0) return; //skip if we are already on top row

        checkNode(currentPoint, currentColumnNumber, upperRowNumber, straightMoveCost);
    }

    private void discoverSurroundingsAround(Point currentPoint) {
        int currentRowNumber = currentPoint.y;
        int currentColumnNumber = currentPoint.x;

        if (currentColumnNumber - 1 >= 0) { //check if we can scan the point on the left
            checkNode(currentPoint, currentColumnNumber - 1, currentRowNumber, straightMoveCost);
        }
        if (currentColumnNumber + 1 < field[0].length) { //check if we can scan the point on the right
            checkNode(currentPoint, currentColumnNumber + 1, currentRowNumber, straightMoveCost);
        }
    }

    private void discoverSurroundingsBelow(Point currentPoint) {
        int currentRowNumber = currentPoint.y;
        int currentColumnNumber = currentPoint.x;
        int lowerRowNumber = currentRowNumber + 1;
        if (lowerRowNumber >= field.length) return; //skip if we are already on bottom row

        checkNode(currentPoint, currentColumnNumber, lowerRowNumber, straightMoveCost);
    }

    private void checkNode(Point currentNode, int col, int row, int cost) {
        Point adjacentNode = field[row][col];
        if (!adjacentNode.isObstacle && !closedList.contains(adjacentNode)) {
            if (!openList.contains(adjacentNode)) {
                adjacentNode.setPointData(currentNode, cost);
                openList.add(adjacentNode);
            } else {
                boolean changed = adjacentNode.isBetterPathFound(currentNode, cost);
                if (changed) {
                    // this is done to refresh the OpenList
                    openList.remove(adjacentNode);
                    openList.add(adjacentNode);
                }
            }
        }
    }
} //end of main logic class

class Point {

    int fValue;
    int gValue;
    int hValue;
    int x;
    int y;
    boolean isObstacle;
    Point previousPoint;

    Point(int y, int x, char c) {
        this.x = x;
        this.y = y;
        this.isObstacle = c == 'W';
    }

    Point(int y, int x, boolean isObstacle) {
        this.x = x;
        this.y = y;
        this.isObstacle = isObstacle;
    }

    void calculateHeuristicValue(Point finalPoint) {
        //we use such formula since diagonal movement is prohibited
        this.hValue = Math.abs(finalPoint.x - this.x) + Math.abs(finalPoint.y - this.y);
    }

    void setPointData(Point currentPoint, int cost) {
        this.gValue = currentPoint.gValue + cost;
        this.previousPoint = currentPoint;
        this.fValue = this.gValue + this.hValue;
    }

    boolean isBetterPathFound(Point currentPoint, int cost) {
        int gCost = currentPoint.gValue + cost;
        if (gCost < this.gValue) {
            setPointData(currentPoint, cost);
            return true;
        }
        return false;
    }

    int getFValue() {
        return fValue;
    }

    @Override
    public boolean equals(Object arg0) {
        Point other = (Point) arg0;
        return this.y == other.y && this.x == other.x;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}