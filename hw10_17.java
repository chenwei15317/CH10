class Car {
    protected String owner;                 //車主姓名
    protected String id;                    //車牌號碼

    // 顯示姓名和號碼
    void show() {
        System.out.println("車主姓名:" + owner);
        System.out.println("車牌號碼:" + id);
    }



    //初始化姓名和號碼
    public Car(String own, String s) {
        owner = own;
        id = s;
    }
}



//CColor繼承自Car
class CColor extends Car {
    private String color;               //車身顏色

    //初始化姓名、號碼和顏色
    public CColor(String own, String s, String c) {
        super(own, s);              // 呼叫父類別的建構元
        color = c;
    }




    // 顯示姓名、號碼和顏色
    public void show() {
        super.show();           // 呼叫父類別的show()
        System.out.println("車身顏色" + color);
    }
}







public class hw10_17 {
    public static void main(String[] args) {
        // 建立CColor物件，設定姓名、號碼和顏色
        CColor mycar = new CColor("Riaan", "A1-235", "Black");
        mycar.show(); // 顯示車子的資訊
    }
}