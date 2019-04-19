package task;

import java.util.stream.Collectors;

public class WorkloadRecordFormatter implements RecordFormatter {

    @Override
    public String format(Record record) {
        WorkloadRecord workloadRecord = (WorkloadRecord) record;
        return workloadRecord.getWorkload().entrySet()
                .stream()
                .map(e -> e.getKey() + ":" + e.getValue())
                .collect(Collectors.joining(", ", "workload: ", ""));
    }
}
