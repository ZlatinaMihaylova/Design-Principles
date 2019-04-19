package task;

public class SkillsRecordFormatter implements RecordFormatter{

    @Override
    public String format(Record record){
        SkillsRecord skillsRecord = (SkillsRecord) record;
        return "skills: " + skillsRecord.getSkill() + "=" + skillsRecord.getLevel();
    }

}
