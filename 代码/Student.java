package experiment3;

public class Student extends people {  //����
    public Student(int number, String name, char sex,Course a){
        super(number,name,sex);
        this.a = a;
    }
    public String toString(){
        return  "\n" + "student(ѧ����Ϣ):  ������" + name
                + "    ѧ�ţ�" + number + "   �Ա�" + sex + "\n" + "��ѡ�γ���Ϣ:   " + a;
    }
    }