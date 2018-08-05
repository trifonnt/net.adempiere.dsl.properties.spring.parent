/**
 * generated by Xtext 2.14.0
 */
package net.adempiere.dsl.properties.propMod.impl;

import net.adempiere.dsl.properties.propMod.Metadata;
import net.adempiere.dsl.properties.propMod.PropModFactory;
import net.adempiere.dsl.properties.propMod.PropModPackage;
import net.adempiere.dsl.properties.propMod.PropModel;
import net.adempiere.dsl.properties.propMod.PropertyDefinition;
import net.adempiere.dsl.properties.propMod.PropertyType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropModPackageImpl extends EPackageImpl implements PropModPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metadataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum propertyTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.adempiere.dsl.properties.propMod.PropModPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PropModPackageImpl()
  {
    super(eNS_URI, PropModFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link PropModPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PropModPackage init()
  {
    if (isInited) return (PropModPackage)EPackage.Registry.INSTANCE.getEPackage(PropModPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredPropModPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    PropModPackageImpl thePropModPackage = registeredPropModPackage instanceof PropModPackageImpl ? (PropModPackageImpl)registeredPropModPackage : new PropModPackageImpl();

    isInited = true;

    // Create package meta-data objects
    thePropModPackage.createPackageContents();

    // Initialize created meta-data
    thePropModPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePropModPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PropModPackage.eNS_URI, thePropModPackage);
    return thePropModPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropModel()
  {
    return propModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropModel_MetaData()
  {
    return (EReference)propModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropModel_Properties()
  {
    return (EReference)propModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetadata()
  {
    return metadataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadata_PackageName()
  {
    return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadata_Prefix()
  {
    return (EAttribute)metadataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetadata_JavaClassName()
  {
    return (EAttribute)metadataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Type()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Name()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_NotNull()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPropertyType()
  {
    return propertyTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropModFactory getPropModFactory()
  {
    return (PropModFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    propModelEClass = createEClass(PROP_MODEL);
    createEReference(propModelEClass, PROP_MODEL__META_DATA);
    createEReference(propModelEClass, PROP_MODEL__PROPERTIES);

    metadataEClass = createEClass(METADATA);
    createEAttribute(metadataEClass, METADATA__PACKAGE_NAME);
    createEAttribute(metadataEClass, METADATA__PREFIX);
    createEAttribute(metadataEClass, METADATA__JAVA_CLASS_NAME);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__TYPE);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NOT_NULL);

    // Create enums
    propertyTypeEEnum = createEEnum(PROPERTY_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(propModelEClass, PropModel.class, "PropModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropModel_MetaData(), this.getMetadata(), null, "metaData", null, 0, 1, PropModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropModel_Properties(), this.getPropertyDefinition(), null, "properties", null, 0, -1, PropModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetadata_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadata_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetadata_JavaClassName(), ecorePackage.getEString(), "javaClassName", null, 0, 1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDefinition_Type(), this.getPropertyType(), "type", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_NotNull(), ecorePackage.getEBoolean(), "notNull", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(propertyTypeEEnum, PropertyType.class, "PropertyType");
    addEEnumLiteral(propertyTypeEEnum, PropertyType.STRING);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.INT);
    addEEnumLiteral(propertyTypeEEnum, PropertyType.BOOLEAN);

    // Create resource
    createResource(eNS_URI);
  }

} //PropModPackageImpl