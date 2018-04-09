package com.example.sn.intechplayertest.models;

import java.util.List;

public class Search {
	private int resultCount;
	private List<Track> results;

	public void setResultCount(int resultCount){
		this.resultCount = resultCount;
	}

	public int getResultCount(){
		return resultCount;
	}

	public void setResults(List<Track> results){
		this.results = results;
	}

	public List<Track> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Search{" +
			"resultCount = '" + resultCount + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}