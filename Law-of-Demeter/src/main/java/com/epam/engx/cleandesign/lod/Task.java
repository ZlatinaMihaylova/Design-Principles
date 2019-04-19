package com.epam.engx.cleandesign.lod;

public class Task {

	String name;
	String id;
	UserStory userStoryName;

	public Task(String taskName) {
		String[] taskDetails = taskName.split(NameFormatter.DELIMITER);
		name = taskDetails[0];
		id = taskDetails[1];

		userStoryName = new UserStory("Story" + NameFormatter.DELIMITER + id);
	}

	public String getAssigneeEmployeeName(){
		return new Employee(id).getName();
	}
}
