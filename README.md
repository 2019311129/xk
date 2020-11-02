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


### 核心代码
```
package experiment3（teacher）;

public class Teacher {
	  private int id;
	  private char sex;
	  private String teacherName;
	  private Course[] courses;
	  //构造函数
	  public Teacher() {
	   super();
	   
	   courses= new Course[1];
	  }
	  public Teacher(int id,String teacherName,char i){
	   this.id=id;
	   this.teacherName=teacherName;
	   this.sex=i;
	   i ='男';
	   courses = new Course[1];
	  }
	  char i ='男';
	  //修改或是添加属性
	  
	  package experiment3;
	  
	  public class people {
	  private int id;
	  private char sex;
	  private String peopleName;
	  private Course[] courses;
	  public people() {
	   super();
	   courses= new Course[1];
	  }
	  public people(int id,String peopleName,char sex){
	    this.id=id;
	    this.peopleName=peopleName;
	    this.sex=sex;
	    courses = new Course[1];
	   }
	
```
## 实验图片


## 实验感想

