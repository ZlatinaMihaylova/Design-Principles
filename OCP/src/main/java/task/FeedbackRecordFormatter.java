package task;

public class FeedbackRecordFormatter implements RecordFormatter {

    @Override
    public String format(Record record){
        FeedbackRecord feedbackRecord = (FeedbackRecord) record;
        return "feedback: " + feedbackRecord.getCriterion() + "=" + feedbackRecord.getQuality();
    }


}
