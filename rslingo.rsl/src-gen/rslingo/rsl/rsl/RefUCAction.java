/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref UC Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.RefUCAction#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.RefUCAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getRefUCAction()
 * @model
 * @generated
 */
public interface RefUCAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Use Case</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use Case</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use Case</em>' reference.
   * @see #setUseCase(UseCase)
   * @see rslingo.rsl.rsl.RslPackage#getRefUCAction_UseCase()
   * @model
   * @generated
   */
  UseCase getUseCase();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RefUCAction#getUseCase <em>Use Case</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Use Case</em>' reference.
   * @see #getUseCase()
   * @generated
   */
  void setUseCase(UseCase value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(UCAction)
   * @see rslingo.rsl.rsl.RslPackage#getRefUCAction_Action()
   * @model
   * @generated
   */
  UCAction getAction();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.RefUCAction#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(UCAction value);

} // RefUCAction
