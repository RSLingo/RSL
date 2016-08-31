/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.State#getStates <em>States</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#getOnEntry <em>On Entry</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#getOnExit <em>On Exit</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.State#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getState()
 * @model
 * @generated
 */
public interface State extends States
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getState_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

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
   * @see rslingo.rsl.rsl.RslPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Initial</em>' attribute.
   * @see #setIsInitial(boolean)
   * @see rslingo.rsl.rsl.RslPackage#getState_IsInitial()
   * @model
   * @generated
   */
  boolean isIsInitial();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.State#isIsInitial <em>Is Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Initial</em>' attribute.
   * @see #isIsInitial()
   * @generated
   */
  void setIsInitial(boolean value);

  /**
   * Returns the value of the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Final</em>' attribute.
   * @see #setIsFinal(boolean)
   * @see rslingo.rsl.rsl.RslPackage#getState_IsFinal()
   * @model
   * @generated
   */
  boolean isIsFinal();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.State#isIsFinal <em>Is Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Final</em>' attribute.
   * @see #isIsFinal()
   * @generated
   */
  void setIsFinal(boolean value);

  /**
   * Returns the value of the '<em><b>On Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Entry</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Entry</em>' attribute.
   * @see #setOnEntry(String)
   * @see rslingo.rsl.rsl.RslPackage#getState_OnEntry()
   * @model
   * @generated
   */
  String getOnEntry();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.State#getOnEntry <em>On Entry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Entry</em>' attribute.
   * @see #getOnEntry()
   * @generated
   */
  void setOnEntry(String value);

  /**
   * Returns the value of the '<em><b>On Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Exit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Exit</em>' attribute.
   * @see #setOnExit(String)
   * @see rslingo.rsl.rsl.RslPackage#getState_OnExit()
   * @model
   * @generated
   */
  String getOnExit();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.State#getOnExit <em>On Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On Exit</em>' attribute.
   * @see #getOnExit()
   * @generated
   */
  void setOnExit(String value);

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getState_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // State
