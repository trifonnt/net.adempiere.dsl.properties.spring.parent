package net.adempiere.dsl.properties.generator

import java.util.List

class PropNode {
	String name;
	String type;
	PropNode parent;
	boolean notNull;

//	Map<String, PropNode> children = new HashMap<String, PropNode>();
	List<PropNode> children = newArrayList();

	new(PropNode parent, String name, String type, boolean notNull) {
		this.parent = parent;
		this.name = name;
		this.type = type;
		this.notNull = notNull;
		if (parent !== null) {
			parent.addChild( this );
		}
	}

	def PropNode getParent() {
		return parent;
	}
	def String getName() {
		return name;
	}
	def String getType() {
		return type;
	}
	def boolean isNotNull() {
		return notNull;
	}

	def boolean hasChildren() {
		return children.size > 0;
	}

	def List<PropNode> getChildrenAsList() {
		return children.clone;
	}
/*	def Map<String, PropNode> getChildren() {
		var Map<String, PropNode> result = newHashMap();
		for (PropNode child: children) {
			result.put(child.getName, child);
		}
		return result;
	}
*/
	def PropNode getChildren(String name) {
		var PropNode result = null;
		if (name !== null) {
			for (PropNode child: children) {
				if (name.equals(child.name)) {
					result = child;
				}
			}
		}
		return result;
	}
	def void addChild(PropNode child) {
		children.add(child);
	}
	def boolean contains(String name) {
		return getChildren(name) !== null;
//	return children.contains(name);
	}

	def String print2() {
		var String result = "";

		if (hasChildren) {
			for (child: children) {
				if (child.hasChildren) {
					
				} else {
					result = name;
				}
			}
		}
		return result;
	}

	def String print(String parentPath) {
		var String result = "\r\n";
//		if (parent !== null) {
//			result = result + parent.constructParent;
//			result = result + "-n-";
//		}
		if (parentPath !== null) {
			result = result + parentPath +"-t-"
		}
//		result = result + name;
		if (hasChildren) {
			for (child: children) {
				result = result + "-tt-" + child.print(parentPath + "-k-" + name) + "\r\n"
			}
		} else {
			result = name;
		}
		return result;
	}

	def String constructParent() {
		var String result = "";
		if (parent !== null) {
			result = parent.constructParent;
			result = result + "_p_" + parent.name;
		} else {
			result = name;
		}
		return result;
	}

	override toString() {
		var String result = "";
		if (parent !== null) {
			result = parent.constructParent;
		}
		result = result + name + "{";
		var boolean isFirst = true;
		for (child: children) {
			if (isFirst) {
				isFirst = false;
			} else {
				result = result + ", "
			}
			result = result + child.getName;
		}
		result = result +"}";
		return result;
	}

// Implementation with ---MAP---
//	def Map<String, PropNode> getChildren() {
//		return children;
//	}
//	def PropNode getChildren(String name) {
//		return children.get(name);
//	}
//	def void addChild(PropNode child) {
//		children.put(child.name, child);
//	}
//	def boolean contains(String name) {
//		return children.containsKey(name);
//	}
//	def String print() {
//		var String result = name;
//		for (child: children.values) {
//			result = result + "\r\n" + name+"." + child.print
//		}
//		return result;
//	}
}