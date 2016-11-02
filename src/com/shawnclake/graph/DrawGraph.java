package com.shawnclake.graph;

/*****************************************************************************
 * DrawGraph Class
 * 
 * Description: This class is responsible for displaying the graph to the user.
 * 
 * Date: October 31st
 * Author: Jennifer Herasymuik
 *****************************************************************************/

public class DrawGraph<T> {
	
	private Graph<T> graph;
	
	//this function uses the graph member variable and draws out the graph
	//for now it will print out the x and y labels, then the data points
	public void drawGraph(){
		String x[] = graph.getXLabels();
		//String y[] = graph.getYLabels();
		T d[][] = graph.getData();
		
		//the x-labels represent the dates the user selected
		System.out.println("X-labels");
		System.out.println(x.toString());
		//******we are going to ignore the ylabels for now since we have no values for these yet
		System.out.println("Data");
		System.out.println(d.toString());
	}
	
	//this functions takes in a graph, then sets the graph member variable to this graph
	public void setGraph(Graph<T> g){
		graph.setXLabels(g.getXLabels());
		graph.setYLabels(g.getYLabels());
		graph.setData(g.getData());
	}
}
