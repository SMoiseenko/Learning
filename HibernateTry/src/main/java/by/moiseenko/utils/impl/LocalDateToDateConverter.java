package by.moiseenko.utils.impl;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Converter(autoApply = true)
public class LocalDateToDateConverter implements AttributeConverter<LocalDate, Date> {
  private static final Logger LOG = LogManager.getLogger(LocalDateToDateConverter.class.getName());

  @Override
  public Date convertToDatabaseColumn(LocalDate localDate) {
    return localDate == null ? null : Date.valueOf(localDate);
  }

  @Override
  public LocalDate convertToEntityAttribute(Date date) {
    return date == null ? null : date.toLocalDate();
  }
}
