## Java学习笔记

by：白白子



[TOC]



### Java语言的特点

#### 面向对象

- 基本概念：类class、对象obj
- 三大特征：封装、继承、多肽

#### 健壮性

- 去掉C/C++的指针，内存申请与释放，提供相对安全的内存管理和访问机制

#### 跨平台性

- 通过Java编写的程序可以在不同的系统平台上运行
- 原理：通过JVM



### Java语言的环境搭建

#### JDK: Java Developer Kit

包含Java开发工具和JRE

#### JRE: Java Runtime Environment

包含JVM和Java SE 标准类库



### Java基本语法01：变量与运算符

#### 关键字keyword与保留字reserved word

- Keyword：被Java语言赋予了特殊含义，用作专门用途的字符串
- 关键字所有字母都是==小写==的

用于定义数据类型的关键字：

| class   | interface | enum  | byte   | short |
| :------ | :-------- | ----- | ------ | ----- |
| int     | long      | float | double | char  |
| boolean | void      |       |        |       |

用于定义流程控制的关键字：

| if     | else | switch | case  | default  |
| :----- | ---- | ------ | ----- | -------- |
| while  | do   | for    | break | continue |
| return |      |        |       |          |

用于定义访问权限修饰符的关键字：

| private | Public | Protected | 缺省 |
| ------- | ------ | --------- | ---- |

- Reserved Word：现有Java尚未使用，在以后的版本可能会作为关键字使用 goto/const

#### 标识符Identifier

- Java对各种变量、方法、类等要素命名时使用的字符序列成为标识符（凡是可以自己起名的地方都是标识符）

```java
/*
标识符的使用
1. 标识符：凡是可以自己起名的地方都是标识符
	 比如：类名、变量名、方法名、接口名、包名....

2. 标识符的命名规则
>	由26个英文字母大小写，0-9 ，_或 $ 组成
>	数字不可以开头。
>	不可以使用关键字和保留字，但能包含关键字和保留字。
>	Java中严格区分大小写，长度无限制。
>	标识符不能包含空格。
*/
class IdentifierTest{
  public static void main(String[] args) {
    
  }
}
```



- Java中的名称命名规范
  - 包名：多单词组成时所有字母都小写：xxxyyyzzz
  - 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
  - 变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
  - 常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

#### 变量

- 内存中的一个存储区域
- 该区域的数据可以在同一类型范围内不断变化
- 是程序中最基本的存储单元，包含==变量类型、变量名和存储的值== (<==强类型)
- 变量的作用：用于在内存中保存数据
- 使用变量需要注意：
  - ==Java中每个变量必须先声明，后使用==
  - 使用变量名来访问这块区域的数据
  - 变量的作用域：其定义所在的一对{ }内
  - 变量只有在其作用域内才有效
  - 同一个作用域内，不能定义重名的变量

- 变量类型
  - 变量按照==数据类型==来分
    - 基本数据类型 Primitive Type, 共8种
      - 数值型
        - 整数类型 byte, short, int, long
        - 浮点数类型 float, double
      - 字符型 char(character)
      - 布尔型 boolean
    - 引用数据类型 Reference Type，==引用数据类型初始化需要使用new==
      - 类 class <== ==字符串 String==在这里
      - 接口 interface
      - 数组 array []
  - 变量按照在类中声明位置来分
    - 成员变量
    - 局部变量
- 整数类型: byte, short, int, long
  - Java中整型常量默认为int
  - 声明long必须后面加“l”
  - 变量通常为int，除非不足以表示较大的数，才使用long

```java
short s1 = 128;
int i1 = 1234;
long l1 = 4623786497126479126L;
```

<img src="./JavaMDImage/整数类型.png" alt="整数类型" style="zoom:33%;" />

- 浮点数类型：float, double
  - float:单精度，尾数可以精确到7位有效数字。很多情况下，精度很难满足需求
  - double:双精度，精度是float的两倍。通常采用此类型
  - ==Java 的浮点型常量默认为double型，声明float型常量，须后加‘f’或‘F’==

```java
float f1 = 12.3F; // 编译后不出现F
double d1 = 123.1; // 通常用double不用float
```

<img src="./JavaMDImage/浮点数类型.png" alt="浮点数类型" style="zoom:33%;" />

- 字符类型：char

  - 1字符 = 2bytes = 16bits

  - 字符串内部只能写==一个字符==

  - ```java
    char c1 = 'a'; // 只能写一个字符
    ```

  - 转义字符：“\\", 将其后的字符转变为特殊字符型常量(反转义：\\\n ==> 输出\\n)

  - Unicode编码集：\uxxxx

  - ```java
    char c2 = '\n'; // 换行符
    char c3 = '\u0043'; // Unicode
    ```

![转义字符](./JavaMDImage/转义字符.jpg)

- 布尔类型：Boolean

  - 用来判断逻辑条件，只有true和false

  - ```java
    boolean bb1 = true;
    boolean bb2 = false;
    ```

  - 布尔型变量==没有null==

- 基本数据类型转换(前提：不包含boolean类型)

  - 自动类型提升：：容量小的类型自动转换为容量大的数据类型

    - <img src="./JavaMDImage/自动类型提升.png" alt="自动类型提升" style="zoom: 50%;" />

    - Example：

      - ```java
        byte b1 = 2;
        int i1 = 129;
        byte b2 = b1 + i1; // 编译不通过，因为int容量大于byte
        
        int i2 = b1 + i1;
        long l1 = b1 + 11;
        float f = b1 + i1;
        
        short s1 = 123;
        double d1 = s1;
        System.out.println(d1); // 123.0
        
        //********************************
        char c1 = 'a'; // a = 97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4); // 107
        ```

  - 强制类型转换：自动类型提升的逆运算

    - 强制类型转换可能会导致精度损失

    - Example

      - ```java
        double d1 = 12.3;
        int i1 = d1; // 此时必须使用强转符
        int i1 = (int)d1; // 截断操作
        System.out.println(i1); // 12 ->损失精度
        ```

  - 特殊情况：编码情况

    - ```java
      // 编码情况1
      long l = 123213;
      System.out.println(l);
      // 编译失败：过大的整数
      // long l1 = 4678164712647912647891264791;
      // 应该使用：
      long l1 = 4678164712647912647891264791L;
      
      float f1 = 12.3; // 编译错误
      float f1 = (Float)12.3;
      
      // 编码情况2
      // 整数型常量默认是int
      byte b = 12;
      byte b1 = b + 1; // 编译错误，将byte和int相加
      ```

- 字符串类型：String

  - ==不是基本数据类型==，而是引用数据类型

  - 声明String类型变量时，使用一对==双引号” “==

  - ```
    String str = "Hello World";
    ```

  - String可以和8种基本数据类型做运算，且运算只能是连接运算‘+’，运算结果也是String类型

  - ```java
    int number = 1001;
    String numberStr = "学号：";
    String info = numberStr + number; // Info的类型是String
    ```

字符串练习1：

```java
char c = 'a'; // a = 97
int num = 10;
String str = "hello";
System.out.println(c + num + str); // 107hello, 因为c和num先做加法，之后整体和str连接
System.out.println(c + str + num); // ahello10
```

字符串练习2：希望控制台输出：```* *```

```java
System.out.println("*	*");
System.out.println('*' + '\t' + '*'); // 93 做加法运算
System.out.println('*' + "\t" + '*');
System.out.println('*' + '\t' + "*"); // 51* 做加法之后连接
System.out.println('*' + ('\t' + "*"));
```



#### 运算符

- 位运算符

  - <img src="./JavaMDImage/位运算符.png" alt="位运算符" style="zoom:33%;" />

- 三元运算符

  - 格式：`(条件表达式)? 表达式1:表达式2;`, 如果条件位true，运算后结果位表达式1，反之则为2

  - 条件表达式的结果为布尔类型

  - ```java
    int m = 12;
    int n = 5;
    int max = (m > n)? m : n; // max的类型只要提升就可以 例如 double max = (m > n)? 1 : 2.0;
    System.out.println(max);
    ```

#### 程序流程控制

- 顺序结构：程序从上到下逐行执行，中间没有任何判断和跳转
- 分支结构：根据条件，选择性的执行某段代码
  - `if ... else`
  - `switch ... else`
- 循环结构：根据循环条件，重复性的执行某段代码
  - `while`
  - `do ... while`
  - `for`
- 特殊关键字：break和continue
  - break使用在switch-case或者循环结构中
    - 结束当前循环，跳出当前循环体
  - continue使用在循环结构中
    - 结束当次循环，跳至下次循环



### 分支语句（条件语句）

- If-else结构

  - if语句的三种格式
    - `if(条件为true){...}; //仅只有在条件位True的时候才会执行`
    - `if(条件为true){.操作1.}; else{.操作2.}; //如果位true会执行操作1；否则执行操作2`
    - `if(条件为true){.操作1.}; else if(条件为true){.操作2.} else{.操作3.};`

- 键盘读取 Scanner

  - 具体步骤：
    1. 导入包：`import java.util.Scanner;`
    2. Scanner的实例化(创建实例对象)：`Scanner <name> = new Scanner(System.in);`
    3. 调取Scanner类的相关方法，来获取指定类型的变量

- Switch-case结构

  - ```java
    switch(表达式){
      case 常量1:
        执行语句1;
      case 常量2:
        执行语句2;
      default:
        执行语句n;
    }
    ```

  - 关键字break：一旦遇到此关键字就调出switch结构
  - 表达式只能为以下类型：byte, short, char, int, 枚举类型, String类型



### 循环结构

