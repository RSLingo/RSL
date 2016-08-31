/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getSource <em>Source</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getCategory <em>Category</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SystemRelation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getSystemRelation()
 * @model
 * @generated
 */
public interface SystemRelation extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.SystemRelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.SystemRelationType
   * @see #setType(SystemRelationType)
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Type()
   * @model
   * @generated
   */
  SystemRelationType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.SystemRelationType
   * @see #getType()
   * @generated
   */
  void setType(SystemRelationType value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(rslingo.rsl.rsl.System)
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Source()
   * @model
   * @generated
   */
  rslingo.rsl.rsl.System getSource();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(rslingo.rsl.rsl.System value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(rslingo.rsl.rsl.System)
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Target()
   * @model
   * @generated
   */
  rslingo.rsl.rsl.System getTarget();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(rslingo.rsl.rsl.System value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.SystemRelationCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see rslingo.rsl.rsl.SystemRelationCategory
   * @see #setCategory(SystemRelationCategory)
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Category()
   * @model
   * @generated
   */
  SystemRelationCategory getCategory();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see rslingo.rsl.rsl.SystemRelationCategory
   * @see #getCategory()
   * @generated
   */
  void setCategory(SystemRelationCategory value);

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
   * @see rslingo.rsl.rsl.RslPackage#getSystemRelation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SystemRelation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // SystemRelation
