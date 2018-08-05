/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.propMod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.adempiere.dsl.properties.propMod.Metadata#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link net.adempiere.dsl.properties.propMod.Metadata#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link net.adempiere.dsl.properties.propMod.Metadata#getJavaClassName <em>Java Class Name</em>}</li>
 * </ul>
 *
 * @see net.adempiere.dsl.properties.propMod.PropModPackage#getMetadata()
 * @model
 * @generated
 */
public interface Metadata extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getMetadata_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.Metadata#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Prefix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefix</em>' attribute.
   * @see #setPrefix(String)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getMetadata_Prefix()
   * @model
   * @generated
   */
  String getPrefix();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.Metadata#getPrefix <em>Prefix</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefix</em>' attribute.
   * @see #getPrefix()
   * @generated
   */
  void setPrefix(String value);

  /**
   * Returns the value of the '<em><b>Java Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Class Name</em>' attribute.
   * @see #setJavaClassName(String)
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#getMetadata_JavaClassName()
   * @model
   * @generated
   */
  String getJavaClassName();

  /**
   * Sets the value of the '{@link net.adempiere.dsl.properties.propMod.Metadata#getJavaClassName <em>Java Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Class Name</em>' attribute.
   * @see #getJavaClassName()
   * @generated
   */
  void setJavaClassName(String value);

} // Metadata
