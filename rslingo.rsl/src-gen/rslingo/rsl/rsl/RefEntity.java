/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RefEntity#getRefEntity <em>Ref Entity</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRefEntity()
 * @model
 * @generated
 */
public interface RefEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Entity</b></em>' reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Entity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Entity</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Entity</em>' reference list.
   * @see rslingo.rsl.rsl.RslPackage#getRefEntity_RefEntity()
   * @model
   * @generated
   */
  EList<Entity> getRefEntity();

} // RefEntity
