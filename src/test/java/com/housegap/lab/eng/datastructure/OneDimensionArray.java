package com.housegap.lab.eng.datastructure;

public class OneDimensionArray {

	public static void main(String[] args) {
		OneDimensionArray oneDimensionArray = new OneDimensionArray();
		oneDimensionArray.simpleArray();
		oneDimensionArray.studentArray();
	}

	private void simpleArray() {
		System.out.println("\nsimpleArray");
		int[] numbers = new int[5];
		numbers[0] = 20;
		numbers[1] = 5;
		numbers[2] = 10;
		numbers[3] = 6;
		numbers[4] = 11;

//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
	}

	private void studentArray() {
		System.out.println("\nstudentArray");
		Student[] students = new Student[5];
		students[0] = new Student("Tom", 15);
		students[1] = new Student("Mark", 16);
		students[2] = new Student("John", 13);
		students[3] = new Student("Zack", 17);
		students[4] = new Student("Peter", 18);

//		for (int i = 0; i < students.length; i++) {
//			System.out.println(students[i].getName() + " - " + students[i].getAge());
//		}
		
		for (Student student : students) {
			System.out.println(student.getName() + " - " + student.getAge());
		}
	}

	class Student {

		private String name;

		private int age;

		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

}
