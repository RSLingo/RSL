/**
 */
package rslingo.rsl.rsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Constraint#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Constraint#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Constraint#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends Requirement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.ConstraintType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.ConstraintType
   * @see #setType(ConstraintType)
   * @see rslingo.rsl.rsl.RslPackage#getConstraint_Type()
   * @model
   * @generated
   */
  ConstraintType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Constraint#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.ConstraintType
   * @see #getType()
   * @generated
   */
  void setType(ConstraintType value);

  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.ConstraintSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.ConstraintSubType
   * @see #setSubType(ConstraintSubType)
   * @see rslingo.rsl.rsl.RslPackage#getConstraint_SubType()
   * @model
   * @generated
   */
  ConstraintSubType getSubType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Constraint#getSubType <em>Sub Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub Type</em>' attribute.
   * @see rslingo.rsl.rsl.ConstraintSubType
   * @see #getSubType()
   * @generated
   */
  void setSubType(ConstraintSubType value);

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(Constraint)
   * @see rslingo.rsl.rsl.RslPackage#getConstraint_PartOf()
   * @model
   * @generated
   */
  Constraint getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Constraint#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(Constraint value);

} // Constraint
