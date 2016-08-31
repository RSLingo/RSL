/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.UCActions#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getUCActions()
 * @model
 * @generated
 */
public interface UCActions extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.UCAction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUCActions_Actions()
   * @model containment="true"
   * @generated
   */
  EList<UCAction> getActions();

} // UCActions
