package mx.rafex.bugs;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface IDateTimeFormatterBug {

    DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("YYYYMMdd");
    ZoneId ZONE_ID = ZoneId.of("America/Bogota");

    List<String> SUPPORTED_FORMATS = Arrays.asList("dd-MM-yyyy", "yyyy-MM-dd");
    List<DateTimeFormatter> DATE_TIME_FORMATTERS = SUPPORTED_FORMATS
            .stream()
            .map(DateTimeFormatter::ofPattern)
            .collect(Collectors.toList());

    

    LocalDate validDate(final String stringDate);

}
