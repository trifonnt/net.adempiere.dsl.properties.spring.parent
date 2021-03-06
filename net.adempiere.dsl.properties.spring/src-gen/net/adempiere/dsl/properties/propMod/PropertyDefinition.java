/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.propMod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#getType <em>Type</em>}</li>
 *   <li>{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#getName <em>Name</em>}</li>
 *   <li>{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#isNotNull <em>Not Null</em>}</li>
 * </ul>
 *
 * @see net.adempiere.dsl.properties.propMod.PropModPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link net.adempiere.dsl.properties.propMod.PropertyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see net.adempiere.dsl.properties.propMod.PropertyType
   * @see #setType(PropertyType)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getPropertyDefinition_Type()
   * @model
   * @generated
   */
  PropertyType getType();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.adempiere.dsl.properties.propMod.PropertyType
   * @see #getType()
   * @generated
   */
  void setType(PropertyType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getPropertyDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Not Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Not Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Null</em>' attribute.
   * @see #setNotNull(boolean)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getPropertyDefinition_NotNull()
   * @model
   * @generated
   */
  boolean isNotNull();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.PropertyDefinition#isNotNull <em>Not Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Null</em>' attribute.
   * @see #isNotNull()
   * @generated
   */
  void setNotNull(boolean value);

} // PropertyDefinition
