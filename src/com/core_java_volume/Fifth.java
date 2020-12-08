package com.core_java_volume;

import java.util.ArrayList;

/*
 *��̬��
 *��̬��
 *final�࣬��������չ�����ɸ��Ƿ�����final���еķ���Ϊfinal��������Ա������������
 *������ abstract
 *Object ������ĳ���
 *Object���toString����
 *���������б� 
 *����
 */
public class Fifth extends Employee {
	// ���Ա���ɼ���������private
	// ��������ɼ���������public
	// �Ա�������������ɼ���������protected��Ĭ�ϣ�
	private double bouns;
	public double setBonus(double tBouns){
		return bouns+=tBouns;
	}
	public Fifth(String n,String des ,double s){
		super(n,des,s);
		bouns = 0;
	}
	public double getSalary(){
		double baseSalary = super.getSalary();
		return baseSalary + bouns;
	}
	public boolean equals(Object otherObject){
		if(this==otherObject)
			return true;
		return true;
	}
	public String toString(){
		return getClass().getName()
				+"[name="+super.getName()
				+",salary="+super.getSalary()
				+"]";
	}
	public static void main(String arg[]){
		//inherit();
		abstractClass();
		//genericArray();
		//wrapper();	
		//varible(3.5,5,-3.5);
		//object();
		try{
			reflection();
		}catch(Exception e){
			//�������Throwable��� printStackTrace������ӡ��ջ�Ĺ켣�� 
			//Throwable �� Exception ��ĳ���
			e.printStackTrace();
		}
	}
	
	//����
	public static void reflection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException{
		//�ܷ�����������ĳ����Ϊ����
		Employee employee = new Employee();
		Class cl = employee.getClass();
		System.out.println(cl.getName());
		//һ��class�����ʾһ������
		Class cl1 = int.class;//int.class��һ��class���͵Ķ���
		System.out.println(Double[].class.getName());//[Ljava.lang.Double
		
		//��̬����һ�����ʵ��������Ĭ�Ϲ���
		String s = "java.util.Random";
		Object obj = Class.forName(s).newInstance();
		
		Employee harry = new Employee("xyg","manger",56);
		Class cl2 = harry.getClass();
		java.lang.reflect.Field f = cl2.getDeclaredField("description");
		f.setAccessible(true);//���ʿ���,Ĭ��false
		//Field.get()����ojbect����
		System.out.println(f.get(harry));//�õ�description��ֵ
		f = cl2.getDeclaredField("salary");
		f.setAccessible(true);//���ʿ���
		System.out.println(f.getDouble(harry));//���ػ�������
		
	}

	public static void object(){
		//Object�����Ӧ����������
		Object obj1 = new Employee("xyg","employee",30000);
		Object obj2 = "hello";
		//��Ҫ֪���������ͣ����ܽ��о������
		String str1 = (String)obj2;
		Employee xyg = (Employee)obj1;
		str1.equals(xyg);
		Fifth per= new Fifth("sf","dkl",56);
		System.out.print(per.toString());//Fifth��toString����
	}
	
	//�ɱ��������
	public static void varible(double ...values){
		//����ΪObject[]���飬���б������в���
		double largest = Double.NEGATIVE_INFINITY;
		for (double v:values)
			if(v > largest)
				largest = v;
		System.out.print(largest);
	}
	
	//��װ�����Զ�װ��
	public static void wrapper(){
		//��װ����Integer,Long,Float,Double,Short,Byte�����ڳ���Number
		//character,Void,Boolean
		ArrayList<Integer> list = new ArrayList<>();//����ʹ�ð�װ��;
		list.add(2);//list.add(Integer.valueOf(3))�Զ�װ��
		int n = list.get(0);//int n = list.get(0).Integer()�Զ�����
		ArrayList<Character> str = new ArrayList<>();
		str.add('5');
		System.out.print(Integer.parseInt("123"));//��װ������
		
		
	}
	
	//���������б�
	public static void genericArray(){
		ArrayList<Employee> staff = new ArrayList<>(10);//import java.util.ArrayList;
		System.out.println(staff.size());//staff.size is 0
		staff.add(new Employee("xyg","manager",80000));//β��
		System.out.println(staff.size());//staff.size is 1
		staff.add(0, new Employee("xyg2","manager",80000));//����
		System.out.println(staff.get(1).getDescription());//��ȡ
		for(Employee a:staff){
			System.out.println(a.getName());
		}
		staff.remove(0);//ɾ��
		
	}
	
	//������
	public static void abstractClass(){
		//����һ���������󷽷������������Ϊ������
		//������ķǳ��󷽷�Ϊ������̳�
		//������ĳ��󷽷�Ϊ������ʵ��
		//������ĳ��󷽷�����������ȫ��ʵ��
//		Person p("jl");�����಻�ܱ�ʵ����
		Person p;//���������÷ǳ����������
		Employee per = new Employee("xyg","manager",80000);
		per.setName("zzy");
		System.out.println(per.getName());//���Ե��ó�����ǳ��󷽷�
	}
	
	//�̳в���
	public static void inherit(){
		Fifth boss = new Fifth("XiongYunGang","maneger", 80000);
		boss.setBonus(5000);
	    Employee[] staff = new Employee[4];
	    staff[0] = new Employee("Carl Cracker","employee", 75000);
	    staff[1] = new Employee("Harry Hacker","employee", 50000);
	    staff[2] = new Employee("Tony Tester","employee", 40000);
	    if (staff[1] instanceof Fifth){ //false
	    	Fifth test = (Fifth)staff[1];//ClassCastExceptiong�쳣,�������ø�������
	    }
	    staff[3] = boss;
	      
	      
//	      for (Employee e : staff)
//	         e.raiseSalary(10);
	      
	      //System.out.println(staff[0].getSalary());

	    for (Employee e : staff)
	    	System.out.println("name=" + e.getName() +"   "+e.getDescription()+ ",salary=" + e.getSalary());
		}
	
}
