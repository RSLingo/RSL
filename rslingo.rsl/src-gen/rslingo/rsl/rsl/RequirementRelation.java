/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RequirementRelation#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.RequirementRelation#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.RequirementRelation#getSource <em>Source</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.RequirementRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.RequirementRelation#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation()
 * @model
 * @generated
 */
public interface RequirementRelation extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RequirementRelation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.RequirementRelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.RequirementRelationType
   * @see #setType(RequirementRelationType)
   * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation_Type()
   * @model
   * @generated
   */
  RequirementRelationType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RequirementRelation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.RequirementRelationType
   * @see #getType()
   * @generated
   */
  void setType(RequirementRelationType value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Requirement)
   * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation_Source()
   * @model
   * @generated
   */
  Requirement getSource();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RequirementRelation#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Requirement value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Requirement)
   * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation_Target()
   * @model
   * @generated
   */
  Requirement getTarget();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RequirementRelation#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Requirement value);

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
   * @see rslingo.rsl.rsl.RslPackage#getRequirementRelation_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RequirementRelation#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // RequirementRelation
