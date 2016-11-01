package com.shawnclake.graph;

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
	//for now the graph will be viewed as a table of data points
	public void drawGraph(){
		System.out.println("(" + graph.xlabel[0] + ", " + graph.ylabel[0]+ ")");
		for(int i = 0; graph.data[i][0] != null; i++){
			System.out.println("(" + graph.data[i][0] + ", " + graph.data[i][1] + ")");
		}
	}
	
	//this functions takes in a graph, then sets the graph member variable to this graph
	public void setGraph(Graph g){
		graph.setXLabels(g.xlabels[]);
		graph.setYLabels(g.ylabels[]);
		graph.setData(g.data[][]);
	}
}
