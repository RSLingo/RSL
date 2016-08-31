/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.System#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getScope <em>Scope</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getSubSystems <em>Sub Systems</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getReusableSystems <em>Reusable Systems</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.System#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
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
   * @see rslingo.rsl.rsl.RslPackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.SystemType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.SystemType
   * @see #setType(SystemType)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_Type()
   * @model
   * @generated
   */
  SystemType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.SystemType
   * @see #getType()
   * @generated
   */
  void setType(SystemType value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.SystemScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see rslingo.rsl.rsl.SystemScope
   * @see #setScope(SystemScope)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_Scope()
   * @model
   * @generated
   */
  SystemScope getScope();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see rslingo.rsl.rsl.SystemScope
   * @see #getScope()
   * @generated
   */
  void setScope(SystemScope value);

  /**
   * Returns the value of the '<em><b>Sub Systems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Systems</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Systems</em>' containment reference.
   * @see #setSubSystems(RefSystem)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_SubSystems()
   * @model containment="true"
   * @generated
   */
  RefSystem getSubSystems();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getSubSystems <em>Sub Systems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Systems</em>' containment reference.
   * @see #getSubSystems()
   * @generated
   */
  void setSubSystems(RefSystem value);

  /**
   * Returns the value of the '<em><b>Reusable Systems</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reusable Systems</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reusable Systems</em>' containment reference.
   * @see #setReusableSystems(RefSystem)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_ReusableSystems()
   * @model containment="true"
   * @generated
   */
  RefSystem getReusableSystems();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getReusableSystems <em>Reusable Systems</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reusable Systems</em>' containment reference.
   * @see #getReusableSystems()
   * @generated
   */
  void setReusableSystems(RefSystem value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rsl.rsl.RslPackage#getSystem_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.System#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // System
