package com.br.jctm.makemigris.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigDAO {
	
	static ConfigDAO configDaoInstance;
	
	private String logInputType;
	private String inputLogPath;
	private String inputLogNamePrefix;
	private String logParameters;
	private String logOutputType;
	private String outputLogPath;
	private String outputLogNamePrefix;
	
	
	private ConfigDAO() throws FileNotFoundException, IOException{
		Properties props = new Properties();
		
		props.load(new FileReader(new File(".\\config\\config.properties")));
		
		this.logInputType			=	props.getProperty("config.TipoLogEntada");
		this.inputLogPath			=	props.getProperty("config.directorioLogEntrada");
		this.inputLogNamePrefix		=	props.getProperty("config.prefixoNomeLogEntrada");
		this.logParameters			=	props.getProperty("config.ListaParametrosLog");
		this.logOutputType			=	props.getProperty("config.TipoLogSaida");
		this.outputLogPath			=	props.getProperty("config.directorioLogSaida");
		this.outputLogNamePrefix	=	props.getProperty("config.prefixoNomeLogSaida");
		
	}

	
	
	public static ConfigDAO getConfigDAOInstance() throws FileNotFoundException, IOException {
		
		if(configDaoInstance == null){
			return new ConfigDAO();
		}
		return configDaoInstance;
	}



	/**
	 * @return the configDaoInstance
	 */
	public static ConfigDAO getConfigDaoInstance() {
		return configDaoInstance;
	}



	/**
	 * @return the logInputType
	 */
	public String getLogInputType() {
		return logInputType;
	}



	/**
	 * @return the inputLogPath
	 */
	public String getInputLogPath() {
		return inputLogPath;
	}



	/**
	 * @return the inputLogNamePrefix
	 */
	public String getInputLogNamePrefix() {
		return inputLogNamePrefix;
	}



	/**
	 * @return the logParameters
	 */
	public String getLogParameters() {
		return logParameters;
	}



	/**
	 * @return the logOutputType
	 */
	public String getLogOutputType() {
		return logOutputType;
	}



	/**
	 * @return the outputLogPath
	 */
	public String getOutputLogPath() {
		return outputLogPath;
	}



	/**
	 * @return the outputLogNamePrefix
	 */
	public String getOutputLogNamePrefix() {
		return outputLogNamePrefix;
	}
	
	
	
	

}
