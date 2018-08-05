package net.adempiere.dsl.properties.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;

@SuppressWarnings("all")
public class PropNode {
  private String name;
  
  private String type;
  
  private PropNode parent;
  
  private boolean notNull;
  
  private List<PropNode> children = CollectionLiterals.<PropNode>newArrayList();
  
  public PropNode(final PropNode parent, final String name, final String type, final boolean notNull) {
    this.parent = parent;
    this.name = name;
    this.type = type;
    this.notNull = notNull;
    if ((parent != null)) {
      parent.addChild(this);
    }
  }
  
  public PropNode getParent() {
    return this.parent;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getType() {
    return this.type;
  }
  
  public boolean isNotNull() {
    return this.notNull;
  }
  
  public boolean hasChildren() {
    int _size = this.children.size();
    return (_size > 0);
  }
  
  public List<PropNode> getChildrenAsList() {
    return (List<PropNode>)Conversions.doWrapArray(((PropNode[])Conversions.unwrapArray(this.children, PropNode.class)).clone());
  }
  
  /**
   * def Map<String, PropNode> getChildren() {
   * var Map<String, PropNode> result = newHashMap();
   * for (PropNode child: children) {
   * result.put(child.getName, child);
   * }
   * return result;
   * }
   */
  public PropNode getChildren(final String name) {
    PropNode result = null;
    if ((name != null)) {
      for (final PropNode child : this.children) {
        boolean _equals = name.equals(child.name);
        if (_equals) {
          result = child;
        }
      }
    }
    return result;
  }
  
  public void addChild(final PropNode child) {
    this.children.add(child);
  }
  
  public boolean contains(final String name) {
    PropNode _children = this.getChildren(name);
    return (_children != null);
  }
  
  public String print2() {
    String result = "";
    boolean _hasChildren = this.hasChildren();
    if (_hasChildren) {
      for (final PropNode child : this.children) {
        boolean _hasChildren_1 = child.hasChildren();
        if (_hasChildren_1) {
        } else {
          result = this.name;
        }
      }
    }
    return result;
  }
  
  public String print(final String parentPath) {
    String result = "\r\n";
    if ((parentPath != null)) {
      result = ((result + parentPath) + "-t-");
    }
    boolean _hasChildren = this.hasChildren();
    if (_hasChildren) {
      for (final PropNode child : this.children) {
        String _print = child.print(((parentPath + "-k-") + this.name));
        String _plus = ((result + "-tt-") + _print);
        String _plus_1 = (_plus + "\r\n");
        result = _plus_1;
      }
    } else {
      result = this.name;
    }
    return result;
  }
  
  public String constructParent() {
    String result = "";
    if ((this.parent != null)) {
      result = this.parent.constructParent();
      result = ((result + "_p_") + this.parent.name);
    } else {
      result = this.name;
    }
    return result;
  }
  
  @Override
  public String toString() {
    String result = "";
    if ((this.parent != null)) {
      result = this.parent.constructParent();
    }
    result = ((result + this.name) + "{");
    boolean isFirst = true;
    for (final PropNode child : this.children) {
      {
        if (isFirst) {
          isFirst = false;
        } else {
          result = (result + ", ");
        }
        String _name = child.getName();
        String _plus = (result + _name);
        result = _plus;
      }
    }
    result = (result + "}");
    return result;
  }
}
