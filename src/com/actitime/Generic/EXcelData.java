package com.actitime.Generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXcelData implements Autoconstant{

	public static String getdata(String filepath,String sheetname,int rn,int cn)
	{
		
		try
		{
			FileInputStream fis=new FileInputStream (new File(filepath));
			Workbook wb=WorkbookFactory.create(fis);
			Cell cc=wb.getSheet(sheetname).getRow(rn).getCell(cn);
			
			String data=cc.toString();
			return data;
			
		}
		catch(Exception e)
		{
			return "";
			
		}
		
		
	}
	
public static int getrowcount(String filepath,String sheetname)
	{
	
	try
	{
		FileInputStream fis=new FileInputStream(new File(filepath));
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		int rc=sh.getLastRowNum();
		return rc;
		
		
	}
	catch (Exception e)
	{
		
		return 0;
		
		
	}
	}

	public static int getcellcount(String filepath,String sheetname,int rn)
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File(filepath));
			Workbook wb=WorkbookFactory.create(fis);
			
		Sheet sh=wb.getSheet(sheetname);
		Row rc=sh.getRow(rn);
		short cc=rc.getLastCellNum();
		return cc;
		}
		
		catch(Exception e)
		{
			return 0;
		
		}
		
		
		
		
		
	}
	
	
		
	


}
