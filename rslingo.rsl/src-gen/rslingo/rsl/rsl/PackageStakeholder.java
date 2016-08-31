/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.PackageStakeholder#getStakeholders <em>Stakeholders</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getPackageStakeholder()
 * @model
 * @generated
 */
public interface PackageStakeholder extends PackageAbstract
{
  /**
   * Returns the value of the '<em><b>Stakeholders</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholders</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageStakeholder_Stakeholders()
   * @model containment="true"
   * @generated
   */
  EList<Stakeholder> getStakeholders();

} // PackageStakeholder
