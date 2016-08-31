/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Step#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Step#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Step#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Step#getSimpleStep <em>Simple Step</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Step#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Step#getIfSteps <em>If Steps</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getStep_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Step#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.StepOperationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.StepOperationType
   * @see #setType(StepOperationType)
   * @see rslingo.rsl.rsl.RslPackage#getStep_Type()
   * @model
   * @generated
   */
  StepOperationType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Step#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.StepOperationType
   * @see #getType()
   * @generated
   */
  void setType(StepOperationType value);

  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.StepOperationSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.StepOperationSubType
   * @see #setSubType(StepOperationSubType)
   * @see rslingo.rsl.rsl.RslPackage#getStep_SubType()
   * @model
   * @generated
   */
  StepOperationSubType getSubType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Step#getSubType <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.StepOperationSubType
   * @see #getSubType()
   * @generated
   */
  void setSubType(StepOperationSubType value);

  /**
   * Returns the value of the '<em><b>Simple Step</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Step</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Step</em>' containment reference.
   * @see #setSimpleStep(SimpleStep)
   * @see rslingo.rsl.rsl.RslPackage#getStep_SimpleStep()
   * @model containment="true"
   * @generated
   */
  SimpleStep getSimpleStep();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Step#getSimpleStep <em>Simple Step</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Step</em>' containment reference.
   * @see #getSimpleStep()
   * @generated
   */
  void setSimpleStep(SimpleStep value);

  /**
   * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Steps</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getStep_SubSteps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSubSteps();

  /**
   * Returns the value of the '<em><b>If Steps</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.IfStep}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If Steps</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getStep_IfSteps()
   * @model containment="true"
   * @generated
   */
  EList<IfStep> getIfSteps();

} // Step
