package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Student extends Thread {
  private static final Logger LOG = LogManager.getLogger(Student.class.getName());

  private Integer idStudent;
  private List<Task> taskList;
  private CountDownLatch countDown;

  public Student(Integer idStudent, int numberTasks) {
    this.idStudent = idStudent;
    this.countDown = new CountDownLatch(numberTasks);
    this.taskList = new ArrayList<>(numberTasks);
  }

  public Integer getIdStudent() {
    return idStudent;
  }

  public void setIdStudent(Integer idStudent) {
    this.idStudent = idStudent;
  }

  public List<Task> getTaskList() {
    return taskList;
  }

  public CountDownLatch getCountDown() {
    return countDown;
  }

  public void addTask(Task task) {
    taskList.add(task);
  }

  @Override
  public void run() {
    int i = 0;
    for (Task task : taskList) {
      try {
        Thread.sleep(new Random().nextInt(100));
      } catch (InterruptedException e) {
        LOG.error(e);
      }
      task.setAnswer("Answer #" + ++i);
      LOG.debug("Answer #" + i + " from student " + idStudent);
    }
    LOG.debug("Student: " + idStudent + " end test");
    try {
      countDown.await();
    } catch (InterruptedException e) {
      LOG.error(e);
    }

    float averageMark = 0;
    for (Task task : taskList) {
      averageMark += task.getMark();
    }
    averageMark /= taskList.size();
    LOG.debug("Student " + idStudent + " : Average mark = " + averageMark);
  }
}