- 循环条件的四要素
  1. 初始化条件
  2. 循环条件 ==> 是boolean类型
  3. 循环体
  4. 迭代条件

- 循环语句分类
  - for循环
    - 
  - while循环
    - 
  - do-while循环
    - 先执行再判断，且最少执行一次才会跳出循环体

### 数组 Array

- 数组的==特点==：
  - 数组是有序排列的
  - 是多个相同类型的数据按照一定顺序排列的集合，并通过编号的方式进行统一管理
  - 数组的本身是引用数据类型，数组中的元素可以为任意数据类型
  - 创建数组的对象会在内存中开辟一==整块连续的==空间（不连续的为链表）
  - 数组的长度一旦确定不可更改
- 数组的分类
  - 按照维数：一维数组，二维数组....
  - 按照数组元素类型：基本数据类型，引用数据类型

#### 一维数组

1. 一维数组的声明和初始化

   - ```java
     // 静态初始化：数组的初始化和赋值同时进行
     int[] ids; //一维数组的声明
     ids = new int[]{1001,1002,1003,1004}; //一维数组的初始化，因为是引用数据类型，所以是用new进行初始化
     // 动态初始化：数组的初始化和赋值不同时进行
     String[] names = new String[5]; // 要给出长度为5
     int[] arr01 = new int[100];
     // 数组一旦初始化完成其长度就确定了
     ```

2. 如何调用数组的指定位置的元素

   - 通过角标/索引的方式进行调用
   - 数组的角标从0开始，到数组的长度-1结束(ArrayLenth - 1)，例如长度为4，只有0 1 2 3 4 这五个元素

3. 如何获取数组的长度

   - 借助数组的属性：length

   - ```java
     String[] names = new String[5];
     int length = names.length;
     ```

4. 如何遍历数组

   - 借助循环结构

   - ```java
     for(int i = 0; i < names.length; i++) {
     	System.out.println(names[i]);
     }
     ```

5. 数组元素的默认初始化值

   - Byte, short, int, long 默认初始化值都是0
   - Float, double 默认初始化值都是0.0
   - Char 默认初始化值是0或者'\u0000' (不是‘0’)
   - Boolean 默认初始化值是false
   - 引用数据类型String 默认初始化是null

6. 数组的内存解析

<img src="./JavaMDImage/内存.png" alt="内存" style="zoom:25%;" />

- 放在方法中的变量叫做局部变量

#### 数组中涉及到的常见算法(p158-p173)

1. 数组元素的复制

---

## 面向对象编程

例子：人把大象装进冰箱

面向过程：1. 把冰箱打开  2. 抬起大象塞进冰箱  3. 关闭冰箱门

面向对象：

```Java
人{
	打开(冰箱){
		冰箱.开开();
	}
	
	抬起(大象){
		大象.进入(冰箱);
	}
	关闭(冰箱){
		冰箱.关闭();
	}
}

冰箱{
	开开(){};
	关闭(){};
}

大象{
	进入(冰箱){};
}
```



- 面向对象(Object Oriented Programming)：将功能封装进对象，强调具备了功能的对象，以class/object为最小单位，考虑谁来做

- 三大特征
  - 封装 Encapsulation
  - 继承 Inheritance
  - 多态 Polymorphism

- 面向过程(Procedure Oriented Programming)：强调的是功能行为，以函数为最小单位，考虑怎么做

- ==面向对象分析方法分析问题的思路和步骤==
  - 根据问题需要，选择问题所针对的现实世界中的实体
  - 从实体中寻找解决问题相关的属性和功能，这些属性和功能就形成了概念世界中的类
  - 把抽象的实体用计算机语言进行描述，形成计算机世界中类的定义。即借助某种程序语言，把类构造成计算机能够识别和处理的数据结构
  - 将类实例化成计算机世界中的对象。对象是计算机世界中解决问题的最终工具
- 核心：类和对象(==重点：类的设计==)
  - 类 class：对一类事物的描述，是抽象的、概念上的定义
    - 属性field：类中的成员变量 ==属性=成员变量=field=域=字段==
    - 方法method：类中的成员方法 ==方法=成员方法=函数=method==
  - 对象 object：是实际存在的该类事物的每个个体，也成为实例(instance)
  - 例子：类=抽象概念的人；对象=实实在在的某个人

Example01：定义Person类

```java
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;
    //方法
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void talking(String language){
        System.out.println("talking in " + language);
    }
}
```

Example02：创建Person类的对象

```Java
public class PersonTest {
    public static void main(String[] args) {
        // 创建Person类的对象
        Person p1 = new Person();
        // 调用对象的属性: 对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        // 调用对象的方法: 对象.方法
        p1.eat();
        p1.sleep();
        p1.talking("Chinese");
        // *************************************************************
        Person p2 = new Person();
        System.out.println(p2.name); // 未给p2赋值，所以默认为null
        // *************************************************************
        // 将p1变量保存的对象的地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);
    }
}
```

- [Line14-15] 如果创建了一个class的多个对象，则每个对象都独立拥有一套class的属性 ==> 非static
- [Line18] 将p1变量保存的对象的地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体

#### 内存解析

<img src="./JavaMDImage/内存解析.jpg" alt="内存解析"  />

- 堆(Heap)：此内存区域的唯一目的就是==存放对象实例==，几乎所有的对象实例都在这里分配内存。这一点在Java虚拟机规范中的描述是：所有的对象实例以及数组都要在堆上分配。
- 栈(Stack)：是指==虚拟机栈==。虚拟机栈用于==存储局部变量==等。局部变量表存放了编译期可知长度的各种基本数据类型(boolean, byte, char, short, int, float, long, double), 对象引用(reference类型，它不等同于对象本身，是对象在堆内存的首地址)。 方法执行完，自动释放。
- 方法区(Method Area)：用于存储已被虚拟机加载的==类信息、常量、静态变量、即时编译器编译后的代码==等数据。



### 属性与局部变量

```java
class User{
	// 属性or成员变量
	String name;
	int age;
	boolean isMale;
	
	public void talk(String language){ //language:形参，属于局部变量
	System.out.println("我们使用 " + language);
	}
  
  public void eat(){
    String food = "烙饼"; //局部变量
    System.out.println("北方人喜欢吃 " + food);
  }
}
```



- 成员变量(属性) vs 局部变量
  - 相同点：
    - 定义变量的格式：`数据类型 变量名 = 变量值`
    - 先声明，后使用
    - 变量都有其对应的作用域
  - 不同点
    - 在类中声明的位置的不同
      - 属性：直接定义在class的一对{}中
      - 局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部
    - ==权限修饰符==的不同
      - 属性：在声明属性时指明其权限，使用权限修饰符
        - **封装性：**常用的权限修饰符：`private, public, protected or 省略`
        - 体现结构被调用性的可见性的大小
      - 局部变量：不可以使用权限修饰符
    - 默认初始化值不同
      - 属性：有初始化值，根据其类型
        - 整型(byte, short, int, long)：默认初始化值是0
        - 浮点型(float, double)：默认初始化值是0
        - 字符型(char)：默认初始化值是0 or ('\u0000')
        - 布尔型(boolean)：默认初始化值是false
        - ==引用数据类型==(class, interface, array)：null
      - 局部变量：没有默认初始化值(在调用局部变量之前一定要显示初始化值)
        - 形参在调用时才会初始化`user.talk("Japanese");`
    - 在内存中加载的位置不同
      - 属性：加载到堆空间Heap (非Static)
      - 局部变量：加载到栈空间Stack (非Static)

- 类中方法的声明和使用

  - 方法method：描述class应该具有的功能

    - Example:

      - Math类：`sqrt(), random(), ...`
      - Scanner类：`nextXxx()...`
      - Arrays类：`sort(), binarySearch(), toString(), equals()...`

    - Example：

      - ```java
        // void: 没有返回值
        public void eat(){}
        public void sleep(int hour){}
        // String: 需要返回一个字符串
        public String getName(){}
        public String getNation(String nation){}
        ```

  - ==method声明方式==
    - `权限修饰符+返回值类型+方法名(形参列表){ 方法体; }`
    -   `public   String  getNation(String nation){}`
    - 特殊修饰方法：`static, final, abstract`
  
  - 需要注意的几点
  
    - 关于权限修饰符：(Java规定的四种修饰符`private, public, protected or 省略`)
      - private私有变量：
    - 关于返回值类型：
      - 如果方法有返回值，则==必须==在方法声明时提供返回值的类型，同时，==方法中需要使用return关键字来返回指定类型的变量或者常量==
      - 如果方法没有返回值，则方法声明时必须使用void，不需要使用return，return在void中表示结束方法 
  
    - 方法名：属于标识符，遵循标识符的规则和规范
  
    - 形参列表：方法可以不声明或声明1个或多个形参
      - 声明格式：`(数据类型1 形参1, 数据类型2 形参2)`
  
      - 什么时候该定义形参？按照UML Diagram
  
    - 方法体：方法功能的实现
  - return关键字的使用：
    - 适用范围：使用在方法体中
    - 作用
      1. 结束方法
      2. 针对于有返回值类型的方法：使用"return + 数据"方法，返回需要的数据
    - 注意点：return关键字后面不可以声明执行语句
  - method的使用
    - 可以调用当前class的属性以及方法
    - 特殊方法：方法A中调用方法A：递归方法



### “万事万物皆对象”

- 在Java中，都将功能、结构等封装到class中，通过class的实例化来调用具体的功能结构
- 在Java与其他语言交互时体现为class或者instance



### 匿名对象：在创建对象时没有显性赋值

