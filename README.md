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
### 实验方法

### 核心代码
```
package text2;
class PC{
	CPU cpu;
	HardDisk HD;
	void setHardDisk(HardDisk HD){
		this.HD = HD;
	}
	void show(){
		System.out.println("电脑CPU速度：" + cpu.getSpeed());
		System.out.println("电脑硬盘容量：" + HD.getAmount());
		System.out.println("硬盘种类：" + HD.getType());
	}
	void setCPU(CPU cpu){
		this.cpu = cpu;
	}
}
public class text{
	public static void main(String args[]){
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		cpu.setSpeed(2000);
		HD.setAmount(500);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
		
	}
}
```
## 实验图片
(https://github.com/2019311129/text/blob/main/%E6%96%B0%E5%BB%BA%E6%96%87%E4%BB%B6%E5%A4%B9/f37fdcd8640032d529f48e69a2c4afa.png)

## 实验感想
通过实验熟悉了类的创建和基本数据类型使用，以及类的组合与替代。我学会类、方法的构建。不同函数的构建和引用，体会到了修饰符private的用法。并学会了将一个程序分成多个包进行分装，将运行方法的访问限制修饰符改变，让不同包能跨包运行。
