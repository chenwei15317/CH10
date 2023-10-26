// 定義父類別 Caaa
class Caaa {
    public int num1; // 整數成員變數 num1
    public int num2; // 整數成員變數 num2

    // 沒有引數建構元，將 num1 和 num2 設定為 1
    public Caaa() {
        num1 = 1;
        num2 = 1;
    }

    // 有引數建構元，設定 num1 為 a，num2 為 b
    public Caaa(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // 顯示 num1 和 num2
    public void show() {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

// 子類別 Cbbb
class Cbbb extends Caaa {
    // 有引數建構元，呼叫父類別建構元以設定 num1 和 num2
    public Cbbb(int a, int b) {
        super(a, b);
    }
}

// 主類別
public class hw10_3 {
    public static void main(String[] args) {
        // 創建 Caaa 類別的實例 a1，使用無引數建構元
        Caaa a1 = new Caaa();
        System.out.println("a1: ");
        a1.show();

        // 創建 Caaa 類別的實例 a2，使用有引數建構元
        Caaa a2 = new Caaa(3, 4);
        System.out.println("a2: ");
        a2.show();

        // 創建 Cbbb 類別的實例 b1，使用有引數建構元
        Cbbb b1 = new Cbbb(7, 8);
        System.out.println("b1: ");
        b1.show();
    }
}
