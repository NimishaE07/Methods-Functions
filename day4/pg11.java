class Student {
    int id;
    String name;
    int age;

    Student(int a, String b, int c) {
        id = a;
        name = b;
        age = c;
        System.out.println(id + " " + name + " " + age);
    }

    Student(int a, int b) {
        id = a;
        age = b;
        System.out.println(id + " " + age);
    }
}

class pg11 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nimisha", 20);
        Student s2 = new Student(2, 30);
    }
}
