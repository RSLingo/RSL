/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.IfStep#getAction <em>Action</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.IfStep#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getIfStep()
 * @model
 * @generated
 */
public interface IfStep extends EObject
{
  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(UCAction)
   * @see rslingo.rsl.rsl.RslPackage#getIfStep_Action()
   * @model
   * @generated
   */
  UCAction getAction();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.IfStep#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(UCAction value);

  /**
   * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Step}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Steps</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getIfStep_Steps()
   * @model containment="true"
   * @generated
   */
  EList<Step> getSteps();

} // IfStep
