package java_0619;

public class Member {
  String name;
  int age;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    int i = name.hashCode() + age;
    System.out.println(i);
    return i;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;
      return member.name.equals(this.name) && member.age == this.age;
    } else {
      return false;
    }
  }
}
