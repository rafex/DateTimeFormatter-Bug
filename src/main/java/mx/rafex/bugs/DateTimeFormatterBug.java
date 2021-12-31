package mx.rafex.bugs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Logger;

public class DateTimeFormatterBug implements IDateTimeFormatterBug {
    
    private static final Logger LOGGER = Logger.getLogger(DateTimeFormatterBug.class.getName());

    @Override
    public LocalDate validDate(final String stringDate) {

        LOGGER.info("Validando fecha: ");
        LOGGER.info(stringDate);

        if (stringDate == null || stringDate.isBlank()) {
            LOGGER.info("Fecha dio null");
            return LocalDate.now(ZONE_ID);
        }

        for (final DateTimeFormatter dateTimeFormatter : DATE_TIME_FORMATTERS) {
            try {
                return LocalDate.parse(stringDate, dateTimeFormatter);
            } catch (final DateTimeParseException e) {
                LOGGER.warning("DateTimeParseException: deliberate empty block so that all parsers run \n" + e.getMessage());
            }
        }

        return null;
    }

}
