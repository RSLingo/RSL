/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Extension Points</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.UCExtensionPoints#getExtensionPoints <em>Extension Points</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getUCExtensionPoints()
 * @model
 * @generated
 */
public interface UCExtensionPoints extends EObject
{
  /**
   * Returns the value of the '<em><b>Extension Points</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.UCExtensionPoint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Points</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Points</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUCExtensionPoints_ExtensionPoints()
   * @model containment="true"
   * @generated
   */
  EList<UCExtensionPoint> getExtensionPoints();

} // UCExtensionPoints
