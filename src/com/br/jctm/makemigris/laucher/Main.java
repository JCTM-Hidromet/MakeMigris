package com.br.jctm.makemigris.laucher;

import java.io.IOException;
import java.util.List;
import com.br.jctm.makemigris.controller.ConfigController;
import com.br.jctm.makemigris.domain.Config;
import com.br.jctm.makemigris.model.dao.AbstractLogDAO;
import com.br.jctm.makemigris.model.dao.LogDAOFactory;



public class Main {

	public static void main(String[] args){
							
		try {
			ConfigController cfgCtr =	new ConfigController();
			Config cfg				=	cfgCtr.getConfig();
						
			String logType			= "ECOLOG";
			AbstractLogDAO logDao	= LogDAOFactory.getLogDAO(logType);
			List<String[]> lst		= logDao.readValuesFromFiles();
			
			for (String[] strings : lst) {
				for (String string : strings) {
					System.out.println(string);
				}
				
			}
			
			
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}

}
