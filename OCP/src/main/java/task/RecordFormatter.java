package task;

import java.util.stream.Collectors;

public interface RecordFormatter {

    default String format(Record record){
        return"record no: "+ record.getId();
    }
}
