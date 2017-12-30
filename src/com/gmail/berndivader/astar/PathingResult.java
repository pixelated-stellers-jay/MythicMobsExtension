package com.gmail.berndivader.astar;

public enum PathingResult {
	
	SUCCESS(0),
	NO_PATH(-1);

	private final int ec;
	
	PathingResult(int ec){
		this.ec = ec;
	}
	
	public int getEndCode(){
		return this.ec;
	}

}