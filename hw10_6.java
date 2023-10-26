class CTriangle {
    protected int base;
    protected int height;

    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}

class CData extends CTriangle {
    // 建立 CData 類別，繼承自 CTriangle

    public CData(int b, int h) {
        // CData 的建構元，初始化 base 和 height
        base = b;
        height = h;
    }

    public void area() {
        // 計算並顯示三角形的面積
        double triangleArea = 0.5 * base * height;
        show(); // 使用父類別的 show() 方法顯示 base 和 height
        System.out.println("area=" + triangleArea);
    }
}

public class hw10_6 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8);
        obj.area();
    }
}