```Java
new Phone().price = 1999; // price = 1999
new Phone().showPrice(); // output = 0
```

- 特征：匿名对象只能调用一次
- 匿名对象的使用：

```java
public static void main(String[] args){
  PhoneMall mall = new PhoneMall;
  mall.show(new Phone()); // ==>匿名对象的使用，可以用两次
}

class PhoneMall{
	public void show(Phone phone){
		phone.sendEmail();
		phone.playGame();
		}
}
```



### Example：自定义数组的工具类

```java
// Main Method
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[] {23, 18, 67, 8, 17, 38, 87, 76, 47, -6, -77};
        int max = util.getMax(arr);
        System.out.println("最大值是：" + max);

        System.out.println("排序前：");
        util.print(arr);

        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);

        System.out.print("Searching index: ");
        int index = util.getIndex(arr, -6);
        if (index > 0) {
            System.out.println("Find it!");
        } else System.out.println("Not find :(");
    }
}

// 自定义数组的工具类, class and method
public class ArrayUtil {

    // 求最大值
    public int getMax(int[] arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求最小值
    public int getMix(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求平均值
    public int getAve(int[] arr){
        return (getSum(arr) / arr.length);
    }

    // 反转数组
    public void reverse(int[] arr){
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i > 0; i--){
            result[j] = arr[i];
            j++;
        }
        arr = result;
    }

    // 复制数组
    public int[] copy(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // 数组排序
    public void sort(int[] arr){
        System.out.println("排好啦只是没写代码");
    }

    // 遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }
    }

    // 查找指定元素
    public int getIndex(int[] arr, int dest){
        for (int i = 0; i < arr.length; i++){
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
```



### ==Method Overload 重载方法==

- 在同一个类中，允许存在一个以上的同名方法，只要参数个数或者参数类型不同

```java
// 这两个method构成重载
public void reverse(int[] arr){}
public void reverse(String[] arr){}
```

- 相同点：class名称，method名称
- 不同点：参数类型不同，参数个数不同

Example：

```java
// 以下四个method构成重载
public void getSum(int i, int j) {}
public void getSum(double d1, double d2) {}
public void getSum(String s, int i) {}
public void getSum(int i, String s) {}

// 以下三个method与第一个不构成重载
// public int getSum(int i, int j) {return 0;}
// 
// public void getSum(int m, int n) {}
//
// private void getSum(int m, int n) {}
```

- 判断方法：跟method的权限修饰符(`public/private...`)，返回值类型(`int, double, void...`)，形参变量名(`(int i, int j)与(int m, int n)`)，以及方法体都没有关系
- Java选择重载方法符合自动类型提升

```java
public class OverLoadTest {
    public static void main(String[] args) {
        OverLoadTest test = new OverLoadTest();
        test.getSum(1, 2); // 自动选择1, 如果1被注释掉会选择2
    }

    public void getSum(int i, int j) {
        System.out.println("1");
    }

    public void getSum(double d1, double d2) {
        System.out.println("2");
    }

    public void getSum(String s, int i) {
        System.out.println("3");
    }

    public void getSum(int i, String s) {
        System.out.println("4");
    }
```

- 在通过对象调用方法时，如何确定要调用某一个同名方法？
  - 方法名 ==> 参数列表

### 可变个数形参的方法

在JDK5.0的时候加入了Varargs(Variable Numbers of Arguements)机制，允许==**直接定义能和多个实参相匹配的形参**==

Example：MethodArgsTest

```java
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12); // 匹配method1
        test.show("Hello"); // 匹配method2
        test.show("Hello", "World!"); //可变形参
    }
    
    public void show(int i) { }
    public void show(String s) { }
    // 可变形参
    public void show(String ... s){ }
    // 此方法与上面的方法不构成重载，编译器报错
    public void show(String[] strs){ }
}
```

- 当调用可变个数形参的方法时，传入的参数个数可以是0个、1个、2个或者多个
- 可变个数形参的方法，==与其他方法名相同，形参类型相同的非数组方法之间构成重载==
- 方法名相同但参数类型也相同的数组之间不构成重载

<img src="./JavaMDImage/可变个数形参.png" alt="可变个数形参" style="zoom: 50%;" />



### ==**方法参数的值传递机制**==

Example:

```java
public class ValueTransfer {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1; // 此时没有生成新对象, 只是把o1.orderId的地址给了o2, o1和o2都指向了堆空间的同一个实体
      
        System.out.println("o1 id:" + o1.orderId + "\n" + "o2 id:" + o2.orderId); 
// o1 id:1001
// o2 id:1001
        o2.orderId = 1002; 
        System.out.println("o1 id:" + o1.orderId + "\n" + "o2 id:" + o2.orderId);
// o1 id:1002
// o2 id:1002
    }
}

class Order{ int orderId; }
```

- 值传递机制

  - 如果参数是基本数据类型：此时实参赋给形参的是实参真实存储的数据值
  - ==**如果参数是引用数据类型：此时实参赋给形参的是实参存储数据的地址值**==
- 参数类型

  - 形参：方法定义时，声明的小括号内的参数 `public void aaa(int c)`

  - 实参：方法调用时，实际传递给形参的数据 `aaa(19)`

### 递归方法 Recursion

- 一个方法体内调用他自身
  - 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制

```java
// 计算从1到自然数n的和
public int getSum(int n){
	if(n == 1){
		return 1;
	} else {
		return n + getSum(n-1);
	}
}
```

### 面向对象的特征

#### 特征一：封装性

- 隐藏对象内部的复杂性，只对外公开简单的接口，便于外界调用，从而提高系统的可扩展性、可维护性
- **"高内聚，低耦合"**
  - 高内聚 ：类的内部数据操作细节自己完成，不允许外部干涉
  - 低耦合 ：仅对外暴露少量的方法用于使用
- 封装性的体现：
  1. `private`
  2. 不对外暴露的私有方法
  3. 单例模式 Singleton

Example: AnimalTest

```Java
package Day10;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 1;
        a.legs = 4; // 由于legs的权限是private，所以这里不可以直接赋值，必须使用给定的setLegs方法

        //a.legs = -4;
        a.setLegs(6);
        a.show();
    }
}

class Animal{
    String name;
    int age;
    private int legs; // 腿的个数, 这里是private权限
	
  // 对属性的复制
    public void setLegs(int legs) {
        if (legs >= 0 && legs % 2 == 0){
            this.legs = legs; //由于重名，这里的legs是method里的legs
        } else {
            this.legs = 0;
        }
    }
  // 对属性的获取
    public int getLegs(){
        return this.legs;
    }

    public void eat(){
        System.out.println("animal eat");
    }

    public void show(){
        System.out.println("name=" + name + ",age=" + age + ",legs=" + legs);
    }
}
```

- 当创建一个类的对象之后，使用“`对象.属性`”对对象的属性进行赋值，但是赋值操作会受到==属性的数据类型和存储范围的制约==，除此之外没有其他制约条件。

- ==在实际问题中，往往需要给属性赋值加入额外的限制条件==，这个条件就不能在属性声明时体现，只能通过method进行限制条件的添加(比如`setLegs(int l){ }`)
- 之后**避免用户再使用`对象.属性`的方式进行赋值，则需要在属性声明为私有的(`private`)****
- **将类的属性aaa私有化(`private`)的同时，需要提供公共(`public`)方法来获取(`getAaa`)以及设置(`setAaa`)此属性的值**

Example：提供关于属性age的get和set方法

```java
		public int getAge(){
        return age; }
    public void setAge(int a){
        age = a; }
```

#### 四种权限修饰符

**Java规定的四种权限修饰符(由小到大排列)：`private/缺省/protected/public`**

<img src="./JavaMDImage/四种权限修饰符.png" alt="四种权限修饰符" style="zoom:50%;" />



- 这四种权限都可以修饰class的内部结构(属性、方法、构造器、内部类)
- 缺省和public权限可以修饰类



### Java继承：面向对象的特征之二：inheritance 继承性

- 子类通过继承父类进行实现同样方法

- 继承性的**好处**

    - 减少代码的冗余，提高了代码的复用性
    - 便于功能的扩展
    - 为多态性的使用提供了前提

- 继承性的使用/格式

    - ```java
        class A extends B{  }
        ```

    - 类A：子类，派生类，subclass

    - 类B：父类，超累，superclass

    - 体现：一旦子类A继承父类B以后，子类A中就获取了B类中声明的结构（属性，方法）

    - 当父类的方法/属性变成private权限，子类是可以继承到的，需要调用get/set方法。只是因为封装性的影响，使得子类不能直接调用父类的结构而已

    - 除此之外，子类继承父类以后，还可以额外声明自己的属性与方法，实现功能的拓展

- 关于Java继承性的规定

    - 一个父类可以被多个子类继承
    - 单继承性：每一个类只能有一个父类
    - 子类直接继承的父类：直接父类。简介继承的父类：间接父类
    - 子类继承父类之后，就直接获取了父类以及所有间接父类的方法与属性

- Java ==Object类==
    - 如果没有显式声明一个类的父类的话，则此类集成于`java.lang.Object`
    - 并且所有的Java类都直接或者间接继承于`java.lang.Object`，所以所有的Java类都继承于`java.lang.Object`



### Java方法重写：Override/Overwrite

- 在子类中可以根据需要对父类中继承来的方法进行改造，也称为方法的重写。在执行程序时，子类的方法将覆盖父类的方法
    - 方法和形参列表必须一样
    - 重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名参数方法时，==实际调用的是子类重写父类的方法==
