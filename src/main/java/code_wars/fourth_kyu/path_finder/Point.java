package code_wars.fourth_kyu.path_finder;

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
