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
    static void init(){
        bug = new DateTimeFormatterBug();
    }
    
    @Test
     void replyBug() {
        String date = "2021-12-26";
        String result = "20211226";
        
        
        LocalDate localDate = bug.validDate(date);
        
        LOGGER.info(date);
        LOGGER.info(result);
        
        Assertions.assertEquals(result,localDate.format(IDateTimeFormatterBug.DATE_FORMATTER));
        
    }
}
