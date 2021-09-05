package com.greatlearning.model;

public class Superdepartment {
	public String Welcome = "Welcome to Super Department";
	public String work = "No work as of now";
	public String DeadLine = "Nil";
	public String Holiday = "Today is not a holiday";
	public String isTodayAHoliday() {
		return Holiday;
	   }
	public String getDepartmentName() {
		return Welcome;
	   }
	public void setDepartmentName(String Welcome) {
		this.Welcome = Welcome;
	   }
	public String getTodaysWork() {
		return work;
	   }
	public void setgetTodaysWork(String work) {
		this.work = work;
	   }
	public String getWorkDeadLine() {
		return DeadLine;
	   }
	public void setWorkDeadLine(String DeadLine) {
		this.DeadLine = DeadLine;
	   }
	  
}
