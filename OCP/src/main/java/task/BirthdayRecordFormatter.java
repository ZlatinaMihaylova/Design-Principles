package task;

public class BirthdayRecordFormatter implements RecordFormatter {

    @Override
    public String format(Record record){
        BirthdayRecord birthdayRecord = (BirthdayRecord) record;
        return "birthday: " + birthdayRecord.getYear() + "/" + birthdayRecord.getMonth() + "/" + birthdayRecord.getDay();
    }
}
