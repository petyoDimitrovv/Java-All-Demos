package PointRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

       Point2D leftBottom = new Point2D(coordinates[0], coordinates[1]);
       Point2D topRight = new Point2D(coordinates[2], coordinates[3]);

        Rectangle rectangle = new Rectangle(leftBottom, topRight);

        int n = Integer.parseInt(scanner.nextLine());

        while(n-- > 0) {
            coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            Point2D point2D = new Point2D(coordinates[0], coordinates[1]);

            boolean isContained = rectangle.contains(point2D);

            System.out.println(isContained);
        }

    }
}
