package com.dylan.dnode;

import java.util.ArrayList;
import java.util.List;

public class XorNode implements DNode {
	private DNode lhs;  
	private DNode rhs;  
	  
	public XorNode(DNode lhs, DNode rhs) {  
		this.lhs = lhs;  
		this.rhs = rhs;  
	}  

	@Override  
	public DValue evaluate() {  

		DValue a = lhs.evaluate();  
		DValue b = rhs.evaluate();  
 
		if (a.boolResult != null && b.boolResult != null) {
			return new DValue(a.boolResult ^ b.boolResult);
		}

		throw new RuntimeException("illegal expression: " + this);  
	}  

	@Override  
	public String toString() {  
		return String.format("(%s xor %s)", lhs, rhs);  
	}
}
