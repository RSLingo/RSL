/**
 */
package rslingo.rsl.rsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.FR#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.FR#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getFR()
 * @model
 * @generated
 */
public interface FR extends Requirement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.FRType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.FRType
   * @see #setType(FRType)
   * @see rslingo.rsl.rsl.RslPackage#getFR_Type()
   * @model
   * @generated
   */
  FRType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.FR#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.FRType
   * @see #getType()
   * @generated
   */
  void setType(FRType value);

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(FR)
   * @see rslingo.rsl.rsl.RslPackage#getFR_PartOf()
   * @model
   * @generated
   */
  FR getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.FR#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(FR value);

} // FR
