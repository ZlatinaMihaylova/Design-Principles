package com.epam.engx.cleandesign.lod;

public class UserStory {


	String userStoryName;
	Employee employee;

	public UserStory(String storyName) {
		String[] taskDetails = storyName.split(NameFormatter.DELIMITER);

		this.userStoryName = storyName;
		this.employee = new Employee(taskDetails[1]);
	}

}