- 方法重写的规定（`权限修饰符+返回值类型+方法名(形参列表) [throws 异常]{ 方法体; }`）
    - 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同
    - 子类重写的方法的==权限修饰符不小于父类中被重写的方法的权限修饰符==
    - 子类不能重写父类中声明为private的方法
    - 返回值类型
        - 父类被重写方法是void，则子类的重写方法返回值也需要是void
        - 父类被重写方法是A类型（引用数据类型），则子类的重写方法返回值也需要是可以是==A类或者A类的子类==
        - 父类被重写方法是基本数据类型，则子类的重写方法返回值必须是相同的基本数据类型

- **如何区分方法的重载与重写？**
    - 重载同名不同参，重载同名同参



### Java多态性(Polymorphism)

- 如何理解多态性：理解为一个事物的多种形态

- Java中多态性的体现：父类的引用指向子类的对象

  - Example: `Person p = new Man()`

- 多态性的应用

  - ```
    多态性的应用: 虚拟方法调用
    在多态场景下，调用方法时：
    编译时看左边，即认为方法时左边声明的父类的类型的方法（被重写的方法）
    运行时看右边，即实际执行的是子类重写父类的方法
    ```

- 多态性的适用前提

  1. 要有类的继承关系
  2. 要有方法的重写

- 多态性的适用性：==只适用于方法，不适用于属性==，属性永远来自于父类

- 多态性的好处和弊端

  - 好处
    - 可以极大的减少了代码的冗余，不需要多次定义需要重载的方法
  - 弊端
    - 问题：`Person P2 = new Man()`
      - 针对创建的对象，在内存中是否加载了Man类中声明的特有属性和方法？ ==答案：加载了==
    - 问题：能不能直接调用`Man`中加载的特有方法和属性？ ==答案：不能==
  
- **向下转型/向上转型**

- `instanceof` 关键词的使用

  - ```
    // 向下转型的问题：类型转换异常(ClassCastException)
    // 格式：a instanceof A: 判断a是否是A的实例，
    // 如果 a instanceof A 返回 true, 则 a instanceof superA 也返回 true, 其中，A 是 superA 的子类
    ```



### 多态性的体现：Object类(java.lang.Object)

- java中预声明的类，如果没有显式声明其父类时，则默认继承`java.lang.Object`

- `java.lang.Object`是类层次结构的根类，是所有其他类的父类，每个类都使用`Object`作为超类

- Object类中声明的结构(属性和方法)等具有通用性

  - Object类中没有声明属性，重点是==使用Object中的方法==
  - Object类提供了一个空参的构造器

- Object类中的方法

  - 重点方法：`equals()`和`toString()`

  - 常用方法：`clone()`和`fanilize()`

    - `Fanilize()` 当GC要回收此对象时，调用这个方法，可以使对象被回收前进行某些操作

      - ```java
        @Override
        protected void fanilize() throws Throwable {
        	//这里是在被回收前执行的操作（例如在android关闭窗口之后下次重新打开可以保存关闭前的进程在文件中）
        }
        ```

      - 但是`fanilize()`可能会导致内部出现循环引用，导致此对象不能被回收（例如两个对象同时处于待关闭，但是两个对象在被关闭前指向了对方的堆空间中的null进行fanilize操作就会导致不能被回收）

      - 此方法在java8以后被弃用，但是依然可以用。


#### Obj类中的重点方法1：equals()方法

1. 适用性：任何引用数据类型都可以使用此方法

2. 方法定义：

   1. ```java
      public boolean equals(Object obj) {
              return (this == obj); //这里实际上是判断的两个对象的地址值是否相等
          }
      ```

3. 子类使用说明

   1. 自定义的类：在没有重写Object中equals()方法的情况下，调用的就是Object类中声明的equals()方法，==实际比较的是两个对象的地址值是否一致（而不是实际的值或者数值）==

   2. 对于像预定义的类(比如String, File, Date)：在Java 这些预定义的类中已经对Object类里的equals()方法进行了重写，所以实际比较的是实体内容是否一样，而不是地址值

   3. **重写equals()方法**

      - ```java
        // 手动实现重写
        @Override
        public boolean equals(Object obj){
            // 地址值如果一样就不需要比较了，因为指向的是同一个堆空间
            if (this == obj){
                return true;
            }
        
            if (obj instanceof User){
                User user = (User) obj;
                if (this.age == user.age && this.name.equals(user.name)){
                    return true;
                }
            }
            return false;
        }
        
        // intellij 自动重写
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
        
            User user = (User) o;
        
            if (age != user.age) return false;
            return Objects.equals(name, user.name);
        }
        ```

      - 在实际开发中，根据自定义的类，常常会判断两个对象是否equals，而此时主要是判断两个对象的属性值是否相等，所以需要重写equals方法，可以直接通过调用intellij的自动重写

      4. 如何区分 == 和 equals()

         - ‘==’ 是一个运算符
           - 适用范围：基本数据类型（判断数据值是否相等）和引用数据类型（比较两个引用变量的地址值是否相等/是否指向同一个对象实体）

         - equals() 是一个方法
           - 适用范围：只能使用在引用数据类型（包括数组）
           - 具体使用：对于类来说，重写equals和不重写的区别......

#### Obj类中的重点方法2：toString()方法

1. Object类中的toString()的定义

   1. ```java
      public String toString() {
              // 获取当前类中的对象的对象名+地址值(hashCode方法转换为16进制)
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
          }
      ```

2. 开发中的使用场景

   - 平时在调用`sout`的时候打印对象引用变量时，本质上调用的就是对象的toString()

3. 子类使用说明

   - ==自定义的类，在没有重写Object里的toString()方法的时候，默认返回是当前对象的地址值==
   - 预定义的类比如String, File, Date或者包装类等Object的子类，他们都重写了Object里面的toString，在调用toString的时候返回当前对象的实体内容(比如string就打印string的内容)

4. 开发中使用说明

   习惯上，在开发中对于自定义的类在调用toString()时，也希望现实其对象的实体内容，而非地址值，这时候就需要重写。



## 8 面向对象编程（高级）

#### 8.1 Static修饰成员变量与方法

- 如果想让一个成员变量被类的所有实例所共享，就用static修饰即可，成为类变量，可以修饰==属性，方法，代码块，内部类==，构造器除外。
- Static修饰属性
  - 对比静态变量和实例变量
    - 个数
      - `static` 静态变量：在内存空间中只有一份，被类的多个对象所共享
      - 实例变量：类的每一个实例或者变量都保存着一份实例变量
    - 内存位置
      - `static` 静态变量：
      - 实例变量：
    - 加载时机
      - `static` 静态变量：随着类的加载而加载，不需要创建实例，并且由于类只会加载一次，所以静态变量也只有一份
      - 实例变量：
    - 调用者
      - `static` 静态变量：
      - 实例变量：
    - 内存位置
      - `static` 静态变量：
      - 实例变量：
    - 内存位置
      - `static` 静态变量：
      - 实例变量：



### 8.4 类的成员之四：代码块

1. 代码块儿的作用：用来初始化类或者对象的信息（初始化类或者对象的成员变量）
2. 代码块儿的修饰：只能使用static关键字进行修饰
3. 代码块分类
   1. 静态代码块：使用static进行修饰
   2. 非静态代码块：没有使用static进行修饰
4. 具体使用
   1. 静态代码块：**执行优先，比非静态早**
      - 随着类的加载而执行，随着类的加载执行一次并且只会执行一次
      - 作用：用来初始化类的信息
      - 内部可以声明变量，调用属性或者方法，编写输出语句
      - 如果声明有多个静态代码块，则按照声明的先后顺序执行
      - 静态代码块内部**只能调用静态属性和静态方法**
   2. 非静态代码块：随着对象的创建
      - 随着==对象的创建而执行==，每创建当前类的一个实例，就会执行一次非静态代码块儿
      - 作用：用来初始化对象的信息
      - 内部可以声明变量，调用属性或者方法，编写输出语句
      - 如果声明有多个非静态代码块，则按照声明的先后顺序执行
      - 非静态代码块可以调用静态以及非静态属性和方法



### 8.6 Final关键字的作用

1. `final`关键字的理解：

2. `final`可以用来修饰的结构：类，方法，变量

