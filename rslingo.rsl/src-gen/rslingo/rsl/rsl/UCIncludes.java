/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Includes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.UCIncludes#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getUCIncludes()
 * @model
 * @generated
 */
public interface UCIncludes extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.RefUC}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUCIncludes_Includes()
   * @model containment="true"
   * @generated
   */
  EList<RefUC> getIncludes();

} // UCIncludes
