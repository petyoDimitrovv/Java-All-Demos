public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width ){
        this.setLength(length);
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setHeight(double height) {
        if (height <= 0){
            throw new IllegalStateException("Height cannot be zero or negative.");
        }
        this.height = height;
     }

    private void setLength(double length) {
        if (length <= 0){
            throw new IllegalStateException("Length cannot be zero or negative.");
        }
        this.length = length;
     }

    private void setWidth(double width) {
        if (width <= 0){
            throw new IllegalStateException("Width cannot be zero or negative.");
        }
        this.width = width;
     }



    public double calculateSurfaceArea(double width, double length, double height  ){
        return 2 *(length * width) +
                2 * (length * height) +
                2 * (width * height);
    }
    public double calculateVolume(double width, double length, double height  ){
        return width * length * height;
    }
    public double calculateLateralSurfaceArea(double width, double length, double height  ){
        return 2*(width * height) +
                2 * (length * height);
    }

}
