/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organizations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Organizations#getCustomer <em>Customer</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Organizations#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Organizations#getPartners <em>Partners</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getOrganizations()
 * @model
 * @generated
 */
public interface Organizations extends EObject
{
  /**
   * Returns the value of the '<em><b>Customer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Customer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Customer</em>' attribute.
   * @see #setCustomer(String)
   * @see rslingo.rsl.rsl.RslPackage#getOrganizations_Customer()
   * @model
   * @generated
   */
  String getCustomer();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Organizations#getCustomer <em>Customer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Customer</em>' attribute.
   * @see #getCustomer()
   * @generated
   */
  void setCustomer(String value);

  /**
   * Returns the value of the '<em><b>Supplier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Supplier</em>' attribute.
   * @see #setSupplier(String)
   * @see rslingo.rsl.rsl.RslPackage#getOrganizations_Supplier()
   * @model
   * @generated
   */
  String getSupplier();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Organizations#getSupplier <em>Supplier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Supplier</em>' attribute.
   * @see #getSupplier()
   * @generated
   */
  void setSupplier(String value);

  /**
   * Returns the value of the '<em><b>Partners</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partners</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partners</em>' attribute.
   * @see #setPartners(String)
   * @see rslingo.rsl.rsl.RslPackage#getOrganizations_Partners()
   * @model
   * @generated
   */
  String getPartners();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Organizations#getPartners <em>Partners</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partners</em>' attribute.
   * @see #getPartners()
   * @generated
   */
  void setPartners(String value);

} // Organizations
