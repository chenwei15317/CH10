class Caaa {
    private int num;

    // 建構元，設定num值
    public Caaa(int n) {
        num = n;
    }

    // 取得num值
    protected int get() {
        return num;
    }

    // 顯示printed from Caaa class
    public void display() {
        System.out.println("printed from Caaa class");
    }
}


//Cbbb，繼承自Caaa
class Cbbb extends Caaa {
    // 顯示num值
    public void show() {
        System.out.println("num=" + get());
    }

    // 建構元    呼叫父類別的建構元並設定 num 的值
    public Cbbb(int n) {
        super(n);
    }

    // 顯示printed from Cbbb class
    public void display() {
        System.out.println("printed from Cbbb class");
    }
}






public class hw10_9 {
    public static void main(String[] args) {
        Caaa bb = new Cbbb(2);  // 建立Cbbb物件並指派給Caaa參考變數
        bb.display();  // 呼叫 display()方法，會呼叫Cbbb中的版本
    }
}