3. 具体说明

   - `final`修饰类：表示此类不能被继承。 Example: String类(`public final String`)

   - `final`修饰方法：表示此方法不能被重写。Example: Object类的``public final native Class<?> getClass()`(native代表使用的是本地方法，在内存中属于本地方法区，无方法体，实际调用的是c/c++的代码)

   - `final`修饰变量：即可以修饰成员变量也可以修饰局部变量。被赋予final的变量不能进行更改，此时成为了常量

     - 修饰成员变量：`final int MIN_SCORE = 0;`

       - 赋值位置：显示赋值，代码块中赋值，构造器中赋值

       - ```java
         class A {
           // 显式赋值
         	final int MIN_SCORE = 0;
           final int MAX_SCORE;
           final int LEFT;
           final int RIGHT; // 这里报错
           
           { // 代码块中赋值
             MAX_SCORE = 100;
           }
           
           // 构造器中赋值
           public A(){
             LEFT = 2;
           }
           public A(int left){
             LEFT = left;
           }
           
           // 方法赋值：!!!会报错
           public void setRight(int right){
             RIGHT = right;
           }
         }
         ```

     - 修饰局部变量：一旦赋值就不能修改

       - 赋值位置：
         - 方法内声明的局部变量：在调用局部变量前一定需要赋值，一旦赋值后就不能更改
         - 方法的形参：`public void method(final int AA)`, 在调用此方法时，给形参进行赋值，一旦赋值后就不能更改

4. `final`和`static`的搭配：修饰成员变量时，此成员变量将成为全局常量

   - 比如：`Math.PI`



### 8.7 抽象类及抽象方法：abstract关键字

为什么要用抽象类：比如定义一个“几何图形”类（包含求周长以及求面积），由于他的子类（圆形，长方形，三角形等）的求周长等方法没有共同点，每次都需要对这些方法进行重写，进而将“几何图形”类变为抽象类，并且提供求周长以及求面积的抽象方法。子类使用这些方法的时候直接对抽象方法进行重写(Override)，实现(Implement)

- `abstract`可以修饰的：类和方法
- 具体的使用
  - abstract修饰类：抽象类
    - 此类不能被实例化
    - 抽象类需要包含构造器，由于子类对象在实例化的时候需要直接/间接调用父类的构造器
    - **抽象类中可以没有抽象方法，但是抽象方法必须存在于抽象类中**
  - abstract修饰方法：抽象方法
    - 抽象方法只有方法的声明，没有方法体
    - 抽象方法其功能是确定的：对方法的命名就已经确定了用途，只是不知道如何具体实现
    - **子类必须重写父类中的所有的抽象方法之后才能实例化，否则此子类仍然是抽象方法**
- `abstract`不能修饰的：属性、构造器、代码块
- `abstract`不能共用关键字（自洽）
  - 私有方法：不能重写
  - 静态方法：只能通过类名调用，但是无方法体所以不能调用
  - final方法：不能被重写
  - final类：不能有子类



### 8.8 interface接口

- 接口定义的关键字：`interface`
- 接口内部结构的声明：
  - 可以声明的：
    - 属性：必须使用`public static final`修饰
    - 方法：
      - jdk8之前：声明抽象方法，修饰为`public abstract`
      - jdk8：声明静态方法和默认方法
      - jdk9：声明私有方法
  - 不能声明的：构造器、代码块
- 接口和类的关系：实现关系（类实现接口）
  - 类可以实现多个接口
  - 类针对于接口的多实现，一定程度上就弥补了类的单继承的局限性
  - 类必须将实现的接口中所有的抽象方法都重写/实现，方可进行实例化，否则此实现类必须声明为抽象类

```java
权限修饰符 class A implements B,C { }

权限修饰符 class A extends SuperA implements B,C {}
// A相较于SuperA来说是子类
// A相较于B,C来说是实现类
```

- 接口和接口的关系：继承关系，并且可以多继承

  - ```java
    interface AA {
        void method1();
    }
    interface BB {
        void method2();
    }
    interface CC extends AA,BB { // 接口多继承
    
    }
    
    class DD implements CC { //对子接口的重写需要重写被继承前的所有方法
        @Override
        public void method1(){
            System.out.println("1");
        }
    
        @Override
        public void method2(){
            System.out.println("2");
        }
    }
    ```

- 接口的多态性：`接口名 变量名 = new 实现类对象`

- 区分抽象类和接口

  - 共性
    - 都可以声明抽象方法
    - 都不能实例化
  - 不同
    - 抽象类一定有构造器，但是接口没有构造器
    - 类与类之间是继承关系，类与接口之间是实现关系，接口与接口之间是多继承关系

![diff-interface-abstract](/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaMDImage/diff-interface-abstract.png)

### 8.9 内部类 inner class

- 将一个类A定义在另一个类B里面，A类就叫做InnerClass，B类叫做OuterClass
- 为什么要声明内部类：遵循高内聚，低耦合；内部类只给外部类提供服务，其他地方用不到
  - Example
    - `Thread`类内部声明了`State`类，表示线程的生命周期
    - `HashMap`类声明了`Node`类，表示封装的key-value
- 内部类的分类
  - 成员内部类：直接声明在外部类的里面
    - 使用static修饰的内部类：静态成员内部类
    - 不使用static修饰的内部类：非静态成员内部类
  - 局部内部类：声明在方法内，构造器内，代码块内的内部类
    - 匿名的局部内部类
    - 非匿名的局部内部类

```java
class Person { // 外部类
    
    // 静态的成员内部类
    static class Dog{
        
    }

    // 非静态的成员内部类
    class Bird {
        
    }
    
    // 方法内
    public void method(){
        // 局部内部类
        class InnerClass{
            
        }
    }
    
    // 构造器内
    public Person(){
        // 局部内部类
        class InnerClass{
            
        }
    }
}
```

- 成员内部类

  - 成员内部类的理解

    - 从类的角度看：
      - 内部可以声明属性、方法、构造器、代码块、内部类等结构
      - 此内部类可以声明父类，可以实现接口
      - 可以使用final修饰，表示不能有子类
      - 可以使用abstract修饰
    - 从外部成员来看
      - 在内部可以调用外部类的属性或者方法等
      - 内部类可以使用包括private和protected在内的所有权限修饰
      - 可以使用static进行修饰

  - 如何创建成员内部类的实例

  - 如何在成员内部类中调用外部类的结构

  - ```java
    class Person { // 外部类
    
        String name = "Tom";
        int age = 10;
    
        // 静态的成员内部类
        static class Dog{
            public void eat(){
                System.out.println("dog eat bone");
            }
        }
    
        // 非静态的成员内部类
        class Bird {
            String name = "Cocatoo";
            public void eat(){
                System.out.println("dog eat worm");
            }
    
            public void show(String name){
                // 这里由于Bird没有age，所以调用的Person的，省略了Person.this
                System.out.println("age= " + age); 
                System.out.println("name= " + name); // 这里调用的是形参的name
                System.out.println("name= " + this.name); // 这里调用的是Bird的name
                System.out.println("name= " + Person.this.name); // 这里调用的是Person的name
            }
        }
    }
    ```

- 局部内部类的使用

- 



### 8.10 枚举类 enumerate

- 定义：枚举类是一种类，并且它的对象是有限的，固定的几个，不能随意修改
- 在开发中的使用
  - 如果针对于某个类，**其实例是确定个数的**，则推荐将此类声明为枚举类
  - 如果枚举类的实例只有一个，则可以实现单例设计模式

声明枚举类的格式

```java
enum Season1{
    // 1. 必须在枚举类的开头声明多个对象，对象之间使用逗号隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");
    
