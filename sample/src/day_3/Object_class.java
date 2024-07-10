
	public String toString() {
		return "OopsConceptDemo [Serial Number=" + serialNum + ", name=" + name + ", age=" + age + "]";
		}
		}
		//Program to demonstrate class and object
		package day_3;
		public class Object_class {
		public static void main(String[] args) {
		//object creation
		OopsConceptDemo obj = new OopsConceptDemo();
		obj.setSerialNum(101);
		obj.setName("Pooja");
		obj.setAge(20);
		System.out.println(obj);
		}
	}
