package com.greatlearning.model1;
import java.util.Scanner;
import java.util.*;
import com.greatlearning.model.*;
public class Admindepartment extends Superdepartment
{
	public String TodaysWork = "Complete your documents Submission";
	public String Deadline = "Complete by EOD ";
	public String Department = "Welcome to Admin Department ";
	   public String departmentName() 
	   {
		return Department;
	   }
	   public String getTodaysWork() 
	   {
		return TodaysWork;
	   }
	   public void setTodaysWork(String TodaysWork)
	   {
		this.TodaysWork = TodaysWork;
	   }
	   public String getWorkDeadline()
	   {
		return Deadline;
	   }
	   public void setWorkDeadline(String Deadline) 
	   {
		this.Deadline = Deadline;
	   }
		
	  
}
