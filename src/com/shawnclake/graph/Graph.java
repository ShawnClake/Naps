package com.shawnclake.graph;

import java.util.Arrays;
import java.util.Date;
/*****************************************************************************
 * Graph Class
 * 
 * Description: This class contains all of the graph information such as the
 * 	axis labels and values to go into graph.
 * 
 * Date: October 31st
 * Author: Jennifer Herasymuik
 *****************************************************************************/

public class Graph {

	private Date xlabels[];
	private String ylabels[];
	private int data[][];


	//sets the x-axis label
	public void setXLabels(Date x[]){
		xlabels = Arrays.copyOf(x, x.length);
	}
	
	//sets the y-axis labels
	public void setYLabels(String y[]){
		ylabels = Arrays.copyOf(y, y.length);
	}
	
	//takes in an array of data points and sets the values of the data member variable
	public void setData(int d[][]){
		data = Arrays.copyOf(d, d.length);
	}
	
	public void fitbitSet(Integer data[]){
		for (int i = 0; i < data.length; i++){
			this.data[i][0] = data[i];
		}
	}
	//getters
	public Date[] getXLabels(){
		return this.xlabels;
	}
	public String[] getYLabels(){  //may be an integer or a date for now
		return this.ylabels;
	}
	public int[][] getData(){
		return data;
	}
	
	//still will not be used as we are reading all values from a file
	public void push(int xVal, int yVal){
		
	}
	
}
