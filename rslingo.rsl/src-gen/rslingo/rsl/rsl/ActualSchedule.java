/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.ActualSchedule#getStart <em>Start</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.ActualSchedule#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getActualSchedule()
 * @model
 * @generated
 */
public interface ActualSchedule extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(Date)
   * @see rslingo.rsl.rsl.RslPackage#getActualSchedule_Start()
   * @model containment="true"
   * @generated
   */
  Date getStart();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.ActualSchedule#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(Date value);

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(Date)
   * @see rslingo.rsl.rsl.RslPackage#getActualSchedule_End()
   * @model containment="true"
   * @generated
   */
  Date getEnd();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.ActualSchedule#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(Date value);

} // ActualSchedule
