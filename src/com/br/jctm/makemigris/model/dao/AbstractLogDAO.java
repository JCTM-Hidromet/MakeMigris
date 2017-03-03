package com.br.jctm.makemigris.model.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractLogDAO {
	private Pattern value;
	private Pattern date;
	private File file;
	private String name;
	
	
	
	public AbstractLogDAO(Pattern date, Pattern value, File file, String name){
		super();
		this.date			=	date;
		this.value			=	value;
		this.file			=	file;
		this.name			=	name;
	}
	
	
	
	public List<String[]> readValuesFromFiles(){
		List<String[]> values	 	=	null;
		FileReader flRdr			=	null;
		BufferedReader bfRdr		=	null;
		File[] files				= 	null;
		String line					=	null;	
		
		try {
			files = selectFiles(this.name);
						
			for (File file : files) {
				flRdr	=	new FileReader(file);
				bfRdr	=	new BufferedReader(flRdr);
				values	=	new ArrayList<String[]>();
				line	=	bfRdr.readLine();
							
				while(line != null){
					String dt		=	"03-12-12 00:00:00";
					String[] vls	=	{"02",".04","-999"};
					int total		=	vls.length + 1;
					line			=	bfRdr.readLine();
					String[] lst	=	new String[total];
					
					for(int i = 0; i < total; i++){
						if(i == 0){
							lst[i] = dt;
							
						}else{
							lst[i] = vls[i];
							
						}
						
					}
					values.add(lst);
					
				}
				
			}
			flRdr.close();
			bfRdr.close();
						
		} catch (Exception e) {
			// TODO: handle exception
		}
		return values;
				
	}

	
	
	private String[] selectValuesFromLine(String line) throws Exception {
		String out[]		=	null;
		Matcher matcher		=	this.value.matcher(line);
		
		if(matcher.find()){
			out = new String[matcher.groupCount()];
						
			for(int i = 0; i < matcher.groupCount(); i++){
				out[i] = matcher.group(i);
				
			}
		
			return out;
		}
		throw new Exception("Não foram encontradas datas na string");
		
	}

	
	
	private String selectDateFromLine(String line) throws Exception {
		String out			=	null;
		Matcher matcher		=	this.date.matcher(line);
		
		if(matcher.find()){
			out = matcher.group();
			
			return out;
		}
		
		throw new Exception("Não foram encontradas datas na string");
	}
	
	
	
	private File[] selectFiles(String name) {
		File[] files = this.file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return (pathname.getName().startsWith(name)) && (pathname.getName().endsWith(".txt"));
			}
		});

		
		return files;
	}
	

	
}
