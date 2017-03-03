package com.br.jctm.makemigris.model.dao;

import java.io.File;
import java.util.regex.Pattern;

public class LogDAOFactory {
	
	public static AbstractLogDAO getLogDAO(String logType){
		AbstractLogDAO logDao = null;
		
		switch (logType) {
		case "ECOLOG":
			Pattern value	=	Pattern.compile("-?\\d*\\.\\d*");
			Pattern date	=	Pattern.compile("\\d{2}-d{2}-d{2}\\s\\d{2}:\\d{2}:\\d{2}");
			File file		=	new File("C:\\Users\\eduardonatividade\\Desktop\\LOGS\\Eco\\");
			String name		=	"eco002";
			
			logDao =  new EcoDAO(date, value, file, name);
			
			break;

		default:
			break;
		}
		return logDao;
		
	}

}
