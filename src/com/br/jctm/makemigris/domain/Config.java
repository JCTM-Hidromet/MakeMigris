package com.br.jctm.makemigris.domain;

import java.io.File;
import java.util.Arrays;

	public class Config {
	private String logInputType;
	private File inputLogDirectory;
	private String inputLogNamePrefix;
	private String[] logParameters;
	private String logOutputType;
	private String outputLogNamePrefix;
	private File outputLogDirectory;
	
	
	
	public Config() {
		super();
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
	public File getInputLogDirectory() {
		return inputLogDirectory;
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
	public String[] getLogParameters() {
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
	public File getOutputLogDirectory() {
		return outputLogDirectory;
	}



	/**
	 * @return the outputLogNamePrefix
	 */
	public String getOutputLogNamePrefix() {
		return outputLogNamePrefix;
	}



	/**
	 * @param logInputType the logInputType to set
	 */
	public void setLogInputType(String logInputType) {
		this.logInputType = logInputType;
	}



	/**
	 * @param inputLogPath the inputLogPath to set
	 */
	public void setInputLogDirectory(File inputLogDirectory) {
		this.inputLogDirectory = inputLogDirectory;
	}



	/**
	 * @param inputLogNamePrefix the inputLogNamePrefix to set
	 */
	public void setInputLogNamePrefix(String inputLogNamePrefix) {
		this.inputLogNamePrefix = inputLogNamePrefix;
	}



	/**
	 * @param logParameters the logParameters to set
	 */
	public void setLogParameters(String[] logParameters) {
		this.logParameters = logParameters;
	}



	/**
	 * @param logOutputType the logOutputType to set
	 */
	public void setLogOutputType(String logOutputType) {
		this.logOutputType = logOutputType;
	}



	/**
	 * @param outputLogPath the outputLogPath to set
	 */
	public void setOutputLogDirectory(File outputLogDirectory) {
		this.outputLogDirectory = outputLogDirectory;
	}



	/**
	 * @param outputLogNamePrefix the outputLogNamePrefix to set
	 */
	public void setOutputLogNamePrefix(String outputLogNamePrefix) {
		this.outputLogNamePrefix = outputLogNamePrefix;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Config [logInputType=").append(logInputType)
				.append(", inputLogDirectory=").append(inputLogDirectory)
				.append(", inputLogNamePrefix=").append(inputLogNamePrefix)
				.append(", logParameters=")
				.append(Arrays.toString(logParameters))
				.append(", logOutputType=").append(logOutputType)
				.append(", outputLogNamePrefix=").append(outputLogNamePrefix)
				.append(", outputLogDirectory=").append(outputLogDirectory)
				.append("]");
		return builder.toString();
	}



	
	
	
	
	
}