    // 2. 声明当前类的实例变量，使用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3. 私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
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
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
```

- `Enum`中的常用方法

  1. 使用`enum`关键字定义的枚举类，默认其父类是`java.lang.Enum`, 属于`java.lang.Object`，并且不能显式的定义其父类
  2. `String toString()`：默认返回的是常量名（对象名），可以继续手动重写该方法
  3. `String name()`：实际上相等于`toString()`的不重写方法，优先使用`toString()`
  4. `static 枚举类型[] values()`：将枚举对象里面所有的对象全部取出放到数组里，是static方法
  5. `static 枚举类型[] valueOf(String name)`：返回当前枚举类中名称为name的枚举类对象，如果枚举类中不存在会报错
  6. `int ordinal()`：返回当前枚举常量的次序号，默认从0开始

- 枚举类实现接口的情况

  - 枚举类实现接口：在枚举类中重写接口中的抽象方法。当通过不同的枚举类调用此方法时，调用的是同一个方法

  - 枚举类的对象重写抽象方法：当通过不同的枚举类调用此方法时，调用的是不同的实现方法

    - ```java
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
      ```

开发中定义枚举：

```java
public enum Status {
    BUSY, FREE, VACATION, DIMISSION;
}
```



### 8.11 注解 annotation @

#### 8.11.1 Annotation

#### 8.11.2 JUnit 单元测试

- 测试分类

  - 黑盒测试：不需要写代码，给定输入的值，看程序是否能输出期望的值

  - 白盒测试：需要写代码，并且关注具体的执行流程





### 8.12 包装类 wrapper



# 9. 异常处理

### 9.1 异常概述

- 异常：指的是程序在执行过程中出现的非正常情况，如果不处理最终会导致JVM的非正常停止，并不是语法和和逻辑错误
- 异常的抛出机制：Java使用不同的类表示异常，当发生异常的时候直接**创建当前异常类型的对象**，并且抛出(throw)，之后程序员可以捕获(catch)该异常并处理

### 9.2 Java异常体系

##### 1. Throwable: `java.lang.Throwable`类是Java程序执行过程中发生的异常事件对应的类的根父类

##### 2. Error和Exception: Throwable的两个子类

- `java.lang.Error`：错误，Java虚拟机无法解决的严重问题。比如JVM系统错误、资源耗尽。**一般不编写针对性的代码进行处理。**
  - `StackOverflowError` 栈内存溢出；`OutOfMemoryError` 堆内存溢出(OOM)

- `java.lang.Exception`：异常，因编程错误或者偶然的外在因素导致的一般性问题，需要针对性的代码进行处理
  - 空指针访问，试图读取不存在的文件
  - 编译时异常：（受检异常）在执行`javac.exe`命令时出现的异常
  - 运行时异常：（非受检异常）在执行`java.exe`命令时出现的异常

##### 3. 常见的运行时异常 RuntimeException

1. `ArrayIndexOutOfBondsException`
2. `NullPointerException`
3. `ClassCastException`
4. `NumberFormatException`
5. `InputMismatchException`
6. `ArithmeticException`

##### 4. 常见的编译时异常

1. `ClassNotFoundException`
2. `FileNotFoundException`
3. `IOException`

### 9.3 Java异常处理

##### 1. 处理方式：将异常处理的程序代码集中在一起

##### 2. `try-catch-finally`：抓抛模型

- `try`：程序在执行过程中，一旦出现异常，就会在出现异常的代码出，生成对应异常类的对象，并将此对象抛出。一旦抛出，此程序就不执行后面的代码了
- `catch`：针对于`try`过程中抛出的异常对象，进行捕获处理。这个捕获处理的过程就是`catch`。一旦将异常处理了之后，代码就可以最后执行

- 基本结构：

  - ```java
    try{
       ..... // 可能产生异常的代码
    } catch(异常类型1 e){
       ..... // 出现异常类型1的时候的处置措施
    } catch(异常类型2 e){
       ..... // 出现异常类型2的时候的处置措施
    } finally {
       ..... // 无论是否发生异常，都无条件执行的语句
    }
    ..... // 异常处理之后继续执行的代码
    ```

- 使用细节

  - 将可能出现异常的代码声明在`try`语句中。一旦代码出现异常，就会自动生成一个对应异常类的对象，并将此对象抛出

  - 针对于`try`中抛出的异常类的对象，使用之后的`catch`语句进行匹配。一旦匹配上，就就进入`catch`语句块儿进行处理

  - 一旦处理结束，代码就可以继续向下运行

  - 如果多个异常类型满足子父类的关系，则需要将子类声明在父类上面，不然会报错

    - ```java
      		try {
                  Scanner scanner = new Scanner(System.in);
                  int num = scanner.nextInt();
                  System.out.println(num);
              } catch (InputMismatchException e){
                  System.out.println("出现了InputMismatchException的异常");
              } catch(RuntimeException e){ // 这个是上面的父类，需要放到最后
                  System.out.println("出现了RuntimeException的异常");
              }
      ```

  - `catch`中异常处理的方式

    - 自己编写输出异常的语句
    - **`public void printStackTrace()`：打印异常的详细信息**(主要使用)
    - `public String getMessage()`：获取发生异常的原因

  - `try`中声明的变量在`try`的大括号以外无效

  - `try-catch`可以嵌套

- 对于编译时异常，一定要进行处理，否则编译不通过。[本质上是将编译时异常转换到运行时处理]

##### 2.5. `finally`关键字

- 我们将一定要执行的代码生命在`finally`内
  - 无论`try`中或者`catch`中存在未被处理的异常/`try`中或者`catch`中是否存在`return`语句，finally里面的语句是一定会被执行的
    - 特殊情况：使用了`System.exit(0) `强制结束程序
  - `catch`和`finally`是可选语句，但是`finally`不能单独使用
- `finally`内需要声明的结构
  - 在开发中，有一些资源例如输入流、输出流、数据库连接、socket代理连接在使用完之后必须进行显式的关闭，否则GC不会自动回收这些资源，进而导致内存的泄露。为了保证这些资源在使用完之后，不管是否出现了未被处理的异常，都需要声明在finally里进行手动关闭。

##### 3. `throws `异常类型：

- 在方法的声明出使用`throws 异常类型1, 异常类型2;`

  - ```java
    @Test
    public void test() throws 异常类型1, 异常类型2{
      // 可能存在编译时异常
    }
    ```

- 处理异常的方式

  - 从编译是否能通过的方式看：继续向上抛出
  - 但是，`throws`的方式，仅是将可能出现的异常抛给了此方法的调用者，调用者仍然需要处理相关异常
  - 子类重写的方法抛出的异常类型可以与父类方法抛出的异常类型相同，也可以是父类方法抛出的异常类型的子类

- 如何选择`try`和`throws`

  - 在开发的时候，涉及到对资源的调用（数据库连接等），必须使用 `try-catch`来处理，保证不出现内存泄露
  - 当父类被重写的方法没有throws异常类型，子类需要抛出异常时只能用`try-catch`
  - 开发中，当a方法依次调用了b、c、d三个方法，而b、c、d三个方法之间是递进关系。此时如果b、c、d中有异常，通常使用`throws`，方法a通常使用`try-catch`

##### 4. 手动抛出异常 `throw`(没有s)

- 在开发中，如果出现不满足具体场景的代码问题，这个时候有必要手动抛出一个指定类型的异常对象

- 如何实现手动抛出异常

  - ```
    throw new 异常类型("自定义的信息")
    ```

- 注意点：throw后的代码不能被执行，并且编译不通过。

##### 5. 自定义异常类

当不满足指定条件时，指明特有的异常类并且通过这个异常类就可以判断出具体出现的问题

- 自定义异常类的方法
  1. 继承与现有的异常体系。通常继承与`RuntimeException`或者`Exception`
  2. 提供几个重载的构造器
  3. 提供一个全局常量，声明为`static final long serialVersionUID = -xxxxxxL`
- 使用方法
  - `throw new 自定义异常类("输出信息")`





# 10. 多线程

### 10.1 相关概念

- 程序(Program)：为了完成特定任务，用某种语言编写的一组指令集合。即指一段静态的代码和静态对象
- 进程(Process)：程序的一次执行过程，或者是内存中运行的程序
  - 每个进程都有独立内存空间，系统运行一个程序的过程：创建->运行->消亡
  - 程序是静态的、进程是动态的
- 线程(Thread)：程序内部的**一条执行路径**。一个进程中至少有一个线程
  - 一个进程同一时间若并行执行多个线程，就是支持多线程的



11.5 日 《红楼梦》+ 多线程 + Treeset + 泛型 + p195 Lambda

11.6 一 《》 + JavaFx

11.7 二   



### 10.2 创建和启动线程：`java.lang.Thread`

##### 1. 线程的创建方式1：继承Thread类，本质上Thread类是`public class Thread implements Runnable`

- 创建继承与Thread类的子类
- 重写Thread类的`run()`方法，将此线程要执行的操作声明在此方法体重
- 创建当前Thread的子类的对象
- 通过对象调用`start()`: 1> 启动线程 2> 调用run()
  - 不能用已经start()的线程再次执行start()，否则报错`IllegalThreadStateException`

```java
public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        p1.start();
    }
}

class PrintNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
```



##### 2. 线程的创建方式1：实现Runnable接口，此方法避免了单继承的局限性

- 创建实现Runnable接口的类
- 重写接口中的run()方法
- 创建当前实现类的对象
- **将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例**
- Thread类的实例调用start()

```java
public class EvenNumberTest {
    public static void main(String[] args) {
        
        EvenNumberPrint p = new EvenNumberPrint();
        // 创建Thread类型的实例对象
        Thread ts = new Thread(p);
        ts.start();
        
    }
}

class EvenNumberPrint implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
```



### 10.2 线程的安全问题及解决方法

- 当多个线程对同一个资源进行读和写的操作，就容易出现线程的安全问题
- 线程1在操作程序的情况下，尚未结束，其他线程参与进来，故导致线程阻塞
  - 必须保证线程1操作结束之后，其他线程才能继续操作
- java使用线程的同步机制来解决线程安全问题

##### 1. 方式1：同步代码块：

关键字：`synchronized`

```java
synchronized(同步监视器,一般使用this){
  // 需要被同步的代码
}
```

使用说明：

- 需要被同步的代码，
  - 即为操作共享数据的代码（共享数据，即多个线程都需要操作的数据，比如卖票中的总票数）
  - 在被`synchronized`包裹以后，就使得一个线程在操作这些代码的过程中，其他线程必须等待。
- 同步监视器，
  - 俗称锁，哪个线程获取了锁，哪个线程就能执行需要被同步的代码
  - 可以使用任何一个类的对象充当，但是多个线程必须共同使用同一个同步监视器
  - 在实现Runnable接口的方式中，同步监视器可以使用this
  - 在继承Thread类的方式中，同步监视器可以使用`当前类.class`

##### 2. 方式2：同步方法

如果操作共享数据的代码被完成的证明在了一个方法中，那么就可以将此方法声明为同步方法

```java
// 这里是implement Runnable
public synchronized void method1(){ // 此时的同步监视器是this，是唯一的
	// 方法体
}
// 这里是extends Thread
public synchronized void method1(){ // 此时的同步监视器是this，但是不是是唯一的，所以仍然线程不安全
  // 修改方法：（如果可以）：使用static 或者使用同步代码块
	// 方法体
}
```

- 对于非静态的同步方法，默认同步监视器是`this`
- 对于静态的同步方法，默认同步监视器是这个类本身



##### 3. 使用synchronized关键字的好处和弊端

- 好处：解决了线程问题
- 弊端：在操作共享数据时，多线程其实是串行执行的，意味着性能低。



# 11. 常用类及基础api

### 11.5 Java比较器：使用Comparable接口实现自然排序

- 对于引用数据类型是无法直接进行大小比较的

##### 1. 排序：Comparable `class A implement Comparable<T>`

- 实现步骤
  - 具体的类A实现Comparable接口
  - 重写Comparable接口中的`compareTo(Object o)`方法，需要在此方法中指明比较类A的对象大小的标准
  - 创建类A的多个实例，进行大小比较的排序

##### 2. 定制排序：Comparator

当使用的是三方的接口或者类，无法对源代码更改或者对于预定义的类(比如String已经重写过了)重新定义新排序

- 实现步骤
  - 创建一个实现Comparator的实现类A
  - 实现类A要求重写的Comparator接口中的抽象方法compare(Object o1, Object o2)，在此方法体中要指明比较大小对象的大小关系
  - 创建此实现类A的对象，并将此对象传入到相关方法的参数位置（）`Arrays.sort(要比较的)`

```java
				Comparator<Product> comparator = new Comparator() {
            // 如何判断两个对象的大小：其标准就是此方法的方法体要写的
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    int value = Integer.compare(p1.getPrice(), p2.getPrice());
                    if (value != 0){
                        return -value;
                    }
                    return -p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("参数不匹配");
            }
        };
        Arrays.sort(要比较的数组, comparator);
