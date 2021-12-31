package mx.rafex.bugs;

import java.time.LocalDate;
import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DateTimeFormatterBugTest {

    private static final Logger LOGGER = Logger.getLogger(DateTimeFormatterBugTest.class.getName());

    private static IDateTimeFormatterBug bug;

    @BeforeAll
    static void init() {
        bug = new DateTimeFormatterBug();
    }

    @Test
    void replyBug20211226() {
        final String date = "2021-12-26";
        final String result = "20211226";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }

    @Test
    void replyBug20211227() {
        final String date = "2021-12-27";
        final String result = "20211227";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }

    @Test
    void replyBug20211228() {
        final String date = "2021-12-28";
        final String result = "20211228";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }

    @Test
    void replyBug20211229() {
        final String date = "2021-12-29";
        final String result = "20211229";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }

    @Test
    void replyBug20211230() {
        final String date = "2021-12-30";
        final String result = "20211230";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }

    @Test
    void replyBug20211231() {
        final String date = "2021-12-31";
        final String result = "20211231";

        final LocalDate localDate = bug.validDate(date);

        LOGGER.info(date);
        LOGGER.info(result);

        Assertions.assertEquals(result, localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));

    }
}
