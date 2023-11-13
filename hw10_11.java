//CShape
class CShape {
    public double area() {
        return 0.0;                     //預設面積0.0
    }
}

//CCircle繼承自CShape
class CCircle extends CShape {
    private double radius;

    //，設定圓半徑
    public CCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;                    // 計算圓形的面積
    }
}

//CSquare繼承自CShape
class CSquare extends CShape {
    private double side;

    //設定正方形邊長
    public CSquare(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;                     // 計算正方形面積
    }
}

//CTriangle繼承自CShape
class CTriangle extends CShape {
    private double base;
    private double height;

    //設定三角形底和高
    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;                     // 計算三角形面積
    }
}

public class hw10_11 {
    public static void main(String[] args) {
        //建立不同形狀的物件
        CCircle circle1 = new CCircle(5.0);
        CCircle circle2 = new CCircle(3.0);
        CSquare square1 = new CSquare(4.0);
        CSquare square2 = new CSquare(6.0);
        CTriangle triangle1 = new CTriangle(5.0, 8.0);
        CTriangle triangle2 = new CTriangle(3.0, 4.0);

        // 放入陣列中
        CShape[] shapes = {circle1, circle2, square1, square2, triangle1, triangle2};

        // 找出最大面積
        double maxArea = largest(shapes);
        System.out.println("最大面積為: " + maxArea);
    }

    // 找出陣列中最大的面積
    public static double largest(CShape[] shapes) {
        double maxArea = Double.MIN_VALUE;                  // 初始化最大面積為最小可能值
        for (CShape shape : shapes) {
            double area = shape.area();                     // 取得各形狀面積
            if (area > maxArea) {
                maxArea = area;                     //若面積大於最大面積，更新最大面積
            }
        }
        return maxArea; // 回傳最大面積
    }
}