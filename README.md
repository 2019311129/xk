# Java实验
## 一、实验目的<br></br>
## 实验要求
  - 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
  + 掌握面向对象的类设计方法（属性、方法）；
  * 掌握类的继承用法，通过构造方法实例化对象；
  + 学会使用super()，用于实例化子类；
  - 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
  
  
  
### 附加要求：
1. 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）
2. 模拟学生退课操作，再打印课程信息。

### 实验过程
1. 首先创建四个类和一个主类
2. 将四个主类名字分别命名为People，然后用另外两个类Student，Teacher分别设置为People的子类，并用super（）将父类People中的编号、姓名、性别继承。在输出语句中用toString（）方法。
3. 随后在Test主类里面设置了教师信息、学生信息、课程信息。
4. 利用循环和import java.util.Scanner设置一个后台输入系统。通过识别输入的数字来确定学生所对应的授课课程和该课程的老师。

### 实验步骤
（1）学生引用父类子类 找出学生信息：  姓名 学号 性别 所选课程信息
（2）教师引用父类子类 找出教师信息:  编号 姓名 性别 所授课程
（3）课程信息 课程编号上课地点 课程时间 课程学分
（4）
### 核心代码
```
学生
public class Student extends people {  //子类
    public Student(int number, String name, char sex,Course a){
        super(number,name,sex);
        this.a = a;
    }
    public String toString(){
        return  "\n" + "student(学生信息):  姓名：" + name
                + "    学号：" + number + "   性别：" + sex + "\n" + "所选课程信息:   " + a;
    }
    }
    课程
    public class Course {
    int number;
    String coursesname;
    String place;
    float time;
    float score;


    public Course(String coursesname, int number, String place, float time, float score) {
        this.coursesname = coursesname;
        this.number = number;
        this.place = place;
        this.time = time;
        this.score = score;

    }

    public String toString() {
        return   coursesname+    "(课程信息)" + "     课程编号：" + number + "   上课地点：" + place
                + "    课程时间：" + time + "小时" + "     课程学分：" + score + "分";
    }
}
教师
public class Teacher extends people {  //子类
    String lesson;
    public Teacher(int number, String name, char sex, String lesson){
        super(number,name,sex);
        this.lesson = lesson;
    }
    public String toString(){
        return   "Teacher(教师信息):" +"  编号：" + number
                + "    姓名：" + name + "   性别：" + sex + "     所授课程：" + lesson;
    }
}
text
 public static void main(String[] args) {
        int flag = 1;
        Course s = null;
        while (flag == 1) {
            Scanner in = new Scanner(System.in);
            Course a = s;      //对a进行初始化赋值
            Student w = new Student(2019311129, "gyq", 'M',a);
            System.out.println("学生信息");
            System.out.println(w);
            Teacher b = new Teacher(1, "GAO", 'M', "数学");
            Teacher c = new Teacher(2, "LI", 'M', "化学");
            Teacher d = new Teacher(3, "ZHANG", 'W', "英语");
            System.out.println("教师信息");
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            Course e = new Course("数学", 7, "101", 2, 2);
            Course f = new Course("英语", 8, "102", 2, 3);
            Course g = new Course("化学", 9, "103", 2, 4);
            System.out.println("课程信息");
            System.out.println(e);
            System.out.println(f);
            System.out.println(g);
```
## 实验图片


## 实验感想
掌握继承的用法，通过构造方法实例化对象，学会面向对象的类设计方法，多加练习掌握此方法

