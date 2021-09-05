package com.greatlearning.model2;
import java.util.Scanner;
import java.util.*;
import com.greatlearning.model.*;
public class Hrdepartment extends Superdepartment
{
	public String work = "Fill today’s worksheet and mark your attendance";
	public  String DeadLine = "Complete by EOD ";
	public String teamLunch = "teamLunch ";
	public  String department=" Welcome to HR Department ";
	public String departmentName()
	{
		 return department;
	}
	public String getTodaysWork() 
	{
		return work;
	 }
	public void setgetTodaysWork(String work) 
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
	public String doActivity()
	{
		return teamLunch;
	}
}