package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Tutor extends Thread {
  private static final Logger LOG = LogManager.getLogger(Tutor.class.getName());

  private Integer idTutor;
  private List<Student> studentList;

  public Tutor() {
    this.studentList = new ArrayList<>();
  }

  public Tutor(List<Student> studentList) {
    this.studentList = studentList;
  }

  public Integer getIdTutor() {
    return idTutor;
  }

  public void setIdTutor(Integer idTutor) {
    this.idTutor = idTutor;
  }

  @Override
  public void run() {
    for (Student student : studentList) {
      List<Task> taskList = student.getTaskList();
      for (Task task : taskList) {
        int mark = 3 + new Random().nextInt(7);
        task.setMark(mark);
        LOG.debug("Student: " + student.getIdStudent() + " , mark: " + mark);
        student.getCountDown().countDown();
      }
      LOG.debug("All estimates made for student: " + student.getIdStudent());
    }
  }
}
