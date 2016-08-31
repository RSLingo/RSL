/**
 */
package rslingo.rsl.rsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Goal#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Goal#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends Requirement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.GoalType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.GoalType
   * @see #setType(GoalType)
   * @see rslingo.rsl.rsl.RslPackage#getGoal_Type()
   * @model
   * @generated
   */
  GoalType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Goal#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.GoalType
   * @see #getType()
   * @generated
   */
  void setType(GoalType value);

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(Goal)
   * @see rslingo.rsl.rsl.RslPackage#getGoal_PartOf()
   * @model
   * @generated
   */
  Goal getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Goal#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(Goal value);

} // Goal
