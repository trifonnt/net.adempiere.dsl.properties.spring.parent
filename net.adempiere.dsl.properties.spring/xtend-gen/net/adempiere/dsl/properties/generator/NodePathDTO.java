package net.adempiere.dsl.properties.generator;

import net.adempiere.dsl.properties.generator.PropNode;

@SuppressWarnings("all")
public class NodePathDTO {
  private PropNode node;
  
  private String path;
  
  public NodePathDTO(final PropNode node, final String path) {
    this.node = node;
    this.path = path;
  }
  
  public PropNode getNode() {
    return this.node;
  }
  
  public String getPath() {
    return this.path;
  }
}
