package com.br.jctm.makemigris.model.dao;

import java.io.File;
import java.util.List;
import java.util.regex.Pattern;



public class EcoDAO extends AbstractLogDAO{
	
	public EcoDAO(Pattern date, Pattern value, File file, String name) {
		super(date, value, file, name);
		// TODO Auto-generated constructor stub
	}

	public List<String[]> readValuesFromFiles() {
		return super.readValuesFromFiles();
		
	}

}
