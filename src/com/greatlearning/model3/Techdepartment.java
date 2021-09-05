package com.greatlearning.model3;
import java.util.Scanner;
import java.util.*;
import com.greatlearning.model.*;
public class Techdepartment extends Superdepartment
{
	public String department = "Welcome to Tech Department  ";
	public String work = "Complete coding of module 1  ";
	public String DeadLine ="Complete by EOD   ";
	public String corejava ="core Java ";
	public String departmentName()
	 {
		return department;
	 }
	public String getTodaysWork()
	 {
		return work;
	}
	public void setTodaysWork(String work) 
	{
		this.work = work;
	}
	public String getWorkDeadLine() 
	{
		return DeadLine;
	}
	public void setWorkDeadLine(String DeadLine)
	{
		this.DeadLine = DeadLine;
	}

	public String getTechStackInformation() 
	{
		return corejava;
	}
	public void setTechStackInformation(String corejava)
	{
		this.corejava = corejava; 
	}
}
