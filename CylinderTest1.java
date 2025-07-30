
package cylinder2;

 class Cylinder{
    
    private double radius;
    private double height;
    
    
    public Cylinder()
    {
        radius=height=1;
    }
    public Cylinder(int r,int h)
    {
        radius=r;
        height=h;
     
    }
    public double getRadius()
    {
      return radius;
    }
    public double getHeight()
    {
        return height;
    }
    public void setRAdius(double r)
    {
        radius=r;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    
}

 public class  Cylinder2 {

   
    public static void main(String[] args) {
         Cylinder c  = new Cylinder();
        c.setRAdius(5);
        c.setHeight(2);
        System.out.println("lidArea is:"+c.lidArea());
        System.out.println("total surface area is:"+c.totalSurfaceArea());
        System.out.println("voulume is:"+c.volume());
        System.out.println("circumference is:"+c.circumference());
        System.out.println("radius:"+c.getRadius());
        System.out.println("height:"+c.getHeight());
 
 
    }
    
}
