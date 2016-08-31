/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Term Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RefTermApplication#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRefTermApplication()
 * @model
 * @generated
 */
public interface RefTermApplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Refs</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.TermApplication}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getRefTermApplication_Refs()
   * @model containment="true"
   * @generated
   */
  EList<TermApplication> getRefs();

} // RefTermApplication
