package shape;

public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        if(this.getPerimeter() != null){
            return getPerimeter();
        }
        Double param = this.height * 2 + this.width * 2 ;
        this.setPerimeter(param);
        return param;

    }

    @Override
    public Double calculateArea() {
        if (this.getArea() != null){
            return this.getArea();
        }
        Double area = this.height * this.width;
        this.setArea(area);
        return area;
    }
}
