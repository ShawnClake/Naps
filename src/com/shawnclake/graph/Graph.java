package com.shawnclake.graph;

import java.util.Arrays;
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

	private String xlabels[];
	private String ylabels[];
	private int data[][];


	//sets the x-axis label
	public void setXLabels(String x[]){
		xlabels = Arrays.copyOf(x, x.length);
	}
	
	//sets the y-axis label
	public void setYLabels(String y[]){
		ylabels = Arrays.copyOf(y, y.length);
	}
	
	//takes in an array of data points and sets the values of the data member variable
	public void setData(int d[][]){
		data = Arrays.copyOf(d, d.length);
	}
	
	//getters
	public String[] getXLabels(){
		return this.xlabels;
	}
	public String[] getYLabels(){
		return this.ylabels;
	}
	public int[][] getData(){
		return this.data;
	}
	
	
	public void push(int xVal, int yVal){
		
	}
	
}
