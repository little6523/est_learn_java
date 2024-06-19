package java_0618;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Java_0618 {

  public void learn() {
    // ----------------- 2교시 ---------------------------
    //    System.out.println(compare(1, 2));

    //     메서드 이름은 compareStirng t1,t2 매개변수 반환값 void 타입 파라미터 한정자가 String
    //     내부 로직은 문자열이 같으면 okay 출력 틀리면 no 출력
    //    compareString("hello", "hello");
    //    compareString("hello", "hello1");

    // ----------------- 2교시 ---------------------------
    // ----------------- 3교시 ---------------------------
    //    java_0618.Course<java_0618.Person> personCourse = new java_0618.Course<>("일반인", 5);
    //    personCourse.add(new java_0618.Person("일반인"));
    //    personCourse.add(new java_0618.Worker("직장인"));
    //    personCourse.add(new java_0618.java_0619.Student("학생"));
    //    personCourse.add(new java_0618.HighStudent("고등학생"));
    //
    //    java_0618.Course<java_0618.Worker> workerCourse = new java_0618.Course<>("직장인과정", 5);
    //    workerCourse.add(new java_0618.Worker("직장인"));
    //
    //    java_0618.Course<java_0618.java_0619.Student> studentCourse = new java_0618.Course<>("학생과정", 5);
    //    studentCourse.add(new java_0618.java_0619.Student("학생"));
    //    studentCourse.add(new java_0618.HighStudent("고등학생"));
    //
    //    java_0618.Course<java_0618.HighStudent> highStudentCourse = new
    // java_0618.Course<>("고등학생과정", 5);
    //    highStudentCourse.add(new java_0618.HighStudent("고등학생"));
    //
    //    registerCourse(personCourse);
    //    registerCourse(workerCourse);
    //    registerCourse(studentCourse);
    //    registerCourse(highStudentCourse);
    //
    //    System.out.println("===================");
    //    System.out.println("===================");
    //    System.out.println("===================");
    //
    //    registerCourseStudent(studentCourse);
    //    registerCourseStudent(highStudentCourse);
    //
    //    System.out.println("===================");
    //    System.out.println("===================");
    //    System.out.println("===================");
    //
    //    registerCourseWorker(personCourse);
    //    registerCourseWorker(workerCourse);
    // ----------------- 3교시 ---------------------------
    // ----------------- 4교시 ---------------------------

    //    java_0618.ChildProduct<java_0618.Tv, String, String> product = new
    // java_0618.ChildProduct<>();
    //    product.setKind(new java_0618.Tv());
    //    product.setModel("smart TV");
    //    product.setCompany("Samsung");
    //
    //    java_0618.StorageImpl<java_0618.Tv> tvStorage = new java_0618.StorageImpl<>(100);
    //    tvStorage.add(new java_0618.Tv(), 0);

    // ----------------- 4교시 ---------------------------
    // ----------------- 5교시 ---------------------------

    //    List<String> arraylist = new ArrayList<>();
    //    arraylist.add("Honggildong");
    //    arraylist.add("Honggildong2");
    //    arraylist.add("Honggildong2");
    //    arraylist.add("Honggildong2");
    //    arraylist.add("Honggildong2");
    //    arraylist.add("Honggildong2");
    //
    //    arraylist.remove("홍길동2");
    //
    //    arraylist.removeIf((s) -> s.equals("홍길동2"));
    //
    //    for (int i = 0; i < arraylist.size(); i++) {
    //      System.out.println(arraylist.get(i));
    //    }
    //    System.out.println("========================");
    //    for (String str : arraylist) {
    //      System.out.println(str);
    //    }

    // ----------------- 5교시 ---------------------------
    // ----------------- 6교시 ---------------------------

    //    List<String> arrayList = new ArrayList<>();
    //    arrayList.add("Java");
    //    arrayList.add("Spring");
    //    arrayList.add("Servlet/JSP");
    //    arrayList.add("DBMS");
    //    arrayList.add("JPA");
    //
    //    System.out.println("총 객체수 : " + arrayList.size());
    //
    //    System.out.println("================");
    //
    //    System.out.println("두 번째 인덱스 : " + arrayList.get(2));
    //
    //    System.out.println(arrayList.contains("java"));
    //
    //    ArrayList<Object> objects = new ArrayList<>();
    //
    //    objects.add(null); // null값도 값이다.
    //
    //    System.out.println(objects.isEmpty());
    //    objects.clear();
    //    System.out.println(objects.isEmpty());

    List<String> arrayList = new ArrayList<>();
    List<String> linkedList = new LinkedList<>();

    long startTime, endTime;
    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      arrayList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("arrayList 걸린시간: " + (endTime - startTime));

    startTime = System.nanoTime();
    for (int i = 0; i < 10000; i++) {
      linkedList.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.println("linkedList 걸린시간: " + (endTime - startTime));
    // ----------------- 6교시 ---------------------------
  }

  public static <T extends Number> int compare(T t1, T t2) {
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();
    return Double.compare(v1, v2);
  }

  public static <T extends String> void compareString(String t1, String t2) {

    System.out.println(t1.equals(t2) ? "okay" : "no");
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }
}
