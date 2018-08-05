package net.adempiere.dsl.properties.generator

class NodePathDTO {
	PropNode node;
	String path;

	new(PropNode node, String path) {
		this.node = node;
		this.path = path;
	}

	def PropNode getNode() {
		return node;
	}
	def String getPath() {
		return path;
	}
}