```







# 12. 集合框架

### 12.1 集合框架概述

- 在内存层面需要针对多个数据进行存储

- 数组存储

    - 数组存储多个方面的特点
        - 数组一旦初始化，其长度就是确定的
        - 数组中的多个元素是依次有序紧密排列的，并且可重复的
        - （优点）数组一旦初始化完成，其类型就是确定的。不是此类型的元素就不能被添加进来
        - （优点）数组中元素的类型既可以是基本数据类型，也可以是引用数据类型

    - 数组存储多个方面的弊端
        - 数组一旦初始化，其长度就是不可变的
        - 数组中存储数据的单一性：对于无序，不可重复的数据就无能为力了
        - 数组中可用的方法/属性很少，具体的需求都需要自己来组织相关的代码逻辑
        - 针对于数组中元素的删除、插入操作性能差

- **==Java集合的框架体系：`java.util`包下==**

    - `java.util.Collection`：存储一个一个的的数据

        - `List `接口：存储有序的、可重复的数据(“动态数组”)
            - `ArrayList(主要实现类); LinkedList; Vector`

        - `Set`接口：存储无序的、不可重复的数据  **具体开发场景里用处比较少**
            - `HashSet(主要实现类); LinkedHashSet; TreeSet`

    - `java.util.Map`：存储一对一对的数据（Key-Value键值对，类似于函数 `y=f(x)`）

        ==不同的key可以指向相同的value，但是一个key不能指向多个value==

        - `HashMap(主要实现类); LinkedHashMap; TreeMap; Hashtable(t小写); Properties`


### 12.2 Collection接口里的方法：`java.util.Collection`

- `java.util.Collection`：存储一个一个的的数据

  - `List `接口：存储有序的、可重复的数据(“动态数组”)
    - `ArrayList(主要实现类); LinkedList; Vector`


  - `Set`接口：存储无序的、不可重复的数据  **具体开发场景里用处比较少**
    - `HashSet(主要实现类); LinkedHashSet; TreeSet`

1. **具体方法如下**：

- `.add(Object obj)`: 添加元素到当前集合里，如果后面是一个集合，会把他整体放进去，而不会进行拆分
- `.addAll(Collection other)`: 添加other集合中的元素全部加到当前集合中
- int `.size()`: 获取当前集合中实际存储的元素个数
- boolean `.isEmpty()`: 判断当前集合是否为空集合
- boolean `.contains(Object obj)`: 判断当前集合中是否存在一个与obj对象equals返回true的元素
- boolean `.containsAll(Collection col)`: 判断coll中的所有元素是否在当前集合中都存在
- boolean `.equals(Object obj)`: 判断当前集合与obj是否相等
- void `.clear()`: 清空当前集合里的元素
- boolean `.remove(Object obj)`: 从当前集合中删除第一个找到的与obj对象equals返回true的元素
- boolean `.removeAll(Collection coll)`: 从当前集合中删除所有与coll集合相同的元素 ->==取差集==
- boolean `.retainAll(Collection coll)`: 从集合中删除所有两个集合中不同的元素，只保留两个集合相同的元素 ->==取交集==
- Object[] `.toArray()`: 返回包含当前集合中所有元素的数组
- `.hashCode()`: 获取当前集合对象的哈希值
- `.iterator()`: 返回迭代器对象，用于集合遍历

**2. 集合和数组的相互转换**

- 集合转换为数组：`.toArray()`
- 数组转换为集合：`Arrays.asList()` Arrays的静态方法asList()

**3. 向Collection中添加元素的要求**： ==要求元素所属的类一定要对equals()方法进行重写==

- 原因：因为collection中相关方法在使用时，要调用元素所在类的equals()

**4. Iterator迭代器的使用**：对集合的遍历

- 如何获取迭代器对象

  - ```java
    Iterator iterator = coll.iterator();
    ```

- 主要方法

  - `.next()`: 获取当前集合的下一个元素，到最后一个之后继续执行会导致报错

  - `.hasNext()`: 判断当前迭代器是否有下一个元素

    - ```java
      while(iterator.hasNext()){
      	// .next(): 1. 指针下移 2. 将下移以后的集合位置上的元素返回
        System.out.println(iterator.next());
              }
      ```

  - ！！！错误的迭代方法

    - ```java
      class{
        // 方式一：错误的遍历：每次调取.next()都会将指针下移一次
      	Iterator iterator = coll.iterator();
      	while(iterator.next() != null){
      	    System.out.println(iterator.next()); 
      	}
      
      	// 方式二：错误的遍历：每次调用.iterator()的时候都会返回一个新的迭代器对象
      	while(coll.iterator().hasNext()){
      	    System.out.println(coll.iterator().next());
      	}
      }
      ```

**5. 增强的for循环：`foreach`的使用**

- 作用：用来遍历数组与集合

- 格式

  - `for(要遍历的集合或者数组元素的类型 临时变量 : 要遍历的集合或者数组变量){ sout(临时变量)}`

  - ```java
    int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    // 使用增强的for循环遍历数组
    for (int o : arr){
        System.out.println(o);
    }
    ```

  - 针对于集合来讲，增强的for循环的低层仍然使用的是`Iterator<E>`

  - ```java
    // 使用下面的增强for循环并不能将集合里面的元素进行修改
    for(String s : coll){
      s = "AA"; // 这里s指向了堆空间中新开辟的区域，而不是当前集合或者数组的原有区域
    }
    ```

    由于s是临时变量，==循环体中对临时变量的修改，可能不会导致原有集合或数组中元素的修改==

  - **增强的for循环执行过程中，是将集合或者数组中的元素依次赋值给临时变量**



### 12.3 List接口的实现类

- List接口中存储数据的特点：用于存储有序并且可以重复的数据，使用List可以替代数组

- List中的常用方法

  - 父级Collection中的15个常用方法
  - 因为List是有序的，进而存在索引。所以会增加一些针对索引操作的办法

- List中的额外方法

  - 增加元素
    - `add(Object obj)`
    - `addAll(Collection coll)`
  - 删除元素
    - `remove(Object obj)`
    - `remove(int i)`：移除指定index位置的元素，并返回此元素
  - 修改元素
    - `set(int index, object element)`：设置指定index位置的元素为element
  - 查询元素
    - `get(int index)`：获取指定index位置的元素
  - 插入元素
    - `add(int index, Object element)`：在index位置插入element元素
    - `addAll(int index, Collection coll)`：在index位置开始将coll中的所有元素插入进来
  - 获取长度
    - `size()`
  - 遍历
    - `iterator()`：使用迭代器进行遍历
    - `for each`：增强的for循环
    - 一般的for循环
  - 获取元素索引
    - `indexOf(Object obj)`：返回obj在集合中首次出现的位置
    - `lastIndexOf(Object obj)`：返回obj在集合中末次出现的位置

- 对List的遍历

  - ```java
            // 遍历方式1：迭代器
            Iterator iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
            
            // 遍历方式2：增强的for
            for (Object o : list){
                System.out.println(o);
            }
            
            // 遍历方式3：一般的for循环
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
    ```

**List及其实现类的特点**

- Arraylist：List的主要的实现类(from JDK1.2)，线程不安全的实现类，效率高；底层使用`Object[]`数组存储==大部分情况都用==
  - 在添加和查找时效率高，但是在插入和删除时效率低
- Vector：List的古老的实现类(from JDK1.0)，线程安全的实现类，效率低；底层使用`Object[]`数组存储
- LinkedList：底层使用==双向链表==的方式进行数组存储；在对集合中的数据进行频繁的插入和删除操作时建议使用

### 12.3.5 LinkedList 双向链表

- 在插入和删除时效率高，但是在添加和查找时效率低
- 元素有序，可重复，有索引（可以有操作索引的方法）
- 线程不安全

#### 方法

- 插入元素
    - `void addFirst(E e)` 将指定元素插入到链表开头
    - `void addLast(E e) `将指定元素插入到链表末尾
- 返回元素
    - `E getFirst() `返回链表的第一个元素
    - `E getLast()` 返回链表的最后一个元素
- 移除并返回元素
    - `E removeFirst()` 移除并返回链表的第一个元素，**返回的是被移除的元素**
    - `E removeLast()` 移除并返回链表的最后一个元素，返回的是被移除的元素
- 堆栈操作
    - `E pop()` 从链表所表示的堆栈处弹出一个元素，按照从前到后的顺序，每pop一次
    - <img src="./JavaMDImage/linkedlist.pop.png" alt="Screenshot 2024-05-07 at 20.54.46" style="zoom:50%;" />
    - `void push(E e)` 将元素推入到此链表所表示的堆栈，插入到第一个为止
    - <img src="./JavaMDImage/Screenshot 2024-05-07 at 20.56.54.png" alt="Screenshot 2024-05-07 at 20.56.54" style="zoom:50%;" />
- 判断
    - `boolean isEmpty()` 判断链表是否为空



### 12.4 Set接口的实现类

- `Set`接口：==存储无序的、不可重复的数据==
  - `HashSet`：主要实现类；底层使用HashMap的方式（使用数组+单向列表+红黑树）->jdk8以后才有红黑树
    - `LinkedHashSet `：HashSet的子类；在现有的数组+单向列表+红黑树的基础上添加了一组双向链表，用于记录添加元素的先后顺序，即可以按照添加元素的顺序实现遍历，==便于频繁的查询操作==
  - `TreeSet`：底层使用红黑树存储。可以按照添加的元素的指定的属性的大小顺序进行遍历
- List中的常用方法
  - 父级Collection中的15个常用方法，**没有额外方法**
- 开发中的使用频率及场景：相较于List和Map，使用set的场景较少
  - 主要使用：==用来过滤重复数据==
- Set中无序性以及不可重复性的理解
  - 无序性（并不是随机的，并且添加元素的顺序和遍历元素的顺序不一致也不是无序性）：
    - 定义：与添加元素的位置有关，并不像`ArrayList`一样是紧密排列的
    - 这里是根据添加元素的哈希值面积算的其在数组中的存柱位置。此位置不是依次排列的，表现为无序性。
  - 不可重复性：添加到Set中的元素是不能相同的
    - 比较的标准是通过使用`hashCode()`方法得到的哈希值以及`equals()`方法得到的boolean结果
    - 哈希值相同且`equals()`方法返回true，则认为是相同的
- 添加到`HashSet/LinkedHashSet`中元素的要求
  - 要求元素所在的类要重写两个方法：`equals()`和`hashCode()`
  - 同时，为了保证一致性，需要在intellij自动生成重写两个方法



### 12.4.5 TreeSet实现类

底层使用红黑树存储。可以按照添加的元素的指定的属性的大小顺序进行遍历

- 向TreeSet中添加元素的要求：要求添加到TreeSet中的元素必须是同一类型的元素。
- 判断是否相等
  - 判断TreeSet内元素是否相同的标准不再是考虑`.equals()`和`.hashCode()`了，也就意味着添加到TreeSet中的元素不必要也不需要重写
  - 比较元素大小或比较元素是否相等的标准就是考虑自然排序或者定制排序中，`compareTo()`或者`compare()`的返回值。
    - 如果两个返回值是0，则认为两个对象时相等的。由于TreeSet中不能存放相同的元素，则后面添加的和前面重复的元素将不再能添加进TreeSet





### 12.5 Map接口的实现类

`java.util.Map`：存储一对一对的数据（`Key-Value`键值对，类似于函数 `y=f(x)`）

==不同的key可以指向相同的value，但是一个key不能指向多个value==

- **`Map`及其实现类对比**

  - `HashMap`：主要实现类；线程不安全的，执行效率高；可以添加`null`的`key`和`value`值(`map.put(null, null);`)
    - 底层使用数组+单向链表+红黑树进行存储(jdk8, 在这个版本前没有红黑树)

  - `LinkedHashMap`：是HashMap的一个子类，在HashMap底层使用的数据结构基础上添加了双向链表用来记录添加的先后顺序，进而在遍历元素时可以按照添加的顺序显示。==在开发中对于频繁的遍历操作可以使用此类，遍历的速度更快==

  - `Hashtable(t小写)`：古老的实现类；线程安全的，执行效率低；可以添加`null`的`key`或者`value`值，不能同时为空
    - 底层使用数组+单向链表存储

  - `Properties`：是`Hashtable`的子类；其`key`和`value`都是`String`类型

  - `TreeMap`：底层使用红黑树存储；可以按照添加的`key-value`中的`key`元素的指定的属性大小顺序进行排序；
    - 排序方式：1. 自然排序    2. 定制排序

- **`HashMap`中的`key-value`特点**

  - HashMap中的所有的`key`是不可重复的，并且无序的，所以所有的`key`就构成一个`HashSet`集合。`key`所在的类需要重写`hashCode()`和`equals()`方法
  - HashMap中的所有的`value`是可重复的，并且无序的，所以所有的value就只构成一个`collection`集合。`value`所在的类只需要重写`equals()`方法
  - HashMap中的一个`key-value`构成了一个`entry`。
  - HashMap中的所有的`entry`彼此之间是不可重复的，无序的。所有的`entry`构成了一个`Set`集合

- **`Map`中的常用方法**

  - 添加、修改操作
    - `object put(Object key, Object value)`：将指定的key-value添加（或者修改）到当前`map`对象中
    - `void putAll(Map m)`：将m中的所有key-value对存放在当前map中
  - 删除操作
    - `Object remove(Object key)`：移除指定key的key-value pair并且返回value
    - `void clear()`：清空当前map中所有数据
  - 查询操作
    - `Object get(Object key)`：获取指定key对应的value
  - 长度
    - `size()`：获取当前map的长度
  - 遍历
    - 遍历key集合：`Set keySet()`
    - 遍历value集合：`Collection values()`
    - 遍历entry集合：`Set entrySet()`
  - 其他方法
    - `boolean containsKey(Object key)`：是否包含指定的key，需要对key所在类进行`equals()`重写
    - `boolean containsValue(Object value)`：是否包含指定的value，需要对value所在类进行`equals()`重写
    - `boolean isEmpty()`：判断当前map是否是空
    - `boolean equals(Object obj)`：判断当前map和参数对象obj是否相等



# 13 泛型

### 13.1 泛型概述

JDK5.0的时候Java引入了”参数化类型(Parameterized Type)“的概念，允许我们在创建集合是指定集合元素的类型。

- 例子：`List<String>`表示该List只能保存字符串类型的对象

泛型的定义：允许在定义类、接口的时候通过一个‘标识’来表示类中的某个属性的类型或者是某个方法的返回值或参数的类型



### 13.2 自定义泛型

##### 1. 自定义反省类\接口

- 格式：`class A<参数>{   }` 参数可以是E,T等
- 接口：`interface B<参数>{   }`

```java
public class Order<T>{ }
// SubOrder1不是泛型类，t可以当成Object类型进行处理，需要在实例化时被替换
public class SubOrder1 extends Order{ } 
// SubOrder2不是泛型类，t已经被替换为Integer类型
public class SubOrder2 extends Order<Integer>{ } 
// SubOrder3是泛型类，t可以当成Object类型进行处理，需要在实例化时被替换
public class SubOrder3<T> extends Order<T>{ }
// SubOrder4是泛型类，t被替换到Integer类型，E为SubOrder4里面自己的类型
public class SubOrder4<E> extends Order<Integer>{ } 
// 在现有的泛型类上新增参数
// SubOrder5是泛型类，t可以当成Object类型进行处理，需要在实例化时被替换，E为SubOrder4里面自己的类型，需要在实例化时被替换
public class SubOrder4<T,E> extends Order<T>{ } 
```

使用说明



##### 2. 自定义泛型方法



# 14 File类与IO流

### 14.1 java.io.File

##### 1. 文件的路径表示方式

- 绝对路径：包括盘符在内的文件或者文件目录的完整路径
- 相对路径：相对于某一个文件目录来讲的相对路径

##### 2. File类的构造器

- `public File(String pathname)`：以pathname为路径创建File对象
- `public File(String parent, String child)`：以parent为父路径(一定是文件目录)，child为子路径创建File对象(可以是文件也可以是目录)
- `public File(File parent, String child)`：根据一个父File对象和子文件路径创建File对象

##### 3. File类的常用方法

获取文件和目录的基本信息

- `public String getName()`：获取文件名称
- `public String getPath()`：获取文件路径
- `public String getAbsolutePath()`：获取文件绝对路径
- `public File getAbsoluteFile()`：获取绝对路径表示的文件
- `public String getParent()`：获取上层文件目录路径，如果没有的话返回null
- `public long length()`：获取文件长度（字节数）。不能获取目录的长度
- `public long lastModified()`：获取最后一次修改的时间，毫秒值

列出目录的下一级



### 14.2 IO流的原理及流的分类

java中，对于数据的输入输出操作时以流stream的方式存在

基础IO流的框架：

|   抽象基类   |  节点流/文件流   |
| :----------: | :--------------: |
| InputStream  | FileInputStream  |
| OutputStream | FileOutputStream |
|    Reader    |    FileReader    |
|    Writer    |    FileWriter    |

##### 1. FileReader 和 FileWriter的使用：主要用来处理字符

执行步骤：

- 创建读取或者写出的File类的对象
- 创建输入流或者输出流
- 具体的读入或者写出的过程
  - 读入：`read(char[] cbuffer)`
  - 写出：`write(String str) / write(char[] cbuffer, 0, len)`
- 关闭流资源

注意点：

- 需要使用`try-catch-finally`处理异常(`IOException`)

- 对于输入流来讲，File类的对象的文件必须在磁盘上存在

- 对于输出流来讲

  - 如果文件不存在会自动创建此文件，并写出数据到这个文件中

  - 如果此文件存在：

    - ```java
      fw = new FileWriter(file); // 替换文件里全部内容
      fw = new FileWriter(file, false); // 替换文件里全部内容
      fw = new FileWriter(file, true); // 在现有的文件的末尾追加内容
      ```

例子：从第一个文件读取里面的内容完全拷贝到第二个文件里

```java
 		@Test
    public void testCopy(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // 创建文件类
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy.txt");

            // 输入输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 输入
            char[] cbuff = new char[5];
            int len; // 记录每次读入到cbuffer中字符的个数

            while ((len = fr.read(cbuff)) != -1) {
                // 输出
                fw.write(cbuff, 0, len);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
          	//流关闭
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
```



##### 2. FileInputStream 和 FileOutputStream的使用：可以处理例如图片等字节文件

执行步骤：

- 创建读取或者写出的File类的对象
- 创建输入流或者输出流
- 具体的读入或者写出的过程
  - 读入：`read(byte[] buffer)`
  - 写出：`write(byte[] buffer, 0, len)`
- 关闭流资源









