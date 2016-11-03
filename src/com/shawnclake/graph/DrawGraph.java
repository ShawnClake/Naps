package com.shawnclake.graph;

import java.util.Date;
import java.util.Arrays;
/*****************************************************************************
 * DrawGraph Class
 * 
 * Description: This class is responsible for displaying the graph to the user.
 * 
 * Date: October 31st
 * Author: Jennifer Herasymuik
 *****************************************************************************/

public class DrawGraph {
	
	private Graph graph;
	
	//this function uses the graph member variable and draws out the graph
	//for now it will print out the x and y labels, then the data points
	public void drawGraph(){
		Date x[] = graph.getXLabels();
		String y[] = graph.getYLabels();
		int d[] = graph.getData();
		
		//the x-labels represent the dates the user selected
		System.out.println("X-labels");
		System.out.println(Arrays.toString(x));
		//ylabels
		System.out.println("Y-labels:");
		System.out.println(Arrays.toString(y));	
		System.out.println("Data");
		System.out.println(Arrays.toString(d));
	}
	
	//this functions takes in a graph, then sets the graph member variable to this graph
	public void setGraph(Graph g){
		graph = g;
	}
}
