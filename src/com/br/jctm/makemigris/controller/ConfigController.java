package com.br.jctm.makemigris.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.br.jctm.makemigris.domain.Config;
import com.br.jctm.makemigris.model.bo.ConfigBO;

public class ConfigController {
	
	public Config getConfig() throws FileNotFoundException, IOException{
		ConfigBO cfgBo = new ConfigBO();
		
		return cfgBo.getConfig();
	}

}
