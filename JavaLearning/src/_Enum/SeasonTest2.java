package _Enum;

public class SeasonTest2 {
}

interface Info1{
    void show();
}

enum Season2 implements Info1{
    // 1. 必须在枚举类的开头声明多个对象，对象之间使用逗号隔开
    SPRING("春天","春暖花开"){
        public void show(){
            System.out.println("春天");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        public void show(){
            System.out.println("autumn");
        }
    },
    WINTER("冬天","冰天雪地"){
        public void show(){
            System.out.println("winter");
        }
    };

    // 2. 声明当前类的实例变量，使用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3. 私有化类的构造器
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    // 4. 提供gets方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
