/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RefActor#getRefs <em>Refs</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRefActor()
 * @model
 * @generated
 */
public interface RefActor extends EObject
{
  /**
   * Returns the value of the '<em><b>Refs</b></em>' reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Actor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refs</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refs</em>' reference list.
   * @see rslingo.rsl.rsl.RslPackage#getRefActor_Refs()
   * @model
   * @generated
   */
  EList<Actor> getRefs();

} // RefActor
