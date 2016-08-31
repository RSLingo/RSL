/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Transition#getUcAction <em>Uc Action</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Transition#getNextstate <em>Nextstate</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Uc Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uc Action</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uc Action</em>' containment reference.
   * @see #setUcAction(RefUCAction)
   * @see rslingo.rsl.rsl.RslPackage#getTransition_UcAction()
   * @model containment="true"
   * @generated
   */
  RefUCAction getUcAction();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Transition#getUcAction <em>Uc Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uc Action</em>' containment reference.
   * @see #getUcAction()
   * @generated
   */
  void setUcAction(RefUCAction value);

  /**
   * Returns the value of the '<em><b>Nextstate</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nextstate</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nextstate</em>' reference.
   * @see #setNextstate(State)
   * @see rslingo.rsl.rsl.RslPackage#getTransition_Nextstate()
   * @model
   * @generated
   */
  State getNextstate();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Transition#getNextstate <em>Nextstate</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nextstate</em>' reference.
   * @see #getNextstate()
   * @generated
   */
  void setNextstate(State value);

} // Transition
