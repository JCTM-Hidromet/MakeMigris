package com.br.jctm.makemigris.model.bo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.br.jctm.makemigris.domain.Config;
import com.br.jctm.makemigris.model.dao.ConfigDAO;

public class ConfigBO {
	
	public Config getConfig() throws FileNotFoundException, IOException{
		ConfigDAO cfgDao	=	ConfigDAO.getConfigDAOInstance();
		Config cfg			=	new Config();
		
		cfg.setInputLogNamePrefix(cfgDao.getInputLogNamePrefix());
		cfg.setInputLogDirectory(getDirectoryFromPath(cfgDao.getInputLogPath()));
		cfg.setLogInputType(cfgDao.getLogInputType());
		cfg.setLogOutputType(cfgDao.getLogOutputType());
		cfg.setLogParameters(getListFromText(cfgDao.getLogParameters()));
		cfg.setOutputLogNamePrefix(cfgDao.getOutputLogNamePrefix());
		cfg.setOutputLogDirectory(getDirectoryFromPath(cfgDao.getOutputLogPath()));
				
		return cfg;	
		
	}
	
	
	
	private File getDirectoryFromPath(String path) throws FileNotFoundException{
		File file = new File(path);
		if( !file.isDirectory()){
			throw new FileNotFoundException("O caminho ["+ path +"] não corresponde a um diretório válido");
			
		}
		return file;
	}
	
	
	
	private String[] getListFromText(String txt){
		return txt.split(";");
	}
	
	

}
