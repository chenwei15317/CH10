// 定義父類別 Caaa
class Caaa {
    public int num1; // 整數成員變數 num1
    public int num2; // 整數成員變數 num2
}

// 子類別 Cbbb
class Cbbb extends Caaa {
    // 設定 num1 和 num2
    public void set_num(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    // 顯示 num1 和 num2
    public void show() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

// 主類別
public class hw10_1 {
    public static void main(String[] args) {
        // 創建 Cbbb 類別的實例 bb
        Cbbb bb = new Cbbb();

        // 使用 set_num 方法設定 num1 和 num2 的值
        bb.set_num(5, 10);

        // 使用 show 方法顯示 num1 和 num2 的值
        bb.show();
    }
}
