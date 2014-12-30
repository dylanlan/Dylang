package com.dylan.dnode;

import java.util.List;
import java.util.ArrayList;

import com.dylan.symbolTable.Scope;

//TODO: block node should push and pop scopes? to handle var declaration in loop??
public class BlockNode implements DNode {
	private List<DNode> statements;  

	public BlockNode() {  
		statements = new ArrayList<DNode>();  
	}  

	public void addStatement(DNode stat) {  
		statements.add(stat);  
	}  

	@Override  
	public DValue evaluate(Scope currentScope) {
		for(DNode stat : statements) {
			DValue value = stat.evaluate(currentScope);  
			if(stat instanceof ReturnNode) {  
				// if we encountered a return node, return its value
				return value;  
			}  
		}  

		// return a null value if no return statement encountered
		return new DValue();  
	} 
}
