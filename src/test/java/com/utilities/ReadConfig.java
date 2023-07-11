package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	// Properties Class
	Properties pro;

	// Constructor
	public ReadConfig()
	{
		File src = new File(System.getProperty("user.dir") + "\\Configuration\\config.properties");// Creating File object


		try
		{
			// Open FileInputStream and Read data
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis); // Load config.properties file
		}
		catch (Exception e)
		{
			// If config.properties file is not available it will throw an exception
			System.out.println("Exception is " + e.getMessage());
		}
	}

	// Methods to read data from config.properties
	public String getApplicationURL() // ok - add new url in config.properties
	{
		String url=pro.getProperty("baseURL"); // Value from config.properties stored in url variable
		return url;
	}
	public String getEntityCodeCorp() // new
	{
		String entityCodeCorp=pro.getProperty("entityCodeCorp");
		return entityCodeCorp;
	}

	public String getUserNameCorp() // new
	{
		String userNameCorp=pro.getProperty("entityCodeCorp");
		return userNameCorp;
	}

	public String getPasswordCorp()
	{
	String passwordCorp=pro.getProperty("passwordCorp");
	return passwordCorp;
	}

	public String getBrowser()
	{
	String browser=pro.getProperty("browser");
	return browser;
	}

	public String getEntityCodePartner(){
		String entityCodePartner=pro.getProperty("entityCodePartner");
		return entityCodePartner;

	}
	public String getPasswordPartner(){
		String passwordPartner=pro.getProperty("passwordPartner");
		return passwordPartner;
	}
	public String getUsernamePartner(){
		String userNamePartner=pro.getProperty("userNamePartner");
		return userNamePartner;
	}








}
