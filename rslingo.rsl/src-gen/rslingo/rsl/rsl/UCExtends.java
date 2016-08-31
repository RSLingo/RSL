/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UC Extends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.UCExtends#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UCExtends#getExtensionPoint <em>Extension Point</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getUCExtends()
 * @model
 * @generated
 */
public interface UCExtends extends EObject
{
  /**
   * Returns the value of the '<em><b>Usecase</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usecase</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usecase</em>' reference.
   * @see #setUsecase(UseCase)
   * @see rslingo.rsl.rsl.RslPackage#getUCExtends_Usecase()
   * @model
   * @generated
   */
  UseCase getUsecase();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UCExtends#getUsecase <em>Usecase</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Usecase</em>' reference.
   * @see #getUsecase()
   * @generated
   */
  void setUsecase(UseCase value);

  /**
   * Returns the value of the '<em><b>Extension Point</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Point</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Point</em>' reference.
   * @see #setExtensionPoint(UCExtensionPoint)
   * @see rslingo.rsl.rsl.RslPackage#getUCExtends_ExtensionPoint()
   * @model
   * @generated
   */
  UCExtensionPoint getExtensionPoint();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UCExtends#getExtensionPoint <em>Extension Point</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension Point</em>' reference.
   * @see #getExtensionPoint()
   * @generated
   */
  void setExtensionPoint(UCExtensionPoint value);

} // UCExtends
