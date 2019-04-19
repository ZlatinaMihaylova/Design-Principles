package task;

public class VisaRecordFormatter implements RecordFormatter{

    @Override
    public String format(Record record){
        VisaRecord visaRecord = (VisaRecord) record;
        return "visa: " + visaRecord.getCountry() + ", from: " + visaRecord.getFrom() + ", to: " + visaRecord.getTo();
    }
}
