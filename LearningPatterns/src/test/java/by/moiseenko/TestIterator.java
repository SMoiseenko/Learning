package by.moiseenko;

import by.moiseenko.behavioral.iterator.Profile;
import by.moiseenko.behavioral.iterator.SocialSpammer;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestIterator {

  private static final Logger LOG = LogManager.getLogger(TestIterator.class.getName());

  @Test
  void testIterator() {
    ArrayList<Profile> profiles = new ArrayList<>();
    profiles.add(new Profile(1, "01@mail.ru"));
    profiles.add(new Profile(2, "02@mail.ru"));
    profiles.add(new Profile(3, "04@mail.ru"));
    profiles.add(new Profile(4, "05@mail.ru"));
    profiles.add(new Profile(5, "06@mail.ru"));
    profiles.add(new Profile(6, "06@mail.ru"));
    profiles.add(new Profile(7, "07@mail.ru"));
    profiles.add(new Profile(8, "08@mail.ru"));
    profiles.add(new Profile(9, "09@mail.ru"));
    profiles.add(new Profile(10, "10@mail.ru"));

    SocialSpammer spammer = new SocialSpammer();
    spammer.sendMessage(profiles.iterator(), "He Everyone!!!");

    Assertions.assertEquals(1,1);

  }

}
