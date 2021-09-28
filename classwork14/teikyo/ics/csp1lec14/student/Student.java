package teikyo.ics.csp1lec14.student;
import teikyo.ics.csp1lec14.Person;
import teikyo.ics.csp1lec14.Learner;
import teikyo.ics.csp1lec14.Study;
import teikyo.ics.csp1lec14.Settable;

public class Student extends Person implements Learner, Settable {
  Study study;

  public Student(String study){
    this.study = getStudyClass(study);
    this.age = 20;
    this.name = "Hanako";
  }

  private Study getStudyClass(String s) {
    switch (s) {
      case "Programming":
        return new Programming();
      case "English":
        return new English();
      case "Science":
        return new Science();
      default:
        throw new ArrayIndexOutOfBoundsException();
    }
  }

  public Study getStudy(){
    return study;
  }

  public void setValues(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void printInfo(){
    System.out.println(getName() + "/" + getAge() + "/" + getStudy().getStudyName());
  }
}
