/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Check#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Check#getCheckExpression <em>Check Expression</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getCheck()
 * @model
 * @generated
 */
public interface Check extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getCheck_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Check#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Check Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Check Expression</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Check Expression</em>' attribute.
   * @see #setCheckExpression(String)
   * @see rslingo.rsl.rsl.RslPackage#getCheck_CheckExpression()
   * @model
   * @generated
   */
  String getCheckExpression();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Check#getCheckExpression <em>Check Expression</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Check Expression</em>' attribute.
   * @see #getCheckExpression()
   * @generated
   */
  void setCheckExpression(String value);

} // Check
