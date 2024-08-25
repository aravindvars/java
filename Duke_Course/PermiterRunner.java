import edu.duke.*;

/**
 * Write a description of PermiterRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermiterRunner {
    
    public double getPermiter(Shape s){
    //Start with totale permiter = 0
    double totalPeri = 0;
    // Need to set the previous point as last point
    Point prevPt = s.getLastPoint();
    //Need to calculate the distance between 
    //the two points by looping through all the points
    for (Point currPt : s.getPoints()){
    double currDist = prevPt.distance(currPt);
    totalPeri = totalPeri + currDist;
    prevPt = currPt;
    }
        return totalPeri;    
    }
    
    public void testPerimeter() {
    FileResource fr = new FileResource();
    Shape s = new Shape(fr);
    double perimeter = getPermiter(s);
    System.out.println("Perimeter: " + perimeter);
}

public static void main (String args[]) {
PermiterRunner pr = new PermiterRunner();
pr.testPerimeter();
}
}


