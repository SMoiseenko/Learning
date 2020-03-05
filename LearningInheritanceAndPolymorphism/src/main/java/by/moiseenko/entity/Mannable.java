package by.moiseenko.entity;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface Mannable {
  int getId();
  void setId(int id);
  String getName();
  void setName(String name);
  int getAge();
  void setAge(int age);
  Passport getPassport();
  void setPassport(Passport passport);


}
