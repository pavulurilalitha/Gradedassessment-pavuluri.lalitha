package com.greatlearning.main;
import com.greatlearning.model.*;
import com.greatlearning.model1.Admindepartment;
import com.greatlearning.model2.*;
import com.greatlearning.model3.*;
public class Driver
{
	public static void main(String[] args)
	{
		Superdepartment div= new Superdepartment();
		
		System.out.println(div.getDepartmentName() );
		
		System.out.println(div.getTodaysWork() );
		
		System.out.println(div.getWorkDeadLine() );
		
		System.out.println(div.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		Admindepartment div1 = new Admindepartment();
		
		
		System.out.println(div1.departmentName());
		
		System.out.println(div1.getTodaysWork() );
		
		System.out.println(div1.getWorkDeadline() );
		
		System.out.println(div1.isTodayAHoliday() );
		
		System.out.println();
		System.out.println();
		
		Hrdepartment  div2 = new Hrdepartment();
		
		System.out.println(div2.departmentName());
		
		System.out.println(div2.doActivity() );
		
		System.out.println(div2.getTodaysWork() );
		
		System.out.println(div2.getWorkDeadLine() );
		
		System.out.println(div2.isTodayAHoliday() );
		
		System.out.println();
		System.out.println();
		
		Techdepartment  div3 = new Techdepartment();
		
		System.out.println(div3.departmentName());
		
		System.out.println(div3.getTodaysWork() );
		
		System.out.println(div3.getWorkDeadLine() );
		
		System.out.println(div3.getTechStackInformation() );
		
		System.out.println(div3.isTodayAHoliday() );
		
	}
}